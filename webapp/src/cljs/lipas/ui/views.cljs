(ns lipas.ui.views
  (:require [lipas.ui.admin.views :as admin]
            [lipas.ui.components :as lui]
            [lipas.ui.events :as events]
            [lipas.ui.front-page.views :as front-page]
            [lipas.ui.ice-stadiums.views :as ice-stadiums]
            [lipas.ui.login.views :as login]
            [lipas.ui.mui :as mui]
            [lipas.ui.navbar :as nav]
            [lipas.ui.register.views :as register]
            [lipas.ui.sports-sites.views :as sports-sites]
            [lipas.ui.subs :as subs]
            [lipas.ui.swimming-pools.views :as swimming-pools]
            [lipas.ui.user.reset-password :as reset-password]
            [lipas.ui.user.views :as user]
            [lipas.ui.utils :refer [<== ==>] :as utils]
            [reagent.core :as r]))

(defn- panels [panel-name tr logged-in?]
  (case panel-name
    :home-panel           [front-page/main tr]
    :admin-panel          [admin/main]
    :sports-panel         [sports-sites/main tr]
    :ice-panel            [ice-stadiums/main]
    :swim-panel           [swimming-pools/main]
    :login-panel          [login/main tr]
    :reset-password-panel [reset-password/main tr]
    :register-panel       [register/main tr]
    :user-panel           [user/main tr]
    [front-page/main tr]))

(defn show-panel [panel-name tr logged-in?]
  [panels panel-name tr logged-in?])

(defn main-panel []
  (let [active-panel (<== [::subs/active-panel])
        logged-in?   (<== [::subs/logged-in?])
        notification (<== [::subs/active-notification])
        confirmation (<== [::subs/active-confirmation])
        disclaimer   (<== [::subs/active-disclaimer])
        tr           (<== [::subs/translator])]

    [mui/css-baseline

     [mui/mui-theme-provider {:theme mui/jyu-theme-dark}

      [mui/grid {:container   true
                 :style       {:min-height     "100%"
                               :flex-direction :column}
                 :align-items :stretch}

       [mui/grid {:item  true :xs 12
                  :style {:flex "0 1 auto"}}

        ;; Navbar and drawer
        [nav/nav tr active-panel logged-in?]

        ;; Dev-env disclaimer
        (when disclaimer
          [mui/grid {:item true :xs 12 :md 12 :lg 12}
           [mui/card {:square true
                      :style  {:background-color mui/secondary
                               :border-bottom    "2px solid white"}}
            [mui/card-header
             {:style  {:padding-bottom 0}
              :title  (tr :disclaimer/headline)
              :action (r/as-element
                       [mui/icon-button
                        {:on-click #(==> [::events/set-active-disclaimer nil])}
                        [mui/icon "close"]])}]
            [mui/card-content
             [mui/typography {:variant :body2}
              disclaimer]]]])]

       [mui/mui-theme-provider {:theme mui/jyu-theme-light}

        ;; Main panel
        [show-panel active-panel tr logged-in?]

        ;; Fixed Map tools
        ;; TODO move this under map.cljs and remove hack
        (when (= (utils/current-path) "/#/liikuntapaikat")
          (let [filters (<== [:lipas.ui.map.subs/filters])
                toggle  #(==> [:lipas.ui.map.events/toggle-filter %])]
            [mui/paper {:style {:position         :fixed
                                :z-index          9999
                                :background-color mui/gray3
                                :bottom           0
                                :left             0
                                :padding-left     "1em"}}
             [lui/checkbox
              {:value     (-> filters :ice-stadium)
               :label     "Jäähallit"
               :on-change #(toggle :ice-stadium)}]
             [lui/checkbox
              {:value     (-> filters :swimming-pool)
               :label     "Uimahallit"
               :on-change #(toggle :swimming-pool)}]]))

        ;; Global UI-blocking confirmation dialog
        (when confirmation
          [lui/confirmation-dialog confirmation])

        ;; Global ephmeral notifications
        (when notification
          [lui/notification
           {:notification notification
            :on-close     #(==> [::events/set-active-notification nil])}])]]]]))
