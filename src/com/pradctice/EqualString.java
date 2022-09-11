package com.pradctice;

public class EqualString {
    public static void main(String[] args) {
        String a ="pradeep";
        String b ="kumar";
        String c=new String("Hello");
        String d=new String("Hello");
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(c.equals(d));

    }
}
