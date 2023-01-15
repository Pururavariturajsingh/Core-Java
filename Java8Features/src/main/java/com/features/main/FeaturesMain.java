package com.features.main;

import com.features.implementer.PQR;
import com.features.implementer.XYZ;
import com.features.interfaces.ABC;

public class FeaturesMain {
    public static void main(String[] args) {
        ABC ref1 = new PQR();
        ref1.show();
        ref1.display();
//        ref1.print(); //CTE
         
        ABC ref2 = new XYZ();
        ref2.show();
        ref2.display();
//        ref2.print();//CTE

        ABC.print();
        
    }
}
