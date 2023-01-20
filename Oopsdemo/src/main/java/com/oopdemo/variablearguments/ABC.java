package com.oopdemo.variablearguments;

public class ABC {

    public void show(int... arr){
       int count = arr.length;
       System.out.println("Show() called with "+ count + " arguments.");
 
            if(count > 0){
                System.out.println("Following are the parameters:" );
                    for(int item : arr){
                        System.out.print(item + " ");
                    }
                System.out.println();
            }
            System.out.println();
   }
    
}
