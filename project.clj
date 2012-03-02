(defproject yfinance "0.2.0-SNAPSHOT"
  :description "Clojure code to access Yahoo! Finance"
  :author "Baishampayan Ghose"
  :dependencies [[org.clojure/clojure "1.3.0-beta1"]
                 [clj-time "0.3.3"]
                 [clj-http "0.2.4"]]

  :plugins [[s3-wagon-private "1.1.1"]]

  :repositories {"nfr-releases" "s3p://newfound-mvn-repo/releases/"
                 "nfr-snapshots" "s3p://newfound-mvn-repo/snapshots/"})
