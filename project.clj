(defproject htmltohiccup "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :min-lein-version "2.0.0"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [compojure "1.6.1"]
                 [hiccup-bridge "1.0.1"]
                 [hiccup "1.0.5"]
                 [http-kit "2.3.0"]]
  :plugins [[lein-ring "0.12.4"]]
  :ring {:handler htmltohiccup.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}}
  :main htmltohiccup.core)
