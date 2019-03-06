(ns lipas.i18n.fi
  (:require
   [clojure.string :as string]))

;; Use "Zero-width space" to define where to split long words for
;; mobile displays. This is mainly needed in headlines with such words
;; as "Uimahalliportaali" => (str "Uimahalli" ZWSP "portaali").
(def ZWSP \u200B)

(def translations
  {:menu
   {:headline      "LIPAS"
    :headline-test "LIPAS-TESTAUS"
    :main-menu     "Päävalikko"
    :jyu           "Jyväskylän yliopisto"
    :frontpage     "Etusivu"}

   :restricted
   {:login-or-register "Kirjaudu sisään tai rekisteröidy"}

   :home-page
   {:headline "Etusivu"}

   :sport
   {:headline    "Liikuntapaikat"
    :description "LIPAS tarjoaa ajantasaisen tiedon Suomen julkisista
    liikuntapaikoista ja virkistyskohteista avoimessa tietokannassa."

    :up-to-date-information "Ajantasainen tieto Suomen liikuntapaikoista"
    :updating-tools         "Päivitystyökalut tiedontuottajille"
    :open-interfaces        "Avoimet rajapinnat"}

   :lipas.sports-site
   {:headline          "Liikuntapaikka"
    :id                "LIPAS-ID"
    :status            "Liikuntapaikan tila"
    :name-short        "Nimi"
    :name              "Virallinen nimi"
    :marketing-name    "Markkinointinimi"
    :event-date        "Muokattu"
    :owner             "Omistaja"
    :admin             "Ylläpitäjä"
    :type              "Tyyppi"
    :construction-year (str "Rakennus" ZWSP "vuosi")
    :renovation-years  (str "Perus" ZWSP "korjaus" ZWSP "vuodet")
    :phone-number      "Puhelinnumero"
    :www               "Web-sivu"
    :email-public      "Sähköposti (julkinen)"
    :comment           "Lisätieto"
    :properties        "Lisätiedot"
    :basic-data        "Perustiedot"
    :contact           "Yhteystiedot"
    :ownership         "Omistus"
    :address           "Osoite"
    :details-in-portal (fn [portal]
                         (str "Kaikki tiedot "
                              (case portal
                                "uimahalliportaali" "Uimahalliportaalissa"
                                "jaahalliportaali"  "Jäähalliportaalissa"
                                "")))
    :new-site          (fn [{:keys [type locale]}]
                         (if (and type locale)
                           (str "Uusi " (-> type :name locale))
                           "Uusi liikuntapaikka"))
    :add-new           "Lisää liikuntapaikka"
    :delete-tooltip    "Poista liikuntapaikka..."
    :delete            "Poista {1}"
    :delete-reason     "Poiston syy"

    :surface-materials "Pintamateriaalit"}

   :type
   {:type-code "Tyyppikoodi"
    :name      "Liikuntapaikkatyyppi"}

   :lipas.location
   {:headline      "Sijainti"
    :address       "Katuosoite"
    :postal-code   "Postinumero"
    :postal-office "Postitoimipaikka"
    :city          "Kunta"
    :city-code     "Kuntanumero"
    :neighborhood  "Kuntaosa"}

   :reports
   {:select-fields     "Valitse raportin kentät"
    :selected-fields   "Valitut kentät"
    :shortcuts         "Pikavalinnat"
    :download-as-excel "Luo raportti"
    :tooltip           "Luo Excel-raportti hakutuloksista"
    :contacts          (str "Yhteys" ZWSP "tiedot")}

   :stats
   {:headline            "Tilastot"
    :description         "Kuntien viralliset tilinpäätöstiedot liikunta- ja
    nuorisotoimien osalta. Kunta voi seurata omaa menokehitystään ja
    vertailla sitä muihin kuntiin."
    :bullet1             "Liikunta- ja nuorisotoimen taloustiedot"
    :bullet2             "Liikuntapaikkatilastot (tulossa)"
    :browse-to           "Siirry tilastoihin"
    :city-stats          (str "Kunta" ZWSP "tilastot")
    :finance-stats       (str "Talous" ZWSP "tiedot")
    :age-structure       (str "Liikunta" ZWSP "paikkojen rakennus" ZWSP "vuodet")
    :age-structure-stats (str "Rakennus" ZWSP "vuodet")
    :sports-stats        (str "Liikunta" ZWSP "paikat")
    :select-city         "Valitse kunta"
    :select-cities       "Valitse kunnat"
    :select-metric       "Valitse suure"
    :select-metrics      "Valitse suureet"
    :select-city-service "Valitse toimi"
    :select-unit         "Valitse yksikkö"
    :select-years        "Valitse vuodet"
    :select-grouping     "Ryhmittely"
    :select-interval     "Valitse aikaväli"
    :country-avg         "(maan keskiarvo)"
    :sports-sites-count  "Liikuntapaikkojen lkm"
    :filter-cities       "Rajaa kunnat"
    :filter-types        "Rajaa tyypit"}

   :ice
   {:headline    (str "Jäähalli" ZWSP "portaali")
    :description "Jäähalliportaali sisältää
              hallien perus- ja energiankulutustietoja sekä ohjeita
              energiatehokkuuden parantamiseen."

    :basic-data-of-halls  "Jäähallien perustiedot"
    :entering-energy-data "Energiankulutustietojen syöttäminen"
    :updating-basic-data  "Perustietojen päivitys"
    :size-category        "Kokoluokitus"
    :comparison           "Hallien vertailu"
    :small                "Pieni kilpahalli > 500 hlö"
    :competition          "Kilpahalli < 3000 hlö"
    :large                "Suurhalli > 3000 hlö"
    :watch                "Katso"
    :video                "Video"
    :video-description    "Pihlajalinna Areena on energiatehokas jäähalli"}


   :ice-rinks
   {:headline "Hallien tiedot"}

   :ice-energy
   {:headline          (str "Energia" ZWSP "info")
    :description       "Ajantasaisen tietopaketin löydät Jääkiekkoliiton sivuilta."
    :finhockey-link    "Siirry Jääkiekkoliiton sivuille"
    :energy-calculator "Jäähallin energialaskuri"}

   :ice-comparison
   {:headline "Hallien vertailu"}

   :lipas.energy-consumption
   {:headline                  (str "Energian" ZWSP "kulutus")
    :headline-year             "Lukemat vuonna {1}"
    :electricity               "Sähköenergia MWh"
    :heat                      "Lämpöenergia (ostettu) MWh"
    :cold                      "Kylmäenergia (ostettu) MWh"
    :water                     "Vesi m³"
    :monthly?                  "Haluan ilmoittaa energiankulutuksen kuukausitasolla"
    :reported-for-year         "Vuoden {1} energiankulutus ilmoitettu"
    :report                    "Ilmoita lukemat"
    :contains-other-buildings? "Energialukemat sisältävät myös muita
    rakennuksia tai tiloja"
    :comment                   "Kommentti"
    :operating-hours           "Käyttötunnit"
    :yearly                    "Vuositasolla*"
    :monthly                   "Kuukausitasolla"
    :monthly-readings-in-year  "Kuukausikulutukset vuonna {1}"
    :not-reported              "Ei energiankulutustietoja"
    :not-reported-monthly      "Ei kuukausikulutustietoja"}

   :lipas.energy-stats
   {:headline            "Hallien energiankulutus vuonna {1}"
    :disclaimer          "*Perustuu ilmoitettuihin kulutuksiin vuonna {1}"
    :energy-mwh          "Sähkö + lämpö MWh"
    :electricity-mwh     "Sähkö MWh"
    :heat-mwh            "Lämpö MWh"
    :cold-mwh            "Kylmä MWh"
    :water-m3            "Vesi m³"
    :hall-missing?       "Puuttuvatko hallisi tiedot kuvasta?"
    :report              "Ilmoita lukemat"
    :energy-reported-for "Sähkön-, lämmön- ja vedenkulutus ilmoitettu vuodelta {1}"
    :reported            "Ilmoitettu {1}"
    :not-reported        "Ei tietoa {1}"}

   :lipas.visitors
   {:headline                 "Kävijämäärät"
    :total-count              "Käyttäjämäärä"
    :spectators-count         "Katsojamäärä"
    :monthly-visitors-in-year "Kuukausittaiset kävijämäärät vuonna {1}"
    :not-reported             "Ei kävijämäärätietoja"
    :not-reported-monthly     "Ei kuukausitason tietoja"}

   :lipas.swimming-pool.conditions
   {:headline          "Aukiolo"
    :daily-open-hours  "Aukiolotunnit päivässä"
    :open-days-in-year "Aukiolopäivät vuodessa"
    :open-hours-mon    "Maanantaisin"
    :open-hours-tue    "Tiistaisin"
    :open-hours-wed    "Keskiviikkoisin"
    :open-hours-thu    "Torstaisin"
    :open-hours-fri    "Perjantaisin"
    :open-hours-sat    "Lauantaisin"
    :open-hours-sun    "Sunnuntaisin"}

   :lipas.swimming-pool.energy-saving
   {:headline                    (str "Energian" ZWSP "säästö" ZWSP "toimet")
    :shower-water-heat-recovery? "Suihkuveden lämmöntalteenotto"
    :filter-rinse-water-heat-recovery?
    "Suodattimien huuhteluveden lämmöntalteenotto"}

   :swim
   {:headline       (str "Uimahalli" ZWSP "portaali")
    :list           "Hallien tiedot"
    :visualizations "Hallien vertailu"
    :description    "Uimahalliportaali sisältää hallien perus- ja
          energiankulutustietoja sekä ohjeita energiatehokkuuden
          parantamiseen."

    :basic-data-of-halls  "Uimahallien perustiedot"
    :entering-energy-data "Energiankulutustietojen syöttäminen"
    :updating-basic-data  "Perustietojen päivitys"

    :latest-updates "Viimeksi päivitetyt tiedot"}

   :swim-energy
   {:headline       (str "Energia" ZWSP "info")
    :headline-short "Info"
    :description    "Ajantasaisen tietopaketin löydät UKTY:n ja SUH:n sivuilta."
    :ukty-link      "Siirry UKTY:n sivuille"
    :suh-link       "Siirry SUH:n sivuille"}

   :open-data
   {:headline            "Avoin data"
    :description         "Linkit ja ohjeet rajapintojen käyttöön."
    :rest                "REST"
    :wms-wfs             "WMS & WFS"
    :wms-wfs-description "<Tähän linkki Geoserveriin>"}

   :partners
   {:headline (str "Kehittä" ZWSP "misessä mukana")}

   :data-users
   {:headline      "Lipasta hyödyntävät"
    :data-user?    "Käytätkö LIPAS-dataa?"
    :tell-us       "Kerro siitä meille"
    :email-subject "Mekin käytämme LIPAS-dataa"
    :email-body    (str "Mukavaa että hyödynnät LIPAS-dataa! "
                        "Kirjoita tähän kuka olet ja miten hyödynnät Lipasta. "
                        "Käytätkö mahdollisesti jotain rajapinnoistamme?")}

   :help
   {:headline "Ohjeet"}

   :user
   {:headline            "Oma sivu"
    :greeting            "Hei {1} {2}!"
    :front-page-link     "Siirry etusivulle"
    :admin-page-link     "Siirry admin-sivulle"
    :ice-stadiums-link   "Jäähalliportaali"
    :swimming-pools-link "Uimahalliportaali"
    :promo-headline      "Ajankohtaista"
    :promo1-topic        "Liikuntasalien päivitys"
    :promo1-text         "Tarkista koulujen liikuntasalien tiedot
    Lipas-järjestelmässä toukokuuhun 2019 mennessä! Uusia kouluja on
    rakennettu ja vanhoja lakkautettu koko Suomessa. Mikä on koulujen
    liikuntasalien tilanne kunnassasi?"
    :promo1-link         "Näytä liikuntasalit jotka voin päivittää"}

   :lipas.admin
   {:headline                   "Admin"
    :users                      "Käyttäjät"
    :magic-link                 "Taikalinkki"
    :send-magic-link            "Taikalinkki käyttäjälle {1}"
    :select-magic-link-template "Valitse saatekirje"
    :confirm-magic-link         "Haluatko varmasti lähettää taikalinkin
    käyttäjälle {1}?"
    :access-all-sites           "Sinulla on pääkäyttäjän oikeudet. Voit muokata
    kaikkia liikuntapaikkoja."}

   :lipas.user
   {:contact-info               "Yhteystiedot"
    :email                      "Sähköposti"
    :email-example              "kalle.kayttaja@kunta.fi"
    :username                   "Käyttäjätunnus"
    :username-example           "tane12"
    :firstname                  "Etunimi"
    :lastname                   "Sukunimi"
    :password                   "Salasana"
    :permissions                "Käyttöoikeudet"
    :permissions-example        "Oikeus päivittää Jyväskylän jäähallien tietoja."
    :permissions-help           "Kerro, mitä tietoja haluat päivittää Lipaksessa"
    :requested-permissions      "Pyydetyt oikeudet"
    :sports-sites               "Omat kohteet"
    :permission-to-cities       "Sinulla on käyttöoikeus seuraaviin kuntiin:"
    :permission-to-types        "Sinulla on käyttöoikeus seuraaviin
    liikuntapaikkatyyppeihin:"
    :permission-to-all-cities   "Sinulla on käyttöoikeus kaikkiin kuntiin"
    :permission-to-all-types    "Sinulla on käyttöoikeus kaikkiin
    liikuntapaikkatyyppeihin"
    :no-permissions             "Sinulle ei ole myönnetty käyttöoikeuksia
    julkaista muutoksia yhteenkään kohteeseen. "
    :permission-to-portal-sites "Sinulla on käyttöoikeus seuraaviin
    jää- ja uimahalleihin:"
    :draft-encouragement        "Voit kuitenkin tallentaa muutosehdotuksia,
    jotka lähetetään ylläpidon hyväksyttäväksi."
    :view-basic-info            "Tarkista perustiedot"
    :report-energy-consumption  "Ilmoita energiankulutus"
    :report-energy-and-visitors "Ilmoita energia- ja kävijämäärätiedot"
    :history                    "Historia"}

   :lipas.user.permissions
   {:admin?       "Admin"
    :draft?       "Ehdota muutoksia"
    :all-cities?  "Oikeus kaikkiin kuntiin"
    :all-types?   "Oikeus kaikkiin tyyppeihin"
    :sports-sites "Liikuntapaikat"
    :types        "Tyypit"
    :cities       "Kunnat"}

   :register
   {:headline "Rekisteröidy"}

   :login
   {:headline              "Kirjaudu"
    :username              "Sähköposti / käyttäjätunnus"
    :username-example      "paavo.paivittaja@kunta.fi"
    :password              "Salasana"
    :login                 "Kirjaudu"
    :logout                "Kirjaudu ulos"
    :bad-credentials       "Käyttäjätunnus tai salasana ei kelpaa"
    :forgot-password?      "Unohtuiko salasana?"
    :login-with-password   "Kirjaudu salasanalla"
    :login-with-magic-link "Kirjaudu sähköpostilla"
    :magic-link-help       "Jos olet jo LIPAS-käyttäjä, voit tilata suoran
     sisäänkirjautumislinkin sähköpostiisi. Linkkiä käyttämällä sinun
     ei tarvitse muistaa salasanaasi."
    :login-help            "Jos olet jo LIPAS-käyttäjä, voit tilata suoran
     sisäänkirjautumislinkin sähköpostiisi"
    :login-here            "täältä"
    :order-magic-link      "Lähetä linkki sähköpostiini"
    :magic-link-ordered    "Linkki on lähetetty ja sen pitäisi saapua
    sähköpostiisi parin minuutin sisällä. Tarkistathan myös
    roskapostin!"}

   :reset-password
   {:headline             "Unohtuiko salasana?"
    :change-password      "Vaihda salasana"
    :helper-text          "Lähetämme salasanan vaihtolinkin sinulle sähköpostitse."
    :reset-link-sent      "Linkki lähetetty! Tarkista sähköpostisi."
    :enter-new-password   "Syötä uusi salasana"
    :password-helper-text "Salasanassa on oltava vähintään 6 merkkiä"
    :reset-success        "Salasana vaihdettu! Kirjaudu sisään uudella salasanalla."
    :get-new-link         "Tilaa uusi vaihtolinkki"}

   :lipas.building
   {:headline                    "Rakennus"
    :main-designers              "Pääsuunnittelijat"
    :total-surface-area-m2       "Bruttopinta-ala m² (kokonaisala)"
    :total-volume-m3             "Bruttotilavuus m³"
    :total-pool-room-area-m2     "Allashuoneen pinta-ala m²"
    :total-water-area-m2         "Vesipinta-ala m²"
    :total-ice-area-m2           "Jääpinta-ala m²"
    :heat-sections?              "Allastila on jaettu lämpötilaosioihin"
    :piled?                      "Paalutettu"
    :heat-source                 "Lämmönlähde"
    :main-construction-materials "Päärakennusmateriaalit"
    :supporting-structures       "Kantavat rakenteet"
    :ceiling-structures          "Yläpohjan rakenteet"
    :staff-count                 "Henkilökunnan lukumäärä"
    :seating-capacity            "Katsomokapasiteetti"}

   :lipas.ice-stadium.envelope
   {:headline                "Vaipan rakenne"
    :base-floor-structure    "Alapohjan laatan rakenne"
    :insulated-exterior?     "Ulkoseinä lämpöeristetty"
    :insulated-ceiling?      "Yläpohja lämpöeristetty"
    :low-emissivity-coating? "Yläpohjassa
    matalaemissiiviteettipinnoite (heijastus/säteily)"}

   :lipas.ice-stadium.rinks
   {:headline  "Radat"
    :edit-rink "Muokkaa rataa"
    :add-rink  "Lisää rata"}

   ::lipas.ice-stadium.refrigeration
   {:headline                       "Kylmätekniikka"
    :original?                      "Alkuperäinen"
    :individual-metering?           "Alamittaroitu"
    :power-kw                       "Kylmäkoneen sähköteho (kW)"
    :condensate-energy-recycling?   "Lauhde-energia hyötykäytetty"
    :condensate-energy-main-targets "Lauhdelämmön pääkäyttökohde"
    :refrigerant                    "Kylmäaine"
    :refrigerant-amount-kg          "Kylmäaineen määrä (kg)"
    :refrigerant-solution           "Rataliuos"
    :refrigerant-solution-amount-l  "Rataliuoksen määrä (l)"}

   :lipas.ice-stadium.conditions
   {:headline                        "Käyttöolosuhteet"
    :daily-open-hours                "Käyttötunnit päivässä"
    :open-months                     "Aukiolokuukaudet vuodessa"
    :air-humidity-min                "Ilman suhteellinen kosteus % min"
    :air-humidity-max                "Ilman suhteellinen kosteus % max"
    :ice-surface-temperature-c       "Jään pinnan lämpötila"
    :skating-area-temperature-c      "Luistelualueen lämpötila 1 m korkeudella"
    :stand-temperature-c             "Katsomon tavoiteltu keskilämpötila
          ottelun aikana"
    :daily-maintenances-week-days    "Jäähoitokerrat arkipäivinä"
    :daily-maintenances-weekends     "Jäähoitokerrat viikonlppuina"
    :weekly-maintenances             "Jäänhoitokerrat viikossa"
    :average-water-consumption-l     "Keskimääräinen jäänhoitoon
          käytetty veden määrä (per ajo)"
    :maintenance-water-temperature-c "Jäähoitoveden
          lämpötila (tavoite +40)"
    :ice-resurfacer-fuel             "Jäänhoitokoneen polttoaine"
    :ice-average-thickness-mm        "Jään keskipaksuus mm"}

   :lipas.ice-stadium.ventilation
   {:headline                 "Hallin ilmanvaihto"
    :heat-recovery-type       "Lämmöntalteenoton tyyppi"
    :heat-recovery-efficiency "Lämmöntalteenoton hyötysuhde %"
    :dryer-type               "Ilmankuivaustapa"
    :dryer-duty-type          "Ilmankuivauksen käyttötapa"
    :heat-pump-type           "Lämpöpumpputyyppi"}

   :lipas.swimming-pool.water-treatment
   {:headline          "Vedenkäsittely"
    :ozonation?        "Otsonointi"
    :uv-treatment?     "UV-käsittely"
    :activated-carbon? "Aktiivihiili"
    :filtering-methods "Suodatustapa"}

   :lipas.swimming-pool.pool
   {:outdoor-pool? "Ulkoallas"
    :accessibility "Saavutettavuus"}

   :lipas.swimming-pool.pools
   {:headline  "Altaat"
    :add-pool  "Lisää allas"
    :edit-pool "Muokkaa allasta"
    :structure "Rakenne"}

   :lipas.swimming-pool.slides
   {:headline   "Liukumäet"
    :add-slide  "Lisää liukumäki"
    :edit-slide "Muokkaa liukumäkeä"}

   :lipas.swimming-pool.saunas
   {:headline    "Saunat"
    :add-sauna   "Lisää sauna"
    :edit-sauna  "Muokkaa saunaa"
    :women?      "Naiset"
    :men?        "Miehet"
    :accessible? "Esteetön"}

   :lipas.swimming-pool.facilities
   {:headline                       "Muut palvelut"
    :platforms-1m-count             "1 m hyppypaikkojen lkm"
    :platforms-3m-count             "3 m hyppypaikkojen lkm"
    :platforms-5m-count             "5 m hyppypaikkojen lkm"
    :platforms-7.5m-count           "7.5 m hyppypaikkojen lkm"
    :platforms-10m-count            "10 m hyppypaikkojen lkm"
    :hydro-massage-spots-count      "Muiden hierontapisteiden lkm"
    :hydro-neck-massage-spots-count "Niskahierontapisteiden lkm"
    :kiosk?                         "Kioski / kahvio"
    :gym?                           "Kuntosali"
    :showers-men-count              "Miesten suihkut lkm"
    :showers-women-count            "Naisten suihkut lkm"
    :showers-unisex-count           "Unisex suihkut lkm"
    :lockers-men-count              "Miesten pukukaapit lkm"
    :lockers-women-count            "Naisten pukukaapit lkm"
    :lockers-unisex-count           "Unisex pukuhuoneet lkm"}

   :dimensions
   {:volume-m3       "Tilavuus m³"
    :area-m2         "Pinta-ala m²"
    :surface-area-m2 "Pinta-ala m²"
    :length-m        "Pituus m"
    :width-m         "Leveys m"
    :depth-min-m     "Syvyys min m"
    :depth-max-m     "Syvyys max m"}

   :units
   {:times-per-day  "kertaa päivässä"
    :times-per-week "kertaa viikossa"
    :hours-per-day  "tuntia päivässä"
    :days-in-year   "päivää vuodessa"
    :person         "hlö"
    :pcs            "kpl"
    :percent        "%"}

   :physical-units
   {:temperature-c "Lämpötila °C"
    :mwh           "MWh"
    :m             "m"
    :mm            "mm"
    :l             "l"
    :m2            "m²"
    :m3            "m³"
    :celsius       "°C"
    :hour          "h"}

   :month
   {:jan "Tammikuu"
    :feb "Helmikuu"
    :mar "Maaliskuu"
    :apr "Huhtikuu"
    :may "Toukokuu"
    :jun "Kesäkuu"
    :jul "Heinäkuu"
    :aug "Elokuu"
    :sep "Syyskuu"
    :oct "Lokakuu"
    :nov "Marraskuu"
    :dec "Joulukuu"}

   :time
   {:time               "Aika"
    :year               "Vuosi"
    :hour               "Tunti"
    :month              "Kuukausi"
    :start              "Alkoi"
    :end                "Päättyi"
    :date               "Päivämäärä"
    :just-a-moment-ago  "Hetki sitten"
    :less-than-hour-ago "Alle tunti sitten"
    :today              "Tänään"
    :yesterday          "Eilen"
    :this-week          "Tällä viikolla"
    :this-month         "Tässä kuussa"
    :this-year          "Tänä vuonna"
    :last-year          "Viime vuonna"
    :two-years-ago      "2 vuotta sitten"
    :three-years-ago    "3 vuotta sitten"
    :long-time-ago      "Kauan sitten"}

   :duration
   {:hour        "tuntia"
    :month       "kuukautta"
    :years       "vuotta"
    :years-short "v"}

   :actions
   {:add                      "Lisää"
    :edit                     "Muokkaa"
    :save                     "Tallenna"
    :save-draft               "Tallenna ehdotus"
    :delete                   "Poista"
    :discard                  "Kumoa"
    :cancel                   "Peruuta"
    :close                    "Sulje"
    :select-hall              "Valitse halli"
    :select-year              "Valitse vuosi"
    :show-all-years           "Näytä kaikki vuodet"
    :show-account-menu        "Avaa käyttäjävalikko"
    :open-main-menu           "Avaa päävalikko"
    :submit                   "Lähetä"
    :download                 "Lataa"
    :browse                   "siirry"
    :browse-to-portal         "Siirry portaaliin"
    :browse-to-map            "Siirry kartalle"
    :choose-energy            "Valitse energia"
    :back-to-listing          "Takaisin listaukseen"
    :fill-data                "Täytä tiedot"
    :fill-required-fields     "Täytä pakolliset kentät"
    :select                   "Valitse"
    :select-hint              "Valitse..."
    :select-type              "Valitse tyyppi"
    :select-types             "Valitse tyypit"
    :select-cities            "Valitse kunnat"
    :select-admins            "Valitse ylläpitäjät"
    :select-owners            "Valitse omistajat"
    :select-columns           "Valitse tietokentät"
    :select-statuses          "Liikuntapaikan tila"
    :filter-area-m2           "Rajaa liikuntapinta-ala m²"
    :filter-construction-year "Rajaa rakennusvuodet"
    :filter-surface-materials "Rajaa pintamateriaalit"
    :clear-selections         "Poista valinnat"
    :download-excel           "Lataa Excel"}

   :confirm
   {:headline              "Varmistus"
    :no                    "Ei"
    :yes                   "Kyllä"
    :discard-changes?      "Tahdotko kumota tekemäsi muutokset?"
    :press-again-to-delete "Varmista painamalla uudestaan"
    :save-basic-data?      "Haluatko tallentaa perustiedot?"}

   :search
   {:headline              "Haku"
    :search                "Hae"
    :search-more           "Hae lisää..."
    :placeholder           "Etsi..."
    :filters               "Rajaa hakua"
    :retkikartta-filter    "Retkikartta.fi kohteet"
    :results-count         "{1} hakutulosta"
    :display-closest-first "Näytä lähimmät kohteet ensin"
    :clear-filters         "Poista rajaukset"
    :permissions-filter    "Näytä kohteet joita voin muokata"
    :page-size             "Näytä kerralla"
    :pagination            "Tulokset {1}-{2}"
    :list-view             "Näytä hakutulokset listana"
    :table-view            "Näytä hakutulokset taulukossa"}

   :statuses
   {:edited "{1} (muokattu)"}

   :general
   {:name          "Nimi"
    :type          "Tyyppi"
    :description   "Kuvaus"
    :event         "Tapahtuma"
    :general-info  "Yleiset tiedot"
    :comment       "Kommentti"
    :structure     "Rakenne"
    :hall          "Halli"
    :updated       "Päivitetty"
    :reported      "Ilmoitettu"
    :done          "Valmis"
    :measures      "Mitat"
    :last-modified "Muokattu viimeksi"}

   :notifications
   {:save-success "Tallennus onnistui"
    :save-failed  "Tallennus epäonnistui"
    :get-failed   "Tietojen hakeminen epäonnistui."}

   :disclaimer
   {:headline     "HUOMIO!"
    :test-version "Tämä on LIPAS-sovelluksen testiversio ja
    tarkoitettu koekäyttöön. Muutokset eivät tallennu oikeaan
    Lipakseen."}

   :map
   {:add-to-map         "Lisää kartalle"
    :zoom-to-site       "Kohdista kartta"
    :center-map-to-site "Kohdista kartta liikuntapaikkaan"
    :zoom-closer        "Kartta täytyy zoomata lähemmäs"
    :draw-geoms         "Piirrä"
    :draw               (fn [geom-type]
                          (case geom-type
                            "LineString" "Piirrä reittiosa"
                            "Polygon"    "Piirrä alue"
                            "Lisää kartalle"))
    :modify             (fn [geom-type]
                          (case geom-type
                            "LineString" "Muokkaa reittiä"
                            "Polygon"    "Muokkaa aluetta"
                            "Point"      "Voit raahata pistettä kartalla"
                            "-"))
    :draw-hole          "Lisää reikä"
    :remove             (fn [geom-type]
                          (case geom-type
                            "LineString" "Poista reittiosa"
                            "Polygon"    "Poista alue"
                            "Poista osa"))
    :edit-later-hint    "Voit muokata geometriaa myös myöhemmin"
    :download-gpx       "Lataa GPX"}

   :map.import
   {:headline          "Tuo geometriat"
    :tooltip           "Tuo reittiosia tiedostosta"
    :supported-formats (fn [ss]
                         (str "Tuetut tiedostomuodot: " (string/join ", " ss)))
    :shapefile         "Tuo .shp .dbf ja .prj tiedostot pakattuna .zip-muotoon."
    :geoJSON           "Tuo .json tiedosto joka sisältää GeoJSON FeatureCollection
    objektin. Lähtaineiston pitää olla WGS84 koordinaatistossa."
    :gpx               "Lähtöaineiston pitää olla WGS84 koordinaatistossa."
    :kml               "Lähtöaineiston pitää olla WGS84 koordinaatistossa."
    :select-encoding   "Valitse merkistö"
    :replace-existing? "Korvaa nykyiset geometriat"
    :import-selected   "Tuo valitut"
    :unknown-format    "Tuntematon tiedostopääte '{1}'"}

   :map.basemap
   {:taustakartta "Taustakartta"
    :maastokartta "Maastokartta"
    :ortokuva     "Ilmakuva"
    :copyright    "© Maanmittauslaitos"}

   :error
   {:unknown             "Tuntematon virhe tapahtui. :/"
    :user-not-found      "Käyttäjää ei löydy."
    :email-not-found     "Sähköpostiosoitetta ei ole rekisteröity."
    :email-conflict      "Sähköpostiosoite on jo käytössä"
    :username-conflict   "Käyttäjätunnus on jo käytössä"
    :reset-token-expired "Salasanan vaihto peäonnistui. Linkki on vanhentunut."
    :invalid-form        "Korjaa punaisella merkityt kohdat"
    :no-data             "Ei tietoja"}})
