(defproject art-collection "0.1.0-SNAPSHOT"
  :description "Website for the Hoggard Wagner Collection"
  :url "https://beta.hoggardwagner.org"
  :license  {:name "MIT"
             :url "https://choosealicense.com/licenses/mit"
             :key "mit"
             :year 2015
             :comment "MIT License"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [ring/ring-core "1.9.6"]
                 [ring/ring-jetty-adapter "1.9.6"]
                 ]
  :main ^:skip-aot art-collection.core
  :repl-options {:init-ns art-collection.core}
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
