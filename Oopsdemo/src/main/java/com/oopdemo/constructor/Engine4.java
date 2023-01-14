/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oopdemo.constructor;

//constructor is a special member method having same name as class
//It does not have any return type not even void.
//Constructor is used to initialize object at the time of object creation.
//Constructor is called implicitly at the time of object creation.

/**
 *
 * @author rituraj
 */
public class Engine4 {
    private int capacity;
    private String fuel;
    
    //non_parametrized constructor
    public Engine4(){
        capacity = 1000;
        fuel = "Diesel";
    }
    
    public Engine4(int cap, String f){
        capacity = cap;
        fuel = f;
    }
    
    
    //parametrized constructor
    public void showEngineDetails(){
        System.out.println("Capacity : " + capacity + "  Fuel : " + fuel);
    }
}
