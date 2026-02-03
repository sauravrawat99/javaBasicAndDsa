package core_java.src.com.corejava;

import java.util.Scanner;

class calculator {

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static double div(int a, int b) {
        return a / (double) b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Enter operation (+, -, *, /):");
        String op = sc.next();

        switch (op) {
            case "+":
                System.out.println("Result: " + add(a, b));
                break;

            case "-":
                System.out.println("Result: " + sub(a, b));
                break;

            case "*":
                System.out.println("Result: " + mul(a, b));
                break;

            case "/":
                if (b == 0) {
                    System.out.println("Division by zero not allowed");
                } else {
                    System.out.println("Result: " + div(a, b));
                }
                break;

            default:
                System.out.println("Invalid Operation");
        }

        sc.close();
    }
}
