(ns roman-numerals-kata.core
  (:gen-class))

(defn roman-chunk [n]
  (* 5 (quot n 5)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
