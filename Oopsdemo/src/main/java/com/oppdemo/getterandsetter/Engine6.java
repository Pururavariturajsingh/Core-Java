/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oppdemo.getterandsetter;
/**
 *
 * @author rituraj
 */

/**
 POJO CLASS = It is a class whose all data members are private.
 *            There should be one non-parametrized constructor .
 *            And also getter and setter method for all data members.
 */
public class Engine6 {

    private int capacity;
    private String fuel;
    
//    parametrized constructor
    public Engine6(int capacity,String fuel) {
    this.capacity = capacity;
    this.fuel = fuel;
    }
    
//    non-parametrized constructor
    public Engine6() {
    
    }

    public int getCapacity() {
        return capacity;
    }

    public String getFuel() {
        return fuel;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
    
    
    
}
