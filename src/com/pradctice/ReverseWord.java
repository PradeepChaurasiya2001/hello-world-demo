package com.pradctice;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "Hare Ram Hare Ram Ram Ram Hare Hare";
        String word[]=str.split(" ");
        String s="";
        for (int i= word.length-1;i>=0;i--)
        {
            s+=" "+word[i];
        }
        System.out.print(s);

    }
}
