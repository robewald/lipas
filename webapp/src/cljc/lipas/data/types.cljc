(ns lipas.data.types)

(def main-categories
  {0
   {:type-code 0,
    :name
    {:fi "Virkistyskohteet ja palvelut",
     :se "Rekreationsanläggningar och tjänster",
     :en "Recreational destinations and services"}},
   1000
   {:type-code 1000,
    :name
    {:fi "Ulkokentät ja liikuntapuistot",
     :se "Utomhusplaner och idrottsparker",
     :en "Outdoor fields and sports parks"}},
   2000
   {:type-code 2000,
    :name
    {:fi "Sisäliikuntatilat",
     :se "Anläggningar för inomhusidrott",
     :en "Indoor sports facilities"}},
   3000
   {:type-code 3000,
    :name
    {:fi "Vesiliikuntapaikat",
     :se "Anläggningar för vattenidrott",
     :en "Water sports facilities"}},
   4000
   {:type-code 4000,
    :name
    {:fi "Maastoliikuntapaikat",
     :se "Anläggningar för terrängidrott",
     :en "Cross-country sports facilities"}},
   5000
   {:type-code 5000,
    :name
    {:fi "Veneily, ilmailu ja moottoriurheilu",
     :se "Anläggningar för båtsport, flygsport och motorsport",
     :en "Boating, aviation and motor sports"}},
   6000
   {:type-code 6000,
    :name
    {:fi "Eläinurheilualueet",
     :se "Anläggningar för djursport",
     :en "Animal sports areas"}},
   7000
   {:type-code 7000,
    :name
    {:fi "Huoltorakennukset",
     :se "Servicebyggnader",
     :en "Maintenance/service buildings"}}})

(def sub-categories
  {2100
   {:type-code 2100,
    :name
    {:fi "Kuntoilukeskukset ja liikuntasalit",
     :se "Konditionsidrottscentra och idrottssalar",
     :en "Fitness centres and sports halls"},
    :main-category "2000"},
   5200
   {:type-code 5200,
    :name
    {:fi "Urheiluilmailualueet",
     :se "Områden för flygsport",
     :en "Sport aviation areas"},
    :main-category "5000"},
   4200
   {:type-code 4200,
    :name
    {:fi "Katetut talviurheilupaikat",
     :se "Vintersportplatser under tak",
     :en "Covered winter sports facilities"},
    :main-category "4000"},
   2200
   {:type-code 2200,
    :name
    {:fi "Liikuntahallit", :se "Idrottshallar", :en "Sports halls"},
    :main-category "2000"},
   1
   {:type-code 1,
    :name
    {:fi "Virkistys- ja retkeilyalueet",
     :se "Rekreations- och friluftsområden",
     :en "Recreational and outdoor areas "},
    :main-category "0"},
   7000
   {:type-code 7000,
    :name
    {:fi "Huoltotilat",
     :se "Servicebyggnader",
     :en "Maintenance/service buildings"},
    :main-category "7000"},
   4400
   {:type-code 4400,
    :name
    {:fi "Liikunta- ja ulkoilureitit",
     :se "Idrotts- och friluftsleder",
     :en "Sports and outdoor recreation routes "},
    :main-category "4000"},
   1300
   {:type-code 1300,
    :name
    {:fi "Pallokentät", :se "Bollplaner", :en "Ball games courts"},
    :main-category "1000"},
   6100
   {:type-code 6100,
    :name
    {:fi "Hevosurheilu", :se "Hästsport", :en "Equestrian sports"},
    :main-category "6000"},
   4700
   {:type-code 4700,
    :name
    {:fi "Kiipeilypaikat",
     :se "Klättringsplatser",
     :en "Climbing venues"},
    :main-category "4000"},
   3100
   {:type-code 3100,
    :name
    {:fi "Uima-altaat, hallit ja kylpylät",
     :se "Simbassänger, hallar och badinrättningar",
     :en "Indoor swimming pools, halls and spas"},
    :main-category "3000"},
   2500
   {:type-code 2500,
    :name {:fi "Jäähallit", :se "Ishallar", :en "Ice-skating arenas"},
    :main-category "2000"},
   1200
   {:type-code 1200,
    :name
    {:fi "Yleisurheilukentät ja -paikat",
     :se "Planer och platser för friidrott",
     :en "Athletics fields and venues"},
    :main-category "1000"},
   5300
   {:type-code 5300,
    :name
    {:fi "Moottoriurheilualueet",
     :se "Områden för motorsport",
     :en "Motor sports areas"},
    :main-category "5000"},
   1600
   {:type-code 1600,
    :name {:fi "Golfkentät", :se "Golfbanor", :en "Golf courses"},
    :main-category "1000"},
   1500
   {:type-code 1500,
    :name
    {:fi "Jääurheilualueet ja luonnonjäät",
     :se "Isidrottsområden och naturisar",
     :en "Ice sports areas and sites with natural ice"},
    :main-category "1000"},
   6200
   {:type-code 6200,
    :name {:fi "Koiraurheilu", :se "Hundsport", :en "Dog sports"},
    :main-category "6000"},
   3200
   {:type-code 3200,
    :name
    {:fi "Maauimalat ja uimarannat",
     :se "Utebassänger och badstränder",
     :en "Open air pools and beaches"},
    :main-category "3000"},
   2
   {:type-code 2,
    :name
    {:fi "Retkeilyn palvelut",
     :se "Utflyktstjänster",
     :en "Hiking facilities"},
    :main-category "0"},
   1100
   {:type-code 1100,
    :name
    {:fi "Lähiliikunta ja liikuntapuistot",
     :se "Närmotion och idrottsparker",
     :en "Neighbourhood sports facilities and parks "},
    :main-category "1000"},
   4100
   {:type-code 4100,
    :name
    {:fi "Laskettelurinteet ja rinnehiihtokeskukset",
     :se "Slalombackar och alpina skidcentra",
     :en "Ski slopes and downhill ski resorts"},
    :main-category "4000"},
   5100
   {:type-code 5100,
    :name
    {:fi "Veneurheilupaikat",
     :se "Platser för båtsport",
     :en "Boating sports facilities"},
    :main-category "5000"},
   2600
   {:type-code 2600,
    :name
    {:fi "Keilahallit", :se "Bowlinghallar", :en "Bowling alleys"},
    :main-category "2000"},
   2300
   {:type-code 2300,
    :name
    {:fi "Yksittäiset lajikohtaiset sisäliikuntapaikat",
     :se "Enstaka grenspecifika anläggningar för inomhusidrott",
     :en "Indoor venues for various sports "},
    :main-category "2000"},
   4300
   {:type-code 4300,
    :name
    {:fi "Hyppyrimäet", :se "Hoppbackar", :en "Ski jumping hills"},
    :main-category "4000"},
   4500
   {:type-code 4500,
    :name
    {:fi "Suunnistusalueet",
     :se "Orienteringsområden",
     :en "Orienteering areas"},
    :main-category "4000"},
   4600
   {:type-code 4600,
    :name
    {:fi "Maastohiihtokeskukset",
     :se "Längdåkningscentra",
     :en "Cross-country ski resorts"},
    :main-category "4000"},
   4800
   {:type-code 4800,
    :name
    {:fi "Ampumaurheilupaikat",
     :se "Sportskytteplatser",
     :en "Shooting sports facilities"},
    :main-category "4000"}})

