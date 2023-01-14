
package com.packagedemo.main;

import com.p1.Student;
import com.p1.p2.Employee;
public class AppMain extends Student {
    public static void main(String[] args){
        Student obj = new Student();
        obj.show();
//        CTE
//        obj.display();
//        obj.print();

        AppMain ref = new AppMain();
        ref.print();
        
        Employee emp = new Employee();
        emp.show();
    }
}
