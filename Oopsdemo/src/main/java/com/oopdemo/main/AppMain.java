package com.oopdemo.main;
import com.oopdemo.entity.Engine;
import com.oopdemo.changecapacity.Engine1;
import com.oopdemo.staticexample.Engine2;
import com.oopdemo.constructor.Engine4;
import com.oopdemo.thiskeyword.Engine5;
import com.oppdemo.getterandsetter.Engine6;
/**
 *
 * @author rituraj
 */
public class AppMain {
   public static void main(String args[]){
        Engine e1 = new Engine();
//        e1.manufactureDeatils();
        e1.manufacturingEngine(1500,"Diesel");
        System.out.println("e1's details are : ");
        e1.showEngineDetails();        
        Engine e2 = new Engine();
        e2.manufacturingEngine(1300,"Petrol");
        System.out.println("e2's details are : ");
        e2.showEngineDetails();
        System.out.println();
        System.out.println();       
        
        
        Engine1 e3 = new Engine1();
        e3.manufacturingEngine(2000, "Hydrogen Gas");
        System.out.println("e3's details are : ");
        e3.showEngineDetails();
        
        e3.changeCapcity(2500);
        System.out.println();
        System.out.println();
        System.out.println("e3's details after changing capacity : ");
        e3.showEngineDetails();  
        
        Engine2 e4 = new Engine2();
        e4.manufacturingEngine(2220, "Electical");
        System.out.println("e4's details are : ");
        e4.showEngineDetails(); 
        
        Engine2 e5 = new Engine2();
        e5.manufacturingEngine(30000, "Hybrid");
        System.out.println("e5's details are : ");
        e5.showEngineDetails();
        
        Engine2.changeCompany("Kiloskar");
        
        System.out.println();
        System.out.println();       
        System.out.println("e4's details are after changing company name : ");
        e4.showEngineDetails(); 
        System.out.println();
        System.out.println();       
        System.out.println("e5's details are  after changing company name : ");
        e5.showEngineDetails();
        
        System.out.println();
        System.out.println();
        

        Engine4 e6 = new Engine4();
        System.out.println("Output after/of making constructor");
        System.out.println("e6's details are : ");
           
        e6.showEngineDetails();
           
        System.out.println();
        System.out.println();
           
           
        Engine4 e7 = new Engine4(24136,"Petrol");
        System.out.println("Output after/of making parametrized constructor");
        System.out.println("e7's details are : ");
        e7.showEngineDetails();
           
           
        System.out.println();
        System.out.println();
        Engine5 e8 = new Engine5(1452,"Hydrogen fuel");
        System.out.println("Output after using this keyword");
        System.out.println("e8's details are : ");
           
        e8.showEngineDetails();

        Engine6 e9 = new Engine6();
        
//        e9.fuel = "Diesel"  Compile Time Error
        e9.setFuel("CNG");
        e9.setCapacity(45632);
        
        System.out.println();
        System.out.println();
        
        System.out.println("Example of POJO class is Engine6 class");
        System.out.println("e9's details are : ");
        System.out.println("Capacity : " + e9.getCapacity() + " ,Fuel : " + e9.getFuel());
        
        
           
        
        
        
        
        
        
   }
    
}

