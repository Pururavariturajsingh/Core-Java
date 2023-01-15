package com.memberinnerclass;

public class ABC {
    private int length = 30;
    protected class PQR{
        private int width = 20;
        public void area(){  //memeber inner class
            System.out.println("Area : " + (length * width));
        }
    }
}
