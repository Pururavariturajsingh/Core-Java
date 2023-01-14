package com.interfacedemo;

public class Snake implements AquaticAnimal,TerrestialAnimal {
    @Override
    public void swim(){
        System.out.println("Snake swims using tail.");
    }
    
    @Override
    public void moveOnLand(){
        System.out.println("Snake Creeps.");
    }
}
