package com.takinginput;

import java.util.Scanner;

public class InputThroughScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        System.out.println("");
        String name = sc.next();
        System.out.println("Your name is : " + name);
    }
}
