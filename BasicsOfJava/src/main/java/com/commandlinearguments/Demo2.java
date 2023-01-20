package com.commandlinearguments;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Inside Demo2: ");
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int ans = x + y;
        System.out.println("Sum of " + x + "and " + y + "is : "+ ans);
    }
}
