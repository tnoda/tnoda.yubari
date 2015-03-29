(ns tnoda.yubari
  (:require [tnoda.yubari.command :as c])
  (:import (net.canarymod Canary Main)))

(defn -main
  [& args]
  (Main/main (make-array String 0))
  (c/compile-all)
  (doseq [cmd (c/instantiate-commands)]
    (.registerCommands (Canary/commands) cmd cmd false)))
