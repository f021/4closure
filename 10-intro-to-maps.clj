;; Maps store key-value pairs. Both maps and keywords can be
;; used as lookup functions. Commas can be used to make
;; maps more readable, but they are not required.


(= (:b {:a 10 :b 20 :c 30})((hash-map :a 10, :b 20, :c 30) :b))
(= (:b {:a 10 :b 20 :c 30}) (:b {:a 10, :b 20, :c 30}))