(defproject bowling-game "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                  [org.slf4j/slf4j-simple "1.7.25" :scope "provided"]
                  [org.clojure/core.async "0.4.474"]
                   [io.ratpack/ratpack-core "1.5.4"]
                  [funcool/catacumba "2.2.1"]]
  :repl-options {:init-ns bowling-game.core}
  :main bowling-game.core)
