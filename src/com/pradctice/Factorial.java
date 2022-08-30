package com.pradctice;

public class Factorial {
    //Factorial Program using recursion
    static int fact(int n){
        if (n==0)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println("Factorial of :  "+ans);
    }
}
