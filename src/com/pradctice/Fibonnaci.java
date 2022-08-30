package com.pradctice;

public class Fibonnaci {

   static int fib(int n)
    {
        //fib(2) =
        if (n==0||n==1)
            return n;
        return fib(n-1)+fib(n-2);

    }

    public static void main(String[] args) {
        int ans = fib(9);
        System.out.println("Fibonnaci : "+ans);
    }
}
