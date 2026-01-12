package com.dsa.recursion;
class FindSortArray {

    static boolean isSorted(int[] arr, int start) {

        // base case: last index
        if (start == arr.length - 1) {
            return true;
        }

        // agar current element next se bada hai
        if (arr[start] > arr[start + 1]) {
            return false;
        }

        // recursive call
        return isSorted(arr, start + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int start = 0;

        System.out.println(isSorted(arr, start));
    }
}
