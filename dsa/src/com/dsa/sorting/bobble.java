/*
The bubble sort is a simple comparison-based sorting algorithm
 in which adjacent elements are repeatedly compared and swapped if they are in the wrong order.

idea
the largest element comes to end of array using swapping

algorithm
Start from index 0
Compare arr[j] and arr[j+1]
Swap if needed
To Repeat till end
Reduce range every pass

Why n-1-i ?
After every pass,
last element is already sorted
no need to compare it again
*/
package com.dsa.sorting;

import java.util.Arrays;

 class bobble {

    // =========================
    // 1️⃣ BASIC BUBBLE SORT
    // =========================
    static void bubbleSortBasic(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // =========================
    // 2️⃣ OPTIMIZED BUBBLE SORT
    // =========================
    static void bubbleSortOptimized(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // agar ek pass me koi swap nahi hua
            // matlab array already sorted hai
            if (!swapped) break;
        }
    }

    // =========================
    // MAIN METHOD
    // =========================
    public static void main(String[] args) {

        int[] arr1 = {9, 5, 2, 4, 1, 8};
        int[] arr2 = {9, 5, 2, 4, 1, 8};

//        bubbleSortBasic(arr1);
//        System.out.println("Basic Bubble Sort  : " + Arrays.toString(arr1));

        bubbleSortOptimized(arr2);
        System.out.println("Optimized Bubble   : " + Arrays.toString(arr2));
        bobble.bubbleSortBasic(arr1);
        System.out.println("Basic Bubble Sort  : " + Arrays.toString(arr1));


    }
}

//Optimized Bubble Sort (INTERVIEW GOLD)

