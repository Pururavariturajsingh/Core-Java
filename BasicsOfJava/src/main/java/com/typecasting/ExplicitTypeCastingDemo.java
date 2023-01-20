package com.typecasting;

public class ExplicitTypeCastingDemo {
    public static void main(String[] args) {
        int x = 20;
        double y = 3.4;
//        x = x + y;//CTE
        x = (int)(x + y);
        System.out.println(x);
        
        
    }
}
