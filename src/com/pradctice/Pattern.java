package com.pradctice;

public class Pattern{
    public static void main(String[] args) {
        int n =3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            if(i==n)
            {
                for(int a=1;a<=n*2+1;a++){
                    System.out.print('$');}
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=1;j <=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


//        int n=5;
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            for(int k=0;k<2*i+1;k++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//
//        for(int i=n-1;i>0;i--)
//        {
//            for(int j=n-1;j>=i;j--){
//                System.out.print(" ");
//            }
//            for(int k=2*i-1;k>0;k--){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }


//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n/2;j++){
//                System.out.print(".");
//            }
//            for(int k=1;k<=i;k++)
//        }
    }
}