(def all
  {1530
   {:name          {:fi "Kaukalo", :se "Rink", :en "Rink"},
    :description
    {:fi
     "Luisteluun, jääkiekkoon, kaukalopalloon jne. tarkoitettu kaukalo. Mahdollinen kesäkäyttö ominaisuustietoihin.",
     :se
     "Rink avsedd för skridskoåkning, ishockey, rinkbandy osv. Eventuell sommaranvändning i karakteristika.",
     :en
     "Rink intended for ice-skating, ice hockey, rink bandy, etc. Potential summer use specified in 'attribute data'."},
    :type-code     1530,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :stand-capacity-person {:priority 0},
     :free-use?             {:priority 0},
     :field-length-m        {:priority 1},
     :match-clock?          {:priority 0},
     :ice-rinks-count       {:priority 0},
     :toilet?               {:priority 0},
     :changing-rooms?       {:priority 0},
     :area-m2               {:priority 1},
     :field-width-m         {:priority 1},
     :ligthing?             {:priority 1},
     :school-use?           {:priority 0},
     :light-roof?           {:priority 0}},
    :main-category 1000,
    :sub-category  1500},
   1520
   {:name
    {:fi "Luistelukenttä",
     :se "Skridskobana",
     :en "Ice-skating field"},
    :description
    {:fi
     "Luisteluun tarkoitettu kenttä. Kesäkäyttö ominaisuustietoihin.",
     :se
     "Plan avsedd för skridskoåkning. Sommaranvändning i karakteristika.",
     :en
     "Field intended for ice-skating. Summer use specified in 'attribute data'."},
    :type-code     1520,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :kiosk?                {:priority 0},
     :stand-capacity-person {:priority 0},
     :free-use?             {:priority 0},
     :field-length-m        {:priority 1},
     :match-clock?          {:priority 0},
     :fields-count          {:priority 0},
     :toilet?               {:priority 0},
     :changing-rooms?       {:priority 0},
     :area-m2               {:priority 1},
     :field-width-m         {:priority 1},
     :ligthing?             {:priority 1},
     :school-use?           {:priority 0},
     :light-roof?           {:priority 0}},
    :main-category 1000,
    :sub-category  1500},
   2320
   {:name
    {:fi "Telinevoimistelutila",
     :se "Utrymme för redskapsgymnastik",
     :en "Artistic gymnastics facility"},
    :description
    {:fi "Pysyvästi telinevoimisteluun varustettu tila.",
     :se "Permanent utrustning för att träna redskapsgymnastik.",
     :en "Space permanently equipped for artistic gymnastics."},
    :type-code     2320,
    :status        "active",
    :geometry-type "Point",
    :props
    {:landing-places-count     {:priority 0},
     :surface-material-info    {:priority 0},
     :surface-material         {:priority 1},
     :area-m2                  {:priority 1},
     :height-m                 {:priority 0},
     :gymnastic-routines-count {:priority 0},
     :school-use?              {:priority 0},
     :free-use?                {:priority 0}},
    :main-category 2000,
    :sub-category  2300},
   6130
   {:name
    {:fi "Esteratsastuskenttä",
     :se "Bana för banhoppning",
     :en "Show jumping field"},
    :description
    {:fi "Pysyvästi esteratsastukseen varusteltu kenttä. Ulkona.",
     :se "Bana med permanent utrustning för banhoppning.",
     :en "Field permanently equipped for show jumping. Outdoors."},
    :type-code     6130,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :kiosk?                {:priority 0},
     :free-use?             {:priority 0},
     :field-length-m        {:priority 1},
     :toilet?               {:priority 0},
     :area-m2               {:priority 1},
     :field-width-m         {:priority 1},
     :ligthing?             {:priority 1},
     :school-use?           {:priority 0}},
    :main-category 6000,
    :sub-category  6100},
   6210
   {:name
    {:fi "Koiraurheilualue",
     :se "Område för hundsport",
     :en "Dog sports area"},
    :description
    {:fi
     "Koiran koulutukseen, agilityyn tai muuhun harjoittamiseen varattu alue.",
     :se
     "Område reserverat för hunddressyr, agility eller annan träning.",
     :en
     "Area reserved for dog training, agility or other dog sports."},
    :type-code     6210,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :free-use?             {:priority 0},
     :field-length-m        {:priority 0},
     :toilet?               {:priority 0},
     :area-m2               {:priority 1},
     :field-width-m         {:priority 0},
     :ligthing?             {:priority 1},
     :school-use?           {:priority 0},
     :track-length-m        {:priority 0}},
    :main-category 6000,
    :sub-category  6200},
   1370
   {:name
    {:fi "Tenniskenttäalue",
     :se "Område med tennisbanor",
     :en "Tennis court area"},
    :description
    {:fi
     "Tenniskenttä tai useampi kenttä samalla alueella. Montako kenttää, pintamateriaali yms. ominaisuustietoihin. Myös tieto lyöntiseinästä.",
     :se
     "En eller flera tennisbanor på samma område. Antalet banor, ytmaterial mm i karakteristika. Även uppgift om slagväggen.",
     :en
     "One or more tennis courts in the same area. Number of courts, surface material, etc. specified in 'attribute data', including information about a potential hit wall."},
    :type-code     1370,
    :status        "active",
    :geometry-type "Point",
    :props
    {:heating?              {:priority 0},
     :surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :free-use?             {:priority 0},
     :field-length-m        {:priority 1},
     :fields-count          {:priority 1},
     :toilet?               {:priority 0},
     :area-m2               {:priority 1},
     :field-width-m         {:priority 1},
     :training-wall?        {:priority 0},
     :ligthing?             {:priority 1},
     :school-use?           {:priority 0},
     :light-roof?           {:priority 0}},
    :main-category 1000,
    :sub-category  1300},
   1360
   {:name
    {:fi "Pesäpallokenttä", :se "Bobollsplan", :en "Baseball field"},
    :description
    {:fi
     "Pesäpallokenttä, nimeä stadioniksi jos on katsomoita. Vähintään kansallisen tason pelipaikka. Hiekka, hiekkatekonurmi / muu synteettinen päällyste, > 50 x 100 m. ",
     :se
     "En bobollsplan, kan ha flera läktare. Minimikrav  spelplats på nationell nivå. Sand, konstgräs med sand / annan syntetisk beläggning. >50 x 100 m.",
     :en
     "Finnish baseball field, may include stands. Can host at least national-level games. Sand, artificial turf / other synthetic surface, > 50 x 100 m. "},
    :type-code     1360,
    :status        "active",
    :geometry-type "Point",
    :props
    {:heating?                   {:priority 0},
     :surface-material           {:priority 1},
     :surface-material-info      {:priority 0},
     :kiosk?                     {:priority 0},
     :stand-capacity-person      {:priority 0},
     :free-use?                  {:priority 0},
     :field-length-m             {:priority 1},
     :match-clock?               {:priority 0},
     :fields-count               {:priority 0},
     :toilet?                    {:priority 0},
     :changing-rooms?            {:priority 0},
     :area-m2                    {:priority 1},
     :field-width-m              {:priority 1},
     :scoreboard?                {:priority 0},
     :loudspeakers?              {:priority 0},
     :ligthing?                  {:priority 1},
     :covered-stand-person-count {:priority 0},
     :school-use?                {:priority 0}},
    :main-category 1000,
    :sub-category  1300},
   110
   {:name
    {:fi "Erämaa-alue", :se "Vildmarksområde", :en "Wilderness area"},
    :description
    {:fi
     "Erämaalailla perustetut alueet pohjoisimmassa Lapissa. Metsähallitus tietolähde.",
     :se
     "Grundade enligt ödemarkslagen, i nordligaste Lappland. Källa  Forststyrelsen. ",
     :en
     "Areas located in northernmost Lapland, established based on the Wildeness Act (1991/62). Source of information  Metsähallitus."},
    :type-code     110,
    :status        "active",
    :geometry-type "Polygon",
    :props
    {:area-km2    {:priority 0},
     :school-use? {:priority 0},
     :free-use?   {:priority 0}},
    :main-category 0,
    :sub-category  1},
   2360
   {:name
    {:fi "Sisäampumarata",
     :se "Inomhusskjutbana",
     :en "Indoor shooting range"},
    :description
    {:fi
     "Pysyvästi käytössä oleva ampumarata sisätiloissa. Huom. Linkki ampumaurheilupaikkoihin.",
     :se
     "Permanent skjutbana inomhus. Obs. Länk till sportskytteplatser.",
     :en
     "Permanent indoor shooting range. Note  Link to 'shooting sports facilities'."},
    :type-code     2360,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material         {:priority 0},
     :surface-material-info    {:priority 0},
     :free-use?                {:priority 0},
     :air-gun-shooting?        {:priority 0},
     :pistol-shooting?         {:priority 0},
     :shooting-positions-count {:priority 1},
     :area-m2                  {:priority 1},
     :rifle-shooting?          {:priority 0},
     :free-rifle-shooting?     {:priority 0},
     :school-use?              {:priority 0},
     :track-length-m           {:priority 1}},
    :main-category 2000,
    :sub-category  2300},
   5310
   {:name
    {:fi "Moottoriurheilukeskus",
     :se "Centrum för motorsport",
     :en "Motor sports centre"},
    :description
    {:fi
     "Useiden eri moottoriurheilun lajien suorituspaikkoja, huoltotilat olemassa.",
     :se
     "Platser för flera olika motorsportgrenar, serviceutrymmen finns.",
     :en
     "Venues for various motor sports; service premises available."},
    :type-code     5310,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material           {:priority 1},
     :surface-material-info      {:priority 0},
     :automated-timing?          {:priority 0},
     :kiosk?                     {:priority 0},
     :stand-capacity-person      {:priority 0},
     :free-use?                  {:priority 0},
     :finish-line-camera?        {:priority 0},
     :track-width-m              {:priority 0},
     :toilet?                    {:priority 0},
     :area-m2                    {:priority 0},
     :scoreboard?                {:priority 0},
     :loudspeakers?              {:priority 0},
     :ligthing?                  {:priority 0},
     :covered-stand-person-count {:priority 0},
     :school-use?                {:priority 0},
     :track-length-m             {:priority 1}},
    :main-category 5000,
    :sub-category  5300},
   1560
   {:name
    {:fi "Alamäkiluistelurata",
     :se "Skridskobana för utförsåkning",
     :en "Downhill skating track"},
    :description
    {:fi "Alamäkiluistelua varten rakennettu pysyvä rata. ",
     :se "Permanent bana byggd för utförsåkning.",
     :en "Permanent track built for downhill skating. "},
    :type-code     1560,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :lifts-count           {:priority nil},
     :free-use?             {:priority 0},
     :track-width-m         {:priority 0},
     :altitude-difference   {:priority 1},
     :toilet?               {:priority 0},
     :ligthing?             {:priority 1},
     :school-use?           {:priority 0},
     :track-length-m        {:priority 1}},
    :main-category 1000,
    :sub-category  1500},
   205
   {:name
    {:fi "Rantautumispaikka",
     :se "Ilandstigningsplats",
     :en "Boat dock"},
    :description
    {:fi
     "Rantautumiseen osoitettu paikka, ei järjestettyjä palveluita.",
     :se
     "Plats som anvisats för ilandstigning, inga ordnade tjänster.",
     :en "Place intended for landing by boat, no services provided."},
    :type-code     205,
    :status        "active",
    :geometry-type "Point",
    :props
    {:toilet?                           {:priority 0},
     :boat-launching-spot?              {:priority 0},
     :may-be-shown-in-excursion-map-fi? {:priority 0},
     :pier?                             {:priority 0},
     :school-use?                       {:priority 0},
     :free-use?                         {:priority 0}},
    :main-category 0,
    :sub-category  2},
   2150
   {:name
    {:fi "Liikuntasali", :se "Idrottssal", :en "Gymnastics hall"},
    :description
    {:fi
     "Muun rakennuksen yhteydessä oleva liikuntatila. Koko ja korkeus lisätiedoissa. Jos on koulun yhteydessä, sekin lisätietoihin.",
     :se
     "En idrottssal som är ansluten till en annan byggnad. Storlek och höjd anges i karakteristika. Precisera till tilläggsuppgifter, ifall ansluten vid en skola.",
     :en
     "A gymnastics hall connected to another building. Size and height specified in 'additional information'. Also specified in 'additional information' if within a school."},
    :type-code     2150,
    :status        "active",
    :geometry-type "Point",
    :props
    {:height-m                {:priority 1},
     :surface-material        {:priority 1},
     :basketball-fields-count {:priority 0},
     :surface-material-info   {:priority 0},
     :free-use?               {:priority 0},
     :tennis-courts-count     {:priority 0},
     :field-length-m          {:priority 1},
     :match-clock?            {:priority 0},
     :badminton-courts-count  {:priority 0},
     :gymnastics-space?       {:priority 0},
     :area-m2                 {:priority 1},
     :field-width-m           {:priority 1},
     :futsal-fields-count     {:priority 0},
     :football-fields-count   {:priority 0},
     :floorball-fields-count  {:priority 0},
     :handball-fields-count   {:priority 0},
     :volleyball-fields-count {:priority 0},
     :spinning-hall?          {:priority 0},
     :school-use?             {:priority 0}},
    :main-category 2000,
    :sub-category  2100},
   2210
   {:name          {:fi "Liikuntahalli", :se "Idrottshall", :en "Sports hall "},
    :description
    {:fi
     "Useiden lajien liikuntatiloja sisältävä rakennus. Koko ja suorituspaikat ominaisuustietoihin.",
     :se
     "Byggnad med utrymmen för flera idrottsgrenar. Storlek och övningsfaciliteter i karakteristika.",
     :en
     "Building containing facilities for various sports. Size and facilities specified in 'attribute data'."},
    :type-code     2210,
    :status        "active",
    :geometry-type "Point",
    :props
    {:height-m                       {:priority 1},
     :surface-material               {:priority 1},
     :basketball-fields-count        {:priority 0},
     :surface-material-info          {:priority 0},
     :kiosk?                         {:priority 0},
     :stand-capacity-person          {:priority 0},
     :free-use?                      {:priority 0},
     :sprint-lanes-count             {:priority 0},
     :javelin-throw-places-count     {:priority 0},
     :tennis-courts-count            {:priority 0},
     :field-length-m                 {:priority 1},
     :circular-lanes-count           {:priority 0},
     :match-clock?                   {:priority 0},
     :inner-lane-length-m            {:priority 0},
     :discus-throw-places            {:priority 0},
     :badminton-courts-count         {:priority 0},
     :hammer-throw-places-count      {:priority 0},
     :polevault-places-count         {:priority 0},
     :group-exercise-rooms-count     {:priority 0},
     :toilet?                        {:priority 0},
     :gymnastics-space?              {:priority 0},
     :running-track-surface-material {:priority 0},
     :area-m2                        {:priority 1},
     :field-width-m                  {:priority 1},
     :scoreboard?                    {:priority nil},
     :futsal-fields-count            {:priority 0},
     :shotput-count                  {:priority 0},
     :longjump-places-count          {:priority 0},
     :football-fields-count          {:priority 0},
     :floorball-fields-count         {:priority 0},
     :squash-courts-count            {:priority 0},
     :accessibility-info             {:priority 0},
     :handball-fields-count          {:priority 0},
     :volleyball-fields-count        {:priority 0},
     :climbing-wall?                 {:priority 0},
     :school-use?                    {:priority 0},
     :highjump-places-count          {:priority 0}},
    :main-category 2000,
    :sub-category  2200},
   101
   {:name          {:fi "Lähipuisto", :se "Närpark", :en "Neighbourhood park"},
    :description
    {:fi
     "Taajamissa, asutuksen välittömässä läheisyydessä. Tarkoitettu jokapäiväiseen käyttöön. Leikki-, oleskelu- ja kävelypaikka. Kaavamerkintä VL.",
     :se
     "I tätorter, i omedelbar närhet till bebyggelse. Avsedd för daglig användning. Plats för lek, vistelse och promenader. Planbeteckning VL.",
     :en
     "In population centres, in or near residential areas. Intended for daily use. Used for play, recreation and walks. Symbol VL."},
    :type-code     101,
    :status        "active",
    :geometry-type "Polygon",
    :props
    {:playground? {:priority 0},
     :area-km2    {:priority 0},
     :school-use? {:priority 0},
     :free-use?   {:priority 0}},
    :main-category 0,
    :sub-category  1},
   102
   {:name
    {:fi "Ulkoilupuisto", :se "Friluftspark", :en "Leisure park"},
    :description
    {:fi
     "Päivittäin käytettäviä alueita, max 1 km asunnoista. Toimivat kävely-, leikki-, oleskelu-, lenkkeily- ja pyöräilypaikkoina. Kevyt liikenne voi mennä ulkoilupuiston läpi. Voi sisältää puistoa, metsää, peltoa, niittyä, vesialuetta. Kaavamerkintä V tai VL.",
     :se
     "Områden för daglig användning. Avstånd från bebyggelse max 1 km. Fungerar som områden för promenader, lekar, vistelse, joggning och cykling. Lättrafikleder kan gå genom en friluftspark. Kan bestå av park, skog, åker, äng och vattenleder. Planbeteckning V eller VL.",
     :en
     "Used daily, max. 1 km from residential areas. Intended for walks, play, recreation, jogging and cycling. There may be bicycle and pedestrian traffic across the park. May consist of park, forest, fields, meadows, bodies of water. Symbol V or VL."},
    :type-code     102,
    :status        "active",
    :geometry-type "Polygon",
    :props
    {:playground?                       {:priority 0},
     :area-km2                          {:priority 0},
     :may-be-shown-in-excursion-map-fi? {:priority 0},
     :school-use?                       {:priority 0},
     :free-use?                         {:priority 0}},
    :main-category 0,
    :sub-category  1},
   7000
   {:name
    {:fi "Huoltorakennukset",
     :se "Servicebyggnader",
     :en "Maintenance/service buildings"},
    :description
    {:fi "Liikuntapaikkoihin liittyvät huoltorakennukset.",
     :se "Servicebyggnader i anslutning till idrottsanläggningar.",
     :en
     "Maintenance buildings in connection with sports facilities."},
    :type-code     7000,
    :status        "active",
    :geometry-type "Point",
    :props
    {:kiosk?            {:priority 0},
     :free-use?         {:priority 0},
     :ski-service?      {:priority 0},
     :toilet?           {:priority 0},
     :shower?           {:priority 0},
     :changing-rooms?   {:priority 0},
     :area-m2           {:priority 0},
     :equipment-rental? {:priority 0},
     :sauna?            {:priority 0},
     :school-use?       {:priority 0}},
    :main-category 7000,
    :sub-category  7000},
   1110
   {:name          {:fi "Liikuntapuisto", :se "Idrottspark", :en "Sports park"},
    :description
    {:fi
     "Liikuntapuisto on useita liikuntapaikkoja käsittävä liikunta- alue. Liikuntapuistossa voi olla esim. erilaisia kenttiä, uimaranta, kuntorata, monitoimihalli, leikkipuisto jne. koottuna samalle alueelle. Lipakseen tallennetaan sekä tieto liikuntapuistosta että yksittäiset liikuntapaikat joita puisto sisältää. Liikuntapaikat lasketaan omiksi paikoikseen. Haku on mahdollista sekä puiston että yksittäisen paikan kautta. ",
     :se
     "En idrottspark är ett idrottsområde med flera idrottsplatser. Där kan finnas olika planer, badstrand, konditionsbana, allaktivitetshall, lekpark osv samlade på samma område. I Lipas lagras uppgifter om såväl idrottsparken som enstaka faciliteter som finns i parken. Varje motionsplats räknas som en plats. Sökning kan ske både via parken eller enstaka faciliteter.",
     :en
     "A sports park is an area including several sports facilities, e.g., different fields, beach, a jogging track, a multi-purpose hall, a playground. 'Lipas' contains information both on the sports park and the individual sports facilities found there. The sports facilities are listed as individual items in the classification, enabling search by the park or by the individual facility."},
    :type-code     1110,
    :status        "active",
    :geometry-type "Polygon",
    :props
    {:area-m2            {:priority 1},
     :playground?        {:priority 0},
     :accessibility-info {:priority nil},
     :ligthing?          {:priority 1},
     :fields-count       {:priority 0},
     :school-use?        {:priority 0},
     :free-use?          {:priority 0}},
    :main-category 1000,
    :sub-category  1100},
   6220
   {:name
    {:fi "Koiraurheiluhalli",
     :se "Hundsporthall",
     :en "Dog sports hall"},
    :description
    {:fi
     "Erityisesti koiraharrastusta, agilityä, koulutusta tms. varten varustettu halli.",
     :se
     "Hall som utrustats särskilt för hundhobby, agility, träning osv.",
     :en
     "Hall specifically equipped for dog sports, agility, training, etc."},
    :type-code     6220,
    :status        "active",
    :geometry-type "Point",
    :props
    {:heating?              {:priority 0},
     :surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :kiosk?                {:priority 0},
     :free-use?             {:priority 0},
     :field-length-m        {:priority 0},
     :toilet?               {:priority 0},
     :area-m2               {:priority 1},
     :field-width-m         {:priority 0},
     :ligthing?             {:priority 0},
     :school-use?           {:priority 0}},
    :main-category 6000,
    :sub-category  6200},
   4530
   {:name
    {:fi "Pyöräsuunnistusalue",
     :se "Cykelorienteringsområde",
     :en " Mountain bike orienteering area"},
    :description
    {:fi "Alueesta pyöräsuunnistukseen soveltuva kartta.",
     :se "Karta över område som lämpar sig för cykelorientering.",
     :en "A map for mountain bike orienteering available."},
    :type-code     4530,
    :status        "active",
    :geometry-type "Polygon",
    :props
    {:area-km2    {:priority 0},
     :school-use? {:priority 0},
     :free-use?   {:priority 0}},
    :main-category 4000,
    :sub-category  4500},
   4720
   {:name
    {:fi "Kiipeilykallio", :se "Klätterberg", :en "Climbing rock"},
    :description
    {:fi
     "Merkitty luonnon kallio. Jääkiipeily lisätietoihin. Myös boulderointikalliot.",
     :se
     "Märkt berg i naturen. Isklättring i tilläggsinformation. Även berg för bouldering.",
     :en
     "Marked natural cliff. Ice climbing specified in additional information. Also includes bouldering cliffs."},
    :type-code     4720,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material                  {:priority 0},
     :surface-material-info             {:priority 0},
     :free-use?                         {:priority 0},
     :may-be-shown-in-excursion-map-fi? {:priority 0},
     :climbing-routes-count             {:priority 0},
     :ice-climbing?                     {:priority 0},
     :climbing-wall-height-m            {:priority 1},
     :area-m2                           {:priority 1},
     :climbing-wall-width-m             {:priority 1},
     :ligthing?                         {:priority 0},
     :school-use?                       {:priority 0}},
    :main-category 4000,
    :sub-category  4700},
   1330
   {:name
    {:fi "Beachvolleykenttä",
     :se "Beachvolleyplan",
     :en "Beach volleyball court"},
    :description
    {:fi
     "Rantalentopallokenttä, pehmeä alusta. Voi sijaita muuallakin kuin rannalla.",
     :se
     "Beachvolleybollplan, mjukt underlag. Kan också ha annat läge än stranden.",
     :en
     "Beach volleyball court, soft basement. May also be located far from a beach."},
    :type-code     1330,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :free-use?             {:priority 0},
     :field-length-m        {:priority 1},
     :toilet?               {:priority 0},
     :area-m2               {:priority 1},
     :field-width-m         {:priority 1},
     :ligthing?             {:priority 1},
     :school-use?           {:priority 0}},
    :main-category 1000,
    :sub-category  1300},
   206
   {:name
    {:fi "Ruoanlaittopaikka",
     :se "Matlagningsplats",
     :en "Cooking facilities"},
    :description
    {:fi "Rakennettu tulentekopaikka tai keittokatos.",
     :se "Kokskjul eller ordnad plats för att göra upp eld.",
     :en "Campfire or cooking shelter."},
    :type-code     206,
    :status        "active",
    :geometry-type "Point",
    :props
    {:may-be-shown-in-excursion-map-fi? {:priority 0},
     :toilet?                           {:priority 0},
     :school-use?                       {:priority 0},
     :free-use?                         {:priority 0}},
    :main-category 0,
    :sub-category  2},
   4830
   {:name
    {:fi "Jousiammuntarata", :se "Bågskyttebana", :en "Archery range"},
    :description
    {:fi "Ulkona tai sisällä. Varustus ja lajit ominaisuustietoihin.",
     :se "Ute eller inne. Utrustning och grenar i karakteristika.",
     :en
     "Outdoors or indoors. Equipment and the various sports detailed in 'attribute data'."},
    :type-code     4830,
    :status        "active",
    :geometry-type "Point",
    :props
    {:kiosk?                   {:priority 0},
     :free-use?                {:priority 0},
     :track-width-m            {:priority 0},
     :toilet?                  {:priority nil},
     :shooting-positions-count {:priority 1},
     :area-m2                  {:priority 0},
     :ligthing?                {:priority 1},
     :school-use?              {:priority 0},
     :track-length-m           {:priority 1}},
    :main-category 4000,
    :sub-category  4800},
   1180
   {:name
    {:fi "Frisbeegolfrata",
     :se "Frisbeegolfbana",
     :en "Disc golf course"},
    :description
    {:fi "Frisbeegolfin pelaamiseen rakennettu rata. ",
     :se "Frisbeegolfbanor finns i idrotts- och friluftsleder.",
     :en "Track built for disc golf. "},
    :type-code     1180,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material                  {:priority 0},
     :surface-material-info             {:priority 0},
     :holes-count                       {:priority 1},
     :free-use?                         {:priority 0},
     :may-be-shown-in-excursion-map-fi? {:priority 0},
     :altitude-difference               {:priority 0},
     :ligthing?                         {:priority 0},
     :accessibility-info                {:priority 0},
     :school-use?                       {:priority 0},
     :track-type                        {:priority 0},
     :range?                            {:priority 0},
     :track-length-m                    {:priority 0}},
    :main-category 1000,
    :sub-category  1100},
   4422
   {:name
    {:fi "Moottorikelkkaura",
     :se "Snöskoterspår",
     :en "Unofficial snowmobile route"},
    :description
    {:fi "Ei reittitoimitusta.",
     :se "Ingen ruttexpedition.",
     :en "No official approval."},
    :type-code     4422,
    :status        "active",
    :geometry-type "LineString",
    :props
    {:may-be-shown-in-excursion-map-fi? {:priority 0},
     :route-width-m                     {:priority 0},
     :route-length-km                   {:priority 1},
     :rest-places-count                 {:priority 0},
     :school-use?                       {:priority 0},
     :free-use?                         {:priority 0}},
    :main-category 4000,
    :sub-category  4400},
   4430
   {:name          {:fi "Hevosreitti", :se "Hästled", :en "Horse track"},
    :description
    {:fi
     "Ratsastukseen ja/tai kärryillä ajoon tarkoitettu reitti. Käyttötavat ominaisuustiedoissa.",
     :se
     "Led avsedd för ridning och/eller häst med kärra. Användningsanvisningar i karakteristika.",
     :en
     "Route intended for horseback riding and/or carriage riding. Different uses specified in 'attribute data'."},
    :type-code     4430,
    :status        "active",
    :geometry-type "LineString",
    :props
    {:surface-material      {:priority 1},
     :rest-places-count     {:priority 0},
     :lit-route-length-km   {:priority 1},
     :surface-material-info {:priority 0},
     :route-width-m         {:priority 1},
     :route-length-km       {:priority 1},
     :school-use?           {:priority 0},
     :free-use?             {:priority 0}},
    :main-category 4000,
    :sub-category  4400},
   204
   {:name
    {:fi "Luontotorni",
     :se "Naturtorn",
     :en "Nature observation tower"},
    :description
    {:fi
     "Luonnon tarkkailuun tarkoitettu rakennelma. Esim. lintutorni.",
     :se
     "Anordning avsedd för observationer i  naturen, t ex fågeltorn.",
     :en
     "Structure built for nature observation. E.g. bird observation tower."},
    :type-code     204,
    :status        "active",
    :geometry-type "Point",
    :props
    {:toilet?                           {:priority nil},
     :may-be-shown-in-excursion-map-fi? {:priority 0},
     :school-use?                       {:priority 0},
     :free-use?                         {:priority 0}},
    :main-category 0,
    :sub-category  2},
   106
   {:name
    {:fi "Monikäyttöalue, jolla on virkistyspalveluita",
     :se "Allaktivitetsområde med rekreationstjänster",
     :en "Multipurpose area with recreational services"},
    :description
    {:fi
     "Maa- ja metsätalousalueita, joita käytetään jokamiehenoikeuteen perustuen myös ulkoiluun, voidaan nimittää monikäyttöalueiksi. Monikäyttöalueita ovat erityisesti rakentamattomat rannat ja taajamien läheiset maa- ja metsätalousalueet. Kaavamerkintä MU.",
     :se
     "Lant- och skogsbruksområden som genom allemansrätten också används för friluftsliv kan kallas allaktivitetsområden. Sådana är i synnerhet obebyggda stränder samt lant- och skogsbruksområden nära tätorter. Planbeteckning MU.",
     :en
     "Agricultural and forestry areas that (based on the right of public access) are also used for recreation can be called multipurpose areas. In particular, these include unbuilt shores and agricultural and forestry areas close to population centres. Symbol MU."},
    :type-code     106,
    :status        "active",
    :geometry-type "Polygon",
    :props
    {:area-km2                          {:priority 0},
     :may-be-shown-in-excursion-map-fi? {:priority 0},
     :playground?                       {:priority 0},
     :school-use?                       {:priority 0},
     :free-use?                         {:priority 0}},
    :main-category 0,
    :sub-category  1},
   4610
   {:name
    {:fi "Ampumahiihdon harjoittelualue",
     :se "Träningsområde för skidskytte",
     :en "Training area for biathlon"},
    :description
    {:fi
     "Muu ampumahiihdon harjoittelualue. Latu ja ampumapaikka olemassa.",
     :se
     "Annat träningsområde för skidskytte. Spår och skjutplats finns.",
     :en
     "Other training area for biathlon. Ski track and shooting range."},
    :type-code     4610,
    :status        "active",
    :geometry-type "Point",
    :props
    {:automated-timing?        {:priority 0},
     :kiosk?                   {:priority 0},
     :summer-usage?            {:priority 0},
     :stand-capacity-person    {:priority 0},
     :free-use?                {:priority 0},
     :ski-service?             {:priority 0},
     :finish-line-camera?      {:priority 0},
     :ski-track-traditional?   {:priority 0},
     :route-width-m            {:priority 0},
     :toilet?                  {:priority 0},
     :rest-places-count        {:priority 0},
     :shooting-positions-count {:priority 1},
     :lit-route-length-km      {:priority 0},
     :scoreboard?              {:priority 0},
     :loudspeakers?            {:priority 0},
     :ski-track-freestyle?     {:priority 0},
     :school-use?              {:priority 0},
     :route-length-km          {:priority 0}},
    :main-category 4000,
    :sub-category  4600},
   2610
   {:name          {:fi "Keilahalli", :se "Bowlinghall", :en "Bowling alley"},
    :description
    {:fi
     "Keilaratoja. Ratojen määrä ja palveluvarustus ominaisuustietoihin.",
     :se "Antalet banor och serviceutrustning i karakteristika.",
     :en
     "Number of alleys and service facilities in 'attribute data'."},
    :type-code     2610,
    :status        "active",
    :geometry-type "Point",
    :props
    {:kiosk?              {:priority 0},
     :free-use?           {:priority 0},
     :automated-scoring?  {:priority 0},
     :bowling-lanes-count {:priority 1},
     :toilet?             {:priority 0},
     :area-m2             {:priority 0},
     :cosmic-bowling?     {:priority 0},
     :scoreboard?         {:priority 0},
     :loudspeakers?       {:priority 0},
     :school-use?         {:priority 0}},
    :main-category 2000,
    :sub-category  2600},
   2110
   {:name
    {:fi "Kuntokeskus", :se "Motionscenter", :en "Fitness centre"},
    :description
    {:fi
     "Erilaisia liikuntapalveluita ja tiloja, esim. kuntosali, ryhmäliikuntatiloja jne. ",
     :se
     "Olika motionstjänster och -utrymmen, t ex gym och gruppidrottsutrymmen.",
     :en
     "Different sports services and premises, e.g., gym, group exercise premises. "},
    :type-code     2110,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material           {:priority 1},
     :surface-material-info      {:priority 0},
     :kiosk?                     {:priority 0},
     :free-use?                  {:priority 0},
     :group-exercise-rooms-count {:priority 0},
     :area-m2                    {:priority 1},
     :boxing-rings-count         {:priority 0},
     :weight-lifting-spots-count {:priority 0},
     :spinning-hall?             {:priority 0},
     :school-use?                {:priority 0},
     :exercise-machines-count    {:priority 0}},
    :main-category 2000,
    :sub-category  2100},
   3120
   {:name          {:fi "Uima-allas", :se "Simbassäng", :en "Swimming pool"},
    :description
    {:fi
     "Yksittäinen uima-allas, usein muun rakennuksen yhteydessä. Ei uimahallissa. <17 m.",
     :se
     "Enstaka simbassäng, ofta i anslutning till en annan byggnad. <17 m.",
     :en
     "Individual swimming pool, often in connection with other buildings. <17 m long."},
    :type-code     3120,
    :status        "active",
    :geometry-type "Point",
    :props
    {:pool-tracks-count   {:priority 0},
     :free-use?           {:priority 0},
     :pool-width-m        {:priority 0},
     :pool-min-depth-m    {:priority 0},
     :swimming-pool-count {:priority 0},
     :pool-water-area-m2  {:priority 1},
     :pool-length-m       {:priority 1},
     :pool-max-depth-m    {:priority 0},
     :accessibility-info  {:priority 0},
     :pool-temperature-c  {:priority 0},
     :school-use?         {:priority 0}},
    :main-category 3000,
    :sub-category  3100},
   104
   {:name
    {:fi "Retkeilyalue", :se "Utflyktsområde", :en "Hiking area"},
    :description
    {:fi
     "Sijaitsevat kauempana taajamasta, automatkan päässä. Monipuolinen polku- ja reittiverkosto. Käyttö painottuu viikonloppuihin ja loma-aikoihin. Palvelevat usein useaa kuntaa. Kaavamerkintä VR.",
     :se
     "Längre borta från tätorter, på bilavstånd. Varierande stig- och vägnätverk. Används mest under helger och semestrar. Betjänar ofta flera kommuner.Planbeteckning VR.",
     :en
     "Located further away from population centres, accessible by car. Complex network of paths and routes. Use concentrated during weekends and holidays. Often serves several municipalities. Symbol VR."},
    :type-code     104,
    :status        "active",
    :geometry-type "Polygon",
    :props
    {:may-be-shown-in-excursion-map-fi? {:priority 0},
     :area-km2                          {:priority 0},
     :school-use?                       {:priority 0},
     :free-use?                         {:priority 0}},
    :main-category 0,
    :sub-category  1},
   2330
   {:name
    {:fi "Pöytätennistila",
     :se "Utrymme för bordtennis",
     :en "Table tennis venue"},
    :description
    {:fi "Pysyvästi pöytätennikseen varustettu tila.",
     :se "Permanent utrustning för att träna bordtennis.",
     :en "Space permanently equipped for table tennis."},
    :type-code     2330,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :height-m              {:priority 0},
     :kiosk?                {:priority 0},
     :area-m2               {:priority 1},
     :table-tennis-count    {:priority 1},
     :school-use?           {:priority 0},
     :free-use?             {:priority 0}},
    :main-category 2000,
    :sub-category  2300},
   2280
   {:name          {:fi "Tennishalli", :se "Tennishall", :en "Tennis hall"},
    :description
    {:fi "Kenttien määrä ominaisuuksiin.",
     :se "Antalet banor i karakteristika.",
     :en "Number of courts specified in 'attribute data'."},
    :type-code     2280,
    :status        "active",
    :geometry-type "Point",
    :props
    {:height-m                {:priority 1},
     :surface-material        {:priority 1},
     :surface-material-info   {:priority 0},
     :kiosk?                  {:priority 0},
     :stand-capacity-person   {:priority 0},
     :free-use?               {:priority 0},
     :tennis-courts-count     {:priority 1},
     :field-length-m          {:priority 0},
     :badminton-courts-count  {:priority 0},
     :toilet?                 {:priority 0},
     :area-m2                 {:priority 1},
     :field-width-m           {:priority 0},
     :scoreboard?             {:priority 0},
     :floorball-fields-count  {:priority 0},
     :squash-courts-count     {:priority 0},
     :volleyball-fields-count {:priority 0},
     :school-use?             {:priority 0}},
    :main-category 2000,
    :sub-category  2200},
   6140
   {:name          {:fi "Ravirata", :se "Travbana", :en "Horse racing track"},
    :description
    {:fi "Raviurheilun harjoitus- tai kilparata.",
     :se "Övnings- eller tävlingsbana för travsport.",
     :en "Training or competition track for horse racing."},
    :type-code     6140,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material           {:priority 1},
     :surface-material-info      {:priority 0},
     :automated-timing?          {:priority 0},
     :kiosk?                     {:priority 0},
     :stand-capacity-person      {:priority 0},
     :free-use?                  {:priority 0},
     :finish-line-camera?        {:priority 0},
     :track-width-m              {:priority 1},
     :toilet?                    {:priority 0},
     :scoreboard?                {:priority 0},
     :loudspeakers?              {:priority 0},
     :ligthing?                  {:priority 1},
     :covered-stand-person-count {:priority 0},
     :school-use?                {:priority 0},
     :track-length-m             {:priority 1}},
    :main-category 6000,
    :sub-category  6100},
   2140
   {:name
    {:fi "Kamppailulajien sali",
     :se "Sal för kampsport",
     :en "Martial arts hall"},
    :description
    {:fi
     "Sali jossa voi harrastaa itsepuolustuslajeja  esim. paini, nyrkkeily ym. Koko ominaisuustietoihin. ",
     :se
     "Sal där man kan utöva självförsvarsgrenar, t ex brottning, boxning. Storleken anges i karakteristika.",
     :en
     "Hall for self-defence sports, e.g., wrestling, boxing. Size specified in 'attribute data'. "},
    :type-code     2140,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material           {:priority 1},
     :surface-material-info      {:priority 0},
     :kiosk?                     {:priority 0},
     :free-use?                  {:priority 0},
     :group-exercise-rooms-count {:priority 0},
     :tatamis-count              {:priority 0},
     :area-m2                    {:priority 1},
     :wrestling-mats-count       {:priority 0},
     :boxing-rings-count         {:priority 0},
     :weight-lifting-spots-count {:priority 0},
     :school-use?                {:priority 0},
     :exercise-machines-count    {:priority 0}},
    :main-category 2000,
    :sub-category  2100},
   4220
   {:name          {:fi "Hiihtotunneli", :se "Skidtunnel", :en "Ski tunnel"},
    :description
    {:fi
     "Hiihtoon tarkoitettu katettu tila (tunneli, putki, halli tms.).",
     :se
     "Utrymme avsett för skidåkning under tak (tunnel, rör, hall el dyl).",
     :en
     "Covered space (tunnel, tube, hall, etc.) intended for skiing."},
    :type-code     4220,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :kiosk?                {:priority 0},
     :free-use?             {:priority 0},
     :ski-service?          {:priority 0},
     :altitude-difference   {:priority 1},
     :route-width-m         {:priority 0},
     :toilet?               {:priority 0},
     :area-m2               {:priority 0},
     :equipment-rental?     {:priority 0},
     :accessibility-info    {:priority 0},
     :school-use?           {:priority 0},
     :route-length-km       {:priority 1}},
    :main-category 4000,
    :sub-category  4200},
   2230
   {:name
    {:fi "Jalkapallohalli", :se "Fotbollshall", :en "Football hall"},
    :description
    {:fi
     "Jalkapalloiluun tarkoitettu halli. Pintamateriaali, kenttien määrä ja koko ominaisuustietoihin, samoin hallin rakenne.",
     :se
     "Hall avsedd för fotboll. Ytmaterial, antalet planer, storlek och byggnadens konstruktion i karakteristika.",
     :en
     "Hall intended for football. Surface material, number and size of courts specified in 'attribute data', as well as hall structure."},
    :type-code     2230,
    :status        "active",
    :geometry-type "Point",
    :props
    {:height-m                {:priority 1},
     :heating?                {:priority 0},
     :surface-material        {:priority 1},
     :basketball-fields-count {:priority 0},
     :surface-material-info   {:priority 0},
     :kiosk?                  {:priority 0},
     :stand-capacity-person   {:priority 0},
     :free-use?               {:priority 0},
     :tennis-courts-count     {:priority 0},
     :field-length-m          {:priority 1},
     :match-clock?            {:priority 0},
     :sprint-track-length-m   {:priority 0},
     :badminton-courts-count  {:priority 0},
     :toilet?                 {:priority 0},
     :area-m2                 {:priority 1},
     :field-width-m           {:priority 1},
     :scoreboard?             {:priority 0},
     :football-fields-count   {:priority 0},
     :loudspeakers?           {:priority 0},
     :volleyball-fields-count {:priority 0},
     :school-use?             {:priority 0}},
    :main-category 2000,
    :sub-category  2200},
   1350
   {:name
    {:fi "Jalkapallostadion",
     :se "Fotbollsstadion",
     :en "Football stadium"},
    :description
    {:fi
     "Suuri jalkapallokenttä, katsomoita. Vähintään kansallisen tason pelipaikka.",
     :se
     "Stor fotbollsplan, flera läktare. Minimikrav  spelplats på nationell nivå.",
     :en
     "Large football field, stands. Can host at least national-level games."},
    :type-code     1350,
    :status        "active",
    :geometry-type "Point",
    :props
    {:heating?                   {:priority 0},
     :surface-material           {:priority 1},
     :surface-material-info      {:priority 0},
     :kiosk?                     {:priority 0},
     :stand-capacity-person      {:priority 0},
     :free-use?                  {:priority 0},
     :finish-line-camera?        {:priority 0},
     :field-length-m             {:priority 1},
     :match-clock?               {:priority 0},
     :fields-count               {:priority 0},
     :toilet?                    {:priority 0},
     :area-m2                    {:priority 1},
     :field-width-m              {:priority 1},
     :scoreboard?                {:priority 0},
     :loudspeakers?              {:priority 0},
     :ligthing?                  {:priority 1},
     :covered-stand-person-count {:priority 0},
     :school-use?                {:priority 0},
     :light-roof?                {:priority 0}},
    :main-category 1000,
    :sub-category  1300},
   4840
   {:name
    {:fi "Jousiammuntamaastorata",
     :se "Terrängbana för bågskytte.",
     :en "Field archery course"},
    :description
    {:fi "Maastoon rakennettu jousiammuntarata.",
     :se "Bågskyttebana byggd i terrängen.",
     :en "Archery course built in rough terrain."},
    :type-code     4840,
    :status        "active",
    :geometry-type "Point",
    :props
    {:shooting-positions-count {:priority 1},
     :toilet?                  {:priority nil},
     :track-length-m           {:priority 1},
     :ligthing?                {:priority 1},
     :school-use?              {:priority 0},
     :free-use?                {:priority 0}},
    :main-category 4000,
    :sub-category  4800},
   1510
   {:name
    {:fi "Tekojääkenttä",
     :se "Konstisplan",
     :en "Mechanically frozen open-air ice rink"},
    :description
    {:fi
     "Koneellisesti / keinotekoisesti jäähdytetty ulkokenttä. Kentän koko, varustus, kaukalo, valaistus yms. Ominaisuustietoihin. Tieto yhdistelmäkentästä mukaan.",
     :se
     "Konstfrusen utomhusplan. Storlek, utrustning, rink, belysning osv i karakteristika. Likaså uppgiften om planen är kombinerad.",
     :en
     "Mechanically/artificially frozen open-air field. Field size, equipment, rink, lighting, etc. specified in 'attribute data', as well as information about multi-use fields."},
    :type-code     1510,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :kiosk?                {:priority 0},
     :stand-capacity-person {:priority 0},
     :free-use?             {:priority 0},
     :field-length-m        {:priority 1},
     :match-clock?          {:priority 0},
     :fields-count          {:priority 0},
     :ice-rinks-count       {:priority 0},
     :toilet?               {:priority 0},
     :changing-rooms?       {:priority 0},
     :area-m2               {:priority 1},
     :field-width-m         {:priority 1},
     :ligthing?             {:priority 1},
     :school-use?           {:priority 0},
     :light-roof?           {:priority 0}},
    :main-category 1000,
    :sub-category  1500},
   5350
   {:name          {:fi "Kiihdytysrata", :se "Dragracingbana", :en "Dragstrip"},
    :description
    {:fi "Pääasiallisesti kiihdytysautoilua varten.",
     :se "Huvudsakligen avsedd för dragracing.",
     :en "Mainly for drag racing."},
    :type-code     5350,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material           {:priority 1},
     :surface-material-info      {:priority 0},
     :automated-timing?          {:priority 0},
     :kiosk?                     {:priority 0},
     :stand-capacity-person      {:priority 0},
     :free-use?                  {:priority 0},
     :track-width-m              {:priority 0},
     :area-m2                    {:priority 0},
     :scoreboard?                {:priority 0},
     :loudspeakers?              {:priority 0},
     :ligthing?                  {:priority 0},
     :covered-stand-person-count {:priority 0},
     :school-use?                {:priority 0},
     :track-length-m             {:priority 1}},
    :main-category 5000,
    :sub-category  5300},
   4440
   {:name
    {:fi "Koirahiihtolatu",
     :se "Spår för skidåkning med hund",
     :en "Dog skijoring track"},
    :description
    {:fi
     "Hiihtolatu, jossa on aina tai tiettyinä aikoina koirahiihto sallittua. Perinteinen tyyli tai vapaa tyyli.",
     :se
     "Ett skidspår där det alltid eller vissa tider är tillåtet att åka skidor med hund. Klassisk stil eller fristil.",
     :en
     "Ski track on which dog skijoring is allowed either always or at given times. Traditional or free style."},
    :type-code     4440,
    :status        "active",
    :geometry-type "LineString",
    :props
    {:surface-material       {:priority 1},
     :surface-material-info  {:priority 0},
     :free-use?              {:priority 0},
     :ski-track-traditional? {:priority 0},
     :route-width-m          {:priority 0},
     :toilet?                {:priority 0},
     :rest-places-count      {:priority 0},
     :lit-route-length-km    {:priority 1},
     :ski-track-freestyle?   {:priority 0},
     :school-use?            {:priority 0},
     :route-length-km        {:priority 1}},
    :main-category 4000,
    :sub-category  4400},
   2520
   {:description
    {:fi
     "Katsomo on, katsomon koko määritellään ominaisuustiedoissa. Kenttien määrät yms. ominaisuuksiin.",
     :se
     "Läktare finns, storleken på läktaren anges i karakteristika, likaså antalet planer.",
     :en
     "Includes bleachers, whose size is specified in 'attribute data'. Number of fields, etc., specified in 'attribute data'."},
    :additional-type
    {:small       {:fi "Pieni kilpahalli > 500 hlö", :en nil, :se nil},
     :competition {:fi "Kilpahalli < 3000 hlö", :en nil, :se nil},
     :large       {:fi "Suurhalli > 3000 hlö", :en nil, :se nil}},
    :name
    {:fi "Kilpajäähalli",
     :se "Tävlingsishall",
     :en "Competition ice arena"},
    :type-code     2520,
    :main-category 2000,
    :status        "active",
    :sub-category  2500,
    :geometry-type "Point",
    :props
    {:heating?              {:priority 0},
     :field-2-area-m2       {:priority 0},
     :surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :field-3-length-m      {:priority 0},
     :field-2-length-m      {:priority 0},
     :automated-timing?     {:priority 0},
     :kiosk?                {:priority 0},
     :stand-capacity-person {:priority 0},
     :free-use?             {:priority 0},
     :field-1-length-m      {:priority 0},
     :finish-line-camera?   {:priority 0},
     :match-clock?          {:priority 0},
     :field-1-width-m       {:priority 0},
     :field-3-width-m       {:priority 0},
     :field-2-width-m       {:priority 0},
     :ice-rinks-count       {:priority 1},
     :field-1-area-m2       {:priority 0},
     :toilet?               {:priority 0},
     :area-m2               {:priority 1},
     :curling-lanes-count   {:priority 0},
     :scoreboard?           {:priority 0},
     :loudspeakers?         {:priority 0},
     :field-3-area-m2       {:priority 0},
     :school-use?           {:priority 0}}},
   4710
   {:name
    {:fi "Ulkokiipeilyseinä",
     :se "Utomhusklättervägg",
     :en "Open-air climbing wall"},
    :description
    {:fi
     "Rakennettu kiipeilyseinä ulkona. Korkeus ominaisuustietoihin. Myös boulderointipaikat.",
     :se
     "Byggd klättervägg utomhus. Höjden anges i karakteristika. Även platser för bouldering.",
     :en
     "Built outdoor climbing wall. Height given in 'attribute data'. Also includes bouldering venues."},
    :type-code     4710,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material       {:priority 0},
     :surface-material-info  {:priority 0},
     :free-use?              {:priority 0},
     :climbing-routes-count  {:priority 0},
     :ice-climbing?          {:priority 0},
     :climbing-wall-height-m {:priority 1},
     :area-m2                {:priority 1},
     :climbing-wall-width-m  {:priority 1},
     :ligthing?              {:priority 0},
     :school-use?            {:priority 0}},
    :main-category 4000,
    :sub-category  4700},
   304
   {:name
    {:fi "Ulkoilumaja/hiihtomaja",
     :se "Friluftsstuga/skidstuga",
     :en "Outdoor/ski lodge "},
    :description
    {:fi "Tavallisen arkiliikunnan taukopaikka, päiväkäyttöön.",
     :se "Rastplats för bruk under dagen, vardagsmotion.",
     :en "Rest area for regular daily sports, for daytime use."},
    :type-code     304,
    :status        "active",
    :geometry-type "Point",
    :props
    {:toilet?                           {:priority 0},
     :may-be-shown-in-excursion-map-fi? {:priority 0},
     :school-use?                       {:priority 0},
     :free-use?                         {:priority 0}},
    :main-category 0,
    :sub-category  3},
   4412
   {:name          {:fi "Pyöräilyreitti", :se "Cykelled", :en "Biking route"},
    :description
    {:fi "Pyöräilyreitti, ei maastopyöräilyyn.",
     :se "Cykelled, ej för terrängcykling.",
     :en "Biking route, not intended for cross-country biking."},
    :type-code     4412,
    :status        "active",
    :geometry-type "LineString",
    :props
    {:surface-material                  {:priority 1},
     :surface-material-info             {:priority 0},
     :free-use?                         {:priority 0},
     :may-be-shown-in-excursion-map-fi? {:priority 0},
     :route-width-m                     {:priority 0},
     :toilet?                           {:priority 0},
     :rest-places-count                 {:priority 0},
     :lit-route-length-km               {:priority 1},
     :school-use?                       {:priority 0},
     :route-length-km                   {:priority 1}},
    :main-category 4000,
    :sub-category  4400},
   4820
   {:name
    {:fi "Ampumaurheilukeskus",
     :se "Sportskyttecentrum",
     :en "Shooting sports centre"},
    :description
    {:fi
     "Ampumarata jossa myös palveluita. Sm-kisojen järjestäminen mahdollista.",
     :se "Skjutbana med tjänster. Möjligt att arrangera FM-tävlingar.",
     :en
     "Shooting range with services. National competitions possible."},
    :type-code     4820,
    :status        "active",
    :geometry-type "Point",
    :props
    {:kiosk?                   {:priority 0},
     :stand-capacity-person    {:priority 0},
     :free-use?                {:priority 0},
     :track-width-m            {:priority 0},
     :air-gun-shooting?        {:priority 0},
     :toilet?                  {:priority 0},
     :pistol-shooting?         {:priority 0},
     :shooting-positions-count {:priority 1},
     :area-m2                  {:priority 0},
     :rifle-shooting?          {:priority 0},
     :scoreboard?              {:priority 0},
     :loudspeakers?            {:priority 0},
     :shotgun-shooting?        {:priority 0},
     :free-rifle-shooting?     {:priority 0},
     :winter-usage?            {:priority 0},
     :ligthing?                {:priority 1},
     :accessibility-info       {:priority 0},
     :school-use?              {:priority 0},
     :track-length-m           {:priority 1}},
    :main-category 4000,
    :sub-category  4800},
   1170
   {:name          {:fi "Pyöräilyrata", :se "Cykelbana", :en "Velodrome"},
    :description
    {:fi "Ratapyöräilyä varten,ulkona (velodromi).",
     :se "Utomhus, velodrom.",
     :en "For track racing outdoors (velodrome)."},
    :type-code     1170,
    :status        "active",
    :geometry-type "Point",
    :props
    {:track-length-m        {:priority 1},
     :track-width-m         {:priority 1},
     :area-m2               {:priority 0},
     :surface-material-info {:priority 0},
     :ligthing?             {:priority 1},
     :surface-material      {:priority 1},
     :school-use?           {:priority 0},
     :free-use?             {:priority 0}},
    :main-category 1000,
    :sub-category  1100},
   4404
   {:name          {:fi "Luontopolku", :se "Naturstig", :en "Nature trail"},
    :description
    {:fi
     "Erityisesti luontoharrastusta varten, reitin varrella opasteita tai infotauluja.",
     :se
     "I synnerhet för naturintresse, info- och orienteringstavlor längs leden.",
     :en
     "Intended particularly for nature activities; signposts or info boards along the route."},
    :type-code     4404,
    :status        "active",
    :geometry-type "LineString",
    :props
    {:surface-material                  {:priority 0},
     :surface-material-info             {:priority 0},
     :free-use?                         {:priority 0},
     :may-be-shown-in-excursion-map-fi? {:priority 0},
     :route-width-m                     {:priority 0},
     :rest-places-count                 {:priority 0},
     :lit-route-length-km               {:priority 0},
     :accessibility-info                {:priority 0},
     :school-use?                       {:priority 0},
     :route-length-km                   {:priority 1}},
    :main-category 4000,
    :sub-category  4400},
   108
   {:name
    {:fi "Virkistysmetsä",
     :se "Friluftsskog",
     :en "Recreational forest"},
    :description
    {:fi
     "Metsähallituksen päätöksellä perustettu virkistysmetsä. Metsätaloudessa huomioidaan mm. maisemalliset arvot. Metsähallitus tietolähde.",
     :se
     "Grundad enligt Forststyrelsens beslut. I skogsbruket tas hänsyn till bl a landskapsvärden. Källa  Forststyrelsen.",
     :en
     "Recreational forest designated by Metsähallitus. E.g. scenic value is considered in forestry. Source of information  Metsähallitus."},
    :type-code     108,
    :status        "active",
    :geometry-type "Polygon",
    :props
    {:area-km2    {:priority 0},
     :school-use? {:priority 0},
     :free-use?   {:priority 0}},
    :main-category 0,
    :sub-category  1},
   4401
   {:name          {:fi "Kuntorata", :se "Konditionsbana", :en "Jogging track"},
    :description
    {:fi
     "Talvi- ja kesäkäyttötavat kerrotaan ominaisuustiedoissa. Kuntoiluun tarkoitettu reitti asutuksen läheisyydessä.",
     :se
     "Led avsedd för konditionssport i närheten av bebyggelse. Vinter- och sommaranvändning beskrivs i karakteristika. ",
     :en
     "Winter and summer uses specified in 'attribute data'. Route intended for jogging in or near a residential area."},
    :type-code     4401,
    :status        "active",
    :geometry-type "LineString",
    :props
    {:surface-material                  {:priority 1},
     :surface-material-info             {:priority 0},
     :free-use?                         {:priority 0},
     :may-be-shown-in-excursion-map-fi? {:priority 0},
     :outdoor-exercise-machines?        {:priority 0},
     :route-width-m                     {:priority 0},
     :toilet?                           {:priority 0},
     :rest-places-count                 {:priority 0},
     :shooting-positions-count          {:priority 0},
     :lit-route-length-km               {:priority 1},
     :accessibility-info                {:priority 0},
     :school-use?                       {:priority 0},
     :route-length-km                   {:priority 1}},
    :main-category 4000,
    :sub-category  4400},
   2350
   {:name
    {:fi "Tanssitila", :se "Utrymme för dans", :en "Dance studio"},
    :description
    {:fi "Pysyvästi tanssi- tai ilmaisuliikuntaan varustettu tila.",
     :se "Permanent utrustning för dans och kreativ motion.",
     :en
     "Space permanently equipped for dance or expressive movement exercise (tanssi- tai ilmaisuliikunta)."},
    :type-code     2350,
    :status        "active",
    :geometry-type "Point",
    :props
    {:group-exercise-rooms-count {:priority 0},
     :surface-material           {:priority 1},
     :area-m2                    {:priority 1},
     :surface-material-info      {:priority 0},
     :kiosk?                     {:priority 0},
     :height-m                   {:priority 0},
     :school-use?                {:priority 0},
     :free-use?                  {:priority 0}},
    :main-category 2000,
    :sub-category  2300},
   2340
   {:name
    {:fi "Miekkailutila",
     :se "Utrymme för fäktning",
     :en "Fencing venue"},
    :description
    {:fi "Pysyvästi miekkailuun varustettu tila.",
     :se "Permanent utrustning för fäktning.",
     :en "Space permanently equipped for fencing."},
    :type-code     2340,
    :status        "active",
    :geometry-type "Point",
    :props
    {:area-m2               {:priority 1},
     :surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :height-m              {:priority 0},
     :kiosk?                {:priority 0},
     :fencing-bases-count   {:priority 1},
     :school-use?           {:priority 0},
     :free-use?             {:priority 0}},
    :main-category 2000,
    :sub-category  2300},
   2120
   {:name          {:fi "Kuntosali", :se "Gym", :en "Gym"},
    :description
    {:fi
     "Kuntosalilaitteita yms. Koko määritellään ominaisuustiedoissa",
     :se "Gymredskap osv. Storleken anges i karakteristika.",
     :en "Gym equipment, etc. Size specified in 'attribute data'."},
    :type-code     2120,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material           {:priority 1},
     :surface-material-info      {:priority 0},
     :kiosk?                     {:priority 0},
     :free-use?                  {:priority 0},
     :group-exercise-rooms-count {:priority 0},
     :area-m2                    {:priority 1},
     :weight-lifting-spots-count {:priority 0},
     :spinning-hall?             {:priority 0},
     :school-use?                {:priority 0},
     :exercise-machines-count    {:priority 0}},
    :main-category 2000,
    :sub-category  2100},
   109
   {:name
    {:fi "Valtion retkeilyalue",
     :se "Statens friluftsområde",
     :en "National hiking area"},
    :description
    {:fi
     "Ulkoilulailla perustettu, retkeilyä ja luonnon virkistyskäyttöä varten. Metsähallitus tietolähde.",
     :se
     "Grundat enligt lagen om friluftsliv för att användas för friluftsliv och rekreation i naturen. Källa  Forststyrelsen.",
     :en
     "Established based on the Outdoor Recreation Act for hiking and recreational use of nature. Source of information  Metsähallitus."},
    :type-code     109,
    :status        "active",
    :geometry-type "Polygon",
    :props
    {:area-km2    {:priority 0},
     :school-use? {:priority 0},
     :free-use?   {:priority 0}},
    :main-category 0,
    :sub-category  1},
   5160
   {:name
    {:fi "Soudun ja melonnan sisäharjoittelutila",
     :se "Inomhusträningsutrymme för rodd och paddling",
     :en "Indoor training facility for rowing and canoeing"},
    :description
    {:fi "Erillinen liikuntapaikka, ei normaali uima-allas.",
     :se "Separat, ej normal simbassäng.",
     :en "Separate training facility, not a regular swimming pool."},
    :type-code     5160,
    :status        "active",
    :geometry-type "Point",
    :props
    {:area-m2     {:priority 0},
     :school-use? {:priority 0},
     :free-use?   {:priority 0}},
    :main-category 5000,
    :sub-category  5100},
   1550
   {:name
    {:fi "Luistelureitti", :se "Skridskoled", :en "Ice-skating route"},
    :description
    {:fi
     "Rakennetaan talvisin samalle alueelle esim. liikuntapuiston alueelle tai meren jäälle.",
     :se
     "Byggs varje vinter på samma område t ex i en idrottspark eller på havsis.",
     :en
     "Built yearly in the same area, e.g., in a sports park or on frozen lake/sea. Same as 'ice-skating route' in 'outdoor recreation routes'."},
    :type-code     1550,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material                  {:priority 1},
     :surface-material-info             {:priority 0},
     :kiosk?                            {:priority 0},
     :free-use?                         {:priority 0},
     :may-be-shown-in-excursion-map-fi? {:priority 0},
     :track-width-m                     {:priority 1},
     :toilet?                           {:priority 0},
     :equipment-rental?                 {:priority 0},
     :ligthing?                         {:priority 1},
     :school-use?                       {:priority 0},
     :track-length-m                    {:priority 1}},
    :main-category 1000,
    :sub-category  1500},
   3230
   {:name
    {:fi "Uimapaikka", :se "Badplats", :en "Unsupervised beach "},
    :description
    {:fi
     "Uimapaikka, jossa esim. pukukopit. Ei valvontaa. Talviuinti tallennetaan omana liikuntapaikkana.",
     :se
     "Badplats med t ex omklädningshytter men ej övervakning. Vinterbad sparas som egen idrottsplats.",
     :en "Beach with e.g. changing rooms. No lifeguards. "},
    :type-code     3230,
    :status        "active",
    :geometry-type "Point",
    :props
    {:kiosk?                            {:priority 0},
     :free-use?                         {:priority 0},
     :pier?                             {:priority 0},
     :may-be-shown-in-excursion-map-fi? {:priority 0},
     :beach-length-m                    {:priority 1},
     :toilet?                           {:priority 0},
     :shower?                           {:priority 0},
     :changing-rooms?                   {:priority 0},
     :sauna?                            {:priority 0},
     :other-platforms?                  {:priority 0},
     :school-use?                       {:priority 0}},
    :main-category 3000,
    :sub-category  3200},
   5130
   {:name
    {:fi "Moottoriveneurheilualue",
     :se "Område för motorbåtsport",
     :en "Motor boat sports area"},
    :description
    {:fi "Pysyvä nopeuskilpailujen rata-alue.",
     :se "Permanent banområde för hastighetstävlingar.",
     :en "Permanent track area for speed competitions."},
    :type-code     5130,
    :status        "active",
    :geometry-type "Point",
    :props
    {:pier?             {:priority 0},
     :area-km2          {:priority 0},
     :boat-places-count {:priority 0},
     :school-use?       {:priority 0},
     :free-use?         {:priority 0}},
    :main-category 5000,
    :sub-category  5100},
   5110
   {:name
    {:fi "Soutustadion", :se "Roddstadion", :en "Rowing stadium"},
    :description
    {:fi
     "Rakennettu pysyvästi soudulle. Katsomo ja valmius ratamerkintöihin.",
     :se
     "Byggt för rodd, permanent. Läktare och förberett för banmärkning.",
     :en
     "Permanent construction for rowing. Bleachers, track markings possible."},
    :type-code     5110,
    :status        "active",
    :geometry-type "Point",
    :props
    {:automated-timing?     {:priority 0},
     :stand-capacity-person {:priority 0},
     :free-use?             {:priority 0},
     :pier?                 {:priority 0},
     :toilet?               {:priority 0},
     :area-m2               {:priority 0},
     :scoreboard?           {:priority 0},
     :school-use?           {:priority 0},
     :track-length-m        {:priority 1}},
    :main-category 5000,
    :sub-category  5100},
   3240
   {:name
    {:fi "Talviuintipaikka",
     :se "Vinterbadplats",
     :en "Winter swimming area"},
    :description
    {:fi "Vain talviuintipaikka, mahdollisesti avanto.",
     :se "Endast vinterbadplats, eventuellt vak.",
     :en "Winter swimming area only, possibly a hole in the ice. "},
    :type-code     3240,
    :status        "active",
    :geometry-type "Point",
    :props
    {:kiosk?          {:priority 0},
     :free-use?       {:priority 0},
     :pier?           {:priority 0},
     :toilet?         {:priority 0},
     :shower?         {:priority 0},
     :changing-rooms? {:priority 0},
     :ice-reduction?  {:priority 0},
     :sauna?          {:priority 0},
     :school-use?     {:priority 0}},
    :main-category 3000,
    :sub-category  3200},
   4510
   {:name
    {:fi "Suunnistusalue",
     :se "Orienteringsområde",
     :en "Orienteering area"},
    :description
    {:fi "Ilmoitettu suunnistusliitolle. Alueesta kartta.",
     :se
     "Anmält till orienteringsförbundet. Karta över området tillgänglig.",
     :en
     "The Finnish Orienteering Federation has been informed. A map of the area available."},
    :type-code     4510,
    :status        "active",
    :geometry-type "Polygon",
    :props
    {:area-km2    {:priority 0},
     :school-use? {:priority 0},
     :free-use?   {:priority 0}},
    :main-category 4000,
    :sub-category  4500},
   4240
   {:name
    {:fi "Lasketteluhalli",
     :se "Slalomhall",
     :en "Downhill skiing hall"},
    :description
    {:fi
     "Katettu laskettelurinne. Korkeusero ja pituus ominaisuuksiin.",
     :se
     "Slalombacke med tak. Höjdskillnad och längd i karakteristika.",
     :en
     "Covered ski slope. Height and length specified in attributes."},
    :type-code     4240,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :kiosk?                {:priority 0},
     :free-use?             {:priority 0},
     :ski-service?          {:priority 0},
     :altitude-difference   {:priority 1},
     :toilet?               {:priority 0},
     :area-m2               {:priority 0},
     :equipment-rental?     {:priority 0},
     :school-use?           {:priority 0},
     :route-length-km       {:priority 1}},
    :main-category 4000,
    :sub-category  4200},
   2270
   {:name          {:fi "Squash-halli", :se "Squashhall", :en "Squash hall"},
    :description
    {:fi
     "Squash-kenttiä yksi tai useampi. Kenttien määrä ominaisuustietoihin",
     :se
     "En eller flera squashplaner. Antalet planer i karakteristika.",
     :en
     "One or more squash courts. Number of courts specified in 'attribute data'."},
    :type-code     2270,
    :status        "active",
    :geometry-type "Point",
    :props
    {:height-m                {:priority 1},
     :surface-material        {:priority 1},
     :surface-material-info   {:priority 0},
     :kiosk?                  {:priority 0},
     :stand-capacity-person   {:priority 0},
     :free-use?               {:priority 0},
     :tennis-courts-count     {:priority 0},
     :field-length-m          {:priority 0},
     :badminton-courts-count  {:priority 0},
     :toilet?                 {:priority 0},
     :area-m2                 {:priority 1},
     :field-width-m           {:priority 0},
     :scoreboard?             {:priority 0},
     :floorball-fields-count  {:priority 0},
     :squash-courts-count     {:priority 1},
     :volleyball-fields-count {:priority 0},
     :school-use?             {:priority 0}},
    :main-category 2000,
    :sub-category  2200},
   4210
   {:name          {:fi "Curlingrata", :se "Curlingbana", :en "Curling sheet"},
    :description
    {:fi "Pysyvästi lajiin varustettu, katettu curlingrata.",
     :se "Curlingbana med tak och permanent utrustning för grenen.",
     :en "Covered track permanently equipped for curling."},
    :type-code     4210,
    :status        "active",
    :geometry-type "Point",
    :props
    {:kiosk?                {:priority 0},
     :surface-material      {:priority 1},
     :toilet?               {:priority 0},
     :surface-material-info {:priority 0},
     :area-m2               {:priority 1},
     :fields-count          {:priority 1},
     :school-use?           {:priority 0},
     :free-use?             {:priority 0}},
    :main-category 4000,
    :sub-category  4200},
   301
   {:name
    {:fi "Laavu, kota tai kammi",
     :se "Vindskydd eller kåta",
     :en "Lean-to, goahti (Lapp tent shelter) or 'kammi' earth lodge"},
    :description
    {:fi "Päiväsaikainen levähdyspaikka retkeilijöille.",
     :se "Viloplats för vandrare under dagtid.",
     :en "Daytime rest stop for hikers."},
    :type-code     301,
    :status        "active",
    :geometry-type "Point",
    :props
    {:may-be-shown-in-excursion-map-fi? {:priority 0},
     :toilet?                           {:priority nil},
     :school-use?                       {:priority 0},
     :free-use?                         {:priority 0}},
    :main-category 0,
    :sub-category  3},
   111
   {:name
    {:fi "Kansallispuisto", :se "Nationalpark", :en "National park"},
    :description
    {:fi
     "Luonnonsuojelualueita, joiden perustamisesta ja tarkoituksesta on säädetty lailla. Pinta- ala väh. 1000 ha. Metsähallitus tietolähde.",
     :se
     "Naturskyddsområden med lagstadgad status och uppgift. Areal minst 1000 ha. Källa  Forststyrelsen",
     :en
     "Nature conservation areas whose establishment and purpose are based on legislation. Min. area 1,000 ha. Source of information  Metsähallitus."},
    :type-code     111,
    :status        "active",
    :geometry-type "Polygon",
    :props
    {:area-km2    {:priority 0},
     :school-use? {:priority 0},
     :free-use?   {:priority 0}},
    :main-category 0,
    :sub-category  1},
   4630
   {:name
    {:fi "Kilpahiihtokeskus",
     :se "Skidtävlingscentrum",
     :en "Ski competition centre"},
    :description
    {:fi "Lähtö- ja maalialue, huoltotilat. Latuja.",
     :se "Start- och målområden, serviceutrymmen, spårsystem.",
     :en "Start and finish area, service premises. Tracks."},
    :type-code     4630,
    :status        "active",
    :geometry-type "Point",
    :props
    {:automated-timing?      {:priority 0},
     :kiosk?                 {:priority 0},
     :stand-capacity-person  {:priority 0},
     :free-use?              {:priority 0},
     :ski-service?           {:priority 0},
     :finish-line-camera?    {:priority 0},
     :ski-track-traditional? {:priority 0},
     :route-width-m          {:priority 0},
     :toilet?                {:priority 0},
     :shower?                {:priority 0},
     :rest-places-count      {:priority 0},
     :changing-rooms?        {:priority 0},
     :lit-route-length-km    {:priority 0},
     :scoreboard?            {:priority 0},
     :sauna?                 {:priority 0},
     :loudspeakers?          {:priority 0},
     :accessibility-info     {:priority 0},
     :ski-track-freestyle?   {:priority 0},
     :school-use?            {:priority 0},
     :route-length-km        {:priority 0}},
    :main-category 4000,
    :sub-category  4600},
   4810
   {:name
    {:fi "Ampumarata", :se "Skjutbana", :en "Open-air shooting range"},
    :description
    {:fi "Ulkoampumarata yhdelle tai useammalle lajille. ",
     :se "Utomhusskjutbana för en eller flera grenar.",
     :en "Outdoor shooting range for one or more sports. "},
    :type-code     4810,
    :status        "active",
    :geometry-type "Point",
    :props
    {:kiosk?                   {:priority 0},
     :stand-capacity-person    {:priority 0},
     :free-use?                {:priority 0},
     :track-width-m            {:priority 0},
     :air-gun-shooting?        {:priority 0},
     :toilet?                  {:priority 0},
     :pistol-shooting?         {:priority 0},
     :shooting-positions-count {:priority 1},
     :area-m2                  {:priority 0},
     :rifle-shooting?          {:priority 0},
     :scoreboard?              {:priority 0},
     :loudspeakers?            {:priority 0},
     :shotgun-shooting?        {:priority 0},
     :free-rifle-shooting?     {:priority 0},
     :winter-usage?            {:priority 0},
     :ligthing?                {:priority 1},
     :accessibility-info       {:priority 0},
     :school-use?              {:priority 0},
     :track-length-m           {:priority 1}},
    :main-category 4000,
    :sub-category  4800},
   1540
   {:name
    {:fi "Pikaluistelurata",
     :se "Bana för hastighetsåkning på skridskor",
     :en "Speed-skating track"},
    :description
    {:fi "Radan koko ja pituus ominaisuustietoihin.",
     :se "Storlek och längd på banan i karakteristika.",
     :en "Track size and length specified in 'attribute data'."},
    :type-code     1540,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :kiosk?                {:priority 0},
     :stand-capacity-person {:priority 0},
     :free-use?             {:priority 0},
     :track-width-m         {:priority 1},
     :toilet?               {:priority 0},
     :area-m2               {:priority 0},
     :ligthing?             {:priority 1},
     :school-use?           {:priority 0},
     :track-length-m        {:priority 1}},
    :main-category 1000,
    :sub-category  1500},
   5320
   {:name
    {:fi "Moottoripyöräilyalue",
     :se "Område för motorcykelsport",
     :en "Motorcycling area"},
    :description
    {:fi
     "Pääasiallisesti moottoripyöräilyä varten. Lajityypit mainitaan ominaisuustiedoissa.",
     :se
     "Huvudsakligen för motorcykelsport. Möjliga grenar anges i karakteristika.",
     :en
     "Mainly for motorcycling. Sports types detailed in 'attribute data'."},
    :type-code     5320,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material           {:priority 1},
     :surface-material-info      {:priority 0},
     :automated-timing?          {:priority 0},
     :kiosk?                     {:priority 0},
     :stand-capacity-person      {:priority 0},
     :free-use?                  {:priority 0},
     :track-width-m              {:priority 0},
     :area-m2                    {:priority 0},
     :scoreboard?                {:priority 0},
     :loudspeakers?              {:priority 0},
     :ligthing?                  {:priority 0},
     :covered-stand-person-count {:priority 0},
     :school-use?                {:priority 0},
     :track-length-m             {:priority 1}},
    :main-category 5000,
    :sub-category  5300},
   3210
   {:name          {:fi "Maauimala", :se "Utebassäng", :en "Open-air pool "},
    :description
    {:fi "Vedenpuhdistusjärjestelmä.",
     :se "Vattenreningssystem.",
     :en "Water treatment system."},
    :type-code     3210,
    :status        "active",
    :geometry-type "Point",
    :props
    {:pool-tracks-count     {:priority 0},
     :kiosk?                {:priority 0},
     :stand-capacity-person {:priority 0},
     :free-use?             {:priority 0},
     :pool-width-m          {:priority 0},
     :pool-min-depth-m      {:priority 0},
     :toilet?               {:priority 0},
     :swimming-pool-count   {:priority 1},
     :pool-water-area-m2    {:priority 1},
     :pool-length-m         {:priority 0},
     :other-pools-count     {:priority 0},
     :pool-max-depth-m      {:priority 0},
     :loudspeakers?         {:priority 0},
     :pool-temperature-c    {:priority 0},
     :school-use?           {:priority 0}},
    :main-category 3000,
    :sub-category  3200},
   4640
   {:name
    {:fi "Hiihtomaa", :se "Skidland", :en "Cross-country ski park"},
    :description
    {:fi "Hiihdon harjoittelupaikka, tekniikkahalsteri ym.",
     :se "Träningsplats för skidåkning, teknikhalster mm.",
     :en
     "Ski training venue, an area of parallel short ski tracks for ski instruction, etc."},
    :type-code     4640,
    :status        "active",
    :geometry-type "Point",
    :props
    {:kiosk?                 {:priority 0},
     :free-use?              {:priority 0},
     :ski-service?           {:priority 0},
     :ski-track-traditional? {:priority 0},
     :toilet?                {:priority 0},
     :rest-places-count      {:priority 0},
     :lit-route-length-km    {:priority 0},
     :scoreboard?            {:priority 0},
     :equipment-rental?      {:priority 0},
     :loudspeakers?          {:priority 0},
     :accessibility-info     {:priority 0},
     :ski-track-freestyle?   {:priority 0},
     :school-use?            {:priority 0},
     :route-length-km        {:priority 0}},
    :main-category 4000,
    :sub-category  4600},
   1150
   {:name
    {:fi "Skeitti-/rullaluistelupaikka",
     :se "Plats för skejtning/rullskridskoåkning",
     :en "Skateboarding/roller-blading rink "},
    :description
    {:fi
     "Rullaluistelua, skeittausta, potkulautailua varten varustettu paikka. Ominaisuustietoihin kirjataan, mitä saa harrastaa.",
     :se
     "Plats utrustad för rullskridskoåkning, skejtning och sparkcykelåkning. I preciseringsuppgifterna anges vad som är tillåtet på området.",
     :en
     "An area equipped  for roller-blading, skateboarding, kick scooting. Hobby  specified in 'attribute data'."},
    :type-code     1150,
    :status        "active",
    :geometry-type "Point",
    :props
    {:area-m2               {:priority 1},
     :surface-material-info {:priority 0},
     :surface-material      {:priority 1},
     :ligthing?             {:priority 1},
     :school-use?           {:priority 0},
     :free-use?             {:priority 0}},
    :main-category 1000,
    :sub-category  1100},
   2310
   {:name
    {:fi "Yksittäinen yleisurheilun suorituspaikka",
     :se "Enstaka övningsplats för friidrott",
     :en "Stand-alone athletics venue"},
    :description
    {:fi
     "Yksittäinen, ei yu-hallin yhteydessä. Ominaisuustiedoissa kerrotaan suorituspaikat (alla esimerkit).",
     :se
     "Fristående, ej i anslutning till en friidrottshall. I karakteristika anges övningsplatserna (exemplifieras nedan).",
     :en
     "Stand-alone, not in an athletics hall. Venues specified under 'attribute data' (examples below)."},
    :type-code     2310,
    :status        "active",
    :geometry-type "Point",
    :props
    {:height-m                   {:priority 0},
     :surface-material           {:priority 1},
     :surface-material-info      {:priority 0},
     :free-use?                  {:priority 0},
     :javelin-throw-places-count {:priority 0},
     :sprint-track-length-m      {:priority 0},
     :inner-lane-length-m        {:priority 0},
     :discus-throw-places        {:priority 0},
     :hammer-throw-places-count  {:priority 0},
     :polevault-places-count     {:priority 0},
     :area-m2                    {:priority 0},
     :shotput-count              {:priority 0},
     :longjump-places-count      {:priority 0},
     :school-use?                {:priority 0},
     :highjump-places-count      {:priority 0}},
    :main-category 2000,
    :sub-category  2300},
   5210
   {:name
    {:fi "Urheiluilmailualue",
     :se "Område för flygsport",
     :en "Sport aviation area"},
    :description   {:fi nil, :se nil, :en nil},
    :type-code     5210,
    :status        "active",
    :geometry-type "Point",
    :props
    {:track-length-m        {:priority 0},
     :area-m2               {:priority 0},
     :surface-material-info {:priority nil},
     :surface-material      {:priority nil},
     :track-width-m         {:priority 0},
     :school-use?           {:priority 0},
     :free-use?             {:priority 0}},
    :main-category 5000,
    :sub-category  5200},
   2380
   {:name          {:fi "Parkour-sali", :se "Parkoursal", :en "Parkour hall"},
    :description
    {:fi "Parkouria varten varustettu sisätila. ",
     :se "Inomhusutrymme utrustat för parkour.",
     :en "Indoor space equipped for parkour. "},
    :type-code     2380,
    :status        "active",
    :geometry-type "Point",
    :props
    {:height-m                 {:priority 0},
     :surface-material         {:priority 0},
     :surface-material-info    {:priority 0},
     :kiosk?                   {:priority 0},
     :free-use?                {:priority 0},
     :climbing-routes-count    {:priority 0},
     :climbing-wall-height-m   {:priority 0},
     :gymnastic-routines-count {:priority 0},
     :area-m2                  {:priority 1},
     :landing-places-count     {:priority 0},
     :school-use?              {:priority 0}},
    :main-category 2000,
    :sub-category  2300},
   103
   {:name
    {:fi "Ulkoilualue", :se "Friluftsområde", :en "Outdoor area"},
    :description
    {:fi
     "Taajamien reunoilla tai vyöhykkeittäin taajaman sisällä. 1-10 km päässä asuinalueista. Käytetään esim. kävelyyn, hiihtoon, lenkkeilyyn, uintiin jne. Yleensä yhden kunnan virkistysaluetarpeita palveleva, tarjoaa monipuolisia liikuntamahdollisuuksia. Voi olla metsää, suota, peltoja, luonnonmukaisia alueita ja puistomaisia osia. Kaavamerkintä VR.",
     :se
     "I utkanten av tätorter eller i zoner inom tätorten. Avstånd från bebyggelse 1-10 km. Används till promenader, skidåkning, joggning, simning osv. I regel friluftsaktiviteter för en kommun. En stor variation av motionsmöjligheter. Kan bestå av skog, kärr, åkrar, naturenliga områden och parkliknande delar. Planbeteckning VR.  ",
     :en
     "On the edge of population centres or zoned within population centres. 1-10 km from residential areas. Used for e.g. walks, skiing, jogging, swimming. Serves usually recreational needs within one municipality, offers versatile sports facilities. May include forest, swamp, fields, natural areas and park areas. Symbol VR."},
    :type-code     103,
    :status        "active",
    :geometry-type "Polygon",
    :props
    {:may-be-shown-in-excursion-map-fi? {:priority 0},
     :playground?                       {:priority 0},
     :area-km2                          {:priority 0},
     :school-use?                       {:priority 0},
     :free-use?                         {:priority 0}},
    :main-category 0,
    :sub-category  1},
   201
   {:name
    {:fi "Kalastusalue/-paikka",
     :se "Område eller plats för fiske",
     :en "Fishing area/spot "},
    :description
    {:fi
     "Luonnonvesistössä sijaitseva virkistyskalastusta varten varustettu ja hoidettu kohde.",
     :se
     "Område eller en plats i ett naturligt vattendrag som ställts i ordning för fritidsfiske.",
     :en
     "Natural aquatic destination equipped and maintained for recreational fishing."},
    :type-code     201,
    :status        "active",
    :geometry-type "Point",
    :props
    {:toilet?     {:priority nil},
     :school-use? {:priority 0},
     :free-use?   {:priority 0}},
    :main-category 0,
    :sub-category  2},
   1220
   {:name
    {:fi "Yleisurheilukenttä",
     :se "Friidrottsplan",
     :en "Athletics field"},
    :description
    {:fi
     "Kenttä, ratoja ja yleisurheilun suorituspaikkoja. Keskusta, radat, päällysteet, suorituspaikat ominaisuuksiin.",
     :se
     "En plan, banor och träningsplatser för friidrott. Centrum, banor, ytbeläggningar samt träningsplatser med beskrivningar.",
     :en
     "Field, track and athletic venues/facilities. Centre, tracks, surfaces, venues specified in 'attribute data'. "},
    :type-code     1220,
    :status        "active",
    :geometry-type "Point",
    :props
    {:heating?                       {:priority 0},
     :surface-material               {:priority 1},
     :surface-material-info          {:priority 0},
     :automated-timing?              {:priority 0},
     :kiosk?                         {:priority 0},
     :stand-capacity-person          {:priority 0},
     :free-use?                      {:priority 0},
     :sprint-lanes-count             {:priority 0},
     :javelin-throw-places-count     {:priority 0},
     :finish-line-camera?            {:priority 0},
     :field-length-m                 {:priority 1},
     :circular-lanes-count           {:priority 0},
     :match-clock?                   {:priority 0},
     :sprint-track-length-m          {:priority 0},
     :inner-lane-length-m            {:priority 0},
     :discus-throw-places            {:priority 0},
     :hammer-throw-places-count      {:priority 0},
     :polevault-places-count         {:priority 0},
     :toilet?                        {:priority 0},
     :running-track-surface-material {:priority 1},
     :area-m2                        {:priority 1},
     :field-width-m                  {:priority 1},
     :scoreboard?                    {:priority 0},
     :shotput-count                  {:priority 0},
     :longjump-places-count          {:priority 0},
     :loudspeakers?                  {:priority 0},
     :ligthing?                      {:priority 1},
     :covered-stand-person-count     {:priority 0},
     :school-use?                    {:priority 0},
     :highjump-places-count          {:priority 0},
     :training-spot-surface-material {:priority 0}},
    :main-category 1000,
    :sub-category  1200},
   4411
   {:name
    {:fi "Maastopyöräilyreitti",
     :se "Cykelled för terrängcykling",
     :en "Cross-country biking route"},
    :description
    {:fi "Erityisesti maastopyöräilyyn tarkoitettu reitti, merkitty.",
     :se "Led avsedd framför allt för terrängcykling, märkt.",
     :en "Marked route intended especially for cross-country biking."},
    :type-code     4411,
    :status        "active",
    :geometry-type "LineString",
    :props
    {:surface-material                  {:priority 1},
     :surface-material-info             {:priority 0},
     :free-use?                         {:priority 0},
     :may-be-shown-in-excursion-map-fi? {:priority 0},
     :route-width-m                     {:priority 0},
     :toilet?                           {:priority 0},
     :rest-places-count                 {:priority 0},
     :lit-route-length-km               {:priority 1},
     :school-use?                       {:priority 0},
     :route-length-km                   {:priority 1}},
    :main-category 4000,
    :sub-category  4400},
   1140
   {:name
    {:fi "Parkour-alue", :se "Parkourområde", :en "Parkour area"},
    :description
    {:fi "Parkouria varten varustettu alue.",
     :se "Område utrustat för parkour.",
     :en "An area equipped for parkour."},
    :type-code     1140,
    :status        "active",
    :geometry-type "Point",
    :props
    {:area-m2               {:priority 1},
     :surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :ligthing?             {:priority 1},
     :school-use?           {:priority 0},
     :free-use?             {:priority 0}},
    :main-category 1000,
    :sub-category  1100},
   4520
   {:name
    {:fi "Hiihtosuunnistusalue",
     :se "Skidorienteringsområde",
     :en "Ski orienteering area"},
    :description
    {:fi "Alueesta hiihtosuunnistuskartta, ei kesäsuunnistusalue.",
     :se
     "Skidorienteringskarta över området, ej för sommarorientering.",
     :en
     "A ski orienteering map of the area available; no summer orienteering."},
    :type-code     4520,
    :status        "active",
    :geometry-type "Polygon",
    :props
    {:area-km2    {:priority 0},
     :school-use? {:priority 0},
     :free-use?   {:priority 0}},
    :main-category 4000,
    :sub-category  4500},
   107
   {:name
    {:fi "Matkailupalveluiden alue",
     :se "Område med turisttjänster",
     :en "Tourist services area"},
    :description
    {:fi
     "Matkailupalvelujen alueet ovat matkailu- ja lomakeskuksille, lomakylille, lomahotelleille ja muille vastaaville matkailua palveleville toiminnoille varattuja alueita, jotka sisältävät myös sisäiset liikenneväylät ja -alueet, alueen toimintoja varten tarpeelliset palvelut ja virkistysalueet sekä yhdyskuntateknisen huollon alueet. Kaavamerkintä RM.",
     :se
     "Områden med turisttjänster har reserverats för turist- och semestercentra, semesterbyar, semesterhotell och motsvarande aktörer. De har egna trafikleder och -områden samt områden för egna serviceenheter och egen infrastruktur för aktiviteter.  Planbeteckning RM.",
     :en
     "Area reserved for tourism and holiday centres, holiday villages, hotels, etc., also including internal traffic routes and areas; services and recreational areas needed for operations, as well as technical maintenance areas. Symbol RM."},
    :type-code     107,
    :status        "active",
    :geometry-type "Polygon",
    :props
    {:area-km2    {:priority 0},
     :school-use? {:priority 0},
     :free-use?   {:priority 0}},
    :main-category 0,
    :sub-category  1},
   6110
   {:name
    {:fi "Ratsastuskenttä", :se "Ridbana", :en "Equestrian field"},
    :description
    {:fi "Ratsastukseen varattu kenttä. Koko ominasuustietoihin.",
     :se "Bana avsedd för ridning. Storlek i karakteristika.",
     :en
     "Field reserved for horseback riding. Size specified in 'attribute data'."},
    :type-code     6110,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :kiosk?                {:priority 0},
     :free-use?             {:priority 0},
     :field-length-m        {:priority 1},
     :toilet?               {:priority 0},
     :show-jumping?         {:priority 0},
     :area-m2               {:priority 1},
     :field-width-m         {:priority 1},
     :ligthing?             {:priority 1},
     :school-use?           {:priority 0}},
    :main-category 6000,
    :sub-category  6100},
   1120
   {:name
    {:fi "Lähiliikuntapaikka",
     :se "Näridrottsplats",
     :en "Neighbourhood sports area"},
    :description
    {:fi
     "Lähiliikuntapaikka on tarkoitettu päivittäiseen ulkoiluun ja liikuntaan. Se sijaitsee asutuksen välittömässä läheisyydessä, on pienimuotoinen ja alueelle on vapaa pääsy. Yleensä tarjolla on erilaisia suorituspaikkoja. Lisätietoihin jos on koulun piha, päiväkodin piha,  suorituspaikat jne.",
     :se
     "Näridrottsplats avsedd för daglig motion och dagligt friluftsliv. Den ligger i omedelbar närhet till bebyggelse, är relativt liten och tillträdet är fritt. I regel erbjuds olika faciliteter för enstaka aktiviteter. I tilläggsinformation anges om det är en skolgård eller daghemsgård samt vilka enskilda faciliteter som finns.",
     :en
     "A neighbourhood sports area is intended for daily outdoor activities and exercise. It is a small area located in or near a residential area, with free public access. It usually provides different exercise/play facilities. It is specified in 'additional information' whether it is a school/nursery school yard, what facilities/equipment are offered, etc."},
    :type-code     1120,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material        {:priority 1},
     :surface-material-info   {:priority 0},
     :free-use?               {:priority 0},
     :fields-count            {:priority 0},
     :ice-rinks-count         {:priority 0},
     :area-m2                 {:priority 1},
     :ligthing?               {:priority 1},
     :accessibility-info      {:priority 0},
     :playground?             {:priority 0},
     :school-use?             {:priority 0},
     :exercise-machines-count {:priority 0}},
    :main-category 1000,
    :sub-category  1100},
   5340
   {:name          {:fi "Karting-rata", :se "Kartingbana", :en "Kart circuit"},
    :description
    {:fi "Pääasiallisesti karting-ajoa varten",
     :se "Huvudsakligen för karting.",
     :en "Mainly for karting."},
    :type-code     5340,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :automated-timing?     {:priority 0},
     :free-use?             {:priority 0},
     :track-width-m         {:priority 0},
     :area-m2               {:priority 0},
     :ligthing?             {:priority 0},
     :school-use?           {:priority 0},
     :track-length-m        {:priority 1}},
    :main-category 5000,
    :sub-category  5300},
   302
   {:name          {:fi "Tupa", :se "Stuga", :en "Hut"},
    :description
    {:fi
     "Autiotupa, varaustupa, taukotupa, päivätupa. Yöpymis- ja levähdyspaikka retkeilijöille. Autiotupa avoin, varaustupa lukittu ja maksullinen. Päivätupa päiväkäyttöön.",
     :se
     "Ödestuga, reserveringsstuga, raststuga, dagstuga. Övernattnings- och rastplats för vandrare. Ödestugan öppen, reserveringsstugan låst och avgiftsbelagd. Dagstuga för bruk under dagen.",
     :en
     "Open hut, reservable hut, rest hut, day hut. Overnight resting place for hikers. An open hut is freely available; a reservable hut locked and subject to a charge. A day hut is for daytime use."},
    :type-code     302,
    :status        "active",
    :geometry-type "Point",
    :props
    {:may-be-shown-in-excursion-map-fi? {:priority 0},
     :toilet?                           {:priority nil},
     :school-use?                       {:priority 0},
     :free-use?                         {:priority 0}},
    :main-category 0,
    :sub-category  3},
   4405
   {:name
    {:fi "Retkeilyreitti", :se "Utflyktsled", :en "Hiking route"},
    :description
    {:fi
     "Maastossa oleva retkeilyreitti, yleensä kauempana asutuksesta. Reitin varrella retkeilyn palveluita, esim. laavuja. Kesä- ja talvikäyttö ominaisuustietoihin.",
     :se
     "Utflyktsled i terrängen, oftast längre borta från bebyggelse. Längs rutten friluftstjänster, t ex vindskydd. Sommar- och vinteranvändning i karakteristika.",
     :en
     "Natural hiking route, usually further away from residential areas. Provides hiking facilities, e.g. lean-to structures. Summer and winter use specified in 'attribute data'."},
    :type-code     4405,
    :status        "active",
    :geometry-type "LineString",
    :props
    {:surface-material                  {:priority 0},
     :surface-material-info             {:priority 0},
     :free-use?                         {:priority 0},
     :may-be-shown-in-excursion-map-fi? {:priority 0},
     :route-width-m                     {:priority 0},
     :toilet?                           {:priority 0},
     :rest-places-count                 {:priority 0},
     :lit-route-length-km               {:priority 1},
     :accessibility-info                {:priority 0},
     :school-use?                       {:priority 0},
     :route-length-km                   {:priority 1}},
    :main-category 4000,
    :sub-category  4400},
   6120
   {:name
    {:fi "Ratsastusmaneesi", :se "Ridmanege", :en "Riding manège"},
    :description
    {:fi "Kylmä tai lämmin, katettu tila ratsastukseen.",
     :se "Kallt eller varmt takförsett utrymme för ridning.",
     :en "Cold or warm, covered space for horseback riding."},
    :type-code     6120,
    :status        "active",
    :geometry-type "Point",
    :props
    {:heating?              {:priority 0},
     :surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :kiosk?                {:priority 0},
     :stand-capacity-person {:priority 0},
     :free-use?             {:priority 0},
     :field-length-m        {:priority 1},
     :toilet?               {:priority 0},
     :show-jumping?         {:priority 0},
     :area-m2               {:priority 1},
     :field-width-m         {:priority 1},
     :ligthing?             {:priority 1},
     :school-use?           {:priority 0}},
    :main-category 6000,
    :sub-category  6100},
   1310
   {:name
    {:fi "Koripallokenttä", :se "Basketplan", :en "Basketball court"},
    :description
    {:fi
     "Koripalloon varustettu kenttä, kiinteät tai siirrettävät telineet.  Minikenttä ja yhden korin kenttä lisätiedoissa. ",
     :se
     "Plan utrustad för basket med fasta eller flyttbara ställningar. Miniplan och enkorgsplan i tilläggsupgifter.",
     :en
     "A field equipped for basketball, with fixed or movable apparatus. 'Mini-court' and 'one-basket court'  included in additional information. "},
    :type-code     1310,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :free-use?             {:priority 0},
     :field-length-m        {:priority 1},
     :match-clock?          {:priority 0},
     :fields-count          {:priority 0},
     :toilet?               {:priority 0},
     :area-m2               {:priority 1},
     :field-width-m         {:priority 1},
     :scoreboard?           {:priority 0},
     :ligthing?             {:priority 1},
     :basketball-field-type {:priority 0},
     :school-use?           {:priority 0}},
    :main-category 1000,
    :sub-category  1300},
   202
   {:name
    {:fi "Telttailu ja leiriytyminen",
     :se "Tältning och läger",
     :en "Camping"},
    :description
    {:fi "Telttailualue tai muu leiriytymiseen osoitettu paikka. ",
     :se "Tältplats eller annat område ordnat för tältning.",
     :en "Camping site for tents or other encampment. "},
    :type-code     202,
    :status        "active",
    :geometry-type "Point",
    :props
    {:toilet?                           {:priority 0},
     :may-be-shown-in-excursion-map-fi? {:priority 0},
     :school-use?                       {:priority 0},
     :free-use?                         {:priority 0}},
    :main-category 0,
    :sub-category  2},
   1620
   {:name          {:fi "Golfkenttä", :se "Golfbana", :en "Golf course"},
    :description
    {:fi
     "Virallinen golfkenttä. Reikien määrä kysytään ominaisuustiedoissa.",
     :se "Officiell golfbana. Antalet hål anges i karakteristika.",
     :en
     "Official golf course. Number of holes included in 'attribute data'."},
    :type-code     1620,
    :status        "active",
    :geometry-type "Point",
    :props
    {:range?      {:priority 0},
     :holes-count {:priority 1},
     :ligthing?   {:priority 1},
     :toilet?     {:priority 0},
     :green?      {:priority 0},
     :school-use? {:priority 0},
     :free-use?   {:priority 0}},
    :main-category 1000,
    :sub-category  1600},
   2250
   {:name
    {:fi "Skeittihalli", :se "Skateboardhall", :en "Indoor skatepark"},
    :description
    {:fi
     "Skeittausta, rullaluistelua, bmx- pyöräilyä yms. varten varustettu halli.",
     :se
     "Hall utrustad för skejtning, rullskridskoåkning, bmx-åkning osv, finns i Idrottshallar.",
     :en
     "An area for skateboarding, roller-blading, BMX biking, etc,. found in sports halls."},
    :type-code     2250,
    :status        "active",
    :geometry-type "Point",
    :props
    {:height-m              {:priority 0},
     :surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :kiosk?                {:priority 0},
     :free-use?             {:priority 0},
     :toilet?               {:priority 0},
     :area-m2               {:priority 1},
     :scoreboard?           {:priority 0},
     :school-use?           {:priority 0}},
    :main-category 2000,
    :sub-category  2200},
   2530
   {:name
    {:fi "Pikaluisteluhalli",
     :se "Skridskohall",
     :en "Speed-skating hall"},
    :description
    {:fi "Pikaluisteluun tarkoitettu halli. Koko > 333,3 m.",
     :se
     "Hall avsedd för hastighetsåkning på skridsko. Storlek > 333,3 m.",
     :en "Hall intended for speed-skating. Size > 333.3 m."},
    :type-code     2530,
    :status        "active",
    :geometry-type "Point",
    :props
    {:heating?              {:priority 0},
     :field-2-area-m2       {:priority 0},
     :surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :field-3-length-m      {:priority 0},
     :field-2-length-m      {:priority 0},
     :automated-timing?     {:priority 0},
     :kiosk?                {:priority 0},
     :stand-capacity-person {:priority 0},
     :free-use?             {:priority 0},
     :field-1-length-m      {:priority 0},
     :finish-line-camera?   {:priority 0},
     :match-clock?          {:priority 0},
     :field-1-width-m       {:priority 0},
     :field-3-width-m       {:priority 0},
     :field-2-width-m       {:priority 0},
     :ice-rinks-count       {:priority 1},
     :field-1-area-m2       {:priority 0},
     :toilet?               {:priority 0},
     :area-m2               {:priority 1},
     :scoreboard?           {:priority 0},
     :loudspeakers?         {:priority 0},
     :field-3-area-m2       {:priority 0},
     :school-use?           {:priority 0}},
    :main-category 2000,
    :sub-category  2500},
   112
   {:name
    {:fi "Muu luonnonsuojelualue, jolla on virkistyspalveluita",
     :se "Annat naturskyddsområde med rekreationstjänster",
     :en "Other nature conservation area with recreational services"},
    :description
    {:fi
     "Muut luonnonsuojelualueet kuin kansallispuistot ja luonnonpuistot. Vain luonnonsuojelualueet, joilla virkistyskäyttö on mahdollista. Esim. kuntien ja yksityisten maille perustetut suojelualueet. Kaavamerkintä S, SL.",
     :se
     "Andra naturskyddsområden än nationalparker och naturparker. Endast de naturskyddsområden där friluftsanvändning är möjlig. T ex skyddsområden som grundats på kommunal eller privat mark. Planbeteckning S, SL.",
     :en
     "Nature conservation areas other than national parks and natural parks. Only nature conservation areas with opportunities for recreation. E.g. protection areas established on municipal and private land. Symbol S, SL."},
    :type-code     112,
    :status        "active",
    :geometry-type "Polygon",
    :props
    {:may-be-shown-in-excursion-map-fi? {:priority 0},
     :area-km2                          {:priority 0},
     :school-use?                       {:priority 0},
     :free-use?                         {:priority 0}},
    :main-category 0,
    :sub-category  1},
   2130
   {:name
    {:fi "Voimailusali",
     :se "Kraftsportsal",
     :en "Weight training hall "},
    :description
    {:fi
     "Painonnostoon ja nyrkkeilyyn varustettu. Koko määritellään ominaisuustiedoissa.",
     :se
     "Utrustad för tyngdlyftning och boxning. Storleken anges i karakteristika.",
     :en
     "Equipped for weightlifting and boxing. Size specified in 'attribute data'."},
    :type-code     2130,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material           {:priority 1},
     :surface-material-info      {:priority 0},
     :kiosk?                     {:priority 0},
     :free-use?                  {:priority 0},
     :group-exercise-rooms-count {:priority 0},
     :tatamis-count              {:priority 0},
     :area-m2                    {:priority 1},
     :wrestling-mats-count       {:priority 0},
     :boxing-rings-count         {:priority 0},
     :weight-lifting-spots-count {:priority 0},
     :school-use?                {:priority 0},
     :exercise-machines-count    {:priority 0}},
    :main-category 2000,
    :sub-category  2100},
   3220
   {:name          {:fi "Uimaranta", :se "Badstrand", :en "Supervised beach"},
    :description
    {:fi
     "Aukioloaikoina valvottu, pukukopit yms. varustelua. Talviuinti omana liikuntapaikkanaan.",
     :se
     "Bevakad under öppethållandetider, omklädningshytter o. dyl. utrustning. Vinterbad som egen idrottsplats.",
     :en
     "Supervised during opening hours; includes changing rooms and other facilities. "},
    :type-code     3220,
    :status        "active",
    :geometry-type "Point",
    :props
    {:kiosk?                            {:priority 0},
     :free-use?                         {:priority 0},
     :pier?                             {:priority 0},
     :may-be-shown-in-excursion-map-fi? {:priority 0},
     :beach-length-m                    {:priority 1},
     :toilet?                           {:priority 0},
     :shower?                           {:priority 0},
     :changing-rooms?                   {:priority 0},
     :eu-beach?                         {:priority 0},
     :sauna?                            {:priority 0},
     :other-platforms?                  {:priority 0},
     :school-use?                       {:priority 0}},
    :main-category 3000,
    :sub-category  3200},
   5330
   {:name
    {:fi "Moottorirata", :se "Motorbana", :en "Formula race track"},
    :description
    {:fi "Suuri rata-autoiluun tarkoitettu moottoriurheilupaikka.",
     :se "Stor motorsportplats avsedd för bankörning.",
     :en "Large motor sports venue for formula racing."},
    :type-code     5330,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :automated-timing?     {:priority 0},
     :kiosk?                {:priority 0},
     :stand-capacity-person {:priority 0},
     :free-use?             {:priority 0},
     :finish-line-camera?   {:priority 0},
     :track-width-m         {:priority 0},
     :scoreboard?           {:priority 0},
     :loudspeakers?         {:priority 0},
     :ligthing?             {:priority 0},
     :school-use?           {:priority 0},
     :track-length-m        {:priority 1}},
    :main-category 5000,
    :sub-category  5300},
   4230
   {:name
    {:fi "Lumilautatunneli",
     :se "Snowboardtunnel",
     :en "Snowboarding tunnel"},
    :description
    {:fi
     "Lautailuun tarkoitettu tunneli. Lisätietoihin eri käyttömuodot.",
     :se
     "Tunnel avsedd för snowboardåkning. Olika användningsmöjligheter i tilläggsinformation.",
     :en
     "Tunnel intended for snowboarding. Different uses specified in additional information."},
    :type-code     4230,
    :status        "active",
    :geometry-type "Point",
    :props
    {:height-m              {:priority 0},
     :surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :kiosk?                {:priority 0},
     :free-use?             {:priority 0},
     :ski-service?          {:priority 0},
     :altitude-difference   {:priority 1},
     :route-width-m         {:priority 0},
     :toilet?               {:priority 0},
     :area-m2               {:priority 0},
     :equipment-rental?     {:priority 0},
     :school-use?           {:priority 0},
     :route-length-km       {:priority 1}},
    :main-category 4000,
    :sub-category  4200},
   4320
   {:name          {:fi "Hyppyrimäki", :se "Hoppbacke", :en "Ski jumping hill"},
    :description
    {:fi
     "Jää-, keramiikka- tai muovilatu. Kesä- ja talvikäyttö ominaisuuksiin, K-piste ym. Vähintään pienmäki, K-piste min 75 m.",
     :se
     "Is-, keramik- eller plastspår. K-punkt samt sommar- och vinteranvändning i karakteristika. Minimikrav  en liten backe med K-punkt på 75 m eller mera.",
     :en
     "Ice, ceramic or plastic track. Summer and winter use specified in attributes, along with K point, etc. Minimum normal hill, K point minimum 75 m."},
    :type-code     4320,
    :status        "active",
    :geometry-type "Point",
    :props
    {:skijump-hill-type     {:priority 1},
     :lifts-count           {:priority 0},
     :plastic-outrun?       {:priority 0},
     :summer-usage?         {:priority 0},
     :free-use?             {:priority 0},
     :ski-service?          {:priority 0},
     :skijump-hill-material {:priority 0},
     :k-point               {:priority 1},
     :toilet?               {:priority 0},
     :p-point               {:priority 0},
     :inruns-material       {:priority 0},
     :school-use?           {:priority 0}},
    :main-category 4000,
    :sub-category  4300},
   3130
   {:name          {:fi "Kylpylä", :se "Badinrättning", :en "Spa"},
    :description
    {:fi
     "Monipuolinen uimala kuntoutus-, virkistys- tai hyvinvointipalveluilla. Vesipinta-ala ja allasmäärät/-tyypit ominaisuuksiin.",
     :se
     "Mångsidig badinrättning med rehabiliterings- och rekreationstjänster. Vattenareal samt antal och typ av bassänger i karakteristika.",
     :en
     "Versatile spa with rehabilitation or wellness services. Water volume and number/types of pools specified in 'attribute data'."},
    :type-code     3130,
    :status        "active",
    :geometry-type "Point",
    :props
    {:pool-tracks-count   {:priority 0},
     :kiosk?              {:priority 0},
     :free-use?           {:priority 0},
     :pool-width-m        {:priority 0},
     :pool-min-depth-m    {:priority 0},
     :toilet?             {:priority 0},
     :swimming-pool-count {:priority 1},
     :pool-water-area-m2  {:priority 1},
     :pool-length-m       {:priority 1},
     :other-pools-count   {:priority 0},
     :pool-max-depth-m    {:priority 0},
     :accessibility-info  {:priority 0},
     :pool-temperature-c  {:priority 0},
     :school-use?         {:priority 0}},
    :main-category 3000,
    :sub-category  3100},
   3110
   {:name
    {:fi "Uimahalli",
     :se "Simhall",
     :en "Public indoor swimming pool"},
    :description
    {:fi
     "Halli, jossa on yksi tai useampia uima-altaita. Altaiden määrä ja vesipinta-ala kysytään ominaisuustiedoissa.",
     :se
     "Hall med en eller flera simbassänger. Antalet bassänger och vattenareal anges i karakteristika.",
     :en
     "Hall with one or several swimming pools. Number of pools and water surface area is requested in 'attribute data'."},
    :type-code     3110,
    :status        "active",
    :geometry-type "Point",
    :props
    {:pool-tracks-count     {:priority 0},
     :automated-timing?     {:priority 0},
     :kiosk?                {:priority 0},
     :stand-capacity-person {:priority 0},
     :free-use?             {:priority 0},
     :finish-line-camera?   {:priority 0},
     :match-clock?          {:priority 0},
     :pool-width-m          {:priority 0},
     :pool-min-depth-m      {:priority 0},
     :toilet?               {:priority 0},
     :swimming-pool-count   {:priority 1},
     :pool-water-area-m2    {:priority 1},
     :scoreboard?           {:priority 0},
     :pool-length-m         {:priority 1},
     :other-pools-count     {:priority 0},
     :pool-max-depth-m      {:priority 0},
     :loudspeakers?         {:priority 0},
     :accessibility-info    {:priority 0},
     :pool-temperature-c    {:priority 0},
     :school-use?           {:priority 0}},
    :main-category 3000,
    :sub-category  3100},
   203
   {:name
    {:fi "Veneilyn palvelupaikka",
     :se "Serviceplats för båtfarare",
     :en "Boating services"},
    :description
    {:fi "Veneilyyn liittyviä palveluita. Tarkennettava palvelut.",
     :se "Tjänster för båtfarare. Precisering i karakteristika.",
     :en "Facilities related to boating. Specififed in 'attributes'."},
    :type-code     203,
    :status        "active",
    :geometry-type "Point",
    :props
    {:may-be-shown-in-excursion-map-fi? {:priority 0},
     :boat-launching-spot?              {:priority 0},
     :toilet?                           {:priority 0},
     :pier?                             {:priority 0},
     :school-use?                       {:priority 0},
     :free-use?                         {:priority 0}},
    :main-category 0,
    :sub-category  2},
   4620
   {:name
    {:fi "Ampumahiihtokeskus",
     :se "Skidskyttecentrum",
     :en "Biathlon centre"},
    :description
    {:fi "Vähintään kansallisen tason kilpailujen järjestämiseen.",
     :se "Tillräckligt stort för åtminstone nationella tävlingar.",
     :en "For minimum national level competitions."},
    :type-code     4620,
    :status        "active",
    :geometry-type "Point",
    :props
    {:automated-timing?        {:priority 0},
     :kiosk?                   {:priority 0},
     :stand-capacity-person    {:priority 0},
     :free-use?                {:priority 0},
     :ski-service?             {:priority 0},
     :finish-line-camera?      {:priority 0},
     :ski-track-traditional?   {:priority 0},
     :route-width-m            {:priority 0},
     :toilet?                  {:priority nil},
     :shower?                  {:priority 0},
     :rest-places-count        {:priority 0},
     :changing-rooms?          {:priority 0},
     :shooting-positions-count {:priority 1},
     :lit-route-length-km      {:priority 0},
     :scoreboard?              {:priority 0},
     :sauna?                   {:priority 0},
     :loudspeakers?            {:priority 0},
     :accessibility-info       {:priority 0},
     :ski-track-freestyle?     {:priority 0},
     :school-use?              {:priority 0},
     :route-length-km          {:priority 0}},
    :main-category 4000,
    :sub-category  4600},
   5360
   {:name
    {:fi "Jokamies- ja rallicross-rata",
     :se "Allemans- och rallycrossbana",
     :en "Everyman racing and rallycross track "},
    :description
    {:fi "Pääasiallisesti jokamiesajoa ja/tai rallicrossia varten.",
     :se "Huvudsakligen för allemanskörning och/eller rallycross.",
     :en "Mainly for everyman racing and/or rallycross."},
    :type-code     5360,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material           {:priority 1},
     :surface-material-info      {:priority 0},
     :automated-timing?          {:priority 0},
     :kiosk?                     {:priority 0},
     :stand-capacity-person      {:priority 0},
     :free-use?                  {:priority 0},
     :finish-line-camera?        {:priority 0},
     :track-width-m              {:priority 0},
     :toilet?                    {:priority 0},
     :area-m2                    {:priority 0},
     :scoreboard?                {:priority 0},
     :loudspeakers?              {:priority 0},
     :ligthing?                  {:priority 0},
     :covered-stand-person-count {:priority 0},
     :school-use?                {:priority 0},
     :track-length-m             {:priority 1}},
    :main-category 5000,
    :sub-category  5300},
   2290
   {:name
    {:fi "Petanque-halli", :se "Petanquehall ", :en "Petanque Hall"},
    :description
    {:fi
     "Petanque-peliin tarkoitettu halli. Koko, kenttien määrä ja varustus ominaisuustietoihin.",
     :se
     "Hall avsedd för petanque. Storlek, antalet planer och utrustning i karakteristika.",
     :en "Hall intended for petanque"},
    :type-code     2290,
    :status        "active",
    :geometry-type "Point",
    :props
    {:height-m              {:priority 0},
     :surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :kiosk?                {:priority 0},
     :free-use?             {:priority 0},
     :fields-count          {:priority 0},
     :toilet?               {:priority 0},
     :area-m2               {:priority 1},
     :scoreboard?           {:priority 0},
     :school-use?           {:priority 0}},
    :main-category 2000,
    :sub-category  2200},
   2260
   {:name
    {:fi "Sulkapallohalli", :se "Badmintonhall", :en "Badminton hall"},
    :description
    {:fi "Ensisijaisesti sulkapalloon tarkoitettu halli",
     :se "Hall i första hand  avsedd för badminton.",
     :en "Hall intended primarily for badminton."},
    :type-code     2260,
    :status        "active",
    :geometry-type "Point",
    :props
    {:height-m                {:priority 1},
     :surface-material        {:priority 1},
     :surface-material-info   {:priority 0},
     :kiosk?                  {:priority 0},
     :stand-capacity-person   {:priority 0},
     :free-use?               {:priority 0},
     :tennis-courts-count     {:priority 0},
     :field-length-m          {:priority 0},
     :badminton-courts-count  {:priority 1},
     :toilet?                 {:priority 0},
     :area-m2                 {:priority 1},
     :field-width-m           {:priority 0},
     :scoreboard?             {:priority 0},
     :floorball-fields-count  {:priority 0},
     :squash-courts-count     {:priority 0},
     :volleyball-fields-count {:priority 0},
     :school-use?             {:priority 0}},
    :main-category 2000,
    :sub-category  2200},
   1160
   {:name          {:fi "Pyöräilyalue", :se "Cykelområde", :en "Cycling area"},
    :description
    {:fi
     "Pyöräilyä ja temppuilua varten, esim. bmx- tai dirt- pyöräilyä varten.",
     :se
     "Avsett för cykelåkning och trick, t ex bmx- eller dirtåkning.",
     :en "For cycling and stunting, e.g. BMX or dirt-biking."},
    :type-code     1160,
    :status        "active",
    :geometry-type "Point",
    :props
    {:ligthing?             {:priority 1},
     :surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :area-m2               {:priority 1},
     :school-use?           {:priority 0},
     :free-use?             {:priority 0}},
    :main-category 1000,
    :sub-category  1100},
   1210
   {:name
    {:fi "Yleisurheilun harjoitusalue",
     :se "Träningsområde för friidrott",
     :en "Athletics training area"},
    :description
    {:fi
     "Suorituspaikat ominaisuustietoihin. Myös yksittäiset suorituspaikat.",
     :se
     "Platserna för olika aktiviteter anges i preciseringsuppgifter. Även enstaka aktiviteter.",
     :en
     "The various sports venues are specified in 'attribute data', also individual venues."},
    :type-code     1210,
    :status        "active",
    :geometry-type "Point",
    :props
    {:heating?                       {:priority 0},
     :surface-material               {:priority 1},
     :surface-material-info          {:priority 0},
     :free-use?                      {:priority 0},
     :sprint-lanes-count             {:priority 0},
     :javelin-throw-places-count     {:priority 0},
     :field-length-m                 {:priority 0},
     :circular-lanes-count           {:priority 0},
     :sprint-track-length-m          {:priority 0},
     :inner-lane-length-m            {:priority 0},
     :discus-throw-places            {:priority 0},
     :hammer-throw-places-count      {:priority 0},
     :polevault-places-count         {:priority 0},
     :toilet?                        {:priority 0},
     :running-track-surface-material {:priority 0},
     :area-m2                        {:priority 1},
     :field-width-m                  {:priority 0},
     :shotput-count                  {:priority 0},
     :longjump-places-count          {:priority 0},
     :ligthing?                      {:priority 1},
     :school-use?                    {:priority 0},
     :highjump-places-count          {:priority 0},
     :training-spot-surface-material {:priority 0}},
    :main-category 1000,
    :sub-category  1200},
   5140
   {:name
    {:fi "Vesihiihtoalue",
     :se "Område för vattenskidåkning",
     :en "Water ski area"},
    :description
    {:fi "Rakennettu pysyvästi vesihiihdolle. Vähintään laituri.",
     :se "Byggt för vattenskidåkning, permanent. Minimikrav  brygga.",
     :en
     "Permanent construction for water skiing. Minimum equipment  pier."},
    :type-code     5140,
    :status        "active",
    :geometry-type "Point",
    :props
    {:pier?       {:priority 0},
     :area-km2    {:priority 0},
     :school-use? {:priority 0},
     :free-use?   {:priority 0}},
    :main-category 5000,
    :sub-category  5100},
   4310
   {:name
    {:fi "Harjoitushyppyrimäki",
     :se "Träningshoppbacke",
     :en "Ski jumping hill for training"},
    :description
    {:fi
     "K-piste, materiaalit, kesä- ja talvikäyttö ominaisuuksiin. Mäkihypyn harjoitteluun tarkoitettu.",
     :se
     "K-punkt, material samt sommar- och vinteranvändning i karakteristika.",
     :en
     "K point in 'attribute data'; materials, summer and winter use specified in attributes. "},
    :type-code     4310,
    :status        "active",
    :geometry-type "Point",
    :props
    {:skijump-hill-type     {:priority 1},
     :lifts-count           {:priority 0},
     :plastic-outrun?       {:priority 0},
     :summer-usage?         {:priority 0},
     :free-use?             {:priority 0},
     :ski-service?          {:priority 0},
     :skijump-hill-material {:priority 0},
     :k-point               {:priority 1},
     :toilet?               {:priority 0},
     :p-point               {:priority 0},
     :inruns-material       {:priority 0},
     :school-use?           {:priority 0}},
    :main-category 4000,
    :sub-category  4300},
   207
   {:name          {:fi "Opastuspiste", :se "Informationspunkt", :en "Info"},
    :description
    {:fi
     "Opastuspiste ulkoilureitin, virkistysalueen tai muun liikuntapaikan yhteydessä. Esim. opastustaulu ja kartta. Voi olla laajempikin palvelupiste. Usein reitin lähtöpiste.",
     :se
     "En informationspunkt vid ett friluftsled eller annan idrottsplats. Kan innehålla t.ex. informationstavla och karta. Kan vara en större servicepunkt. Oftast i början av rutten.",
     :en
     "Information point or starting point of a route, recreation area etc. Map of the route or area included, possibly also parking area."},
    :type-code     207,
    :status        "active",
    :geometry-type "Point",
    :props
    {:parking-place?                    {:priority 0},
     :may-be-shown-in-excursion-map-fi? {:priority 0},
     :toilet?                           {:priority 0},
     :school-use?                       {:priority 0},
     :free-use?                         {:priority 0}},
    :main-category 0,
    :sub-category  2},
   1130
   {:name
    {:fi "Ulkokuntoilupaikka",
     :se "Konditionsplats för utomhusaktiviteter",
     :en "Fitness training place"},
    :description
    {:fi
     "Kuntoilulaitteita, voimailulaitteita yms. ulkokuntosali. Voi olla osa liikuntapuistoa, tai liikuntareitin varrella olevia kuntoilupisteitä.",
     :se
     "Konditions- och styrketräningsanordningar osv, en \"utomhusträningssal\". Kan vara en del av en idrottspark eller konditionsplats vid en motionsbana.",
     :en
     "Contains fitness and gym equipment, etc., \"outdoor gym\". May be part of a sports park."},
    :type-code     1130,
    :status        "active",
    :geometry-type "Point",
    :props
    {:area-m2                 {:priority 1},
     :exercise-machines-count {:priority 1},
     :ligthing?               {:priority 1},
     :surface-material-info   {:priority 0},
     :surface-material        {:priority 1},
     :playground?             {:priority 0},
     :school-use?             {:priority 0},
     :free-use?               {:priority 0}},
    :main-category 1000,
    :sub-category  1100},
   5120
   {:name
    {:fi "Purjehdusalue", :se "Seglingsområde", :en "Sailing area"},
    :description
    {:fi "Rakennettu pysyvästi purjehdukselle.",
     :se "Byggt för segling, permanent. ",
     :en "Permanent construction for sailing."},
    :type-code     5120,
    :status        "active",
    :geometry-type "Point",
    :props
    {:area-km2          {:priority 0},
     :pier?             {:priority 0},
     :boat-places-count {:priority 0},
     :school-use?       {:priority 0},
     :free-use?         {:priority 0}},
    :main-category 5000,
    :sub-category  5100},
   4110
   {:name
    {:fi "Laskettelun suorituspaikka",
     :se "Slalombackar och alpina skidcentra",
     :en "Ski slopes and downhill ski resorts"},
    :description
    {:fi "Laskettelurinteet, lumikourut ym. rinnerakenteet.",
     :se
     "Slalombacke, rodelbana, pipe, puckelpist, freestyle ramp, trickbana.",
     :en "-"},
    :type-code     4110,
    :status        "active",
    :geometry-type "Point",
    :props
    {:lifts-count             {:priority 1},
     :freestyle-slope?        {:priority 0},
     :kiosk?                  {:priority 0},
     :free-use?               {:priority 0},
     :ski-service?            {:priority 0},
     :longest-slope-m         {:priority 0},
     :snowpark-or-street?     {:priority 0},
     :max-vertical-difference {:priority 1},
     :toilet?                 {:priority 0},
     :halfpipe-count          {:priority 0},
     :equipment-rental?       {:priority 0},
     :slopes-count            {:priority 1},
     :shortest-slope-m        {:priority 0},
     :toboggan-run?           {:priority 0},
     :jumps-count             {:priority 0},
     :lit-slopes-count        {:priority 1},
     :accessibility-info      {:priority 0},
     :school-use?             {:priority 0}},
    :main-category 4000,
    :sub-category  4100},
   4452
   {:name
    {:fi "Vesiretkeilyreitti",
     :se "Utflyktsled i vattendrag",
     :en "Water route"},
    :description
    {:fi
     "Merkitty vesireitti, ei veneväylä. Reittiehdotus- tyyppinen. Esim. kirkkovenesoutureitti.",
     :se
     "Märkt vattenled, endast ruttförslag t ex för kyrkbåtsrodd, inte som farled för småbåtar.",
     :en
     "Marked water route, not a navigation channel. Route suggestions included. E.g., route for \"church rowing boats\"."},
    :type-code     4452,
    :status        "active",
    :geometry-type "LineString",
    :props
    {:may-be-shown-in-excursion-map-fi? {:priority 0},
     :route-length-km                   {:priority 1},
     :rest-places-count                 {:priority 0},
     :school-use?                       {:priority 0},
     :free-use?                         {:priority 0}},
    :main-category 4000,
    :sub-category  4400},
   5370
   {:name
    {:fi "Jääspeedway-rata",
     :se "Isracingbana",
     :en "Ice speedway track"},
    :description
    {:fi "Pääasiallisesti jääspeedwayta varten.",
     :se "Huvudsakligen för isracing.",
     :en "Speedway mainly for ice racing."},
    :type-code     5370,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :automated-timing?     {:priority 0},
     :kiosk?                {:priority 0},
     :stand-capacity-person {:priority 0},
     :free-use?             {:priority 0},
     :finish-line-camera?   {:priority 0},
     :track-width-m         {:priority 0},
     :scoreboard?           {:priority 0},
     :loudspeakers?         {:priority 0},
     :ligthing?             {:priority 0},
     :school-use?           {:priority 0},
     :track-length-m        {:priority 1}},
    :main-category 5000,
    :sub-category  5300},
   2240
   {:name
    {:fi "Salibandyhalli", :se "Innebandyhall", :en "Floorball hall"},
    :description
    {:fi
     "Ensisijaisesti salibandyyn tarkoitettu halli. Kenttien määrä ja pintamateriaali ominaisuustietoihin.",
     :se
     "Hall i första hand avsedd för innebandy. Antalet planer samt ytmaterial i karakteristika.",
     :en
     "Hall primarily intended for floorball. Number of courts and surface material specified in 'attribute data'."},
    :type-code     2240,
    :status        "active",
    :geometry-type "Point",
    :props
    {:height-m               {:priority 0},
     :surface-material       {:priority 1},
     :surface-material-info  {:priority 0},
     :kiosk?                 {:priority 0},
     :stand-capacity-person  {:priority 0},
     :free-use?              {:priority 0},
     :field-length-m         {:priority 1},
     :badminton-courts-count {:priority 0},
     :toilet?                {:priority 0},
     :area-m2                {:priority 1},
     :field-width-m          {:priority 1},
     :scoreboard?            {:priority 0},
     :floorball-fields-count {:priority 1},
     :school-use?            {:priority 0}},
    :main-category 2000,
    :sub-category  2200},
   2510
   {:name
    {:fi "Harjoitusjäähalli",
     :se "Övningsishall",
     :en "Training ice arena"},
    :description
    {:fi
     "Kenttien määrä, lämmitys, pukukopit yms. ominaisuustietoihin. ",
     :se
     "Antalet planer och omklädningsrum, uppvärmning osv anges i karakteristika.",
     :en
     "Number of fields, heating, changing rooms, etc., specified in 'attribute data'. "},
    :type-code     2510,
    :status        "active",
    :geometry-type "Point",
    :props
    {:heating?              {:priority 0},
     :field-2-area-m2       {:priority 0},
     :surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :field-3-length-m      {:priority 0},
     :field-2-length-m      {:priority 0},
     :automated-timing?     {:priority 0},
     :kiosk?                {:priority 0},
     :stand-capacity-person {:priority 0},
     :free-use?             {:priority 0},
     :field-1-length-m      {:priority 0},
     :finish-line-camera?   {:priority 0},
     :match-clock?          {:priority 0},
     :field-1-width-m       {:priority 0},
     :field-3-width-m       {:priority 0},
     :field-2-width-m       {:priority 0},
     :ice-rinks-count       {:priority 1},
     :field-1-area-m2       {:priority 0},
     :toilet?               {:priority 0},
     :area-m2               {:priority 1},
     :curling-lanes-count   {:priority 0},
     :scoreboard?           {:priority 0},
     :loudspeakers?         {:priority 0},
     :field-3-area-m2       {:priority 0},
     :school-use?           {:priority 0}},
    :main-category 2000,
    :sub-category  2500},
   1640
   {:name          {:fi "Ratagolf", :se "Bangolf", :en "Minigolf course"},
    :description
    {:fi "Ratagolf- liiton hyväksymät ratagolf /minigolf- radat.",
     :se
     "Bangolf / minigolf, enligt Finlands Bangolfförbundets regler.",
     :en
     "A course built for miniature golf, accepted by the Ratagolf Union"},
    :type-code     1640,
    :status        "active",
    :geometry-type "Point",
    :props
    {:range?      {:priority 0},
     :holes-count {:priority 1},
     :ligthing?   {:priority 1},
     :green?      {:priority 0},
     :toilet?     {:priority 0},
     :school-use? {:priority 0},
     :free-use?   {:priority 0}},
    :main-category 1000,
    :sub-category  1600},
   1380
   {:name
    {:fi "Rullakiekkokenttä",
     :se "Inlinehockeyplan",
     :en "Roller hockey field"},
    :description
    {:fi "Rullakiekon pelaamiseen varustettu kenttä.",
     :se "Plan utrustad för inlinehockey.",
     :en "Field equipped for roller hockey."},
    :type-code     1380,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :free-use?             {:priority 0},
     :field-length-m        {:priority 1},
     :match-clock?          {:priority 0},
     :fields-count          {:priority 0},
     :toilet?               {:priority 0},
     :area-m2               {:priority 1},
     :field-width-m         {:priority 1},
     :ligthing?             {:priority 1},
     :school-use?           {:priority 0}},
    :main-category 1000,
    :sub-category  1300},
   4451
   {:name          {:fi "Melontareitti", :se "Paddlingsled", :en "Canoe route"},
    :description
    {:fi
     "Erityisesti melontaan, merkitty. Reittiehdotus- tyyppinen, ei navigointiin.",
     :se
     "Särskilt för paddling, märkt med ruttförslag, ej för navigering.",
     :en
     "Marked route particularly for canoeing. Route suggestions are not intended for navigation."},
    :type-code     4451,
    :status        "active",
    :geometry-type "LineString",
    :props
    {:route-length-km                   {:priority 1},
     :rest-places-count                 {:priority 0},
     :may-be-shown-in-excursion-map-fi? {:priority 0},
     :school-use?                       {:priority 0},
     :free-use?                         {:priority 0}},
    :main-category 4000,
    :sub-category  4400},
   4403
   {:name
    {:fi "Kävelyreitti/ulkoilureitti",
     :se "Promenadled/friluftsled",
     :en "Walking route/outdoor route"},
    :description
    {:fi
     "Jalkaisin tapahtuvaan ulkoiluun tarkoitettu reitti. Suhteellisen leveä ja helppokulkuinen. Mahdollisesti valaistu ja pinnoitettu reitti.",
     :se
     "Promenadled. Relativt bred och lättilgänglig, eventuellt belyst och asfalterad.",
     :en
     "Route intended for outdoor pedestrian activities. Relatively broad and passable. Potentially lit and surfaced."},
    :type-code     4403,
    :status        "active",
    :geometry-type "LineString",
    :props
    {:surface-material                  {:priority 1},
     :surface-material-info             {:priority 0},
     :free-use?                         {:priority 0},
     :may-be-shown-in-excursion-map-fi? {:priority 0},
     :outdoor-exercise-machines?        {:priority 0},
     :route-width-m                     {:priority 0},
     :toilet?                           {:priority 0},
     :rest-places-count                 {:priority 0},
     :lit-route-length-km               {:priority 1},
     :accessibility-info                {:priority 0},
     :school-use?                       {:priority 0},
     :route-length-km                   {:priority 1}},
    :main-category 4000,
    :sub-category  4400},
   5150
   {:name
    {:fi "Koskimelontakeskus",
     :se "Centrum för forspaddling",
     :en "Rapid canoeing centre"},
    :description
    {:fi "Kilpailujen järjestäminen mahdollista.",
     :se "Möjligt att arrangera tävlingar.",
     :en "Competitions possible."},
    :type-code     5150,
    :status        "active",
    :geometry-type "Point",
    :props
    {:equipment-rental?   {:priority 0},
     :pier?               {:priority 0},
     :altitude-difference {:priority 0},
     :school-use?         {:priority 0},
     :free-use?           {:priority 0}},
    :main-category 5000,
    :sub-category  5100},
   1630
   {:name
    {:fi "Golfin harjoitushalli",
     :se "Övningshall för golf",
     :en "Golf training hall"},
    :description
    {:fi
     "Golfia varten rakennettu harjoittelutila. Koko ominaisuustietoihin. Linkki sisäliikuntatiloihin!",
     :se
     "Övningsutrymme byggt för golf. Storlek i karakteristika. Länk till Anläggningar för inomhusidrott.",
     :en
     "Training space built for golf. Size specified in 'attribute data'. Link to 'indoor sport facilities'"},
    :type-code     1630,
    :status        "active",
    :geometry-type "Point",
    :props
    {:height-m    {:priority 1},
     :holes-count {:priority 0},
     :kiosk?      {:priority 0},
     :free-use?   {:priority 0},
     :toilet?     {:priority 0},
     :area-m2     {:priority 1},
     :green?      {:priority 0},
     :school-use? {:priority 0},
     :range?      {:priority 0}},
    :main-category 1000,
    :sub-category  1600},
   2370
   {:name
    {:fi "Sisäkiipeilyseinä",
     :se "Klättervägg inomhus",
     :en "Indoor climbing wall"},
    :description
    {:fi "Kiipeilyyn varustettu sisätila. Myös boulderointipaikat. ",
     :se
     "Inomhusutrymme utrustat för klättring, också platser för bouldering.",
     :en
     "Indoor space equipped for climbing. Also bouldering venues."},
    :type-code     2370,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material       {:priority 0},
     :surface-material-info  {:priority 0},
     :kiosk?                 {:priority 0},
     :free-use?              {:priority 0},
     :climbing-routes-count  {:priority 0},
     :climbing-wall-height-m {:priority 1},
     :area-m2                {:priority 1},
     :climbing-wall-width-m  {:priority 1},
     :school-use?            {:priority 0}},
    :main-category 2000,
    :sub-category  2300},
   1340
   {:name          {:fi "Pallokenttä", :se "Bollplan", :en "Ball field"},
    :description
    {:fi
     "Palloiluun tarkoitettu kenttä. Hiekka, nurmi, hiekkatekonurmi tms, koko vaihtelee. Yksi tai useampi palloilulaji mahdollista. Kevyt poistettava kate mahdollinen.",
     :se
     "Plan avsedd för bollspel. Sand, gräs, konstgräs med sand el. dyl., storleken varierar. En eller flera bollspelsgrenar möjliga.",
     :en
     "A field intended for ball games. Sand, grass, artificial turf, etc., size varies. One or more types of ball games possible."},
    :type-code     1340,
    :status        "active",
    :geometry-type "Point",
    :props
    {:heating?              {:priority 0},
     :surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :kiosk?                {:priority 0},
     :stand-capacity-person {:priority 0},
     :free-use?             {:priority 0},
     :field-length-m        {:priority 1},
     :fields-count          {:priority 0},
     :toilet?               {:priority 0},
     :changing-rooms?       {:priority 0},
     :area-m2               {:priority 1},
     :field-width-m         {:priority 1},
     :ligthing?             {:priority 1},
     :school-use?           {:priority 0},
     :light-roof?           {:priority 0}},
    :main-category 1000,
    :sub-category  1300},
   1610
   {:name
    {:fi "Golfin harjoitusalue",
     :se "Träningsområde för golf",
     :en "Golf training area"},
    :description
    {:fi
     "Golfin harjoittelua varten, yksi tai useampia suorituspaikkoja. Ulkona.",
     :se
     "Träningsplats för golf, en eller flera övningsplatser. Utomhus.",
     :en "One or more areas for golf training. Outdoors."},
    :type-code     1610,
    :status        "active",
    :geometry-type "Point",
    :props
    {:holes-count {:priority 1},
     :ligthing?   {:priority 1},
     :toilet?     {:priority 0},
     :range?      {:priority 0},
     :green?      {:priority 0},
     :school-use? {:priority 0},
     :free-use?   {:priority 0}},
    :main-category 1000,
    :sub-category  1600},
   4421
   {:name
    {:fi "Moottorikelkkareitti",
     :se "Snöskoterled",
     :en "Official snowmobile route"},
    :description
    {:fi "Reittitoimituksella hyväksytty, virallinen reitti.",
     :se "En officiell rutt som godkänts genom en ruttexpedition.",
     :en
     "Officially approved route (in compliance with Act 670/1991)."},
    :type-code     4421,
    :status        "active",
    :geometry-type "LineString",
    :props
    {:rest-places-count                 {:priority 0},
     :route-width-m                     {:priority 0},
     :may-be-shown-in-excursion-map-fi? {:priority 0},
     :route-length-km                   {:priority 1},
     :school-use?                       {:priority 0},
     :free-use?                         {:priority 0}},
    :main-category 4000,
    :sub-category  4400},
   2220
   {:name
    {:fi "Monitoimihalli/areena",
     :se "Allaktivitetshall/multiarena",
     :en "Multipurpose hall/arena"},
    :description
    {:fi "Merkittävä monien lajien kilpailupaikka, >=5000 m2.",
     :se "Större tävlingsplats för ett flertal grenar, >= 5 000 m2.",
     :en
     "Significant competition venue for various sports, >=5000 m2."},
    :type-code     2220,
    :status        "active",
    :geometry-type "Point",
    :props
    {:height-m                       {:priority 1},
     :surface-material               {:priority 1},
     :basketball-fields-count        {:priority 0},
     :surface-material-info          {:priority 0},
     :automated-timing?              {:priority 0},
     :kiosk?                         {:priority 0},
     :stand-capacity-person          {:priority 0},
     :free-use?                      {:priority 0},
     :sprint-lanes-count             {:priority 0},
     :javelin-throw-places-count     {:priority 0},
     :tennis-courts-count            {:priority 0},
     :field-length-m                 {:priority 1},
     :circular-lanes-count           {:priority 0},
     :match-clock?                   {:priority 0},
     :sprint-track-length-m          {:priority 0},
     :inner-lane-length-m            {:priority 0},
     :discus-throw-places            {:priority 0},
     :badminton-courts-count         {:priority 0},
     :hammer-throw-places-count      {:priority 0},
     :polevault-places-count         {:priority 0},
     :toilet?                        {:priority 0},
     :gymnastics-space?              {:priority 0},
     :running-track-surface-material {:priority 0},
     :area-m2                        {:priority 1},
     :field-width-m                  {:priority 1},
     :scoreboard?                    {:priority 0},
     :shotput-count                  {:priority 0},
     :longjump-places-count          {:priority 0},
     :football-fields-count          {:priority 0},
     :floorball-fields-count         {:priority 0},
     :squash-courts-count            {:priority 0},
     :loudspeakers?                  {:priority 0},
     :accessibility-info             {:priority 0},
     :handball-fields-count          {:priority 0},
     :volleyball-fields-count        {:priority 0},
     :climbing-wall?                 {:priority 0},
     :school-use?                    {:priority 0},
     :highjump-places-count          {:priority 0}},
    :main-category 2000,
    :sub-category  2200},
   1320
   {:name
    {:fi "Lentopallokenttä",
     :se "Volleybollplan",
     :en "Volleyball court"},
    :description
    {:fi
     "Lentopalloon varustettu kenttä. Kiinteät lentopallotelineet.",
     :se "Plan utrustad för volleyboll. Fasta volleybollställningar.",
     :en
     "A field equipped for volleyball. Fixed volleyball apparatus."},
    :type-code     1320,
    :status        "active",
    :geometry-type "Point",
    :props
    {:surface-material      {:priority 1},
     :surface-material-info {:priority 0},
     :free-use?             {:priority 0},
     :field-length-m        {:priority 1},
     :fields-count          {:priority 0},
     :toilet?               {:priority 0},
     :area-m2               {:priority 1},
     :field-width-m         {:priority 1},
     :ligthing?             {:priority 1},
     :school-use?           {:priority 0}},
    :main-category 1000,
    :sub-category  1300},
   4402
   {:name          {:fi "Latu", :se "Skidspår", :en "Ski track"},
    :description
    {:fi
     "Hiihtoon tarkoitettu reitti. Ei kesäkäyttöä/hoitoa. Hiihtotyylit kerrotaan ominaisuustiedoissa.",
     :se
     "Led avsedd för skidåkning. Ej sommaranvändning och -underhåll. Åkstilar anges i karakteristika.",
     :en
     "Route intended for skiing. Not in use and unmaintained in summer. Ski styles provided in 'attribute data'."},
    :type-code     4402,
    :status        "active",
    :geometry-type "LineString",
    :props
    {:surface-material                  {:priority 1},
     :surface-material-info             {:priority 0},
     :free-use?                         {:priority 0},
     :may-be-shown-in-excursion-map-fi? {:priority 0},
     :outdoor-exercise-machines?        {:priority 0},
     :ski-track-traditional?            {:priority 0},
     :route-width-m                     {:priority 0},
     :toilet?                           {:priority 0},
     :rest-places-count                 {:priority 0},
     :shooting-positions-count          {:priority 0},
     :lit-route-length-km               {:priority 1},
     :ski-track-freestyle?              {:priority 0},
     :school-use?                       {:priority 0},
     :route-length-km                   {:priority 1}},
    :main-category 4000,
    :sub-category  4400}})

(def by-main-category (group-by :main-category (vals all)))
(def by-sub-category (group-by :sub-category (vals all)))
