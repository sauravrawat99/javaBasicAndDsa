public class FindFloor {
    static int findFloor(int[] arr, int x) {

        int low = 0;
        int high = arr.length - 1;
        int index = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] > x) {
                high = mid - 1;
            }
            else {
                index = mid;   // possible floor
                low = mid + 1; // try to find larger floor
            }
        }
        return index;
    }

    public static void main(String[] args){
        int[] arr={1,3,5,6,6,7,8};
        int x=4;

        System.out.println(findFloor(arr,x));
    }
}