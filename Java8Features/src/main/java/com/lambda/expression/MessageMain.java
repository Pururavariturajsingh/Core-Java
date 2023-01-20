package com.lambda.expression;

import com.features.interfaces.Message;
public class MessageMain {
    public static void main(String[] args) {
//        System.out.println("hi from main.");
        Message ref1 = () ->{
            System.out.println("Hello!!!");
        };
        
        ref1 = ()->{
            System.out.println("hiii");
            System.out.println("I am fine.");
        };
        ref1.showMessage();
        
    }
}
