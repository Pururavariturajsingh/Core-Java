package com.excdemo.main;

import java.io.*;
//Exception Handling
//public class TryResourceDemo {
//    public static void main(String[] args){
//        
//        try( FileWriter Writer = new FileWriter("/home/rituraj/Desktop/UniversalCoacingJava/ExceptionDemo/d1.text")){
//            Writer.write("I love coding in java");
//            System.out.println("File writing completed");
//        }
//        catch(IOException exc){
//            exc.printStackTrace();
//        }
//    }
//}



//Exception Declaration
public class TryResourceDemo {
    public static void main(String[] args)throws IOException{
        
        FileWriter Writer = new FileWriter("/home/rituraj/Desktop/UniversalCoacingJava/ExceptionDemo/d1withexceptiodeclaration.text");
        Writer.write("I love coding in java");
        System.out.println("File writing completed");
        Writer.close();
    }
}
