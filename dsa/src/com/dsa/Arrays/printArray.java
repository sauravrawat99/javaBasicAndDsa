package com.dsa.Arrays;

 class PrintArray {

    // Print array elements
    static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    // Find maximum element in array
    static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Find minimum element in array
    static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Reverse array using two pointer (in-place)
    static void reverseArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    // Check if array is sorted in ascending order
    static boolean checkSorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        print(arr);

        System.out.println("Max = " + findMax(arr));
        System.out.println("Min = " + findMin(arr));

        reverseArray(arr);
        print(arr);

        System.out.println("Is Sorted = " + checkSorted(arr));
    }
}

/*
* ✅ Print Array

Traverse array and print each element

Time: O(n)

Space: O(1)

✅ Find Maximum

Assume first element as max

Compare with remaining elements

Update when bigger found

Time: O(n)

✅ Find Minimum

Assume first element as min

Compare and update

Time: O(n)

✅ Reverse Array (Two Pointer)

Use two pointers: start & end

Swap elements

Move inward

✔ In-place reversal
✔ No extra array

Time: O(n)
Space: O(1)

✅ Check Sorted

Compare adjacent elements

If arr[i] > arr[i+1] → not sorted

Time: O(n)

🔥 Interview One-Line Summary

We perform basic array operations like traversal, finding min/max, reversing using two pointers,
*  and checking if the array is sorted,all with optimal time and constant space complexity.
* */