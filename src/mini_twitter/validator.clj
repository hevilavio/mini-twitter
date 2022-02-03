(ns mini-twitter.validator)


(defn valid-tweet? [tweet]
  (and
    (< 0 (count (:text tweet)))
    (< 0 (count (:user tweet)))))