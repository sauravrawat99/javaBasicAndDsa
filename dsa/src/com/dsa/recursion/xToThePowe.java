package com.dsa.recursion;

public class xToThePowe {

    static int xTOthe(int n, int x) {

        // base case
        if (n == 1) {
            return x;
        }
        return x * xTOthe(n - 1, x);
    }
    static int optimize(int n, int x) {
//base case
        if (n == 0) {
            return 1;
        }
        int half = optimize(n / 2 , x);
   if (n%2 ==0){
       return half*half;
   }else {
       return x*half*half;
   }

    }


    public static void main(String[] args) {
        int x = 2;
        int n = 4;

        System.out.println(xTOthe(n, x));
        System.out.println(optimize(n, x));

    }
}
