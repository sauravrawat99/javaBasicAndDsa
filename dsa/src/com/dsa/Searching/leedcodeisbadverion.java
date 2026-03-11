public class leedcodeisbadverion {
    static int findBad(int[] arr,int k){
        int st=0;
        int end=arr.length-1;

        while(st <end){
            int mid = st+(end-st)/2;

            if(arr[mid]==k) end=mid;
            else st=mid+1;
        }
        return st;
    }
    public static void main(String[] args){
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8};
        int k=7;
        System.out.println(findBad(arr,k));
    }
}