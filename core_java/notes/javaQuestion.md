Java Core – Basic Level
----

What is Java? Why is Java platform-independent?
--
Java is object-oriented,platform independent programming language use to develop scalable application

why java platform independent
-java platform independent because 
*java code compile in bytecode, Not machine code 
*This bytecode run on jvm (java virtual machine)
*Each os has own jvm  

mmi==Java is platform-independent because compiled bytecode runs on JVM, not directly on the operating system.
-----------------------------------------------------------------------------------------------------------

Difference between JDK, JRE, and JVM?
-

| Term    | Full Form                | Purpose                                   |
| ------- | ------------------------ | ----------------------------------------- |
| **JVM** | Java Virtual Machine     | Executes Java bytecode                    |
| **JRE** | Java Runtime Environment | Provides environment to run Java programs |
| **JDK** | Java Development Kit     | Used to develop and run Java programs     |

jvm-(java virtual machine)
* convert bytecode to machine code 
* platform independent
responsive for:=>1.memory management 2.garbage collection 3.execution of program

jreJRE (Java Runtime Environment)

Contains:
JVM
Core Java libraries
Used only to run Java applications
Cannot compile Java code
👉 JRE = JVM + Libraries

JDK (Java Development Kit)
Used to develop Java programs
Contains:
JRE
Compiler (javac)
Debugger and tools
👉 JDK = JRE + Development tools

mmi=>JVM runs the program, JRE provides runtime environment, and JDK is used to develop Java applications.
-----------------------------------------------------------------------------------------------------------------------

What is bytecode in Java?
-
bytecode in java intermediate code generator by the java compiler after compile a.java file 
java source code compile ==javac
output .class file called bytecode

mmi==> bytecode is the intermediate flatform independent in java compiler which is code execution
---------------------------------------------------------------------------------------------------------

Why Java is not 100% object-oriented?
-
java in pure oop programing language but they support primitive datatype
like int float boolean dabble char

and that primitive datatype store daringly
and they do not belong any class and do not have any methods 

mmi=> Java is not 100% object-oriented because it supports primitive data types that are not objects.
-----------------------------------------------------------------------------------------------------------

Difference between == and .equals()?
-
| `==`                                | `.equals()`                 |
| ----------------------------------- | --------------------------- |
| Compares **memory reference**       | Compares **content/value**  |
| Used for reference comparison       | Used for logical comparison |
| Works same for objects & primitives | Mainly used for objects     |
| Cannot be overridden                | Can be overridden           |

mmi=> == compares memory references, while .equals() compares actual object content.
--------------------------------------------------------------------------------------------------------

What is Class and Object?
-
Class=>The class is the blue print or template used to create object,
its define data (variable) behavior(methods)

object=> An object is a real-world instance of a class.
It represents actual data and uses the class methods.

mmi=> A class is a blueprint, and an object is an instance created from that class.
----------------------------------------------------------------------------------------------------------

Types of variables in Java?
-
Local => 1,Declare inside the method or block 2.used only within method 3.no default value
example=> void show() {
            int x = 10;
            }


Instance=> 1.Declare inside the class but outside method 2,belong to a object 3, gets default value
example  class Test {
int a;   // instance variable
}

Static=>1Declared using static keyword
2,Shared among all objects
3,Memory allocated once

class Test {
static int count = 0;
}

mmi Java has three types of variables: local, instance, and static variables.
----------------------------------------------------------------------------------------------------------

What is static keyword?
-
the static keyword use for variable and methods or block belong to class instant of the object

1.Static members are shared among all objects
2.memory allocate only once 
3.can be access using class name 

example
class Test {
static int x = 10;
}

access= text.x //10

The static keyword is used to create class-level members that are shared by all objects.
-----------------------------------------------------------------------------------------------------

Why main() method is static?
-
the main method is static because jvm need to without creating an object

1. program executions start main()
2. At this time no object exits
3. f main() were not static, JVM would need an object first 
4. That would create a dependency problem
5. 
So, main() is made static to allow direct access by JVM using class name.

mmi=> The main method is static so that JVM can call it without creating an object.
-------------------------------------------------------------------------------------------------------

Can we overload main() method?
-
yes we can overload main methods in java
1. java allowed same method difference parameter 
2. we can create multiple main method 
3. but jvm tun only Public static void main(String[] args)
4. and other main method do not run automatically

mmi =Yes, main() can be overloaded, but JVM always calls only public static void main(String[] args).
----------------------------------------------------------------------------------------------------
What happens if we don’t write main() method?
-
If we don’t write the main() method, the program will compile successfully but will not run.
At runtime, JVM throws this error:
Error: Main method not found in class

JVM starts execution from main() method
Without main(), JVM doesn’t know where to begin execution

mmi=Without the main() method, the program compiles but fails at runtime because JVM cannot find the entry point.
-----------------------------------------------------------------------------------------------------------------------

What is wrapper class?
-
A Wrapper Class in Java is used to convert primitive data types into objects.
int → Integer
double → Double
char → Character

