//What is Prefix Sum?
//
//Prefix Sum means:
//
//        👉 Create a new array where each index stores
//sum of all elements from start to that index
//
//🔹 Simple Definition
//
//Prefix sum array stores cumulative sum of elements.
//
//        🔹 Example
//Input Array
//arr = [2, 4, 6, 8]
//
//Prefix Sum Array
//prefix = [2, 6, 12, 20]
//
//
//Because:
//
//        2
//        2+4 = 6
//        2+4+6 = 12
//        2+4+6+8 = 20
//
//        🔥 Why Prefix Sum is Used?
//
//Fast range sum queries
//
//Reduce time complexity
//
//Used in many DSA problems

package com.dsa.Arrays;
class PrefixSum{
    static int[] prefixSum(int[] arr) {

        int n = arr.length;
        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        return prefix;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8};

        int[] result = prefixSum(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}