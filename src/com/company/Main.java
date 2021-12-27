package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {
    /**Эки setтин симметриялык айырмасын эсептеген symmetricDifference методун ишке ашырыныз.
     *  Метод натыйжаны жаңы set катары кайтарышы керек. Методко параметр катары берилген
     *  setтерди өзгөртүүгө жол берилбейт.

     Мисалы: [1, 2, 3} жана {0, 1, 2]
     Жооп: [0, 3]

     public static Set<Integer> symmetricDifference (Set<Integer> set1,
     Set<Integer> set2) методу болушу керек*/

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(8);

        set2.add(2);
        set2.add(3);
        set2.add(8);

        symmetricDifference(set1, set2);
    }

    public static void symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        // a new set
        Set<Integer> newSet = new HashSet<>(set1);
        newSet.removeAll(set2);
        set2.removeAll(set1);
        newSet.addAll(set2);
        System.out.println(newSet);
    }
}

