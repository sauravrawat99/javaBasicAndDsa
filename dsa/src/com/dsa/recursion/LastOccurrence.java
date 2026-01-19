//Pehle recursion poora end tak jata hai
//Wapas aate waqt check hota hai
//Jo sabse last milta hai wahi return hota hai

package com.dsa.recursion;
public class LastOccurrence {

    static int LastOcc(int[] arr,int key,int index){
//        base case
        if(index==arr.length){
            return -1;
        }
      int ans=LastOcc(arr,key,index+1);
        if(ans==-1 && key==arr[index]){
            return index;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,5,7,8,5,4,3,3,5};
        int index=0;
        int key=5;
        System.out.println(LastOcc(arr,key,index));
    }
}