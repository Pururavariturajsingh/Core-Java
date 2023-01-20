package com.stringdemo.main;

public class BuilderDemo {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("abc");
        System.out.println(str);
        
        str.append(" pqr");
        System.out.println(str);
        
        str.reverse();
        System.out.println(str);

        str.reverse();
        System.out.println(str);
        
        str.replace(0, 3, "ABC");
        System.out.println(str);
    }
}
