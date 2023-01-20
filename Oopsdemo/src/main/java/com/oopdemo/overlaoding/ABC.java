package com.oopdemo.overlaoding;
public class ABC {
    public void show(){
        System.out.println("Show is called ");
    }
    
    public void show(int x, int y){
        System.out.println("Show(int,int) is called ");
    }
    
    public void show(String x, String y){
        System.out.println("Show(String,String) is called ");
    }
}
