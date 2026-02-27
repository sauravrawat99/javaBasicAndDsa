public class peakIndexInMountainArr {

    static int MountainArray(int[] arr) {
        int st = 0;
        int la = arr.length - 1;

        while (st < la) {
            int mid = st + (la - st) / 2;

            if (arr[mid] < arr[mid + 1]) {
                st = mid + 1;
            } else {
                la = mid;
            }
        }
        return st;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 12, 9, 5, 2};
        System.out.println("Peak Index: " + MountainArray(arr));
    }
}