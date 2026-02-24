package com.dsa.Arrays.ArrayList;

import java.util.ArrayList;

public class PairSumnigativeOne{
    static boolean pairSum1(ArrayList<Integer> arr,int sum){
        int st=0;
        int end=arr.size()-1;

        while (st<end){
            if (arr.get(st)+arr.get(end)==sum)return true;
            else if(arr.get(st)+arr.get(end)>sum)end--;
            else st++;

        }
        return false;

    }
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int sum=5;
        System.out.println(pairSum1(arr,sum)+"pair of sum");

    }
}