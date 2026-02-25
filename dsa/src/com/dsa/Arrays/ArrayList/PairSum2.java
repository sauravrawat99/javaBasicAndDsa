package com.dsa.Arrays.ArrayList;

import java.util.ArrayList;

public class PairSum2 {
    static boolean findPairSum2(ArrayList<Integer> list,int target){
//        finding pivot point
        int pi=-1;
        int n=list.size();

        for (int i=0;i<list.size();i++){
            if (list.get(i)>list.get(i+1)){
                pi=i;
                break;
            }
        }

        int lp=pi+1;
        int rp=pi;

        while (lp != rp){
//            case 1
            if (list.get(lp)+list.get(rp)==target) return true;
//            case 2
            else if (list.get(lp)+list.get(rp)<target) {
               lp = (lp+1)%n;
            }else {
                rp = (rp+n-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 160;

        System.out.println(findPairSum2(list,target));
    }
}