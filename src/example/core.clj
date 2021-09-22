(ns example.core
  (:require [datalevin.core :as d]))

;;
;;  After jack-in, evaluating this file generates the following error in the REPL
;;
;;

;; clj꞉user꞉> 
;; ; Evaluating file: core.clj
;; ; Syntax error (IllegalArgumentException) compiling . at (datalevin/datom.cljc:202:28).
;; ; No matching method compare found taking 2 args for class java.util.Arrays
;; ; Evaluation of file core.clj failed: class clojure.lang.Compiler$CompilerException
;; 
;; clj꞉user꞉> 
;; clj꞉example.core꞉> 

;; On a second evaluation:
;; clj꞉example.core꞉> 
;; ; Evaluating file: core.clj
;; ; Syntax error compiling at (datalevin/db.cljc:62:20).
;; ; No such var: d/cmp-datoms-eavt
;; ; Evaluation of file core.clj failed: class clojure.lang.Compiler$CompilerException

;; On a third evaluation
;; clj꞉example.core꞉> 
;; ; Evaluating file: core.clj
;; ; Syntax error compiling at (datalevin/pull_parser.cljc:77:9).
;; ; No such var: db/reverse-ref?
;; ; Evaluation of file core.clj failed: class clojure.lang.Compiler$CompilerException

