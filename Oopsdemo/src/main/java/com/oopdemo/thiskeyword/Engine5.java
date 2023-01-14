/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oopdemo.thiskeyword;
/**
 *
 * @author rituraj
 */
public class Engine5 {
    private int capacity;
    private String fuel;
    
    public Engine5(int capacity,String fuel){
        this.capacity = capacity;
        this.fuel = fuel;
        
    }
    
    public void showEngineDetails(){
        System.out.println("Capacity : " + capacity + " Fuel : " + fuel);
    }
    
}
