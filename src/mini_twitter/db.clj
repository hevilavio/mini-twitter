(ns mini_twitter.db)

(def database
  (atom []))

(defn get-tweets [user]
  (filter #(= user (:user %)) @database))

(defn insert-tweet [tweet]
  (let [updated (swap! database conj tweet)]
    (merge {} {:id (count updated)})))
