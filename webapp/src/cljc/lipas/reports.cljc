(ns lipas.reports
  (:require
   [lipas.utils :as utils]
   [lipas.data.prop-types :as prop-types]))

(defn- all-energy-data-exists? [{:keys [energy-consumption]}]
  (let [{:keys [electricity-mwh heat-mwh water-m3]} energy-consumption]
    (and
     (some? electricity-mwh)
     (some? heat-mwh)
     (some? water-m3))))

(defn- get-values [sites field-kw]
  (->> sites
       (map (comp field-kw :energy-consumption))
       (remove nil?)))

(defn- ->data-point [{:keys [lipas-id name energy-consumption]}]
  (-> energy-consumption
      (assoc :energy-mwh (+ (:heat-mwh energy-consumption 0)
                            (:electricity-mwh energy-consumption 0)))
      (assoc :name name)
      (assoc :lipas-id lipas-id)))

(defn energy-report [sites]
  {:total-count     (count sites)
   :electricity-mwh (utils/simple-stats (get-values sites :electricity-mwh))
   :heat-mwh        (utils/simple-stats (get-values sites :heat-mwh))
   :water-m3        (utils/simple-stats (get-values sites :water-m3))
   :data-points     (->> sites
                         (filter all-energy-data-exists?)
                         (map ->data-point))
   :hall-of-fame    (->> sites
                         (filter all-energy-data-exists?)
                         (map #(select-keys % [:lipas-id :name])))})

(defn ->row [fields m]
  (reduce
   (fn [res f]
     (let [v (utils/get-in-path m f)]
       (conj res (if (coll? v) (utils/join v) v))))
   []
   fields))

(def basic-fields
  {"lipas-id"                   {:fi "Lipas-id"}
   "name"                       {:fi "Nimi"}
   "name-localized.se"          {:fi "Nimi ruotsiksi"}
   "marketing-name"             {:fi "Markkinointinimi"}
   "event-date"                 {:fi "Muokattu viimeksi"}
   "owner"                      {:fi "Omistaja"}
   "admin"                      {:fi "Ylläpitäjä"}
   "construction-year"          {:fi "Rakennusvuosi"}
   "renovation-years"           {:fi "Peruskorjausvuodet"}
   "phone-number"               {:fi "Puhelinnumero"}
   "email"                      {:fi "Sähköposti"}
   "www"                        {:fi "WWW"}
   "comment"                    {:fi "Kommentti"}
   "type.type-code"             {:fi "Tyyppikoodi"}
   "type.type-name"             {:fi "Liikuntapaikkatyyppi"}
   "location.city.city-code"    {:fi "Kuntanumero"}
   "location.city.city-name"    {:fi "Kunta"}
   "location.city.neighborhood" {:fi "Kuntaosa"}
   "location.address"           {:fi "Katuosoite"}
   "location.postal-code"       {:fi "Postinumero"}
   "location.postal-office"     {:fi "Postitoimipaikka"}})

(def prop-fields
  (reduce (fn [res [k v]]
            (assoc res (str "properties." (name k)) (:name v)))
          {}
          prop-types/all))

(def meta-fields
  {"search-meta.location.wgs84-point" {:fi "Koordinaatit (WGS84)"}})

(def area-fields
  (select-keys prop-fields ["properties.area-m2"
                            "properties.area-km2"
                            "properties.pool-water-area-m2"]))

(def surface-material-fields
  (select-keys prop-fields ["properties.surface-material"
                            "properties.surface-material-info"
                            "properties.running-track-surface-material"
                            "properties.training-spot-surface-material"
                            "properties.inruns-material"
                            "properties.skijump-hill-material"]))

(def length-fields
  (select-keys prop-fields ["properties.field-length-m"
                            "properties.hall-length-m"
                            "properties.inner-lane-length-m"
                            "properties.route-length-km"
                            "properties.lit-route-length-km"
                            "properties.pool-length-m"
                            "properties.sprint-track-length-m"
                            "properties.track-length-m"
                            "properties.beach-length-m"
                            "properties.longest-slope-m"
                            "properties.shortest-slope-m"]))

(def width-fields
  (select-keys prop-fields ["properties.field-width-m"
                            "properties.climbing-wall-width-m"
                            "properties.hall-width-m"
                            "properties.pool-width-m"
                            "properties.route-width-m"
                            "properties.track-width-m"]))

(def height-fields
  (select-keys prop-fields ["properties.height-m"
                            "properties.climbing-wall-height-m"]))

(def other-measures
  (select-keys prop-fields ["properties.p-point"
                            "properties.k-point"
                            "properties.altitude-difference"]))

(def measure-fields
  (merge
   area-fields
   length-fields
   width-fields
   height-fields
   other-measures))

(def service-fields
  (select-keys prop-fields ["properties.equipment-rental?"
                            "properties.ski-service?"
                            "properties.kiosk?"
                            "properties.shower?"
                            "properties.parking-place?"
                            "properties.playground?"
                            "properties.pier?"
                            "properties.rest-places-count"
                            "properties.toilet?"
                            "properties.changing-rooms?"
                            "properties.sauna?"]))

(def activity-fields
  (select-keys prop-fields ["properties.rifle-shooting?"
                            "properties.shotgun-shooting?"
                            "properties.pistol-shooting?"
                            "properties.free-rifle-shooting?"
                            "properties.air-gun-shooting?"
                            "properties.shooting-positions-count"
                            "properties.tatamis-count"
                            "properties.badminton-courts-count"
                            "properties.hammer-throw-places-count"
                            "properties.landing-places-count"
                            "properties.weight-lifting-spots-count"
                            "properties.exercise-machines-count"
                            "properties.ice-rinks-count"
                            "properties.futsal-fields-count"
                            "properties.training-wall?"
                            "properties.winter-swimming?"
                            "properties.ski-track-traditional?"
                            "properties.gymnastics-space?"
                            "properties.shotput-count"
                            "properties.fencing-bases-count"
                            "properties.basketball-fields-count"
                            "properties.freestyle-slope?"
                            "properties.throwing-sports-spots-count"
                            "properties.range?"
                            "properties.green?"
                            "properties.longjump-places-count"
                            "properties.holes-count"
                            "properties.boat-places-count"
                            "properties.outdoor-exercise-machines?"
                            "properties.cosmic-bowling?"
                            "properties.spinning-hall?"
                            "properties.climbing-routes-count"
                            "properties.handball-fields-count"
                            "properties.javelin-throw-places-count"
                            "properties.lit-slopes-count"
                            "properties.fields-count"
                            "properties.table-tennis-count"
                            "properties.volleyball-fields-count"
                            "properties.gymnastic-routines-count"
                            "properties.boxing-rings-count"
                            "properties.football-fields-count"
                            "properties.polevault-places-count"
                            "properties.climbing-wall?"
                            "properties.archery?"
                            "properties.jumps-count"
                            "properties.discus-throw-places"
                            "properties.wrestling-mats-count"
                            "properties.show-jumping?"
                            "properties.curling-lanes-count"
                            "properties.bowling-lanes-count"
                            "properties.floorball-fields-count"
                            "properties.highjump-places-count"
                            "properties.other-platforms?"
                            "properties.toboggan-run?"
                            "properties.halfpipe-count"
                            "properties.tennis-courts-count"
                            "properties.slopes-count"
                            "properties.snowpark-or-street?"
                            "properties.circular-lanes-count"
                            "properties.boat-launching-spot?"
                            "properties.plastic-outrun?"
                            "properties.ice-climbing?"
                            "properties.squash-courts-count"
                            "properties.group-exercise-rooms-count"
                            "properties.sprint-lanes-count"]))

(def other-fields
  (select-keys prop-fields ["properties.accessibility-info"
                            "properties.basketball-field-type"
                            "properties.summer-usage?"
                            "properties.winter-usage?"
                            "properties.ice-reduction?"
                            "properties.ligthing?"
                            "properties.lifts-count"
                            "properties.school-use?"
                            "properties.skijump-hill-type"
                            "properties.track-type"
                            "properties.covered-stand-person-count"
                            "properties.stand-capacity-person"
                            "properties.eu-beach?"
                            "properties.may-be-shown-in-excursion-map-fi?"
                            "properties.ski-track-freestyle?"
                            "properties.free-use?"
                            "properties.heating?"]))

(def competition-fields
  (select-keys prop-fields ["properties.match-clock?"
                            "properties.automated-timing?"
                            "properties.automated-scoring?"
                            "properties.scoreboard?"
                            "properties.loudspeakers?"
                            "properties.finish-line-camera?"]))


(def fields
  (merge
   basic-fields
   meta-fields
   prop-fields))

(def default-fields
  (select-keys fields ["lipas-id"
                       "name"
                       ;;"marketing-name"
                       "type.type-name"
                       "location.city.city-name"
                       "properties.surface-material"
                       "properties.area-m2"]))

(def stats-metrics
  {"investments"        {:fi "Investoinnit"
                         :en "Investments"}
   "operating-expenses" {:fi "Käyttökustannukset"
                         :en "Operating expenses"}
   "operating-incomes"  {:fi "Käyttötuotot"
                         :en "Operating incomes"}
   "subsidies"          {:fi "Myönnetyt avustukset"
                         :en "Subsidies"}
   "net-costs"          {:fi "Nettokustannukset"
                         :en "Net costs"}})

(def city-services
  {"sports-services" {:fi "Liikuntatoimi"
                      :en "Sports services"}
   "youth-services"  {:fi "Nuorisotoimi"
                      :en "Youth services"}})

(def stats-units
  {"1000-euros"       {:fi "Tuhatta €"
                       :en "€1000"}
   "euros-per-capita" {:fi "€ / Asukas"
                       :en "€ / Capita"}})

(def age-structure-groupings
  {"owner" {:fi "Omistaja"
            :en "Owner"}
   "admin" {:fi "Ylläpitäjä"
            :en "Administrator"}})

(def sports-stats-groupings
  {"location.city.city-code" {:fi "Kunta"
                              :en "City"}
   "type.type-code"          {:fi "Tyyppi"
                              :en "Type"}})

(def sports-stats-metrics
  {"sites-count"        {:fi "Liikuntapaikkojen lkm"
                         :en "Sports-sites count"}
   "sites-count-p1000c" {:fi "Liikuntapaikkojen lkm/1000 asukasta"
                         :en "Sports-sites count/1000 people"}
   "m2-total"           {:fi "Liikuntapinta-ala m²"
                         :en "Operating expenses"}
   "m2-pc"              {:fi "Liikuntapinta-ala m²/asukas"
                         :en "Surface area m²/capita"}})

(defn- service-avgs [service year cities]
  (let [ms (map (comp #(get % service) :services #(get % year) :stats) cities)
        ks (-> stats-metrics keys (->> (map keyword)))]
    (reduce
     (fn [res k]
       (assoc res k (->> ms
                         (map k)
                         (remove nil?)
                         utils/simple-stats)))
     {}
     ks)))

(defn calc-avgs [year cities]
  {:population (->> cities
                    (map (comp :population #(get % year) :stats))
                    (remove nil?)
                    utils/simple-stats)
   :services
   {:youth-services     (service-avgs :youth-services year cities)
    :sports-services    (service-avgs :sports-services year cities)
    :youth-services-pc  (service-avgs :youth-services-pc year cities)
    :sports-services-pc (service-avgs :sports-services-pc year cities)}})

(def calc-avgs-memo (memoize calc-avgs))

(defn calc-stats [years cities]
  (reduce
   (fn [res year]
     (assoc res year (calc-avgs-memo year cities)))
   {}
   years))

(defn calc-per-capita [population m]
  (reduce
   (fn [m [k v]]
     (assoc m k (/ (* 1000 v) population)))
   {}
   m))

(defn finance-report [city-codes all-cities]
  (let [cities (utils/index-by :city-code all-cities)
        years  (into #{} (mapcat (comp keys :stats)) all-cities)]
    {:country-averages (calc-stats years all-cities)
     :data-points      (select-keys cities city-codes)}))

(defn calculate-stats-by-city [m2-data pop-data]
  (reduce
   (fn [res m]
     (let [city-code   (:key m)
           population  (pop-data city-code)
           m2-sum      (-> m :area_m2_stats :sum)
           sites-count (:doc_count m)
           entry       {:population         population
                        :m2-total           m2-sum
                        :m2-count           (-> m :area_m2_stats :count)
                        :m2-avg             (-> m :area_m2_stats :avg)
                        :m2-min             (-> m :area_m2_stats :min)
                        :m2-max             (-> m :area_m2_stats :max)
                        :sites-count        sites-count
                        :sites-count-p1000c (when (and population sites-count)
                                              (double
                                               (/ sites-count
                                                  (/ population 1000))))
                        :m2-pc              (when (and population m2-sum)
                                              (double (/ m2-sum population)))}]
       (assoc res city-code entry)))
   {}
   m2-data))

(defn calculate-stats-by-type [m2-data pop-data city-codes]
  (reduce
   (fn [res m]
     (let [type-code   (:key m)
           populations (if (empty? city-codes)
                         pop-data ;; all
                         (select-keys pop-data city-codes))
           population  (->> populations vals (reduce +))
           m2-sum      (-> m :area_m2_stats :sum)
           sites-count (:doc_count m)
           entry       {:population         population
                        :m2-total           m2-sum
                        :m2-count           (-> m :area_m2_stats :count)
                        :m2-avg             (-> m :area_m2_stats :avg)
                        :m2-min             (-> m :area_m2_stats :min)
                        :m2-max             (-> m :area_m2_stats :max)
                        :sites-count        sites-count
                        :sites-count-p1000c (when (and population sites-count)
                                              (double
                                               (/ sites-count
                                                  (/ population 1000))))
                        :m2-pc              (when (and population m2-sum)
                                              (double (/ m2-sum population)))}]
       (assoc res type-code entry)))
   {}
   m2-data))
