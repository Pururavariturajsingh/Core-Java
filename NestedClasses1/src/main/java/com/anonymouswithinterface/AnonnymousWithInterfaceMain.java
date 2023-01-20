package com.anonymouswithinterface;

public class AnonnymousWithInterfaceMain {
    public static void main(String[] args) {
        ABC obj = new ABC(){
            @Override
            public void show(){
                System.out.println("Hello!! from anonymousWithInterface.");
            }
        };
        obj.show();
        
            
    }
}
