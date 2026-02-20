import java.util.ArrayList;

public class MultiDimensionalArrayList {
    public static void main(String[] args){
//        create big array
        ArrayList<ArrayList<Integer>> MainArr=new ArrayList<>();
//       create list1
        ArrayList<Integer>list1=new ArrayList<>();
//list2
        ArrayList<Integer>list2=new ArrayList<>();
//list 3
        ArrayList<Integer>list3=new ArrayList<>();
//add the element with loop
        for (int i=1;i<=5;i++){
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }

        MainArr.add(list1);
        MainArr.add(list2);
        MainArr.add(list3);


        System.out.print(MainArr);

//        print every item of element using nested loop
        for (int i=0; i<MainArr.size(); i++){
            ArrayList<Integer> curr=MainArr.get(i);
            for (int j=0;j<curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println( );

        }

    }
}