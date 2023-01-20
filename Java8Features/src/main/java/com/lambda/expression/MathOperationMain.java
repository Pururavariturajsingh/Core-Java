package com.lambda.expression;

import com.features.interfaces.MathOperation;
public class MathOperationMain {
    public static void main(String[] args) {
        MathOperation ref1 = (int a, int b)->{
            return (a+b);
        };
        
        System.out.println("Sum of 10 and 15 is : " + ref1.calculate(10,15));
        
        ref1 = (int a, int b)->{
            return (a-b);
        };
        System.out.println("Subtraction of 10 and 15 is : " + ref1.calculate(10,15));
        
        ref1 = (int x, int y)->{
            return (x*y);
        };
        
        System.out.println("Multiplication of 10 and 15 is : " + ref1.calculate(10,15));
        
        
        ref1 = (int s,int t)->{
            return (s/t);
        };
        
        System.out.println("Division of 105 and 15 is : " + ref1.calculate(105,15));
                
    }
}
