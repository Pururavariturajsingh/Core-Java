package com.excdemo.main;
import java.util.Scanner;
//Exception by developer
public class AppMain {
    public static void main(String[] args){
        String s1 = "hi , how are you";
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter position for" +
                    "character to be displayed from string : ");
        int position = sc.nextInt();
        
        try{
            System.out.println("Character present at given position : " + s1.charAt(position));
        }catch(StringIndexOutOfBoundsException exc){
            System.out.println("Please enter position between range 0 - 16.");
        }
    }
            
}
