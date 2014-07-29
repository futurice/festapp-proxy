(defproject rgstr "0.1.0-SNAPSHOT"
  :description "festapp-proxy"
  :url "https://github.com/futurice/festapp-proxy"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring/ring-jetty-adapter "1.3.0"]
                 [metosin/compojure-api "0.14.0"]
                 [metosin/ring-swagger-ui "2.0.17"]
                 [clj-time "0.7.0"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler festapp.web/app
         :reload-paths ["src"]})
