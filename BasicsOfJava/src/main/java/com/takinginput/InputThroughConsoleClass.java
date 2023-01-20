package com.takinginput;

import java.io.Console;

public class InputThroughConsoleClass {
    public static void main(String[] args) {
        Console con = System.console();
        System.out.println("Enter number : ");
        int num = Integer.parseInt(con.readLine());
        System.out.println("Square is : " + num * num);
        
    }
}
