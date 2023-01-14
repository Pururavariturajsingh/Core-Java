package com.oopdemo.arrayofobjects;
import com.oppdemo.getterandsetter.Engine6;
import java.util.Scanner;

public class Engine7 {
    public static void main(String[] args ){
    Engine6[] arr = new Engine6[3];
    Scanner sc = new Scanner(System.in);
    
    for(int i = 0; i < arr.length; i++){
        arr[i] = new Engine6();
        System.out.println("Enter capacity details of engine " + (i+1) + " : ");
        
        arr[i].setCapacity(sc.nextInt());
        
        System.out.println("Enter fuel details of engine " + (i+1) + " : ");
        
        arr[i].setFuel(sc.next());    
    }
    System.out.println("Engines details from array are : ");
    
    for(Engine6 e : arr){
    System.out.println("Capacity : "+ e.getCapacity() +" , Fuel : "+ e.getFuel());
    }
    
    }
}
