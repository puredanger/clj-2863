(ns build
  (:refer-clojure :exclude [compile])
  (:require [clojure.tools.build.api :as b]))

(def lib 'my/lib1)
(def version "1.0.0")
(def class-dir "target/classes")

(defn clean [_]
  (b/delete {:path "target"}))

(defn compile [_]
  (let [basis (b/create-basis {:project "deps.edn"})]
    (clean nil)
    (b/javac {:class-dir class-dir, :basis basis, :src-dirs ["java"]})
    (b/compile-clj {:class-dir class-dir, :basis basis, :ns-compile '[main]})))
