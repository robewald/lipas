(ns lipas.ui.map.map
  (:require cljsjs.leaflet
            cljsjs.leaflet-draw
            cljsjs.proj4leaflet
            [lipas.ui.map.events :as events]
            [lipas.ui.map.subs :as subs]
            [lipas.ui.mui :as mui]
            [lipas.ui.utils :refer [<== ==>] :as utils]
            [reagent.core :as r]))

(def base-url "https://localhost/mapproxy/wmts")

(def urls
  {;:osm          "http://{s}.tile.osm.org/{z}/{x}/{y}.png"
   :taustakartta (str base-url "/mml_taustakartta/mml_grid/{z}/{x}/{y}.png")
   :maastokartta (str base-url "/mml_maastokartta/mml_grid/{z}/{x}/{y}.png")
   :ortokuva     (str base-url "/mml_ortokuva/mml_grid/{z}/{x}/{y}.png")})

(def layers
  {;:osm          (.tileLayer js/L (:osm urls))
   :taustakartta (.tileLayer js/L (:taustakartta urls))
   :maastokartta (.tileLayer js/L (:maastokartta urls))
   :ortokuva     (.tileLayer js/L (:ortokuva urls))})

(def resolutions
  #js[8192, 4096, 2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1, 0.5, 0.25])

(def crs
  (js/L.Proj.CRS. "EPSG:3067"
                  (str "+proj=utm"
                       "+zone=35"
                       "+ellps=GRS80"
                       "+towgs84=0,0,0,0,0,0,0"
                       "+units=m"
                       "+no_defs")
                  #js{:resolutions resolutions
                      :origin      #js[-548576, 8388608]
                      :bounds      (js/L.bounds #js[-548576, 8388608]
                                                #js[1548576, 6291456])}))

(def map-opts
  #js{:crs crs
      :center #js [61 25]
      :zoom   6
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
