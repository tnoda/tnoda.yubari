(defproject org.clojars.tnoda/tnoda.yubari "0.0.11"
  :description "tnoda's Minecraft server settings"
  :url "https://github.com/tnoda/tnoda.yubari"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [camel-snake-kebab "0.3.1"]
                 [local/canarymod "1.2.0"]]
  :jvm-opts ["-Xmx1g"]
  :main tnoda.yubari)
