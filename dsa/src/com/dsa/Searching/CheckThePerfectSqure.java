public class CheckThePerfectSqure {
    static boolean findSqure(int num){
        int st = 1;
        int end = num;

        while(st <= end){

            int mid = st + (end - st) / 2;
            long square = (long) mid * mid;

            if(square == num)
                return true;

            else if(square > num)
                end = mid - 1;

            else
                st = mid + 1;
        }

        return false;

    }
    public static void main(String[] args){
        int num=16;
        System.out.println(findSqure(num));
    }
}