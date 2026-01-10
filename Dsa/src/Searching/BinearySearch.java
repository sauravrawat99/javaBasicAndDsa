package Searching;
public class BinearySearch {

    // Binary Search Method
    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;   // element found
            }
            else if (arr[mid] < target) {
                start = mid + 1;   // search right side
            }
            else {
                end = mid - 1;     // search left side
            }
        }

        return -1;  // element not found
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};  // must be sorted
        int target = 40;

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
