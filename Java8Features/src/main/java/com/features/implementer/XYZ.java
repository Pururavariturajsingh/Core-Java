package com.features.implementer;

import com.features.interfaces.ABC;


public class XYZ implements ABC {
    @Override
    public void display(){
        System.out.println("diaplay() of XYZ called.");
    }
    @Override
    public void show(){
        System.out.println("show() of XYZ called.");
    }
}
