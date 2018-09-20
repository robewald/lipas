(ns lipas.ui.map.subs
  (:require [re-frame.core :as re-frame]))

(defn ->feature [site]
  (-> site
      :location
      :geometries
      (update-in [:features]
                 #(map (fn [f]
                         (assoc-in f [:properties :name] (:name site)))
                       %))))

(re-frame/reg-sub
 ::geometries
 :<- [:lipas.ui.sports-sites.subs/latest-sports-site-revs]
 (fn [sites _]
   (prn "Sub updated")
   (->> sites
        vals
        (map ->feature))))
