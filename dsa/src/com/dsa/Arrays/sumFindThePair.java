package com.dsa.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

class sumFindThePair {

    static boolean findPairSum(int[] arr,int target){
        Arrays.sort(arr);

        int i=0,j=arr.length-1;

        while (i<j){
            if (arr[i]+arr[j]==target)return true;
            if (arr[i]+arr[j]>target)j--;
            else i++;

        }
        return false;

    }
    public static void main(String[] args){
        int[] arr={2,4,6,5,4,2,3,4,6,7};
        int target=11;
        System.out.println(findPairSum(arr,target));
    }
}
