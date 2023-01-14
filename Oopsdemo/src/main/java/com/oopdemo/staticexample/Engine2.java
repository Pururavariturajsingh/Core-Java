/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oopdemo.staticexample;

//only one copy of static data member is created and shared by amongst all object of the class
// static method can be access only by static members of the class
// main class is named as static because static members does not require creation of object to be used/called.

/**
 *
 * @author rituraj
 */
public class Engine2 {
    private int capacity;
    private String fuel;
    private static String company = "Fiat";
    
//    public void manufacturingEngine(){
//        capacity = 1300;
//        fuel = "petrol";
//    }
    
    public void manufacturingEngine(int cap , String fu){
        capacity = cap;
        fuel = fu;
    }
    
    public void showEngineDetails(){
        System.out.println("Capacity : " + capacity + " , Fuel : " + fuel + ", Comany : " + company );
    }
    
    public static void changeCompany(String comp){
        company = comp;
    }
    
}
