(ns lipas.ui.ice-stadiums.events
  (:require cljsjs.filesaverjs
            [lipas.ui.utils :as utils]
            [re-frame.core :as re-frame]))

(re-frame/reg-event-db
 ::set-active-tab
 (fn [db [_ active-tab]]
   (assoc-in db [:ice-stadiums :active-tab] active-tab)))

(re-frame/reg-event-fx
 ::select-energy-consumption-site
 (fn [{:keys [db]} [_ lipas-id]]
   {:db       (-> db
                  (assoc-in [:ice-stadiums :energy-consumption :lipas-id] lipas-id)
                  (assoc-in [:ice-stadiums :energy-consumption :year] nil))
    :dispatch [:lipas.ui.sports-sites.events/get-history lipas-id]}))

(re-frame/reg-event-db
 ::select-energy-consumption-year
 (fn [db [_ year]]
   (let [lipas-id (-> db :ice-stadiums :energy-consumption :lipas-id)
         site     (get-in db [:sports-sites lipas-id])
         rev      (or (utils/find-revision site year)
                      (utils/make-revision site (utils/->timestamp year)))
         rev      (utils/make-editable rev)]
     (-> db
         (assoc-in [:ice-stadiums :energy-consumption :year] year)
         (assoc-in [:sports-sites lipas-id :editing] rev)))))

(defn- calculate-totals [data]
  {:electricity-mwh (reduce + (map :electricity-mwh (vals data)))
   :heat-mwh        (reduce + (map :heat-mwh (vals data)))
   :cold-mwh        (reduce + (map :cold-mwh (vals data)))
   :water-m3        (reduce + (map :water-m3 (vals data)))})

(re-frame/reg-event-db
 ::calculate-total-energy-consumption
 (fn [db [_ lipas-id]]
   (let [base-path    [:sports-sites lipas-id :editing]
         yearly-path  (conj base-path :energy-consumption)
         monthly-path (conj base-path :energy-consumption-monthly)
         monthly-data (get-in db monthly-path)]
     (if monthly-data
       (update-in db yearly-path #(calculate-totals monthly-data))
       db))))

(re-frame/reg-event-fx
 ::set-monthly-energy-consumption
 (fn [{:keys [db]} [_ lipas-id month field value]]
   (let [basepath [:sports-sites lipas-id :editing :energy-consumption-monthly]
         path  (into basepath [month field])]
     {:db (assoc-in db path value)
      :dispatch [::calculate-total-energy-consumption lipas-id]})))

(re-frame/reg-event-fx
 ::commit-energy-consumption
 (fn [_ [_ rev]]
   (let [rev (utils/make-saveable rev)]
     {:dispatch [:lipas.ui.sports-sites.events/commit-rev rev]})))

(re-frame/reg-event-db
 ::toggle-dialog
 (fn [db [_ dialog data]]
   (let [data (or data (-> db :ice-stadiums :dialogs dialog :data))]
     (-> db
         (update-in [:ice-stadiums :dialogs dialog :open?] not)
         (assoc-in [:ice-stadiums :dialogs dialog :data] data)))))

(re-frame/reg-event-db
 ::reset-dialog
 (fn [db [_ dialog]]
   (assoc-in db [:ice-stadiums :dialogs dialog] {})))

(re-frame/reg-event-db
 ::set-dialog-field
 (fn [db [_ dialog field value]]
   (let [path [:ice-stadiums :dialogs dialog :data field]]
     (utils/set-field db path value))))

(re-frame/reg-event-db
 ::save-rink
 (fn [db [_ value]]
   (let [lipas-id (-> db :ice-stadiums :editing :lipas-id)
         path [:sports-sites lipas-id :editing :rinks]]
     (utils/save-entity db path value))))

(re-frame/reg-event-db
 ::remove-rink
 (fn [db [_ {:keys [id]}]]
   (let [lipas-id (-> db :ice-stadiums :editing :lipas-id)]
     (update-in db [:sports-sites lipas-id :editing :rinks] dissoc id))))

(re-frame/reg-event-fx
 ::display-site
 (fn [{:keys [db]} [_ {:keys [lipas-id]}]]
   {:db       (assoc-in db [:ice-stadiums :display-site] lipas-id)
    :dispatch-n
    [(when lipas-id
       [:lipas.ui.sports-sites.events/get-history lipas-id])
     (when lipas-id
       [:lipas.ui.events/navigate (str "/#/jaahalliportaali/" lipas-id)])
     (when-not lipas-id
       [:lipas.ui.events/navigate "/#/jaahalliportaali"])]}))

(re-frame/reg-event-fx
 ::download-contacts-report
 (fn [{:keys [db]} [_ data headers]]
   (let [tr       (:translator db)
         filename (str (tr :reports/contacts) ".csv")
         mime     (str "text/plain;charset=" (.-characterSet js/document))
         blob     (new js/Blob
                       [(utils/->csv data headers)]
                       (clj->js {:type mime}))
         _        (js/saveAs blob filename)]
     {})))
