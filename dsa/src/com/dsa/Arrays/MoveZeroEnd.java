//Best Approach (Two Pointer)
//Time Complexity: O(n)
//Space Complexity: O(1)
//💡 Logic
//
//Ek pointer rakho index = 0
//
//Non-zero element mile → front me shift karo
//
//Last me bache hue places par zero fill karo


package com.dsa.Arrays;
 class MovesZeroEnd{
    static void moveZeros(int[] arr) {

        int index = 0;

        // Step 1: Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Step 2: Fill remaining positions with zeros
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 14, 0, 13, 12};

        moveZeros(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


//Move Zeros to End can be solved in O(n) time and O(1) space using two-pointer technique.