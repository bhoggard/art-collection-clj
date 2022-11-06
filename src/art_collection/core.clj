(ns art-collection.core
  (:require [ring.adapter.jetty :as jetty]
            [clojure.pprint])
  (:gen-class))

(defn handler [request]
  (clojure.pprint/pprint request)
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World"})

(defn -main
  [& args]
  (jetty/run-jetty handler
                   {:port 3000
                    :join? false}))
