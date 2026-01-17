// first approach base case
// and return value with index





package com.dsa.recursion;
public class FirstOccurince {

     static int occurrence(int[] arr,int target,int index){
//   base case
        if(index==arr.length){
            return -1;
        }
//        return index;
        if(arr[index]==target){
            return index;
        }
        return occurrence(arr,target,index+1);

}
    public static void main(String[] args) {
        int[] arr={1,3,2,4,3,2,3,4};
        int target=2;
        int index=0;
        int result=occurrence(arr,target,index);
        System.out.println(result);

    }
}