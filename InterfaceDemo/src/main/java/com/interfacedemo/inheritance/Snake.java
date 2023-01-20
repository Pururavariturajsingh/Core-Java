package com.interfacedemo.inheritance;

public class Snake implements TerrestialAnimal {
    @Override
    public void reproduce(){
         System.out.println("Snake reproduce by laying eggs");
    }
    @Override
    public void moveOnLand(){
        System.out.println("Snake screeps on land");
    }
}
