/*
Merge Sort

Theory:
Merge sort is a divide and conquer algorithm.
It divides the array into halves until single elements remain,
then merges them back in sorted order.

Time Complexity:
Best, Average, Worst → O(n log n)

Space Complexity:
O(n) (extra array required)

Stable:
Yes

Used in:
External sorting, large datasets
*/

package com.dsa.sorting;

import java.util.Arrays;

public class MergeSort {

    // =========================
    // MERGE SORT FUNCTION
    // =========================
    public static void mergeSort(int[] arr, int si, int ei) {

        // base case
        if (si >= ei) return;

        int mid = si + (ei - si) / 2;

        // left part
        mergeSort(arr, si, mid);

        // right part
        mergeSort(arr, mid + 1, ei);

        // merge
        merge(arr, si, mid, ei);
    }

    // =========================
    // MERGE TWO SORTED ARRAYS
    // =========================
    private static void merge(int[] arr, int si, int mid, int ei) {

        int[] temp = new int[ei - si + 1];

        int i = si;        // left pointer
        int j = mid + 1;   // right pointer
        int k = 0;

        while (i <= mid && j <= ei) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // remaining left
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // remaining right
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy back
        for (int x = 0; x < temp.length; x++) {
            arr[si + x] = temp[x];
        }
    }

    // =========================
    // MAIN METHOD
    // =========================
    public static void main(String[] args) {

        int[] arr = {6, 3, 9, 5, 2, 8};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Merge Sort : " + Arrays.toString(arr));
    }
}
