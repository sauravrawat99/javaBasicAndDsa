/*
Given a string, reverse it.

Input:  "hello"
Output: "olleh"

✅ Best DSA Approach
Convert string to char array
Use Two Pointer Technique
Swap characters from both ends
💡 Core Logic

Use two pointers:

left = 0
right = n-1


Swap until:

left < right

🧩 Algorithm (Step-by-Step)

Convert string → char array

Take two pointers

Swap characters

Move pointers

Convert back to string

 */

package com.dsa.String;
class ReverseString {
    static String reverse(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // swap
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        String s = "hello";

        System.out.println(reverse(s));
    }
}