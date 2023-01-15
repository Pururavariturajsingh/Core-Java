package com.features.main;

import com.features.interfaces.Predicate;
public class PredicateMain {
    public static void main(String[] args) {
        Predicate<Integer> ref = a -> a%2 == 0;
        System.out.println("Is 23 a even number : " + ref.test(23));
        System.out.println("Is 24 a odd number : " + ref.test(24));
    }
}
