package com.dsa.Arrays;

public class occurrence {
    static int firstOccurrence(int[] arr, int k) {
        int st = 0, la = arr.length - 1;
        int firstoccu = -1;

        while (st <= la) {
            int mid = st + (la - st) / 2;

            if (arr[mid] == k) {
                firstoccu = mid;
                la = mid - 1;
            } else if (arr[mid] < k) {
                st = mid + 1;
            } else {
                la = mid - 1;
            }
        }
        return firstoccu;
    }

    static int lastoccurrence(int[] arr, int k) {
        int st = 0;
        int la = arr.length - 1;
        int lastOccur = -1;

        while (st <= la) {
            int mid = st + (la - st) / 2;

            if (arr[mid] == k) {
                lastOccur = mid;
                st = mid + 1;
            } else if (arr[mid] < k) {
                st = mid + 1;
            } else {
                la = mid - 1;
            }
        }
        return lastOccur;
    }

    static int countOccurrence(int[] arr, int k) {
        int start = firstOccurrence(arr, k);
        int last = lastoccurrence(arr, k);

        if (start == -1) return -1;

        return (last - start) + 1;

    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 5, 5, 5};
        int k = 5;
        System.out.println("First Occurrence: " + firstOccurrence(arr, k));
        System.out.println("Last Occurrence: " + lastoccurrence(arr, k));
        System.out.println("Total Count: " + countOccurrence(arr, k));
    }
}