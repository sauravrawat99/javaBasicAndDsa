 class lastOccurance {


    static int findIndex(int[] arr,int k){
        int st=0;
        int end = arr.length-1;
        int index=-1;


        while (st<=end){
            int mid=st+(end-st)/2;

            if (arr[mid]==k){
                index=mid;
                st=mid+1;
            } else if (arr[mid]>k) {
                st=mid+1;
            }else {
                end=mid+1;
            }
        }
        return index;

    }
    public static void main(String[] args){
        int[] arr = {1,4,4,4, 4, 5};
        int k = 4;
        System.out.println(findIndex(arr, k));
    }
}