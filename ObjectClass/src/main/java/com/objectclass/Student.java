package com.objectclass;

public class Student {
    private int rollno;
    private String name;

    public Student() {
    }
    

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return rollno + " : " + name;
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Student ref = (Student) obj;
        return this.rollno == ref.rollno;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.rollno;
        return hash;
    }
    
    
    
    
    
}
