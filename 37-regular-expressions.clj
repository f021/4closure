;; Regex patterns are supported with a special reader macro.

(= "ABC" (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))