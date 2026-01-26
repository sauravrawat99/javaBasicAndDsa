package com.dsa.Arrays;

public class FindTheMissingNumber {

    static int findMissingNumber(int[] arr, int n) {

        int expect = n * (n + 1) / 2;   // 1 to n ka sum
        int actual = 0;

        for (int i = 0; i < arr.length; i++) {
            actual += arr[i];
        }

        return expect - actual;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 6};
        int n = 6;

        System.out.println(findMissingNumber(arr, n));
    }
}
