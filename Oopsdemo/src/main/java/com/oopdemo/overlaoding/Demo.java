package com.oopdemo.overlaoding;
import com.oopdemo.overlaoding.ABC1;
public class Demo {
    public static void main(String args[]){
        ABC obj = new ABC();
        obj.show();
        obj.show(4,5);
        obj.show("Sushma","Mahesh");
        
        System.out.println("ABC1 class called.");
        ABC1 obj1 = new ABC1();
        obj1.show();
        obj1.show(4,5.0);
        obj1.show(5.0,4);
//        obj1.show(4,5); Compile time error
    }
}
