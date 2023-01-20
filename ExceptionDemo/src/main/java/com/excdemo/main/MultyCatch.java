package com.excdemo.main;

import java.util.*;


public class MultyCatch {
    public static void main(String[] args){
        String str = "hi , how are you";
        
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Enter position for character to be displayed from string : ");
            int position = sc.nextInt();
            
            System.out.println("Character present at positon : " + str.charAt(position));
        }
        catch(StringIndexOutOfBoundsException | InputMismatchException exc){
            if(exc instanceof InputMismatchException ){
                
                System.out.println("Please enter position as integer value.");
            
            }
            else{
                
                System.out.println("Please enter value between range 0-16.");
            }
        }
        
        System.out.println("Hello");
    }
}
