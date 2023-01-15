package com.lambda.expression;

import com.features.interfaces.EvenOdd;
public class EvenOddMain {
    public static void main(String[] args) {
        EvenOdd ref1 ;
        ref1 = a -> (a%2 == 0);
        System.out.println("Is 23 even : " + ref1.checkEven(23));
        System.out.println("Is 24 even : " + ref1.checkEven(24));
    }
}
