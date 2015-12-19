;; All Clojure collections support sequencing.
;; You can operate on sequences with functions like first,
;; second, and last.

(= 3 (first '(3 2 1)))
(= 3 (second [2 3 4]))
(= 3 (last (list 1 2 3)))