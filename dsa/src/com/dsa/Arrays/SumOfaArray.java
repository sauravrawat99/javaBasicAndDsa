//Sum of Array — Complete Notes
//🔹 Problem
//
//Array ke sabhi elements ka total sum nikalna.
//
//Example
//
//Input:  [2, 34, 7, 42, 1, 3, 5]
//Output: 94
//
//        🔹 Approach (Logic)
//
//Ek variable sum = 0 lo
//
//Array ke har element ko visit karo
//
//Har element ko sum me add karo
//
//Last me sum return karo
//
//🔹 Important Concept
//
//Array traversal = sabhi elements ko ek-ek karke access karna
//
//2 tarike hote hain:
//
//        1) Normal for loop → index milta hai
//2) For-each loop → direct element milta hai (best for sum)
//✅ Correct Code (Recommended)


package com.dsa.Arrays;

public class SumOfaArray {

    static int sumof(int[] arr){
        int sum = 0;

        // traversal using for-each
        for (int element : arr){
            sum += element;
        }

        return sum;
    }

    public static void main(String[] args){
        int[] arr = {2,34,7,42,1,3,5};
        System.out.println(sumof(arr));
    }
}

//| Element | Sum |
//        | ------- | --- |
//        | 2       | 2   |
//        | 34      | 36  |
//        | 7       | 43  |
//        | 42      | 85  |
//        | 1       | 86  |
//        | 3       | 89  |
//        | 5       | 94  |
//
//time and space complexity
//        | Type             | Value |
//        | ---------------- | ----- |
//        | Time Complexity  | O(n)  |
//        | Space Complexity | O(1)  |

//Interview Explanation (Yaad kar lo)
//
//We traverse the array once and keep adding elements into a sum variable.
//Since traversal happens only once, time complexity is O(n) and no extra memory is used, so space complexity is O(1).