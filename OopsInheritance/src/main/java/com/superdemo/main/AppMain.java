package com.superdemo.main;
import com.superdemo.pojo.InHouseFaculty;
import com.superdemo.pojo.VisitingFaculty;

public class AppMain {
    public static void main(String[] args){
        InHouseFaculty f1 = new InHouseFaculty(3400,"Anil","DSA");
        System.out.println("Details of faculty f1 is : ");
        System.out.println("Name : "+ f1.getName());
        System.out.println("Subject : "+ f1.getSubject());
        System.out.println("Salary : "+ f1.getSalary());
        
        System.out.println();
        
        VisitingFaculty f2 = new VisitingFaculty(2400,"Sandip","Horticulture");
        System.out.println("Details of faculty f2 is : ");
        System.out.println("Name : "+ f1.getName());
        System.out.println("Subject : "+ f1.getSubject());
        System.out.println("Salary : "+ f2.getDailyWages());
    }
}
