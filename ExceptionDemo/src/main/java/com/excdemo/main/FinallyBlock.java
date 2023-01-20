package com.excdemo.main;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String args[]){
        String str = "hi , how are you";
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Enter positon for character to be displayed from string : ");
            int position = sc.nextInt();
            System.out.println("Character present at given positon : " + str.charAt(position));
        }
        catch(StringIndexOutOfBoundsException exc){
            System.out.println("Please enter positon as integer value.");
        }
        finally{
            System.out.println("I will always be executed.");
        }
        
        System.out.println("Hello");
    }
}
