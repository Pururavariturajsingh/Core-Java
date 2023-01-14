package com.oopdemo.variablearguments;
public class Demo {
    public static void main(String args[]){
        ABC obj = new ABC();
        obj.show(45,52,65,45);
        obj.show(45,52,65);
        obj.show(45,52);
        obj.show(45);
        obj.show();
    }
}
