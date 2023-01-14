package com.excdemo.main;

import java.util.Scanner;

public class GeneralCatchBlock {
    public static void main(String[] args){
        String str = "hi , how are you";
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Enter position for character "+ 
                    "to be dispalyed from string : ");
            int position = sc.nextInt();
            System.out.println("Character present at position : " + str.charAt(position) );
        }catch(Exception exc){
            System.out.println(exc.getMessage());
            System.out.println(exc);
//            System.out.println(exc.printStackTrace());
        }
        System.out.println("Hello");
    }
}
