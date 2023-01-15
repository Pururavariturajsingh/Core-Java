package com.features.main;

import com.features.interfaces.MathOperation;
public class MethodReferenceMain {
    public static void main(String[] args) {
        MathOperation ref = MethodReferenceMain::perform1;
        
        System.out.println("Sum of 20 and 30 is : " + ref.calculate(20, 30));
        
        ref = new MethodReferenceMain()::perform2;
        System.out.println("Product of 15 and 10 is : "+ref.calculate(15,10));
    }    
        static int perform1(int x ,int y){
            return x+y;
        }
        
        int perform2(int x, int y){
            return x*y;
        }
    
}
