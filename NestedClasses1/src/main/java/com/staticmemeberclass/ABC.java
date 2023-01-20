package com.staticmemeberclass;

public class ABC {
    
    private final  int length = 30;        
    static class PQR{
        //static inner class
        //It can access all members of outter class to access non-static members of outter class, outter class object is required
        private static int width = 40;
            
        public static void area(){
            System.out.println("Area : " + (new ABC ()).length*width);
        }
           
        public void show(){
            System.out.println("show() called : ");
        }
    }
}
