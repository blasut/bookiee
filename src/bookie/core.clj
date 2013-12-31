(ns bookie.core
  (:require [clj-http.client :as client]))

(def cs (clj-http.cookies/cookie-store))

(def route "/cgi-bin/pts3/mps/1000/mps1001bm.aspx")
(def base-url "https://mobil.seb.se")
(def post-url (apply str base-url route))
(def form-params {:A3 4, :A1 "PERSONNUMMER", :A2 "PERSONLIGKOD"})

(defn extract-group [n] (fn [group] (group n)))

(defn login
  []
  (client/post post-url {:form-params form-params
                         :cookie-store cs}))

(defn get-account-overview
  []
  (login)
  (let [account-overview-url (apply str base-url "/cgi-bin/pts3/mps/1100/mps1101.aspx?X1=digipassAppl1")
        account-overview (client/get account-overview-url  {:cookie-store cs})
        matches-for-privatkonto (re-seq #"href=\"(.+)\">Privatkonto 1" (:body account-overview))
        accounts-page (apply str base-url (str (first (map (extract-group 1) matches-for-privatkonto))))]
    (client/get (clojure.string/replace accounts-page #"amp;" "") {:cookie-store cs})))
