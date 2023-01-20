/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oopdemo.entity;

/**
 *
 * @author rituraj
 */
public class Engine {
    private int capacity;
    private String fuel;
    
//    public void manufacturingEngine(){
//        capacity = 1300;
//        fuel = "petrol";
//    }
    
    public void manufacturingEngine(int cap , String fu){
        capacity = cap;
        fuel = fu;
    }
    
    public void showEngineDetails(){
        System.out.println("Capacity : " + capacity + " , Fuel : " + fuel );
    }
    
    
}
