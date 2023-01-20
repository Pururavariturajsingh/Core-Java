package com.features.interfaces;

public interface ABC {
    void display();
    
    default void show(){
        System.out.println("default show() of ABC inteface called.");
    }
    
    static void print(){
        System.out.println("Static print() of ABC interface called.");
    }
}
