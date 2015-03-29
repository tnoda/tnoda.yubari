(ns tnoda.yubari.command.eval
  (:import (net.canarymod.commandsys Command)
           (net.canarymod.api.entity.living.humanoid Player)))

(gen-class
   :name tnoda.yubari.command.Eval
   :implements [net.canarymod.commandsys.CommandListener
                net.canarymod.commandsys.CommandOwner]
   :methods [[^{Command {:aliases ["eval"]
                         :description "Write arguments to player's chat line"
                         :permissions [""]
                         :toolTip "/eval"}}
              eval [net.canarymod.chat.MessageReceiver "[Ljava.lang.String;"] void]
             [getName [] java.lang.String]])

(defn- -eval
  [this caller params]
  (assert (instance? Player caller))
  (->> params
       next
       (interpose " ")
       (apply str)
       read-string
       eval
       str
       (.chat ^Player caller)))

(defn- -getName
  [this]
  "eval")

