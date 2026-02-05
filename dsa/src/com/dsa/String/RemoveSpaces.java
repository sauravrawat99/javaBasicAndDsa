/*
DSA Approach (Without Built-in replace)

We will:

Traverse string once

Copy only non-space characters

Build new result string

🧩 Algorithm

Take empty result string

Loop through each character

If character != space → add to result

Print result

Complexity

Time Complexity: O(n)

Space Complexity: O(n)
 */
package com.dsa.String;
class RemoveSpaces{
    static String removeSpaces(String s) {

        String result = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch != ' ') {
                result = result + ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "Hello World Java";

        System.out.println(removeSpaces(s));
    }
}