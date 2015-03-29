(ns tnoda.yubari.command
  (:require [camel-snake-kebab.core :refer [->PascalCaseString]]))

(def ^:private prefix "tnoda.yubari.command.")

(def ^:private commands ["hello-world" "echo" "eval"])

(defn compile-all
  []
  (let [cmd-ns (map #(symbol (str prefix %)) commands)]
    (doseq [x cmd-ns]
      (compile x))))

(defn instantiate-commands
  []
  (map (comp #(clojure.lang.Reflector/invokeConstructor % (to-array []))
             #(Class/forName %)
             (partial str prefix)
             ->PascalCaseString)
       commands))
