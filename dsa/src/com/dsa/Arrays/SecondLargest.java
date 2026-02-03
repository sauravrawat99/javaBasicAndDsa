/*
What this program does:

Finds second largest element in array

Uses single traversal (O(n))

No sorting required

🔹 Variables Used
largest        -> stores maximum value
secondLargest  -> stores second maximum value

🔹 Logic in Simple Words

Traverse array one time

If current number > largest

update secondLargest = largest

update largest

Else if number > secondLargest

update secondLargest

🔹 Important Conditions
num != largest


👉 Prevents duplicate largest value issue

🔹 Time & Space Complexity

Time Complexity: O(n)

Space Complexity: O(1)

🔥 Interview Points

Best optimal approach

No sorting needed

Works with duplicates

Handles negative numbers
* */

package com.dsa.Arrays;
class SecondLargest{
    static int secLargest(int[] arr) {

        if (arr.length < 2) {
            System.out.println("Second largest not possible");
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
            return -1;
        }

        return secondLargest;
    }
    public static void main(String[] args){
  int[] arr={3,3,5,4,5,7};
        System.out.println(secLargest(arr));
    }
}