(ns lipas.ui.map.subs
  (:require [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::geometries
 :<- [:lipas.ui.sports-sites.subs/latest-sports-site-revs]
 (fn [sites _]
   (->> sites
        vals
        (map (comp :geometries :location)))))
