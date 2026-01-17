
//factorial(5)
//= 5 × factorial(4)
//= 5 × 4 × factorial(3)
//= 5 × 4 × 3 × factorial(2)
//= 5 × 4 × 3 × 2 × factorial(1)
//= 120

//⏱️ Complexity
//Time → O(n)
//Space → O(n)
//💣 Interview Line
//“Factorial is a classic example of recursion where each call depends on the result of a smaller subproblem.”

package com.dsa.recursion;
class Factorial {
    static int fact(int n) {
//        base case
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
