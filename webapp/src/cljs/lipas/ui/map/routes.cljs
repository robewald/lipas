(ns lipas.ui.map.routes
  (:require
   [cljs.reader :as reader]
   [lipas.ui.map.views :as views]
   [lipas.ui.utils :as utils :refer [==>]]))

(def routes
  ["liikuntapaikat"
   {:name      :lipas.ui.routes/map
    :tr-key    :sport/headline
    :view      views/main
    :hide-nav? true}

   [""
    {:name :lipas.ui.routes.map/map
     :controllers
     [{:identity
       (fn [match]
         (-> match :parameters :query))
       :start
       (fn [params]
         (let [params  (-> params
                           (update :filters reader/read-string)
                           (update :pagination reader/read-string)
                           (update :sort reader/read-string)
                           (update :center reader/read-string)
                           (update :zoom reader/read-string)
                           (update :basemap reader/read-string))
               center  (:center params)
               zoom    (:zoom params)
               basemap (:basemap params)]
           (==> [:lipas.ui.events/set-query-params nil])
           (when center (==> [:lipas.ui.map.events/set-center (:lat center) (:lon center)]))
           (when basemap (==> [:lipas.ui.map.events/select-basemap basemap]))
           (when zoom (==> [:lipas.ui.map.events/set-zoom zoom]))
           (==> [:lipas.ui.search.events/set-search-params params])
           (==> [:lipas.ui.map.events/show-sports-site* nil])))}]}]

   ["/:lipas-id"
    {:name       :lipas.ui.routes.map/details-view
     :parameters {:path {:lipas-id int?}}
     :controllers
     [{:identity
       (fn [match]
         (-> match :parameters :path :lipas-id))
       :start
       (fn [lipas-id]
         (let [on-success [[:lipas.ui.map.events/show-sports-site* lipas-id]
                           ;; Not sure if zooming is good UX-wise...
                           [:lipas.ui.map.events/zoom-to-site lipas-id]]]
           (==> [:lipas.ui.sports-sites.events/get lipas-id on-success])))}]}]])
