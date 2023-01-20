package com.anonymousinnerclass;

public class AnonymousMain {
    public static void main(String[] args) {
        ABC obj = new ABC(){
            @Override
            public void show(){
                System.out.println("Overriding show called.");
            }
        };
        obj.show();
    }
}
