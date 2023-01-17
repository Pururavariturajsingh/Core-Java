package com.typecasting;

public class Demo1 {
    public static void main(String[] args) {
        /*
        In case of java if arithmetic operation is performed on 
        bytr,short and char type values then the values are first converted to int 
        and then calculations are performed.
        
        
        kisi bhi variab;e ko use karne se pahle usee initalize karna padta he java me.
        */
        short x = 20;
        short y = 34;
//        short z =  x + y;//CTE
        short z =  (short) (x + y);
        System.out.println("Value fo z is : " + z);
        
    }
}
