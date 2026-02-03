//W
package com.dsa.Arrays;
class SubarraySumBrute {

    static void subarraySum(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                System.out.println("Sum from " + i + " to " + j + " = " + sum);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        subarraySum(arr);
    }
}