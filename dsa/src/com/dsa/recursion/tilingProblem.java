// given a tile

package com.dsa.recursion;
public class tilingProblem {
    static int tiling(int n) {

        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // vertical
        int vertical = tiling(n - 1);

        // horizontal
        int horizontal = tiling(n - 2);

        return vertical + horizontal;
    }

    public static void main(String[] args){
        int n=10;
        System.out.print(tiling(n));

    }
}