;; Vectors can be constructed several ways. You can compare them with lists. 

(= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))