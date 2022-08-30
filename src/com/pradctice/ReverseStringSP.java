package com.pradctice;

public class ReverseStringSP {
    public static void main(String[] args) {
        String str ="Ram Sita";
        String words[]= str.split(" ");

        for(String word : words)
        {
           // StringBuffer sb=new StringBuffer(word);
           // sb.reverse();
           // System.out.print(sb.toString()+" ");
            String revword="";
            for (int i=word.length()-1;i>=0;i--)
            {
                 revword = revword+word.charAt(i);
            }
            String rw = revword+" ";
            System.out.print(rw);
        }
    }
}
