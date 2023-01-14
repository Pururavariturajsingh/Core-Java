package com.interfacedemo.inheritance;

public class DemoMain {
    public static void main(String[] args) {
        Snake snake = new Snake();
        snake.reproduce();
        snake.moveOnLand();
        
        Animal ref1 = snake;
        ref1.reproduce();
//        ref1.moveOnLand();  //CTE

        TerrestialAnimal ref2 = snake;
        ref2.reproduce();//This must provide CTE
        ref2.moveOnLand();
    }
}