Why wrapper classes are needed?
Collections (like ArrayList) store only objects
To use primitives as objects

mmi=Wrapper classes convert primitive data types into objects so they can be used where objects are required.
--------------------------------------------------------------------------------------------------
Supports autoboxing and unboxing
-
Autoboxing and unboxing are feacher in java that automatic convert between primitive type and auto object

Autoboxing 
automatic conversion of primitive --> wrapper object
example  int a = 10;
Integer i = a;   // autoboxing

unboxing
Automatic conversion of wrapper object → primitive.
integer i=20;
int a=i // unboxing

mmi==Autoboxing converts primitive to object automatically, and unboxing converts object back to primitive.
---------------------------------------------------------------------------------------------------------------------------------

boolean → BooleanDifference between primitive and non-primitive data types?
-
Difference between Primitive and Non-Primitive Data Types
| Primitive               | Non-Primitive                  |
| ----------------------- | ------------------------------ |
| Stores **actual value** | Stores **reference (address)** |
| Predefined in Java      | Created by programmer          |
| Uses **less memory**    | Uses **more memory**           |
| Cannot call methods     | Can call methods               |
| Faster                  | Comparatively slower           |

primitive Data Types:
int, float, double, char, boolean

👉 boolean

Non-Primitive Data Types:
String, Array, Class, Object, Interface, Boolean

👉 Boolean

mmi=Primitive data types store values directly, while non-primitive data types store references to objects.
------------------------------------------------------------------------------------------------------------


What is immutable object?
-
An immutable object after the creations do not change or modify

Explanation
Once an immutable object is created, its data cannot be modified
Any change creates a new object

String s = "Java";
s = s.concat(" World");

mmi==An immutable object is an object whose state cannot be changed once it is created.-
----------------------------------------------------------------------------------------------------------------------------------
=----------------------------------------------------------------------------------------------------------------------

🔹 OOPs (VERY IMPORTANT)

What are the 4 pillars of OOP?
-
The 4 pillars of Object-Oriented Programming (OOP) are:

1️⃣ Encapsulation
2️⃣ Inheritance
3️⃣ Polymorphism
4️⃣ Abstraction

The four pillars of OOP are Encapsulation, Inheritance, Polymorphism, and Abstraction.
---------------------------------------------------------------------------------------------------------------------


Explain Encapsulation with example
-
Encapsulation means wrapping data (variables) and code (methods) into a single
unit and restricting direct access to data.


Explain Inheritance
Types of inheritance in Java

class Employee {
private int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
Explanation
salary is private → cannot be accessed directly
Access is controlled using methods

Encapsulation protects data by restricting direct access and allowing controlled access through methods.
---------------------------------------------------------------------------------------------------------
Why multiple inheritance not supported in Java?
- 
Java does not support multiple inheritance using classes to avoid ambiguity problem(diamond problem)

if a class inherit 2 more classes have same method
class A {
void show() {}
}

class B {
void show() {}
}

class C extends A, B {   // ❌ confusion
}

JVM cannot decide which show() method to call — from A or B.
This creates ambiguity, so Java does not allow multiple inheritance with classes.

How Java solves this?
Java supports multiple inheritance using interfaces
Because interfaces provide method declaration only, not implementation (before Java 8)

mmi==ava does not support multiple inheritance with classes to avoid ambiguity and diamond problem.
------------------------------------------------------------------------------------------------------

What is Polymorphism?
-
Polymorphism means same method but different behavior

in java polymorphism  achieve by 
method Overloading(compile time )
method overriding(run time)

Payment p;

p = new CardPayment();
p.pay();

p = new UpiPayment();
p.pay();

Same method call → different behavior.

mmi===Polymorphism allows one method or object to perform different actions based on the situation.
------------------------------------------------------------------------------------------------------

Difference between compile-time and runtime polymorphism
-
polymorphism 
| Compile-time Polymorphism                | Runtime Polymorphism                |
| ---------------------------------------- | ----------------------------------- |
| Achieved by **method overloading**       | Achieved by **method overriding**   |
| Method call resolved at **compile time** | Method call resolved at **runtime** |
| Based on **method signature**            | Based on **object type**            |
| Faster                                   | Slightly slower                     |
| Uses **static binding**                  | Uses **dynamic binding**            |
 
mmi==Compile-time polymorphism uses method overloading, while runtime polymorphism uses method overriding.
----------------------------------------------------------------------------------------------------

What is method overloading?
-
Method overloading means having multiple methods with the same name but different parameters in the same class.
Rules

Method name must be same
Parameters must be different (number, type, or order)
Return type alone cannot change

class Test {

