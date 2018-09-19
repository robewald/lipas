(ns lipas.ui.map.events
  (:require [re-frame.core :as re-frame]))

(re-frame/reg-event-db
 ::set-current-position
 (fn [db [_ lat lon]]
   (assoc-in db [:map :current-pos] {:lat lat :lon lon})))
