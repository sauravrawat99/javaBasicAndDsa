public class searchInsertion {

    static int FindIndex(int[] arr, int k){
        int st = 0;
        int end = arr.length - 1;

        while(st <= end){
            int mid = st + (end - st) / 2;

            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid] < k){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return st; // insert position
    }

    public static void main(String[] args){
        int[] arr = {1,3,4,5};
        int k = 2;

        System.out.println(FindIndex(arr,k));
    }
}