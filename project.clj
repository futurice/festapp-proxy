(defproject rgstr "0.1.0-SNAPSHOT"
  :description "festapp-proxy"
  :url "https://github.com/futurice/festapp-proxy"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring/ring-jetty-adapter "1.3.1"]
                 [metosin/compojure-api "0.16.2"]
                 [metosin/ring-swagger-ui "2.0.17"]
                 [clj-time "0.8.0"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler festapp.web/app
         :reload-paths ["src"]})
