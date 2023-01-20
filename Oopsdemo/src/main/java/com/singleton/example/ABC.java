package com.singleton.example;

public class ABC {
    private int x;
    static private ABC obj = new ABC(35);
    
    private ABC(int x){
        this.x = x;
        
    }
    public void show(){
        System.out.println("Value of x is : " + x);
    }
    static public ABC getInstance(){
        return obj;
    }
    
}
