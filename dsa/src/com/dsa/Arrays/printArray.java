package com.dsa.Arrays;

class printArray{
     static void print(int[] arr) {
         for (int j : arr) {
             System.out.print(j + " ");
         }

    }
    static int FindMax(int[] arr){
         int max=arr[0];
         for (int i=1;i<arr.length;i++){
             if (max<arr[i]){
                 max=arr[i];
             }
         }
         return max;
    }

    public static void main(String[] args){
        int[] arr={7,5,3,2,5};
        print(arr);
        System.out.println(FindMax(arr));
    }
}