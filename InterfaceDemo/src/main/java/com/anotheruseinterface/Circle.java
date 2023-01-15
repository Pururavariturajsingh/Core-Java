package com.anotheruseinterface;

public class Circle implements Shape{
    private final int radius;
    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public void findArea() {
            System.out.println("Area of circle : " + Shape.PI*(radius*radius));
//            System.out.println("Worked properly");
    }

    
    
    
   
}

