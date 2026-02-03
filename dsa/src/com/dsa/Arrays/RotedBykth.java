/*
What is “Rotate Array by K”?
Array ke elements ko K positions left ya right shift karna is called Rotate by K.

Most Optimal Approach (Reversal Algorithm)
Time Complexity: O(n)
Space Complexity: O(1)

Right Rotate by K – Logic
Steps:
Reverse whole array
Reverse first K elements
Reverse remaining elements

Left Rotate by K
Logic:
Reverse first K elements
Reverse remaining elements
Reverse whole array

*/

package com.dsa.Arrays;

class RotedBykth {

    // step 1 whole array reverse
    static void Reverse(int[] arr, int start, int end) {

        while (start < end) {      // also fixed condition

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void roted(int[] arr, int k) {

        int n = arr.length;
        k = k % n;

//        right roted
//        Reverse(arr, 0, n - 1);
//        Reverse(arr, 0, k - 1);
//        Reverse(arr, k, n - 1);

//        left roted
        Reverse(arr, k, n - 1);
        Reverse(arr, 0, k - 1);
        Reverse(arr, 0, n - 1);



    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int k = 3;

        roted(arr, k);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
