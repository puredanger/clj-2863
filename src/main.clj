(ns main
  (:gen-class))

(set! *warn-on-reflection* true)

(defn invoke [val]
  (Receiver/overload val))

(defn -main [& args]
  (println (invoke {"a" 1})))
