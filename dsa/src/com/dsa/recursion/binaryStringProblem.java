//Problem
//
//        Generate binary strings of length n such that
//        no two 1s come together.
//
//        🔹 Rule
//
//        After 0 → can add 0 or 1
//
//        After 1 → can add only 0
//
//        🔹 Function Meaning
//        binaryStringPro(n, last, str)
//
//
//        n → positions left
//
//        last → previous digit (0 or 1)
//
//        str → string formed so far
//
//        🔹 Base Case
//        if(n == 0)
//        print str
//        return
//
//        🔹 Recursive Calls
//        Always add 0:
//        binaryStringPro(n-1, 0, str+"0");
//
//        Add 1 only if last == 0:
//        binaryStringPro(n-1, 1, str+"1");
//
//        🔹 Important Points
//
//        ✔ return is mandatory in base case
//        ✔ lastNumber must change with added digit
//        ✔ prevents "11" automatically
//
//        🔹 Example (n = 3)
//
//        Output:
//
//        000
//        001
//        010
//        100
//        101
//
//        🔹 Time & Space
//        Time  : O(2^n)
//        Space : O(n)
//
//        🔒 Final Memory Line
//
//        Add 1 only when previous digit is 0.





package com.dsa.recursion;

import java.util.Scanner;

public class binaryStringProblem {

    static void binaryStringPro(int n, int lastNumber, String str) {

        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // add 0 → always allowed
        binaryStringPro(n - 1, 0, str + "0");

        // add 1 → only if last was 0
        if (lastNumber == 0) {
            binaryStringPro(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        binaryStringPro(n, 0, "");
    }
}
