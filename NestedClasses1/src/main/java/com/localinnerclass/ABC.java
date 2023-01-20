package com.localinnerclass;

public class ABC {
    private int length = 30;
    public void calculate(){
        int width = 20;
        class PQR{
            //Local inner class 
            //It can access only such local variable that are final or effectively final
            public void area(){
                System.out.println("Area : " + (length * width));
            }
        }
        
        PQR obj = new PQR();
        obj.area();
    }
}
