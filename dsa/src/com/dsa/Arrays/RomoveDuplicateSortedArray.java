/*
Optimal Approach — Two Pointer Technique (MOST IMPORTANT)

Hum do pointers use karte hain:

i → last unique element
j → traversal pointer

Logic

Agar arr[j] != arr[i]
→ new unique element mila
→ i++
→ arr[i] = arr[j]

Interview Explanation

Since the array is sorted, duplicates are adjacent.
We maintain a pointer for the last unique element and overwrite duplicates while traversing once.
Hence time complexity O(n) and space O(1).
 */
class RomoveDuplicateSortedArray {
    static int FindDu(int[] arr){
        int i=0;
        for (int j=1;j<arr.length-1;j++){
            if (arr[i] !=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args){
        int[] arr={1,2,2,3,3,4,4,5,5};
        int newSize=FindDu(arr);
        for (int k=0; k<newSize;k++){
            System.out.print(arr[k]+" ");
        }
    }
}