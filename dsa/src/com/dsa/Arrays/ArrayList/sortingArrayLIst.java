import java.util.ArrayList;
import java.util.Collections;

public class sortingArrayLIst {
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(7);
        arr.add(8);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        Collections.sort(arr);
        System.out.println(arr);


    }
}