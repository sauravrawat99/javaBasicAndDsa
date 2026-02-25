package com.dsa.Arrays.ArrayList;

import java.util.ArrayList;

public class monotonicArrayList {
    static boolean FindMonotonic(ArrayList<Integer> list){
        boolean inc=true;
        boolean dec=true;
        for (int i=0;i<list.size()-1;i++){
//            case 1
            if(list.get(i)<=list.get(i+1)) dec = false;
            if (list.get(i)>=list.get(i+1)) inc= false;
        }
        return dec || inc;
    }
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);

        System.out.println(FindMonotonic(list));
    }


}