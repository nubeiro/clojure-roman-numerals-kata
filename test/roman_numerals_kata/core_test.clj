(ns roman-numerals-kata.core-test
  (:require [clojure.test :refer :all]
            [roman-numerals-kata.core :refer :all]))

(defn to-roman [n]
  (let [result ""
        remaining n]
    (cond
        4 "IV"
        5 "V"
        6 "VI"
        7 "VII"
        8 "VIII"
        9 "IX"
        10 "X"
        (apply str (repeat n "I")))
      )
    )

(deftest to-roman-produces-romans
  (testing "simplistic-romans"
    (is (= "I" (to-roman 1)))
    (is (= "II" (to-roman 2)))
    (is (= "III" (to-roman 3)))
    (is (= "IV" (to-roman 4)))
    (is (= "V" (to-roman 5)))
    (is (= "VI" (to-roman 6)))
    (is (= "VII" (to-roman 7)))
    (is (= "VIII" (to-roman 8)))
    (is (= "IX" (to-roman 9)))
    (is (= "X" (to-roman 10)))))
