(ns lipas.ui.sports-sites.views
  (:require [lipas.ui.mui :as mui]
            [lipas.ui.sports-sites.subs :as subs]
            [lipas.ui.sports-sites.events :as events]
            [lipas.ui.map.map :as map]))

;; [mui/grid {:item true :xs 12}
;;  [mui/card {:square true}
;;   [mui/card-header {:title (tr :sport/headline)}]
;;   [mui/card-content
;;    [mui/typography (tr :sport/legacy-disclaimer)]]
;;   [mui/card-actions
;;    [mui/button {:color "secondary"
;;                 :href "http://www.lipas.fi/"}
;;     "> lipas.fi"]]]]

(defn create-panel [tr]
  [map/map-outer])

(defn main [tr]
  (create-panel tr))
