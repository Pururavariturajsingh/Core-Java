package com.objectclass;

public class ObjectClassMain {
    public static void main(String[] args) {
        Student s1 = new Student(32,"Vinay");
        System.out.println("s1's deatils are : ");
        System.out.println(s1);
        
        Student s2 = new Student(33,"Vijay");
        System.out.println("s2's deatils are : ");
        System.out.println(s2);
        
        if(s1.equals(s2)){
            System.out.println("s1 and s2 are same.");
        }else{
            System.out.println("s1 and s2 are not same.");
        }
    
        System.out.println("s1's hashcode is : " + s1.hashCode());
        System.out.println("s1's hashcode is : " +  s2.hashCode());
    }
}
