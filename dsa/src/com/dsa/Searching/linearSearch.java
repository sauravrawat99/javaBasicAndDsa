package com.dsa.Searching;
 public class linearSearch {
    // Linear Search Method
    static int LinearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;   // target found
            }
        }

        return -1;  // target not found
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 30, 45, 50};
        int target = 30;

        int result = LinearSearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
