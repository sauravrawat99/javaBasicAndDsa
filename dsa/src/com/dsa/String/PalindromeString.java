/*
Use Two Pointer Technique

Compare first and last character

Move pointers towards center

If mismatch → not palindrome

🧩 Algorithm

Take two pointers

left = 0

right = length-1

While left < right

if chars not equal → return false

else move pointers

If loop completes → palindrome

Complexity

Time Complexity: O(n)

Space Complexity: O(1)
 */
package com.dsa.String;
class PalindromeString {

    static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "madam";

        if (isPalindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

