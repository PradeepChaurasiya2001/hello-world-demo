package com.pradctice;

public class Overloading {
    void Test(){
        System.out.println("hii");
    }
    void Test(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        Overloading o=new Overloading();
        o.Test();
        o.Test(10);
    }
}
