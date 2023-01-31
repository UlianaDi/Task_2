package com.company;


public class Main {
    public static void main(String[] args) {
        One one = new One(1,2,3);
        System.out.println(one.sum());
        Two two = new Two();
        two.twoMethod(2);
    }
}
