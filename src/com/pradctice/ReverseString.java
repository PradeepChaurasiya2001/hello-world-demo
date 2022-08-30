package com.pradctice;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Ram Sita",s="";
        char ch;
        for (int i=0;i<str.length();i++){
            ch = str.charAt(i);
            s=ch+s;
        }
        System.out.println("Reverse String : "+s);
    }
}
