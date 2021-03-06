(ns codeup.core
  (:gen-class))

(defn a1001 []
  (println "Hello"))

(defn a1002 []
  (println "Hello World"))

(defn a1003 []
  (println "Hello\nWorld"))

(defn a1004 []
  (println "'Hello'"))

(defn a1005 []
  (println "\"Hello World\""))

(defn a1006 []
  (println "!@#$%^&*()"))

(defn a1007 []
  (println "\"C:\\Download\\hello.cpp\""))

(defn a1010 []
  (let [n (read-line)]
    (println (format "%d" (read-string n)))
    n))

(defn a1011 []
  (let [n (read-line)]
    (println (format "%s" n))
    n))

(defn a1012 []
  (let [n (read-line)]
    (println (format "%f" (read-string n)))
    n))

(defn a1013 []
  (let [n1 (read-line) 
        n2 (read-line)]
    (println n1 n2)
    n1 n2))

(defn a1014 []
  (let [n1 (read-line)
        n2 (read-line)]
    (println n2 n1)
    n1 n2))

(defn a1015 []
  (let [n (read-line)]
    (println (format "%.2f" (read-string n)))
    n))

(defn a1017 []
  (let [n (read-line)]
    (println n n n)
    n))

(defn a1018 []
  (let [n1 (read-line)
        n2 (read-line)]
    (println n1 ":" n2)
    n1 n2))

(defn a1019 []
  (let [y (read-string (read-line))
        m (read-string (read-line))
        d (read-string (read-line))]
    (println (format "%04d.%02d.%02d" y m d))
    y m d))

(defn a1020 []
  (let [n (read-line)]
    (println (apply str 
                    (subs n 0 6)
                    (subs n 7)))
    n))

(defn a1021 []
  (let [n (read-line)]
    (println (subs n 0 50))
    n))

(defn a1023 []
  (let [n (read-line)]
    (println (apply str (subs n 0 1) "\n" (subs n 2)))
    n))

(defn a1024 []
  (let [n (read-line)]
    (doall (map (fn [n]
                  (println (format "'%s'" n)))
                (to-array n)))
    n))

(defn a1025 []
  (let [n (read-line)
        flag "0000"]
    (doall (map-indexed (fn [i n]
                          (println (apply str 
                                          "["
                                          n
                                          (subs flag i)
                                          "]")))
                        (to-array n)))
    n flag))

(defn a1038 []
  (let [n1 (read-line)
        n2 (read-line)]
    (println (+ (read-string n1) (read-string n2)))
    n1 n2))

(defn a1045 []
  (let [n1 (read-string (read-line))
        n2 (read-string (read-line))]
    (println (+ n1 n2))
    (println (- n1 n2))
    (println (* n1 n2))
    (println (/ n1 n2))
    n1 n2))

(defn a1053 []
  (let [n (read-string (read-line))]
    (if (= n 0) (println 1) (println 0))
    n))

(defn a1054 []
  (let [n1 (read-line)
        n2 (read-line)]
    (if (and (= n1 0) (= n2 0))
      (println 1)
      (println 0))
    n1 n2))

(defn -main []
  (println "Hello, World!"))