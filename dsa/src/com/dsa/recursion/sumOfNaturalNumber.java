//Logic
//sum(n) = n + sum(n-1)
//jab n == 0 → stop

//call stack
//sum(5)
//        = 5 + sum(4)
//        = 5 + 4 + sum(3)
//        = 5 + 4 + 3 + sum(2)
//        = 5 + 4 + 3 + 2 + sum(1)
//        = 5 + 4 + 3 + 2 + 1 + sum(0)

//⏱️ Complexity

//        Time → O(n)
//        Space → O(n) (recursive stack)

//        💣 Interview Line
//        “The sum of n natural numbers using recursion reduces the problem size by one at each call.”


package com.dsa.recursion;
import java.util.*;
public class sumOfNaturalNumber {
    static int sum(int n){
//        base case
        if(n==1){
            return 1;
        }
        return n+(sum(n-1));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}