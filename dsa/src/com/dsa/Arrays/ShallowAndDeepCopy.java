import java.util.Arrays;

/*
Shallow copy copies object references, while deep copy copies the entire object graph independently.
 */
 class ShallowAndDeepCopy {
     public static void main(String[] args){
         int[] arr={1,2,3,45,6};
         int[] x=arr;
         arr[0]=100;
         System.out.println(x[0]);
//         change value because shallow copy point the reference and changes real array
//         that called shallow copy
         int[] deep= Arrays.copyOf(arr,arr.length);
         deep[0]=99;

         System.out.println(arr[0]);
         System.out.println(deep[0]);

     }
}