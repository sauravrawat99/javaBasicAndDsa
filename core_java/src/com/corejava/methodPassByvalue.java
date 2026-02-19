package src.com.corejava;

import java.util.Scanner;

class MethodPassByValue {   // Class name capital letter se shuru karna best practice hai

    // Yeh method primitive (int) ko as parameter leti hai → pass-by-value hota hai
    static void change(int x) {
        System.out.println("Inside change - before: " + x);   // 10 aayega
        x = 6;                                                // sirf is method ke andar ka (copy) badlega
        System.out.println("Inside change - after:  " + x);   // 6 aayega
    }
    static void swap(int a ,int b){
        System.out.println(a+"  "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+"  "+b);

    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before calling change: " + x);    // 10
        change(x);   // yahan x ki COPY jaati hai, original nahi
        System.out.println("After calling change:  " + x);    // ab bhi 10 (kyunki original badla nahi)

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        swap(a,b);
        System.out.println("but actual value change nahi hogi "+a+" "+b);

    }
}