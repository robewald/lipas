(ns lipas.ui.map.map
  (:require cljsjs.leaflet
            cljsjs.leaflet-draw
            [lipas.ui.map.events :as events]
            [lipas.ui.map.subs :as subs]
            [lipas.ui.mui :as mui]
            [lipas.ui.utils :refer [<== ==>] :as utils]
            [reagent.core :as r]))

(def base-url "https://localhost/mapproxy/wmts")

(def urls
  {:osm          "http://{s}.tile.osm.org/{z}/{x}/{y}.png"
   :taustakartta (str base-url "/mml_taustakartta/mml_grid/{z}/{x}/{y}.png")
   :maastokartta (str base-url "/mml_maastokartta/mml_grid/{z}/{x}/{y}.png")
   :ortokuva     (str base-url "/mml_ortokuva/mml_grid/{z}/{x}/{y}.png")})

(def layers
  {:osm          (.tileLayer js/L (:osm urls))
   :taustakartta (.tileLayer js/L (:taustakartta urls))
   :maastokartta (.tileLayer js/L (:maastokartta urls))
   :ortokuva     (.tileLayer js/L (:ortokuva urls))})

(def map-opts
  #js{:center #js [0 0]
      :zoom   3
      :layers (clj->js (vals layers))})

(defn mount-leaflet []
  (let [lmap (.map js/L "map" map-opts)]
    (-> js/L
        .-control
        (.layers (clj->js layers))
        (.addTo lmap))
    (.on lmap "mousemove"
         (fn [e]
           (==> [::events/set-current-position
                               (-> e .-latlng .-lng)
                               (-> e .-latlng .-lat)])))))

(defn update-leaflet [x]
  ;; todo update map with features
  (println x))

(defn map-inner []
  (let [lmap (atom nil)]
    (r/create-class
     {:reagent-render       (fn [] [mui/grid {:id    "map"
                                              :item  true
                                              :xs    12
                                              :style {:flex "1 1 auto"}}])
      :component-did-mount  mount-leaflet
      :component-did-update update-leaflet
      :display-name         "leaflet-inner"})))

(defn map-outer []
  (let [geoms (<== [::subs/geometries])]
    [map-inner]))
