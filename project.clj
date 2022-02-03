(defproject mini-twitter "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}

  :uberjar-name "mini-twitter.jar"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [cheshire "5.8.1"]
                 [ring/ring-defaults "0.3.2"]
                 [ring/ring-json "0.4.0"]
                 [clj-http "3.9.1"]]
  :repl-options {:init-ns mini-twitter.core}
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler mini-twitter.core/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]
                        [midje "1.9.6"]
                        [ring/ring-core "1.7.1"]
                        [ring/ring-jetty-adapter "1.7.1"]
                        [clj-http "3.9.1"]]
         :plugins [[lein-midje "3.2.1"]
                   [lein-cloverage "1.0.13"]]}})
