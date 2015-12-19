;; Write a function which doubles a number.

(= (#(* % 2) 2) 4)
(= ((fn [x] (* x 2)) 3) 6)
(= ((partial * 2) 11) 22)
(= (#(* % 2) 7) 14)