package com.dsa.recursion;
class CheackSortedArray {
    static boolean cheakSort(int[] arr,int n){
//        base case
        if (n==arr.length-1){
            return true;
        }
        if(arr[n]>arr[n+1])return false;

        return cheakSort(arr,n+1);
    }
    public static void main(String[] args){
        int[] arr={1,2,0,4,5,6};
        System.out.println(cheakSort(arr,0));
    }
}