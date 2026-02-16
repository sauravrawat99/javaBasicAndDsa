/*
Reverse Array — Proper Notes (DSA Style)
🔹 Problem

Given an array, uske elements ko ulta karna hai (in-place).

Example

Input :  [1,2,3,4,5,6,7]
Output:  [7,6,5,4,3,2,1]

🔹 Approach — Two Pointer Technique

Hum array ke dono ends se swap karte hain.

start → beginning
end   → last


Har step me:

start aur end swap

start++

end--

Jab start >= end → stop
 */
package com.dsa.Arrays;
class ReverseArray {
    static void reverse(int[] arr){
        int start=0;
        int end =arr.length-1;
        while (start < end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        reverse(arr);
        for (int j:arr) {
            System.out.print(j+" ");
        }
    }
}

/*
time complexity o(n)
space o(1)

interview line
Interview Explanation(Yaad karlo)

We use the two pointer technique. One pointer starts from the beginning and the
 other from the end. We keep swapping elements until they meet. Since the array is
 traversed once, time complexity is O(n) and no extra memory is used, so space complexity is O(1). */

