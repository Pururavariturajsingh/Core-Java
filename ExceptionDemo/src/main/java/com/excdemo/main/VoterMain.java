package com.excdemo.main;

import com.ecxdemo.pojo.Voter;
import com.excdemo.main.exception.AgeException;

public class VoterMain {
    public static void main(String[] args){
        Voter v1 = new Voter(3,"Rituraj");
        Voter v2 = new Voter(17,"Chetan");
        
        try{
            v1.checkAge();
            v2.checkAge();
        }catch(AgeException exc){
            System.out.println(exc.getMessage());
        }
        
        
    }
}
