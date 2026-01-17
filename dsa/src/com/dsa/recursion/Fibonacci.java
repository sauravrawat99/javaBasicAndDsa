//fib(n) = fib(n-1) + fib(n-2)
//⚠️ Important Warning
//        This code is slow ❌
//        (but interview me logic ke liye poocha jaata hai)
//        ⏱️ Complexity
//        Time → O(2ⁿ) ❌
//        Space → O(n)
//        Reason:
//        same values repeat again and again
//        💣 Interview Line
//        “Recursive Fibonacci has exponential time complexity due to repeated overlapping subproblems.”
package com.dsa.recursion;

import java.util.Scanner;

class Fibonacci {

    static int fib(int n) {
        if (n == 0||n==1) {
            return n;   // base case
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
    }
}
