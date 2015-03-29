(ns tnoda.yubari.command.echo
  (:import (net.canarymod.commandsys Command)
           (net.canarymod.api.entity.living.humanoid Player)))

(gen-class
   :name tnoda.yubari.command.Echo
   :implements [net.canarymod.commandsys.CommandListener
                net.canarymod.commandsys.CommandOwner]
   :methods [[^{Command {:aliases ["echo"]
                         :description "Write arguments to player's chat line"
                         :permissions [""]
                         :toolTip "/echo"}}
              echo [net.canarymod.chat.MessageReceiver "[Ljava.lang.String;"] void]
             [getName [] java.lang.String]])

(defn- -echo
  [this caller params]
  (assert (instance? Player caller))
  (->> params
       next
       (interpose " ")
       (apply str)
       (.chat ^Player caller)))

(defn- -getName
  [this]
  "echo")

