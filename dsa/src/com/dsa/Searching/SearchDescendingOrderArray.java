package com.dsa.Searching;

public class SearchDescendingOrderArray {

    static int Searching(int[] arr,int key){
        int start=0,end=arr.length-1,index=-1;


        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==key){
                return mid;

            } else if (arr[mid]>key) {
                start=mid+1;

            }else {
                end=mid-1;
            }
        }
        return index;
    }
    public static void main(String[] args){
        int[] arr = {99,87,67,54,32,25,20,15};
        int k=25;

        System.out.println(Searching(arr,k)+":key index");
    }
}