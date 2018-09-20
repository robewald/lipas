(ns lipas.ui.map.map
  (:require cljsjs.leaflet
            cljsjs.leaflet-draw
            cljsjs.proj4leaflet
            cljsjs.leaflet-markercluster
            [lipas.ui.map.events :as events]
            [lipas.ui.map.subs :as subs]
            [lipas.ui.mui :as mui]
            [lipas.ui.utils :refer [<== ==>] :as utils]
            [reagent.core :as r]
            [re-frame.core :as re-frame]))

;; Kudos https://github.com/jleh/Leaflet.MML-layers

(def base-url "https://localhost/mapproxy/wmts")

(def urls
  {;:osm          "http://{s}.tile.osm.org/{z}/{x}/{y}.png"
   :taustakartta (str base-url "/mml_taustakartta/mml_grid/{z}/{x}/{y}.png")
   :maastokartta (str base-url "/mml_maastokartta/mml_grid/{z}/{x}/{y}.png")
   :ortokuva     (str base-url "/mml_ortokuva/mml_grid/{z}/{x}/{y}.png")})

(def base-layers
  {;:osm          (.tileLayer js/L (:osm urls))
   :ortokuva     (.tileLayer js/L (:ortokuva urls))
   :maastokartta (.tileLayer js/L (:maastokartta urls))
   :taustakartta (.tileLayer js/L (:taustakartta urls))})

(def overlays
  {:markers (js/L.markerClusterGroup)})

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
  #js{:crs             crs
      :center          #js [61 25]
      :minZoom         0
      :maxZoom         (dec (count resolutions))
      :continuousWorld true
      :worldCopyJump   false
      :zoom            6
      :layers          (clj->js (vals base-layers))})

(defn add-layer-switcher [lmap {:keys [base-layers overlays]}]
  (-> js/L
      .-control
      (.layers (clj->js base-layers) (clj->js overlays))
      (.addTo lmap)))

(defn mount-leaflet [layers]
  (let [lmap (.map js/L "map" map-opts)]
    (add-layer-switcher lmap layers)
    (.on lmap "mousemove"
         (fn [e]
           (let [lat (-> e .-latlng .-lat)
                 lon (-> e .-latlng .-lng)]
             (==> [::events/set-current-position lat lon]))))
    lmap))

(defn bind-popup [feature layer]
  (.bindPopup layer (-> feature .-properties .-name)))

(defn update-markers [lmap layers props]
  (let [markers (-> layers :overlays :markers)
        geoJSON (js/L.geoJSON (clj->js (:geoms props))
                              #js{:onEachFeature bind-popup})]
    (.addLayer markers geoJSON)
    (.addLayer lmap markers)))

(defn map-inner []
  (let [layers    (atom {:base-layers base-layers
                         :overlays    overlays})
        map-state (atom nil)]
    (r/create-class
     {:reagent-render       (fn [] [mui/grid {:id    "map"
                                              :item  true
                                              :xs    12
                                              :style {:flex "1 1 auto"}}])
      :component-did-mount  (fn [comp]
                              (let [props (r/props comp)
                                    lmap  (-> (mount-leaflet @layers)
                                              (update-markers @layers props))]
                                (reset! map-state lmap)))
      :component-did-update (fn [comp]
                              (let [props (r/props comp)]
                                (update-markers @map-state @layers props)))
      :display-name         "leaflet-inner"})))

(defn map-outer []
  (let [geoms (re-frame/subscribe [::subs/geometries])]
    (fn []
      [map-inner {:geoms @geoms}])))

(comment
  (==> [:lipas.ui.sports-sites.events/get-by-type-code 3110])
  (==> [:lipas.ui.sports-sites.events/get-by-type-code 3130]))
