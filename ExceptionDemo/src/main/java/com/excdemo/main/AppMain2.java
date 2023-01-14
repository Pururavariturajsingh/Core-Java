package com.excdemo.main;
import java.util.Scanner;
//exception by JVM
public class AppMain2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter two numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        try{
            System.out.println("Division is : " + (n1/n2));
        }
        catch(ArithmeticException exc){
              System.out.println("Not divide by zero.");
        }
        
        System.out.println("Hello");
    }
}
