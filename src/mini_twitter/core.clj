(ns mini-twitter.core
  (:require
    [mini_twitter.db :as db]
    [mini_twitter.validator :as validator]
    [compojure.core :refer :all]
    [compojure.route :as route]
    [cheshire.core :as json]
    [ring.middleware.defaults :refer [wrap-defaults api-defaults]]
    [ring.middleware.json :refer [wrap-json-body]]))


(defn as-json [content]
  {:status 200
   :headers {"Content-Type" "application/json; charset=utf=8"}
   :body (json/generate-string content)
   :throw-exceptions false})

(defroutes app-routes
           (GET "/" [] "Hello World!")
           (GET ["/tweet/:user"] [user] (as-json (db/get-tweets user)))
           (POST "/tweet" request (if (validator/valid-tweet? (:body request))
                                      (-> (db/insert-tweet (:body request))
                                          (as-json))
                                      (as-json {:status "invalid request"})))

           (route/not-found (as-json {:status "route not found"})))


(def app
  (-> (wrap-defaults app-routes api-defaults)
      (wrap-json-body {:keywords? true :bigdecimals? true })))
