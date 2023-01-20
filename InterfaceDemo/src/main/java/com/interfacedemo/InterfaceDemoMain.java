package com.interfacedemo;

public class InterfaceDemoMain {

    public static void main(String[] args) {
        Snake snake = new Snake();
        snake.swim();
        snake.moveOnLand();
        
        AquaticAnimal ref1 = snake;        
        ref1.swim();
//        ref1.moveOnLand()// CTE
                
         TerrestialAnimal ref2 = snake;
//         ref2.swim(); //CTE
         ref2.moveOnLand();  
        
        
    }
}
