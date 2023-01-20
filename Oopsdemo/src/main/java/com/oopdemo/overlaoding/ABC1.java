package com.oopdemo.overlaoding;

public class ABC1 {
    public void show(){
        System.out.println("Show is called ");
    }
    
    public void show(int x, double y){
        System.out.println("Show(int,double) is called ");
    }
    
    public void show(double x, int y){
        System.out.println("Show(double,int) is called ");
    }
}
