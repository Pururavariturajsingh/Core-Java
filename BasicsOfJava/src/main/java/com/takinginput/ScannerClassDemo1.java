package com.takinginput;

import java.util.Scanner;

public class ScannerClassDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter Second number : ");
        int secondNumber = sc.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("Sum of "+ firstNumber + " and " + secondNumber + " is : "+ sum);
        
    }
}
