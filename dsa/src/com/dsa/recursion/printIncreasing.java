//Concept
//        recursion pehle deep jaati hai
//        printing return time pe hoti ai
//        ⏱️ Complexity
//        Time → O(n)
//        Space → O(n)

//        💣 Interview Line
//        “Printing in increasing order happens while the call stack is unwinding.”

package com.dsa.recursion;

import java.util.Scanner;

public class printIncreasing {

     static  void increasing(int n){
//        base case
        if(n==1){
            System.out.println(n+" ");
            return;
        }

        increasing(n-1);
      System.out.println(n+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        increasing(n);
    }
}