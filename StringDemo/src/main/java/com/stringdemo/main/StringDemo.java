package com.stringdemo.main;
public class StringDemo {

    public static void main(String[] args) {
        String s1 = new String("Hii");
        String s2 = "hello";
        String s3 = "hello";
        String s4 = new String("Hii");
        if(s1 == s4){
            System.out.println("s1 and s4 are equals.");
        }else{
            System.out.println("s1 and s4 are not equal.");
            System.out.println("This code shows that s1 and s4 are not equal because "
                    + "here reference s1 and s4 both are pointing towards different objects.");
        }
        
        if(s2 == s3){
            System.out.println("s2 and s3 are equal because s1 and s1 both are pointing towards same object in StringLiteral pool");
        }else{
            System.out.println("s2 and s3 are not equal.");
        }           
        String s5 = "abc";
        s5.toUpperCase();       
        System.out.println(s5 + " because toUpppercase converts abc to ABC but new object has been created "
                + "if we want to use that object than we use to tak enew reference for it."
        );
        String s6 = s5.toUpperCase();
        System.out.println(s6 + " because new reference has been created.");
    }
}