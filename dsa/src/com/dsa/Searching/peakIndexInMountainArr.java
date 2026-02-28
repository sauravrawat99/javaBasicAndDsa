package com.dsa.Searching;

public class peakIndexInMountainArr {

    static int MountainArray(int[] arr) {
        int st = 0;
        int la = arr.length - 1;

        while (st < la) {
            int mid = st + (la - st) / 2;

            if (arr[mid] < arr[mid + 1]) {
                st = mid + 1;
            } else {
                la = mid;
            }
        }
        return st;
    }

    static int optimize(int[] arr){
        int low=0,hig=arr.length-1;

        while (low<hig){
            int mid=low+(hig+low)/2;
            if (arr[mid]<arr[mid+1])hig=mid;
            else low=mid+1;
        }
        return low;

    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 12, 9, 5, 2};
        System.out.println("Peak Index: " + MountainArray(arr));
        System.out.println("optimize Peak Index: " + MountainArray(arr));

    }
}