import java.util.ArrayList;
import java.util.Scanner;

public class printArrayList {

    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        for ()
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.print(arr+", ");

        for (int i=arr.size()-1; i>=0;i--){
            System.out.print(arr.get(i)+", ");
        }


    }
}

