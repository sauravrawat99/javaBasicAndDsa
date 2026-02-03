//Approach – Using Array (Not HashMap)
//
//Ye approach tab use hota hai jab:
//
//Values limited range me ho
//
//Mostly 0 to n ke beech ho
//
//🧠 Logic
//
//Maximum element find karo
//
//Ek frequency array banao

//Original array traverse karke count store karo


package com.dsa.Arrays;

class FindFrequency {

    static void findFre(int[] arr) {

        // Step 1: Find maximum element
        int max = arr[0];

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }

        // Step 2: Create frequency array
        int[] freq = new int[max + 1];

        // Step 3: Count frequency
        for (int k : arr) {
            freq[k]++;
        }

        // Step 4: Print frequency
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,2,1,3,3};

        findFre(arr);
    }
}
