package com.dsa.Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class lonelyNumber {
    static ArrayList<Integer> findLonealyNum(ArrayList<Integer> list){
//        step 1 sort list
        Collections.sort(list);
//        create new array for lonely
        ArrayList<Integer> Result = new ArrayList<>();

        for (int i=0;i<list.size();i++){
            boolean lonely=true;

//            previous
            if (i>0){
                if (list.get(i).equals(list.get(i - 1)) ||
                        list.get(i) - list.get(i - 1) == 1) {
                    lonely = false;
                }
            }

//            next

            if(i<list.size()-1){
                if (list.get(i).equals(list.get(i+1))
                        || list.get(i+1) - list.get(i) == 1){
                    lonely=false;
                }
            }

            if (lonely){
                Result.add(list.get(i));
            }

        }
        return Result;


    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(5);

        ArrayList<Integer> result=findLonealyNum(list);

        System.out.println(result);
    }
}