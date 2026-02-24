package com.dsa.Arrays.ArrayList;

import java.util.ArrayList;

class containWithMostWater {
    static int MaxWater(ArrayList<Integer> Height){
//        start with max value 0;
        int max=0;
        for (int i=0;i< Height.size();i++){
            for (int j=i+1;j<Height.size();j++){
                int width=j-i;
                int high=Math.min(Height.get(i),Height.get(j));
                   int water=high*width;
                   if(water>max) max=water;
            }
        }
        return max;
    }
//    time complexity O(n2)
//    space constant

    static int maxWaterOpti(ArrayList<Integer> height){
//        using two pointer technique
        int left=0;
        int right=height.size()-1;
        int max=0;

//        loop
        while (left<right){
//            finding height
            int heigh=Math.min(height.get(left),height.get(right));
            int width=right-left;
            int area=heigh*width;

            if (area>max)max=area;

            if (height.get(left)<height.get(right)){
                left++;
            }else if(height.get(left)>=height.get(right)){
                right--;
            }
        }
         return max;

    }
     public static void main(String[] args){
         ArrayList<Integer> height= new ArrayList<>();
         height.add(1);
         height.add(8);
         height.add(6);
         height.add(2);
         height.add(5);
         height.add(4);
         height.add(8);
         height.add(3);
         height.add(7);

         System.out.println(MaxWater(height));
         System.out.println(maxWaterOpti(height)+" optimise");

     }
}