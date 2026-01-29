
/*
Insertion Sort

Theory:
Insertion sort works the way we sort playing cards in our hand.
It takes one element at a time and inserts it into its correct position
in the sorted part of the array.

Idea:
Left side is always sorted.

Algorithm:
1. Start from index i = 1
2. Store current element as key
3. Compare key with left elements
4. Shift elements greater than key
5. Insert key at correct position

Time Complexity:
Best Case  : O(n)  (already sorted)
Average    : O(n^2)
Worst Case : O(n^2)

Space Complexity:
O(1)  (in-place)

Stable:
Yes
*/

package com.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {

    // =========================
    // INSERTION SORT
    // =========================
    public static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            // shift elements
           while (j>=0 && arr[j]>key){
               arr[j+1] = arr[j];
               j--;
           }
            // insert key
           arr[j+1]=key;

        }
    }

    // =========================
    // MAIN METHOD
    // =========================
    public static void main(String[] args) {

        int[] arr = {8, 3, 5, 2, 6};

        insertionSort(arr);

        System.out.println("Insertion Sort : " + Arrays.toString(arr));
    }
}
/*Is insertion sort stable?

✅ Yes
(because equal elements are not swapped)

❓ Is insertion sort in-place?

✅ Yes

❓ Why insertion sort is important?

🔥 Because it works very fast on nearly sorted arrays.

❓ Where is it used in real life?

👉 Used internally in:

Java TimSort

Hybrid sorting algorithms

(for small subarrays)

🔥 INTERVIEW ONE-LINER

Insertion sort builds the sorted array one element at a time by inserting each element into its
 correct position.
* */