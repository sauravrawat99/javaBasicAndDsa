✅ What is Method?

A method is a block of code used to perform a specific task.
It runs only when it is called.

✅ Why we use Methods?

Code reusability

Improves readability

Easy maintenance

Avoids duplicate code

✅ Syntax of Method
returnType methodName(parameters) {
// method body
}

✅ Example
class Demo {

    static void sayHello() {
        System.out.println("Hello Java");
    }

    public static void main(String[] args) {
        sayHello(); // method call
    }
}

✅ Types of Methods in Java
1️⃣ Predefined Method

Methods already provided by Java.

System.out.println("Hello");
Math.sqrt(25);

2️⃣ User-Defined Method

Methods created by programmer.

static int add(int a, int b) {
return a + b;
}

✅ Based on Return Type
🔹 Method with Return Value
static int square(int n) {
return n * n;
}

🔹 Method without Return Value (void)
static void printMsg() {
System.out.println("No return");
}

✅ Based on Parameters
🔹 Method with Parameters
static void greet(String name) {
System.out.println("Hello " + name);
}

🔹 Method without Parameters
static void show() {
System.out.println("Hello");
}

✅ Method Call
int result = square(5);

✅ Method Overloading

Same method name but different parameters.

class Calc {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}


📌 Interview line:
Method overloading is compile-time polymorphism.

✅ Method Execution Flow
main() → method call → method body → return → back to main()

🎯 One-Line Interview Definition

A method in Java is a block of code that performs a specific task and can be reused.

✅ What is Call by Value?

In call by value, a copy of the variable value is passed to the method.
So original variable is NOT changed.

📌 Important:
👉 Java supports ONLY call by value, not call by reference.

✅ Simple Example
class Demo {

    static void change(int x) {
        x = 100;
    }

    public static void main(String[] args) {
        int a = 50;
        change(a);
        System.out.println(a);
    }
}

🔹 Output
50


📌 Reason:
a ki copy x me gayi, original a change nahi hua.

✅ Call by Value with Object (Tricky Interview Part)
class Student {
int marks;
}

class Test {

    static void change(Student s) {
        s.marks = 90;
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.marks = 50;

        change(st);
        System.out.println(st.marks);
    }
}

🔹 Output
90

❓ Confusion kyu hota hai?

Object ka reference copy pass hota hai

Reference same object ko point karta hai

Isliye object data change ho jata hai

📌 Interview line:
Java me object reference bhi call by value hota hai.

❌ Java does NOT support Call by Reference

Java me:

Variable ka actual address pass nahi hota

Sirf value copy pass hoti hai

| Call by Value        | Call by Reference      |
| -------------------- | ---------------------- |
| Copy of value passed | Actual address passed  |
| Original value safe  | Original value changes |
| Supported by Java    | ❌ Not supported        |

One-Line Interview Answer

Java supports only call by value, where a copy of the value is passed to the method.