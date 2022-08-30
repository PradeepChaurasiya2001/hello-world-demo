package com.pradctice;

public class Pallindrome {
    static int palli(int n,int temp){
        if(n==0)
            return temp;
        temp = (temp*10)+(n%10);
        return palli(n/10,temp);
    }

    public static void main(String[] args) {
         int n = 121;
         int temp = palli(n ,0);
         if(n==temp)
             System.out.println("This number is Pallindriome : "+n);
         else
             System.out.println("This Number is not Pallindrome : "+n);
    }
}
