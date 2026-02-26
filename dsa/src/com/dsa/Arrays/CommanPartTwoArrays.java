package com.dsa.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class CommanPartTwoArrays {
    static ArrayList<Integer> findComman(int[] arr1,int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i=0,j=0;
        int n=arr1.length;

        ArrayList<Integer> list = new ArrayList<>();
        while (i<arr1.length && j<arr2.length){
            if (arr1[i]==arr2[j]){
                list.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i]<arr2[j]) i++;
            else j++;
        }
        return list;
    }
    public static void main(String[] args){
        int[] arr1={1,7,5,4,2,1,1,3},arr2={1,2,3,4,1,2,};
        System.out.println(findComman(arr1,arr2)+": comman of this array");
    }
}