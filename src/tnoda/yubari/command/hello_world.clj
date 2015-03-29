(ns tnoda.yubari.command.hello-world
  (:import (net.canarymod.commandsys Command)
           (net.canarymod Canary)))

(gen-class
 :name tnoda.yubari.command.HelloWorld
 :implements [net.canarymod.commandsys.CommandListener
              net.canarymod.commandsys.CommandOwner]
 :methods [[^{Command {:aliases ["hello"]
                       :description "Displays a hello-world message."
                       :permissions [""]
                       :toolTip "/hello"}}
            hello [net.canarymod.chat.MessageReceiver "[Ljava.lang.String;"] void]
           [getName [] java.lang.String]])

(defn- -hello
  [this caller params]
  (-> (Canary/getServer)
      (.broadcastMessage "Hello World.")))

(defn- -getName
  [this]
  "hello-world")

