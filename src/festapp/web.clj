(ns festapp.web
  (:require [ring.util.http-response :refer :all]
            [compojure.route :as route]
            [compojure.api.sweet :refer :all]
            [schema.core :as s]
            [festapp.db :refer :all])
  (:import [org.joda.time DateTime]))

;;; Models
(def Festival {:stages [String]
               :days [String]})

(def Artist {:id String
             :name String
             :info String
             (s/optional-key :wikipedia) String})

(def Gig {:artist Artist
          :name String
          :stage String
          :day String
          :start-time DateTime
          :end-time DateTime})

(def NewsItem {:title String
               :published DateTime
               :content String})

(def InfoItem {:title String
               :content String})

;;; Routes

(defapi app
  (route/resources "/")
  (swagger-ui "/")
  (swagger-docs "/api/api-docs"
   :title      "Festapp Proxy API"
   :apiVersion "0.0.0"
   :contact    "festapp@futurice.com")
  (swaggered "festapp"
   :description "Provide data of your festival"
   (context "/api" []
     (GET* "/artists" []
       :return   [Artist]
       :summary  "List of all artists"
       (ok artists))
     (GET* "/gigs" []
       :return [Gig]
       :summary "List of all gigs"
       (ok gigs))
     (GET* "/news" []
       :return [NewsItem]
       :summary "List of all news"
       (ok news))
     (GET* "/info" []
       :return [InfoItem]
       :summary "List of all info items"
       (ok info))
     (GET* "/festival" []
       :return       Festival
       :summary      "Festival general configuration"
       (ok festival)))))
