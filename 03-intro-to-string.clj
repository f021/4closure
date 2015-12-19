
;; Clojure strings are Java strings.
;; This means that you can use any of the Java string methods on Clojure strings.

(= "HELLO WORLD" (.toUpperCase "hello world"))