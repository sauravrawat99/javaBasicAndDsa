/*
Selection Sort

Theory:
Selection sort is a comparison-based sorting algorithm in which
the smallest element is selected from the unsorted part of the array
and placed at the correct position.

Idea:
Select the minimum element and put it at the beginning.

Algorithm:
1. Start from index i = 0
2. Assume minIndex = i
3. Traverse remaining array to find minimum
4. Swap arr[i] with arr[minIndex]
5. Repeat for next position

Time Complexity:
Best, Average, Worst → O(n^2)

Space Complexity:
O(1) (in-place)

Stable:
No (because of swapping)
*/

package com.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {

    // =========================
    // BASIC SELECTION SORT
    // =========================
    public static void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap only once per pass
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // =========================
    // MAIN METHOD
    // =========================
    public static void main(String[] args) {

        int[] arr = {7, 3, 5, 1, 4};

        selectionSort(arr);

        System.out.println("Selection Sort : " + Arrays.toString(arr));
    }
}

//INTERVIEW IMPORTANT POINTS
//❓ Is selection sort stable?
//
//        ❌ No
//        (because direct swapping breaks order)
//
//❓ Is it in-place?
//
//        ✅ Yes
//
//❓ Why is selection sort better than bubble?
//
//        👉 Fewer swaps
//        (only one swap per pass)
//
//❓ Why still not used in industry?
//
//Because time complexity is still O(n²).
//
//        🔥 INTERVIEW ONE-LINER
//Selection sort repeatedly selects the minimum element from the unsorted part and places it at the
// correct position. It performs fewer swaps but still has O(n²) time complexity.