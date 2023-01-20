package com.memberinnerclass;

public class MemberInnerClassMain {
    public static void main(String[] args) {
        ABC obj = new ABC();
        ABC.PQR ref = obj.new PQR();
        ref.area();
    }
}
