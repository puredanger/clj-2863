(ns main
  (:import Receiver)
  (:gen-class))

(set! *warn-on-reflection* true)

(defn invoke [val])
  (Receiver/overload val)

(defn -main [& args]
  (invoke {:a 1}))
