package com.stringdemo.main;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class AppMain {
    public static void main(String args[]){
        String s1 = "hi , how are you";
        String s2 = "I am fine";
        System.out.println("Length of s1 : " + s1.length());
        System.out.println("Is how present in s1 : " + s1.contains("how"));
        System.out.println("Let's print : " + s2.substring(5));
        System.out.println("Let's replace h with H : " + s1.replace("h","H"));
        System.out.println("Let's print in upperCase : " + s1.toUpperCase());
        System.out.println("let's print in lowerCase : " + s2.toLowerCase());
        
        String[] arr = s1.split(" ");
        System.out.println("Individual String : ");
        for(String s : arr){
            System.out.println(s);
        }
        
        
        StringTokenizer  tokenizer = new StringTokenizer(s2," ");
        System.out.println("Individual String : ");
        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }
        
        StringJoiner joiner = new StringJoiner(" | ");
        joiner.add("Shailesh");
        joiner.add("Bhojraj");
        joiner.add("Piyush");
        joiner.add("Kulddep");
        joiner.add("Vishu");
        
        System.out.println(joiner);
        
        
        
    }
    
    
}