      void add(int a, int b) {
      System.out.println(a + b);
}

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
------------------------------------------------------------------------------------
What is method overriding?
-

Can we override a static method?

What is super keyword?

What is this keyword?

What is abstraction?

Difference between abstract class and interface

Can interface have methods with body?

Can abstract class have constructor?

🔹 String (MOST ASKED 🔥)

Difference between String, StringBuilder, StringBuffer

Why String is immutable?

What is String Constant Pool?

Difference between:

String s1 = "Java";
String s2 = new String("Java");


How many objects are created in above code?

Can we change String value?

Why StringBuilder is faster than String?

🔹 Memory & JVM

What is JVM memory structure?

Difference between Stack and Heap memory

What is Garbage Collection?

Who triggers Garbage Collection?

Can we force Garbage Collection?

What is OutOfMemoryError?

What is StackOverflowError?

🔹 Exception Handling

What is exception?

Difference between checked and unchecked exception

Difference between Error and Exception

What is try-catch-finally?

Can we have multiple catch blocks?

Can we write try without catch?

What happens if exception occurs in finally?

What is throw vs throws?

Can we create custom exception?

🔹 Collections Framework (VERY IMPORTANT 🔥)

What is Collection Framework?

Difference between Array and ArrayList

Difference between ArrayList and LinkedList

Difference between List, Set, and Map

Difference between HashMap and Hashtable

Difference between HashMap and TreeMap

Difference between HashSet and TreeSet

Why HashMap allows one null key?

What is Iterator?

Difference between Iterator and ListIterator

What is fail-fast and fail-safe iterator?

How HashMap works internally?

What is load factor?

🔹 Multithreading (Important)

What is thread?

Difference between process and thread

How to create thread in Java?

Difference between Thread class and Runnable interface

What is synchronization?

What is deadlock?

What is race condition?

Difference between sleep() and wait()

Difference between start() and run()

🔹 Java 8 Features (HIGH DEMAND 🔥)

What are Java 8 features?

What is lambda expression?

What is functional interface?

What is Stream API?

Difference between map() and filter()

What is Optional?

What is default method in interface?

🔹 Miscellaneous

What is final keyword?

Difference between final, finally, finalize

Can we override final method?

What is marker interface?

What is serialization?

What is transient keyword?

Difference between shallow copy and deep copy

What is clone() method?

Why Java doesn’t support pointers?

What is reflection API?

What is singleton class?

How to create thread-safe singleton?

🔹 Coding Interview Questions (Must Practice)

Reverse a String

Check palindrome

Find factorial (recursion)

Fibonacci series

Find duplicate elements in array

Find first non-repeating character

Sort array without using sort()

Count frequency of characters

Swap two numbers without third variable

Find second largest element


--------------------------------------------------------------------------------------------------------------
🧱 BASIC OOP CONCEPTS

What is Object-Oriented Programming?

What are the four pillars of OOP?

What is class?

What is object?

Difference between class and object?

Why OOP is used?

Advantages of OOP?

What is real-world example of OOP?

🔐 ENCAPSULATION

What is encapsulation?

How is encapsulation achieved in Java?

Why variables are declared private?

Difference between encapsulation and data hiding?

Can encapsulation be achieved without getter and setter?

Benefits of encapsulation?

🧬 INHERITANCE

What is inheritance?

Why inheritance is used?

Types of inheritance in Java?

Why multiple inheritance not supported in Java?

How Java supports multiple inheritance?

What is IS-A relationship?

What is HAS-A relationship?

Difference between IS-A and HAS-A?

🔁 POLYMORPHISM

What is polymorphism?

Types of polymorphism?

What is compile-time polymorphism?

What is runtime polymorphism?

What is method overloading?

Rules of method overloading?

What is method overriding?

Rules of method overriding?

Can we override static method?

Can we override final method?

Can we override private method?

What is method hiding?

🎭 ABSTRACTION

What is abstraction?

Why abstraction is required?

How abstraction is achieved in Java?

What is abstract class?

Can abstract class have constructor?

Can abstract class have non-abstract methods?

Can we create object of abstract class?

What is interface?

Difference between abstract class and interface?

What is 100% abstraction?

Can interface have variables?

Can interface have constructors?

What is default method?

What is functional interface?

🔑 KEYWORDS RELATED TO OOP

What is this keyword?

What is super keyword?

Difference between this and super?

What is final keyword?

final vs finally vs finalize?

Can we override final method?

What happens if class is final?

🧠 OBJECT & MEMORY CONCEPT

Where are objects stored in Java?

What is heap memory?

What is stack memory?

What is object reference?

What is garbage collection?

Who triggers garbage collection?

Can we force GC?

⚠️ TRICKY INTERVIEW QUESTIONS 🔥

Can constructor be inherited?

Can constructor be overridden?

Can we overload constructor?

Why Java does not support multiple inheritance with class?

Why main method is static?

Can we make class abstract and final together?

Can interface extend another interface?

Can a class implement multiple interfaces?

Difference between composition and inheritance?

Why composition is better than inheritance?

What is tight coupling?

What is loose coupling?

What is dependency injection? (basic idea)

🔥 MOST ASKED REAL QUESTIONS

Difference between abstraction and encapsulation?

Difference between interface and abstract class?

Overloading vs overriding?

Compile-time vs runtime polymorphism?

HAS-A vs IS-A relationship?

Why Java supports interfaces?

Can interface have static methods?

Why interface methods are public by default?

What happens if we don’t override abstract method?

What is diamond problem?