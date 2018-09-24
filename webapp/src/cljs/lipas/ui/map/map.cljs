(ns lipas.ui.map.map
  (:require cljsjs.leaflet
            cljsjs.leaflet-draw
            cljsjs.proj4leaflet
            cljsjs.leaflet-markercluster
            leaflet-geometryutil
            leaflet-snap
            [goog.object :as gobj]
            [lipas.ui.map.events :as events]
            [lipas.ui.map.subs :as subs]
            [lipas.ui.mui :as mui]
            [lipas.ui.utils :refer [<== ==>] :as utils]
            [reagent.core :as r]
            [re-frame.core :as re-frame]))

;; Kudos https://github.com/jleh/Leaflet.MML-layers

;; (set! *warn-on-infer* true)

(def base-url "/mapproxy/wmts")

(def urls
  {;:osm          "http://{s}.tile.osm.org/{z}/{x}/{y}.png"
   :taustakartta (str base-url "/mml_taustakartta/mml_grid/{z}/{x}/{y}.png")
   :maastokartta (str base-url "/mml_maastokartta/mml_grid/{z}/{x}/{y}.png")
   :ortokuva     (str base-url "/mml_ortokuva/mml_grid/{z}/{x}/{y}.png")})

(defn init-layers []
  {:basemaps
   {;:osm          (.tileLayer js/L (:osm urls))
    :ortokuva     (.tileLayer js/L (:ortokuva urls))
    :maastokartta (.tileLayer js/L (:maastokartta urls))
    :taustakartta (.tileLayer js/L (:taustakartta urls))}
   :overlays
   {:markers (js/L.markerClusterGroup)
    :edit    (js/L.FeatureGroup.)}})

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

(defn ->map-opts [{:keys  [base-layer zoom center]
                   :or {zoom   2
                        center {:lon 25 :lat 65}}}]
  #js{:crs             crs
      :center          #js[(:lat center) (:lon center)]
      :minZoom         0
      :maxZoom         (dec (count resolutions))
      :continuousWorld true
      :worldCopyJump   false
      :zoom            zoom
      :layers          #js[base-layer]})

(defn init-draw [^js/L.Map lmap layers]
  (let [^js/L.FeatureGroup edit-layer (-> layers :overlays :edit)

        error #js {:color   "#e1e100"
                   :message "<strong>EI EI EI<strong> älä"}

        opts #js{:draw
                 #js{:polyline     #js{:allowIntersection false
                                       :drawError         error
                                       :guideLayers       #js[edit-layer]}
                     :polygon      #js{:allowIntersection false
                                       :drawError         error
                                       :guideLayers       #js[edit-layer]}
                     :circle       false
                     :circlemarker false
                     :rectangle    false}
                 :edit
                 #js{:featureGroup edit-layer
                     :remove       true}}]

    (.addControl lmap (L.Control.Draw. opts))
    (.on lmap js/L.Draw.Event.CREATED
         (fn [^js/L.Event e]
           (.addLayer edit-layer e.layer)))))

(defn add-layer-switcher [^js/L.Map lmap {:keys [basemaps overlays]}]
  (-> js/L
      .-control
      (.layers (clj->js basemaps) (clj->js overlays))
      (.addTo lmap)))

(defn init-leaflet [{:keys [basemap] :as opts}]
  (let [layers     (init-layers)
        base-layer (-> layers :basemaps basemap)
        map-opts   (-> opts
                       (assoc :base-layer base-layer)
                       ->map-opts)
        lmap       (.map js/L "map" map-opts)]

    (add-layer-switcher lmap layers)

    (init-draw lmap layers)

    (.on lmap "baselayerchange"
         (fn [^js/L.LayersControlEvent e]
           (let [basemap (-> e .-name keyword)]
             (==> [::events/select-basemap basemap]))))

    (.on lmap "moveend"
         (fn [e]
           (let [lat (-> lmap .getCenter .-lat)
                 lon (-> lmap .getCenter .-lng)]
             (==> [::events/set-center lat lon]))))

    (.on lmap "zoomend"
         (fn [e]
           (let [zoom (-> lmap .getZoom)]
             (==> [::events/set-zoom zoom]))))

    [lmap layers]))

(defn bind-popup [feature ^js/L.FeatureGroup layer]
  (.bindPopup layer (gobj/getValueByKeys feature "properties" "name")))

(defn update-markers [^js/L.Map lmap layers features]
  (let [^js/L.MarkerClusterGroup markers (-> layers :overlays :markers)
        geoJSON                          (js/L.geoJSON (clj->js features)
                                                       #js{:onEachFeature bind-popup})]
    (.clearLayers markers)
    (.addLayer markers geoJSON)
    (.addLayer lmap markers)))

(defn map-inner []
  (let [layers-state (atom nil)
        map-state    (atom nil)
        geoms-state  (atom nil)]
    (r/create-class
     {:reagent-render       (fn [] [mui/grid {:id    "map"
                                              :item  true
                                              :xs    12
                                              :style {:flex "1 1 auto"}}])
      :component-did-mount  (fn [comp]
                              (let [{:keys [geoms] :as opts} (r/props comp)
                                    [lmap layers*]           (init-leaflet opts)]
                                (update-markers lmap layers* geoms)
                                (reset! layers-state layers*)
                                (reset! map-state lmap)))
      :component-did-update (fn [comp]
                              (let [opts  (r/props comp)
                                    geoms (:geoms opts)]
                                (when (not= @geoms-state geoms)
                                  (update-markers @map-state @layers-state geoms)
                                  (reset! geoms-state geoms))))
      :display-name         "leaflet-inner"})))

(defn map-outer []
  (==> [:lipas.ui.sports-sites.events/get-by-type-code 3110])
  (==> [:lipas.ui.sports-sites.events/get-by-type-code 3130])
  (==> [:lipas.ui.sports-sites.events/get-by-type-code 2510])
  (==> [:lipas.ui.sports-sites.events/get-by-type-code 2520])
  (let [geoms   (re-frame/subscribe [::subs/geometries])
        basemap (re-frame/subscribe [::subs/basemap])
        center  (re-frame/subscribe [::subs/center])
        zoom    (re-frame/subscribe [::subs/zoom])]
    (fn []
      [map-inner {:geoms   @geoms
                  :basemap @basemap
                  :center  @center
                  :zoom    @zoom}])))
