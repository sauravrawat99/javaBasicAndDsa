package com.dsa.DivideAndConqure;
public class MargeSort {

    static void mergeSort(int[] arr, int si, int ei) {

        // base case
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        System.out.println(mid);

        // divide
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        // conquer
        merge(arr, si, mid, ei);
    }

    static void merge(int[] arr, int si, int mid, int ei) {

        int[] temp = new int[ei - si + 1];
        int i = si, j = mid + 1, k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy back
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2};
        mergeSort(arr, 0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

//✅ MERGE SORT — SHORT NOTES
//🔹 Divide & Conquer
//
//Problem ko chhote parts me todna
//
//Recursion use hota hai
//
//3 steps:
//
//Divide → Conquer → Combine
//
//🔹 Merge Sort Idea
//
//Array ko half-half divide karo
//
//Jab tak single element na bache
//
//Phir sorted parts ko merge karo
//
//🔹 Base Case
//if (si >= ei) return;
//
//
//        0 ya 1 element already sorted hota hai
//
//🔹 Mid Formula
//mid = si + (ei - si) / 2;
//
//
//Integer overflow se bachne ke liye
//
//🔹 mergeSort() ka kaam
//
//Sirf divide karta hai
//
//Sorting merge() me hoti hai
//
//🔥 MERGE FUNCTION SHORT NOTES
//🔹 3 pointers
//i → left part (si to mid)
//j → right part (mid+1 to ei)
//k → temp array
//
//🔹 Main while loop
//while(i <= mid && j <= ei)
//
//
//Jab dono side me element ho
//
//Compare karo
//
//Chhota temp me daalo
//
//🔹 Remaining loops
//while(i <= mid)
//        while(j <= ei)
//
//
//Jab ek side khatam ho jaye
//
//Dusri side ke elements direct copy
//
//Kyunki wo already sorted hote hain
//
//🔹 Copy back
//arr[i] = temp[k];
//
//
//Temp se original array update
//
//🔹 Time Complexity
//O(n log n)
//
//
//Best / Average / Worst same
//
//🔹 Space Complexity
//O(n)
//
//
//Extra temp array use hota hai
//
//🔹 Properties
//
//✅ Stable sort
//❌ In-place nahi
//✅ Large data ke liye fast
//
//🔥 ONE-LINE LOGIC (VERY IMPORTANT)
//
//Pehle compare,
//phir remaining copy,
//phir original array update
//🧠 INTERVIEW ONE-LINER
//Merge sort is a divide and conquer algorithm that divides the array recursively and merges sorted halves.