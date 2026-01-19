package com.dsa.Arrays;
public class findSmallest {
    static int findSmall(int[] arr){
        int smallest=arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    static int findmax(int[] arr){
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,1,9,3};
        System.out.println(findSmall(arr));
        System.out.println(findmax(arr));

    }
}