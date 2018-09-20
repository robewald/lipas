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
 ::filters
 (fn [db _]
   (-> db :map :filters)))

(def type-codes
  {:ice-stadium   #{2510 2520}
   :swimming-pool #{3110 3130}})

(re-frame/reg-sub
 ::geometries
 :<- [:lipas.ui.sports-sites.subs/latest-sports-site-revs]
 :<- [::filters]
 (fn [[sites filters] _]
   (let [type-codes (->> filters
                         vec
                         (filter (comp true? second))
                         (map first)
                         (select-keys type-codes)
                         vals
                         (reduce concat)
                         set)]
     (->> sites
          vals
          (filter (comp type-codes :type-code :type))
          (map ->feature)))))
