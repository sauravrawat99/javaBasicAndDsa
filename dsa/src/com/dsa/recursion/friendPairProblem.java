
//        Given n friends, each friend can:
//        stay single, or
//        be paired with exactly one friend
//        Find total number of ways.
//
//        🔹 Key Idea
//        Fix one friend and think of choices.
//
//        🔹 Two Choices
//        1️⃣ Friend stays single
//        Remaining friends = n - 1
//        Ways:
//        f(n - 1)
//
//        2️⃣ Friend pairs with someone
//        He can pair with (n - 1) friends.
//
//        After pairing → remaining friends = n - 2
//
//        Ways:
//
//        ( n - 1 ) × f(n - 2)
//
//        🔹 Formula (IMPORTANT)
//        f(n) = f(n - 1) + (n - 1) × f(n - 2)
//
//        🔹 Base Case
//        f(1) = 1
//        f(2) = 2
//
//
//        (optional)
//
//        f(0) = 1
//
//        🔹 Example
//        f(4) = f(3) + 3 × f(2)
//        = 4 + 3×2
//        = 10
//
//        🔹 Time & Space
//        Time  : O(2^n)   (recursion)
//        Space : O(n)     (call stack)
//
//        🔹 Interview One-Liner
//        Fix one friend. Either he stays single or pairs with any of the remaining friends, leading to the recurrence relation.
package com.dsa.recursion;

import java.util.Scanner;

public class friendPairProblem {
    static int friendPair(int n){
//        base case
        if(n==1||n==2){
            return n;
        }
        return friendPair(n-1)+(n-1)*friendPair(n-2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(friendPair(n));
    }
}