(ns bowling-game.core
  (:require [catacumba.core :as ct]
            [clojure.core.async :as async :refer [go-loop <! >! close!]]
            [catacumba.handlers.misc :refer (autoreloader)])
  (:gen-class))


(defn welcome-handler
  [context]
   "Hello world")

(defn game-logic [player, frames]
  "Defines game logic for bowling game")

(defn game-handler
  "This is the websocket handler."
  {:handler-type :catacumba/websocket}
  [{:keys [in out]}]
  (go-loop []
     (if-let [received (<! in)]
       (do
         (>! out received)
         (recur))
       (close! out))))

(def app
  (ct/routes [[:any (autoreloader)]
              [:all "" welcome-handler]
              [:get "ws" game-handler]]
              ))

(defn -main
  [& args]
  (ct/run-server app {:port 3030}))