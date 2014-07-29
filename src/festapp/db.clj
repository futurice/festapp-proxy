(ns festapp.db
  (:require [clj-time.core :as t]))

;;; This default implementation serves static content.

(def festival {:stages ["Logic" "Fathers" "Type Theory"]
               :days   ["Saturday"]})

(def info {})

(def coquand {:id "coquand"
              :name "Thierry Coquand"
              :info "Thierry Coquand (born 18 April 1961, Jallieu, Isère, France) is a professor in computer science at the University of Gothenburg, Sweden. He is known for his work in constructive mathematics, especially the calculus of constructions."
              :wikipedia "http://en.wikipedia.org/wiki/Thierry_Coquand"})

(def martin-lof {:id "martin-lof"
                 :name "Per Martin-Löf"
                 :info "Per Erik Rutger Martin-Löf (born 1942) is a Swedish logician, philosopher, and mathematical statistician. He is internationally renowned for his work on the foundations of probability, statistics, mathematical logic, and computer science. "
                 :wikipedia "http://en.wikipedia.org/wiki/Per_Martin-L%C3%B6f"})

(def turing {:id "turing"
             :name "Alan Turing"
             :info "Alan Mathison Turing, OBE, FRS (23 June 1912 – 7 June 1954) was a British mathematician, logician, cryptanalyst, philosopher, computer scientist, mathematical biologist, and marathon and ultra distance runner."
             :wikipedia "http://en.wikipedia.org/wiki/Alan_Turing"})

(def church {:id "church"
             :name "Alonzo Church"
             :info "Alonzo Church (June 14, 1903 – August 11, 1995) was an American mathematician and logician who made major contributions to mathematical logic and the foundations of theoretical computer science."
             :wikipedia "http://en.wikipedia.org/wiki/Alonzo_Church"})

(def curry {:id "curry"
            :name "Haskell Curry"
            :info "Haskell Brooks Curry (/ˈhæskəl ˈkɜri/; September 12, 1900 – September 1, 1982) was an American mathematician and logician."
            :wikipedia "http://en.wikipedia.org/wiki/Haskell_Curry"})

(def howard {:id "howard"
             :name "William Alvin Howard"
             :info "William Alvin Howard (born 1926) is a proof theorist best known for his work demonstrating formal similarity between intuitionistic logic and the simply typed lambda calculus that has come to be known as the Curry–Howard correspondence."
             :wikipedia "http://en.wikipedia.org/wiki/William_Alvin_Howard"})

(def godel {:id "godel"
            :name "Kurt Gödel"
            :info "Kurt Friedrich Gödel (April 28, 1906 – January 14, 1978) was an Austrian, and later American, logician, mathematician, and philosopher. "
            :wikipedia "http://en.wikipedia.org/wiki/Kurt_G%C3%B6del"})

(def tarski {:id "tarski"
             :name "Alfred Tarski"
             :info "Alfred Tarski (January 14, 1901 – October 26, 1983) was a Polish-American logician, mathematician and philosopher."
             :wikipedia "http://en.wikipedia.org/wiki/Alfred_Tarski"})

(def gentzen {:id "gentzen"
              :name "Gerhard Gentzen"
              :info "Gerhard Karl Erich Gentzen (November 24, 1909 – August 4, 1945) was a German mathematician and logician. He made major contributions to the foundations of mathematics, proof theory, especially on natural deduction and sequent calculus."
              :wikipedia "http://en.wikipedia.org/wiki/Gerhard_Gentzen"})

; Ideas for speakers:
; http://en.wikipedia.org/wiki/Saunders_Mac_Lane
; http://en.wikipedia.org/wiki/Jean-Yves_Girard

(def artists [coquand
              martin-lof
              turing
              church
              curry
              howard
              godel
              tarski
              gentzen])

(defn make-gig [artist name stage start end]
  {:artist artist
   :name name
   :stage stage
   :start-time start
   :end-time end})

; All gigs are at the same time.
(def start-time (t/date-time 2014 8 1 15 0 0 0))
(def end-time (t/date-time 2014 8 1 16 0 0 0))

(def gigs [(make-gig coquand "Calculus of Constructions" "Type Theory" start-time end-time)
           (make-gig martin-lof "Intuitionistic Type Theory" "Type Theory" start-time end-time)
           (make-gig turing "Turing Machine" "Computing" start-time end-time)
           (make-gig church "Entscheidungsproblem" "Computing" start-time end-time)
           (make-gig curry "Curry's Paradox" "Computing" start-time end-time)
           (make-gig howard "Curry-Howard correspondence" "Computing" start-time end-time)
           (make-gig godel "Incompleteness theorems" "Logic" start-time end-time)
           (make-gig tarski "Truth in formalized languages" "Logic" start-time end-time)
           (make-gig gentzen "Natural deduction" "Logic" start-time end-time)])

(def news [{:title "Simply typed lambda calculus is strongly normalizing"
            :published (t/date-time 1967 1 1 0 0 0 0)
            :content "Tait showed in 1967 that beta-reduction is strongly normalizing. As a corollary beta eta-equivalence is decidable. Statman showed in 1977 that the normalisation problem is not elementary recursive. A purely semantic normalisation proof (see normalisation by evaluation) was given by Berger and Schwichtenberg in 1991."}
           {:title "General solution to the Entscheidungsproblem is impossible"
            :published (t/date-time 1936 1 1 0 0 0 0)
            :content "In 1936, Alonzo Church and Alan Turing published independent papers[2] showing that a general solution to the Entscheidungsproblem is impossible, assuming that the intuitive notation of \"effectively calculable\" is captured by the functions computable by a Turing machine (or equivalently, by those expressible in the lambda calculus). This assumption is now known as the Church–Turing thesis."}])
