package com.oopdemo.changecapacity;

/**
 *
 * @author rituraj
 */
public class Engine1 {
    private int capacity;
    private String fuel;
    
//    public void manufactureDeatils(){
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
    
    public void changeCapcity(int cap){
        capacity = cap;
    }
}