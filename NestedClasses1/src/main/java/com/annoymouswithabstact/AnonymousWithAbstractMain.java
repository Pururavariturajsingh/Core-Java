package com.annoymouswithabstact;

public class AnonymousWithAbstractMain {
    public static void main(String[] args) {
        ABC obj = new ABC(){
            @Override
            public void show(){
                System.out.println("Overloading show() called.");
            }
        };
        obj.show();
    }
}
