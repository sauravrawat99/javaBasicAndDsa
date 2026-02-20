
package com.dsa.Arrays;

import java.util.Arrays;

public class waveSort {
    static void wave(int[] arr){
        for (int i=0;i+1< arr.length;i+=2){
            int temp=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        wave(arr);
        System.out.println(Arrays.toString(arr));
    }
}
