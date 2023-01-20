package com.excdemo.main;
import java.util.Scanner;

public class SingleTryMultyCatchBlock {
    public static void main(String[] args){
        String str = "hi , how are you";
    
        Scanner sc = new Scanner(System.in);
    
    
        try{
            System.out.println("Enter position for charcater to be displayed from string : ");
            int position = sc.nextInt();
            System.out.println("Chatacter present at given positon : " + str.charAt(position));
    
        }
        catch(StringIndexOutOfBoundsException exc){
            
            System.out.println(exc.getMessage());
            
        }
//        catch(InputMismatchException exc){
//            
//            System.out.println("Please enter value as integer value.");
//        }
        System.out.println("Hello");
    }
    
}
