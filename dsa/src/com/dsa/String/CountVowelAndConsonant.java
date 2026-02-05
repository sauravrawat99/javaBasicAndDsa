//Problem
//
//Given a string, count:
//
//Number of vowels
//
//Number of consonants
//
//🔹 Example
//Input:  "hello"
//Output:
//Vowels = 2
//Consonants = 3
//
//        🔥 DSA Logic
//
//Traverse string character by character
//
//Convert to lowercase (for easy checking)
//
//If character is vowel → vowel++
//
//Else if alphabet → consonant++
//
//        🧩 Algorithm Steps
//
//Loop from 0 to length-1
//
//Ignore non-alphabet characters
//
//Use condition checking
//
//✅ Java Code (Optimal – O(n))
package com.dsa.String;
class CountVowelAndConsonant {

    static void count(String s) {

        s = s.toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {

                    vowels++;

                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {

        String s = "Hello World";

        count(s);
    }
}

//🔹 Output
//Vowels: 3
//Consonants: 7
//
//        🕒 Complexity
//
//Time Complexity: O(n)
//
//Space Complexity: O(1)
//
//👉 Best optimal approach
//
//🔥 Important Edge Cases
//
//Handles:
//
//Uppercase & lowercase
//
//        Spaces
//
//Digits
//
//Special characters
//
//Only alphabets are counted