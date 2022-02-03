(ns mini-twitter.core-test
  (:require [clojure.test :refer :all]
            [mini-twitter.core :refer :all]))

(deftest dummy-test
  (testing "1 nao eh igual a 2"
    (not (= 1 2))
    (is (= 1 1))))
