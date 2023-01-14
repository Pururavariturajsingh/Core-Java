package com.ecxdemo.pojo;

import com.excdemo.main.exception.AgeException;
public class Voter {
    private int age;
    private String name;

    public Voter() {
    }

    public Voter(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    
    
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void checkAge() throws AgeException{
        if(age < 18){
            throw new AgeException(name + " is not eligible for voting as age < 18.");
        }else{
            System.out.println(name + " is eligible for voting.");
        }
    }
    
}
