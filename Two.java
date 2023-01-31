package com.company;

public class Two {
    One one = new One(1,2,3);
    void twoMethod(int n){
        System.out.println(one.sum()/n);
    }
}