package com.takinginput;

import java.util.Scanner;
public class ScannerClassDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String yourName = sc.nextLine();
        System.out.println("Your name is : " + yourName);
    }
}
