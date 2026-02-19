import java.util.Scanner;
import java.util.Arrays;   // ← printing ke liye add kar liya (optional but helpful)

public class SegregateZerosAndOne {

    static void zeroandone(int[] arr) {
        int left = 0;   // Yeh pointer batata hai: "yahan tak saare 0s already aa chuke hain"

        // right poora array traverse karega (0 to length-1)
        for (int right = 0; right < arr.length; right++) {   // ← yahan -1 hataya

            if (arr[right] == 0) {
                // 0 mila → ise left position pe le aao (swap)
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;   // ab left aage badha do (next 0 yahan aayega)
            }
            // agar arr[right] == 1 hai → kuch nahi karna, right aage badhega
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements (only 0s and 1s):");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before: " + Arrays.toString(arr));

        zeroandone(arr);

        System.out.println("After : " + Arrays.toString(arr));

        sc.close();
    }
}