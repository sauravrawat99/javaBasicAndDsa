/*
problem find the negative number of array

approach declare local variable count and traverse array if condition less then 0 then count ++;

 */
package com.dsa.Arrays;
 public class countNagativeNumber {
    static int FindNegitive(int[] arr){
        int count=0;
        for (int j:arr){
            if (j<0)count++;
        }
        return count;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,-4,-5,-6,7};

        System.out.println(FindNegitive(arr));
    }
}

/*
Interview Explanation

We traverse the array once and check each element.
If the element is less than zero, we increment the counter.
Since traversal happens once, time complexity is O(n) and no extra memory is used, so space complexity is O(1).

🔁 Same Pattern Questions (Important)

Ye sab same logic pe based hote hain:

Count positive numbers

Count even numbers

Count odd numbers

Count zeros

Count numbers greater than k ⭐

👉 Isko bolte hain Counting Pattern in Arrays
 */