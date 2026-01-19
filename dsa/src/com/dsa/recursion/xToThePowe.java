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

        if (n == 0) {
            return 1;
        }

        int result = optimize(n / 2, x);
        int result2 = result * result;

        if (n % 2 != 0) {
            result2 = x * result2;
        }

        return result2;
    }


    public static void main(String[] args) {
        int x = 2;
        int n = 10;

        System.out.println(xTOthe(n, x));
        System.out.println(optimize(n, x));

    }
}
