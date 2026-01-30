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
-The method overriding means redefine parent class method in child class with the same parameter
same name and same return type

conditions
must be inheritance
method name must be same
parameter name must be same 
return type same must be or 
access modifiers cannot be restrictive

example
class Parent {
void show() {
System.out.println("Parent");
}
}

class Child extends Parent {
void show() {
System.out.println("Child");
}
}

mmi==Method overriding allows a child class to provide its own implementation of a parent class method.
--------------------------------------------------------------------------------------------------------

Can we override a static method?
-
no, cannot we override a static method

reason
static method belong to class not in object
override work on run time in polymorphism
static method resolve on compile time

So, static methods support method hiding, not overriding.

Static methods cannot be overridden because they belong to the class and are resolved at compile time.
----------------------------------------------------------------------------------------------------

What is super keyword?
-
the super keyword use to refer immediate parent class object

Uses of super
1️⃣ To access parent class variables
2️⃣ To call parent class methods
3️⃣ To call parent class constructor

class Parent {
int x = 10;
}

class Child extends Parent {
int x = 20;

    void show() {
        System.out.println(super.x); // 10
    }
}

The super keyword is used to access parent class members and constructors.
----------------------------------------------------------------------------------------------------

What is this keyword?
-
this keyword refer to the current object in the class

Uses of this
1️⃣ To differentiate instance variable and local variable
2️⃣ To call current class methods
3️⃣ To call current class constructor

example
class Test {
int x;

    Test(int x) {
        this.x = x;
    }
}
 
mmi==The this keyword refers to the current object of the class.
-----------------------------------------------------------------------------------------------------------------

What is abstraction?
-
Abstraction means hiding implementation details and showing only essential feacher to the user

In Java, abstraction is achieved using:
1️⃣ Abstract class
2️⃣ Interface

🔹 Example (real-life)
Car → you use accelerator & brake
You don’t know internal engine logic

mmi==Abstraction hides internal implementation and shows only necessary functionality.
----------------------------------------------------------------------------------------------

Difference between abstract class and interface
-abstract vs interface
| Abstract Class                                 | Interface                              |
| ---------------------------------------------- | -------------------------------------- |
| Can have **abstract and non-abstract methods** | Methods are **abstract by default**    |
| Supports **method implementation**             | No implementation (before Java 8)      |
| Supports **instance variables**                | Only **public static final constants** |
| Supports **constructors**                      | Does not support constructors          |
| Supports **single inheritance**                | Supports **multiple inheritance**      |
| Uses `extends` keyword                         | Uses `implements` keyword              |

mmi=Abstract class can have implemented methods, while interface is used for full abstraction and multiple inheritance.
------------------------------------------------------------------------------------------------------------------

Can interface have methods with body?
-
Yes, interfaces can have methods with body — from Java 8 onwards.

Types of methods with body in interface

1️⃣ Default methods
Written using default keyword
Can have method body

default void show() {
System.out.println("Default method");
}

2️⃣ Static methods
Can have method body
Called using interface name

static void test() {
System.out.println("Static method");
}

mmi=From Java 8 onwards, interfaces can have default and static methods with implementation.
--------------------------------------------------------------------------------------------

Can abstract class have constructor?
-
Yes, an abstract class can have a constructor.

🔹 Reason
Constructor is used to initialize variables
When a child class object is created,
the abstract class constructor is called first

🔹 Example
abstract class A {
A() {
System.out.println("Abstract class constructor");
}
}

class B extends A {
B() {
super();
}
}

Yes, abstract classes can have constructors to initialize common data.
---------------------------------------------------------------------------------------------------------

🔹 String (MOST ASKED 🔥)
-------------------------------------------------------------------------------------------------------

Difference between String, StringBuilder, StringBuffer
-
s
| Feature         | String        | StringBuilder | StringBuffer              |
| --------------- | ------------- | ------------- | ------------------------- |
| Mutability      | **Immutable** | **Mutable**   | **Mutable**               |
| Thread-safe     | ❌ No          | ❌ No          | ✅ Yes                     |
| Performance     | Slow          | Fast          | Slower than StringBuilder |
| Synchronization | No            | No            | Yes                       |
| Introduced in   | Java 1.0      | Java 1.5      | Java 1.0                  |

Key Points

String → value cannot be changed
StringBuilder → fast, single-threaded environment
StringBuffer → thread-safe, multi-threaded environment

mmi String is immutable, StringBuilder is mutable and fast, and StringBuffer is mutable but thread-safe.
=====================================================================================================

Why String is immutable?
-
String is immutable in Java for security, performance, and memory optimization.

Reasons

1️⃣ Security
Strings are used in:
passwords
database URLs
file paths
If mutable, values could be changed and cause security issues.

2️⃣ String Constant Pool (Memory Optimization)
Same string value can be shared
Immutability prevents data corruption.

3️⃣ Thread Safety
Immutable objects are automatically thread-safe.

4️⃣ Caching of hashcode
Improves performance in collections like HashMap.

String is immutable to provide security, memory efficiency, and thread safety.
----------------------------------------------------------------------------------------------------

What is String Constant Pool?
-
The String Constant Pool (SCP) is a special memory area in heap where String literals are stored.

Explanation
When a String literal is created, JVM first checks SCP
If the same value already exists, it reuses the reference
Otherwise, a new String object is created in SCP

string s1 = "Java";
String s2 = "Java";
Both s1 and s2 point to the same object in SCP.

mmi=String Constant Pool is a memory area where JVM stores and reuses String literals to save memory.-
----------------------------------------------------------------------------------------


Difference between:

String s1 = "Java";
String s2 = new String("Java");
| Point                       | String Literal           | new String()                  |
| --------------------------- | ------------------------ | ----------------------------- |
| Memory location             | **String Constant Pool** | **Heap memory**               |
| Object creation             | Reuses existing object   | Creates new object every time |
| Memory efficient            | Yes                      | No                            |
| Reference comparison (`==`) | Same reference           | Different reference           |


String s1 = "Java";
String s2 = "Java";
String s3 = new String("Java");

System.out.println(s1 == s2); // true
System.out.println(s1 == s3); // false
System.out.println(s1.equals(s3)); // true

mmi=String literal is stored in String Constant Pool, while new String() creates a new object in heap memory.
-------------------------------------------------------------------------------------------------

How many objects are created in above code?
-
String s1 = "Java";
String s2 = new String("Java");

🔹 Objects created: 2
🔸 Explanation
1️⃣ "Java" → created once in String Constant Pool
2️⃣ new String("Java") → creates one new object in heap

So total objects =
👉 1 (SCP) + 1 (Heap) = 2 objects

Two objects are created: one in String Constant Pool and one in heap memory.
---------------------------------------------------------------------------------------------------

Can we change String value?
-
No, we cannot change the value of a String in Java.

🔹 Reason

String is immutable
Any modification creates a new String object
Original String remains unchanged

🔹 Example
String s = "Java";
s = s.concat(" World");


Here:
"Java" remains same
New object "Java World" is created

mm-String values cannot be changed because String objects are immutable; any modification creates a new object.
------------------------------------------------------------------------------------------------------------------

Why StringBuilder is faster than String?
-
StringBuilder is faster than String because it is mutable.

🔹 Explanation

String is immutable → every modification creates a new object
StringBuilder is mutable → modifies the same object
No extra object creation
Less memory usage and faster execution

mmi=StringBuilder is faster because it is mutable and does not create new objects during modification.
----------------------------------------------------------------------------------------

🔹 Memory & JVM
===========================================================================================================================

What is JVM memory structure?
-
The JVM memory structure defines how memory is divided while executing a Java program.

🔹 JVM Memory Areas

1️⃣ Method Area
Stores class metadata
Methods, static variables, constants

2️⃣ Heap Area
Stores objects and instance variables
Shared among all threads

3️⃣ Stack Area
Stores method calls and local variables
Each thread has its own stack

4️⃣ PC Register
Holds current executing instruction address

5️⃣ Native Method Stack
Used for native (non-Java) methods


JVM memory is divided into Method Area, Heap, Stack, PC Register, and Native Method Stack.
Difference between Stack and Heap memory
---------------------------------------------------------------------------------------------------------

What is Garbage Collection?
-
Garbage Collection is the process by which JVM automatically removes unused objects from heap memory.
🔹 Explanation

Objects with no reference become eligible for GC
JVM frees memory automatically
Improves performance and prevents memory leaks

Garbage Collection automatically removes unused objects from heap memory to free space.
----------------------------------------------------------------------------------------------

Who triggers Garbage Collection?
-
Garbage Collection is triggered by the JVM automatically.
Explanation

1 Programmer cannot force GC
1 JVM decides when to run GC based on:

 memory usage
heap space availability
System.gc() can request GC, but JVM may ignore it.

Garbage Collection is automatically triggered by the JVM, not by the programmer.
-------------------------------------------------------------------------------------------

Can we force Garbage Collection?
-
No, we cannot force Garbage Collection in Java.

Explanation

System.gc() or Runtime.getRuntime().gc() only requests GC
JVM may ignore the request
Final decision is always taken by JVM

Garbage Collection cannot be forced; it can only be requested, and JVM decides when to execute it.
------------------------------------------------------------------------------------

What is OutOfMemoryError?
-
OutOfMemoryError occurs when JVM runs out of heap memory and cannot allocate memory for new objects.

🔹 Reasons

Creating too many objects
Memory leak
Insufficient heap size

OutOfMemoryError occurs when JVM cannot allocate memory due to insufficient heap space.
--------------------------------------------------------------------------------------------------

What is StackOverflowError?
-
StackOverflowError occurs when the stack memory is exhausted.

🔹 Main Reason

Infinite or deep recursion
Too many method calls without returning

void show() {
show(); // infinite recursion
}


mmi==StackOverflowError occurs when stack memory overflows due to infinite or excessive method calls.
----------------------------------------------------------------------------------------------

🔹 Exception Handling
=================================================================================================================================

What is exception?
-
An exception is an unexpected event that occurs during program execution and disrupts the normal flow of the program.
----------------------------------------------------------------------------------------------

Difference between checked and unchecked exception
-
exception vs non exception
| Checked Exception                             | Unchecked Exception                                     |
| --------------------------------------------- | ------------------------------------------------------- |
| Checked at **compile time**                   | Checked at **runtime**                                  |
| Must be handled using **try-catch or throws** | Handling is optional                                    |
| Extends **Exception** class                   | Extends **RuntimeException**                            |
| Compiler forces handling                      | Compiler does not force                                 |
| Examples: `IOException`, `SQLException`       | Examples: `NullPointerException`, `ArithmeticException` |

Checked exceptions are verified at compile time, while unchecked exceptions occur at runtime.
------------------------------------------------------------------------------------------------------


Difference between Error and Exception
| Error                                              | Exception                                       |
| -------------------------------------------------- | ----------------------------------------------- |
| Occurs due to **system failure**                   | Occurs due to **program logic**                 |
| Cannot be handled                                  | Can be handled                                  |
| Occurs at **runtime**                              | Can occur at compile or runtime                 |
| Not recoverable                                    | Recoverable                                     |
| Examples: `OutOfMemoryError`, `StackOverflowError` | Examples: `IOException`, `NullPointerException` |

Errors are serious system problems that cannot be handled, while exceptions are runtime issues that can be handled.
---------

What is try-catch-finally?
--
try–catch–finally is used to handle exceptions in Java.

🔹 try
Contains code that may cause exception

🔹 catch
Handles the exception

🔹 finally
Always executes

Used for resource cleanup

🔹 Example
try {
int a = 10 / 0;
} catch (Exception e) {
System.out.println("Exception handled");
} finally {
System.out.println("Finally block executed");
}

try handles risky code, catch handles exception, and finally executes whether exception occurs or not.
-------------------------------------------------------------------------------------------------------


Can we have multiple catch blocks?
--
Yes, we can have multiple catch blocks in Java.

🔹 Rules

Used to handle different types of exceptions
Parent exception must be written after child exception
Otherwise, compiler error occurs

🔹 Example
try {
int a = 10 / 0;
} catch (ArithmeticException e) {
System.out.println("Arithmetic Exception");
} catch (Exception e) {
System.out.println("General Exception");
}

Yes, multiple catch blocks are allowed, but child exceptions must come before parent exceptions.
Can we write try without catch?
------------------------------------------------------------------------------------------------

What happens if exception occurs in finally?
---
If an exception occurs inside the finally block, that exception overrides any previous exception.

🔹 Explanation

Even if exception occurs in try or catch
If finally throws an exception
JVM considers finally exception only

🔹 Example
try {
int a = 10 / 0;
} finally {
int b = 10 / 0;
}


👉 Output: ArithmeticException from finally block

If an exception occurs in finally, it suppresses the original exception and finally exception is thrown.
-------------------------------------------------------------------------------------------------

What is throw vs throws?
---
throw vs throws
| `throw`                                   | `throws`                              |
| ----------------------------------------- | ------------------------------------- |
| Used to **explicitly throw an exception** | Used to **declare exception**         |
| Used inside method body                   | Used in method signature              |
| Throws **one exception at a time**        | Can declare **multiple exceptions**   |
| Used to create custom exception           | Used to pass exception responsibility |


Example

throw
throw new ArithmeticException("Error");

throws
void readFile() throws IOException {
}

throw is used to explicitly throw an exception, while throws is used to declare exceptions.
---------------------------------------------------------------------------------------
Can we create custom exception?
-
Yes, we can create a custom exception in Java.

🔹 How?

By extending the Exception class
or

By extending the RuntimeException class

🔹 Example
class AgeException extends Exception {
AgeException(String msg) {
super(msg);
}
}

Yes, custom exceptions can be created by extending Exception or RuntimeException.
------------------------------------------------------------------------------------------------

🔹 Collections Framework (VERY IMPORTANT 🔥)
===============================================================================================

What is Collection Framework?
---
The Collection Framework in Java is a set of classes and interfaces used to store, manipulate,
and manage groups of objects.

🔹 It provides:
Ready-made data structures
Interfaces like List, Set, Queue, Map

Classes like ArrayList, LinkedList, HashSet, HashMap

The Collection Framework provides predefined classes and interfaces to store
and manipulate groups of objects efficiently.
---------------------------------------------------------------------------------------------------------

Difference between Array and ArrayList
-
array vs arrayList
| Array                               | ArrayList               |
| ----------------------------------- | ----------------------- |
| Fixed size                          | Dynamic size            |
| Can store **primitive and objects** | Stores **objects only** |
| Faster                              | Slightly slower         |
| Length is fixed                     | Size can grow or shrink |
| No built-in methods                 | Provides many methods   |

mmi==Array is fixed-size, while ArrayList is dynamic and provides built-in methods.
--------------------------------------------------------------------------------------------------

Difference between ArrayList and LinkedList
-
arraylist vs linklist
| ArrayList                          | LinkedList                        |
| ---------------------------------- | --------------------------------- |
| Uses **dynamic array**             | Uses **doubly linked list**       |
| Faster in **random access**        | Slower in random access           |
| Slower insertion/deletion (middle) | Faster insertion/deletion         |
| Uses less memory                   | Uses more memory                  |
| Better for search operations       | Better for frequent insert/delete |

ArrayList is better for searching, while LinkedList is better for frequent insertion and deletion.
----------------------------------------------------------------------------------------

Difference between List, Set, and Map
--l
list vs set vs map
| List                            | Set                            | Map                                |
| ------------------------------- | ------------------------------ | ---------------------------------- |
| Allows **duplicate values**     | Does **not allow duplicates**  | Stores data in **key–value pairs** |
| Maintains insertion order       | No insertion order (generally) | No duplicate keys                  |
| Accessed by index               | No index                       | Accessed by key                    |
| Examples: ArrayList, LinkedList | Examples: HashSet, TreeSet     | Examples: HashMap, TreeMap         |

List allows duplicates, Set stores unique values, and Map stores data as key–value pairs.
--------------------------------------------------------------------------------------------------------------

Difference between HashMap and Hashtable
-
hashmap vs hashtable
| HashMap                                          | Hashtable                            |
| ------------------------------------------------ | ------------------------------------ |
| Not synchronized                                 | Synchronized                         |
| Not thread-safe                                  | Thread-safe                          |
| Allows **one null key and multiple null values** | Does **not allow null key or value** |
| Faster                                           | Slower                               |
| Introduced in Java 1.2                           | Legacy class (Java 1.0)              |

HashMap is non-synchronized and faster, while Hashtable is synchronized and slower.
-----------------------------------------------------------------------------------------------------

Difference between HashMap and TreeMap
=
| HashMap                         | TreeMap                            |
| ------------------------------- | ---------------------------------- |
| Does **not maintain order**     | Maintains **sorted order of keys** |
| Faster                          | Slower                             |
| Allows **one null key**         | Does **not allow null key**        |
| Based on **hash table**         | Based on **Red-Black Tree**        |
| Used when order is not required | Used when sorted data is required  |

HashMap stores data without order, while TreeMap stores data in sorted order of keys.
---------------------------------------------------------------

Difference between HashSet and TreeSet
-
| HashSet                     | TreeSet                           |
| --------------------------- | --------------------------------- |
| Does **not maintain order** | Maintains **sorted order**        |
| Faster                      | Slower                            |
| Allows **one null value**   | Does **not allow null value**     |
| Based on **hash table**     | Based on **Red-Black Tree**       |
| Best for fast searching     | Best when sorted data is required |

HashSet stores elements without order, while TreeSet stores elements in sorted order.
---------------------------------------------------------------------------------------

Why HashMap allows one null key?
--
HashMap allows one null key because it stores keys using hash values, and null is treated as a special case with hash value 0.

🔹 Explanation

HashMap internally calls hashCode() on keys
For null, no hashCode() exists
So HashMap assigns hash = 0 for null key
Only one null key is allowed to avoid ambiguity

HashMap allows one null key because it treats null as a special case with hash value zero.
------------------------------------------------------------------------------------------------
What is Iterator?
-
An Iterator is an interface used to traverse (iterate) elements of a collection one by one.

Key points

Works with Collection object
Supports forward direction only

Provides methods:
hasNext()
next()
remove()

Iterator is used to traverse collection elements safely one by one.
--------------------------------------------------------------------------------------------------

Difference between Iterator and ListIterator
-
iterator vs listIterator
| Iterator                             | ListIterator                          |
| ------------------------------------ | ------------------------------------- |
| Used with all Collections            | Used only with List                   |
| Moves in **one direction (forward)** | Moves in **both directions**          |
| Can remove elements                  | Can add, remove, and update           |
| Methods: `hasNext()`, `next()`       | Methods: `hasNext()`, `hasPrevious()` |
| No index access                      | Supports index-based traversal        |

Iterator supports one-way traversal, while ListIterator supports both forward and backward
traversal with more operations.
---------------------------------------------------------------------------------------------------

What is fail-fast and fail-safe iterator?
-
Fail-Fast Iterator
Throws ConcurrentModificationException
When collection is modified during iteration
Works on original collection

Examples:
ArrayList, HashMap, HashSet

🔹 Fail-Safe Iterator
Does not throw exception
Works on copy of collection
Modifications do not affect iteration

Examples:
ConcurrentHashMap, CopyOnWriteArrayList

mmi==Fail-fast iterator throws exception on modification, 
while fail-safe iterator works on a copy and does not throw exception.
-----------------------------------------------------------------------------------------------------------

How HashMap works internally?
-

✅ Interview Answer

HashMap works using hashing technique.

🔹 Internal Working

1️⃣ When we put a key–value pair:

map.put(key, value);


2️⃣ HashMap calls:

hashCode() → key


3️⃣ Hash value is converted into index (bucket)

4️⃣ Data is stored as Node (Entry) in bucket:

(key, value, hash, next)


5️⃣ If two keys generate same index → collision occurs

🔹 Collision Handling

HashMap uses LinkedList

From Java 8 onwards → converts to Balanced Tree (Red-Black Tree) when threshold exceeds

🔹 Retrieval (get(key))

HashMap again calculates hash

Goes to same bucket

Uses equals() to find exact key

mmi==HashMap stores data using hashCode and equals; in case of collision, it uses LinkedList or Red-Black Tree (Java 8+).
----------------------------------------------------------------------------------------------------------------

What is load factor?
--
Load factor in HashMap defines when the HashMap should increase its capacity (resize).

🔹 Explanation

Default load factor = 0.75

It means:

When 75% of buckets are filled

HashMap performs rehashing

🔹 Formula
Threshold = Capacity × Load Factor

⭐ One-line interview punch

Load factor decides when HashMap should resize to maintain performance.
-----------------------------------------------------------------------------------------------------------------

🔹 Multithreading (Important)
=======================================================================================================

What is thread?
-
A thread is a lightweight unit of execution that runs inside a process.

🔹 Explanation

A program can have multiple threads

Threads execute tasks simultaneously

Improves performance and responsiveness

⭐ One-line interview punch

A thread is a lightweight process that executes a part of a program independently.
-------------------------------------------------------------------------
Difference between process and thread
| Process                          | Thread                     |
| -------------------------------- | -------------------------- |
| Independent program in execution | Sub-part of a process      |
| Has separate memory              | Shares memory with process |
| Heavyweight                      | Lightweight                |
| Slower context switching         | Faster context switching   |
| More resource usage              | Less resource usage        |

A process is an independent program, while a thread is a lightweight unit within a process.
---------------------------------------------------------------------------------

How to create thread in Java?
-
There are two ways to create a thread in Java:

 1 by extending thread class
class MyThread extends Thread {
public void run() {
System.out.println("Thread running");
}
}

2 the implement runnable interface
class MyThread implements Runnable {
public void run() {
System.out.println("Thread running");
}
}

Threads in Java can be created by extending Thread class or implementing Runnable interface.
-------------------------------------------------------------------------------------------------

Difference between Thread class and Runnable interface 
-
Answer: Difference between Thread class and Runnable interface
| Thread Class                | Runnable Interface         |
| --------------------------- | -------------------------- |
| Extends `Thread`            | Implements `Runnable`      |
| Cannot extend another class | Can extend another class   |
| Less flexible               | More flexible              |
| Object itself is a thread   | Object is task, not thread |
| Uses more memory            | Uses less memory           |

⭐ One-line interview punch

Runnable is preferred over Thread because it supports multiple inheritance and better design.
------------------------------------------------------------------------------------------------------------

What is synchronization?
-
Synchronization is a mechanism used to control access of multiple threads to shared resources.

🔹 Purpose

Prevents data inconsistency

Allows only one thread at a time to access critical section

⭐ One-line interview punch

Synchronization ensures that only one thread accesses shared data at a time.
----------------------------------------------------------------------------------------------

What is deadlock?
-
Deadlock is a situation where two or more threads are permanently blocked, because each thread is waiting for a resource held by another thread.

🔹 Purpose / Problem

Occurs due to improper synchronization

Threads keep waiting forever

Program hangs (no execution further)

🧠 Simple Example

Thread A → holds Resource 1 → waiting for Resource 2
Thread B → holds Resource 2 → waiting for Resource 1

➡️ No thread can proceed → DEADLOCK

⭐ One-line interview punch

Deadlock occurs when two or more threads wait indefinitely for resources held by each other.

💡 Real-life example

Two people:

Person A has key of Room 1, wants Room 2

Person B has key of Room 2, wants Room 1

👉 Both wait forever 😵‍💫

If you want, next we can do 🔥

Deadlock conditions (very important)

How to prevent deadlock

Deadlock vs Starvation

Java deadlock code example
------------------------------------------------------------------------------------------------


What is race condition?
-
Race condition is a situation where multiple threads access and modify shared data at the same time, and the final result depends on the order of execution of threads.

🔹 Problem

Multiple threads run concurrently

Shared variable gets inconsistent value

Output becomes unpredictable

🧠 Simple Example

Two threads updating same variable:

count = count + 1;


Thread A reads → 5
Thread B reads → 5

Both update → 6

❌ Expected: 7
✅ Actual: 6

➡️ This is race condition

⭐ One-line interview punch

Race condition occurs when multiple threads access shared data simultaneously and the result depends on execution timing.

🔥 Key point

Race condition happens due to:

Lack of synchronization

Shared mutable data
---------------------------------------------------------------------------------------------
Difference between sleep() and wait()
| Point           | sleep()                                | wait()                                   |
| --------------- | -------------------------------------- | ---------------------------------------- |
| Package         | Thread class                           | Object class                             |
| Lock            | ❌ Does **not release** lock            | ✅ **Releases** lock                      |
| Usage           | Pause thread for fixed time            | Used for inter-thread communication      |
| Synchronization | Can be used without synchronized block | Must be called inside synchronized block |
| Wake up         | Automatically after time               | By `notify()` / `notifyAll()`            |
| Purpose         | Delay execution                        | Thread coordination                      |

sleep()

Pauses current thread for given time

Thread keeps the lock

Used for timing

Thread.sleep(1000);

🔹 wait()

Makes thread go to waiting state

Releases lock

Waits until notify is called

synchronized(obj){
obj.wait();
}

⭐ One-line interview punch

sleep() pauses execution without releasing lock, whereas wait() releases lock and waits for notification.
----------------------------------------------------------------------------------------------------------------

Difference between start() and run()
-| Point          | start()                    | run()                        |
| -------------- | -------------------------- | ---------------------------- |
| Thread         | Creates **new thread**     | No new thread created        |
| Execution      | Runs concurrently          | Runs like normal method      |
| JVM role       | JVM calls run() internally | JVM not involved             |
| Multithreading | ✅ Yes                      | ❌ No                         |
| Call           | Called once per thread     | Can be called multiple times |

🔹 start()

Creates a separate thread

JVM allocates new stack

Internally calls run()

Thread t = new Thread();
t.start();


➡️ True multithreading

🔹 run()

Normal method call

Executes in main thread

t.run();


➡️ No multithreading

⭐ One-line interview punch

start() creates a new thread and executes run() concurrently, whereas run() executes like a normal method in the same thread.

🔥 Interview trap question

Can we call run() directly?
✅ Yes, but it will not create a new thread.
-----------------------------------------------------------------------------------------------------------------------

🔹 Java 8 Features (HIGH DEMAND 🔥)
=======================================================================================================

What are Java 8 features?
-
Java 8 introduced functional programming concepts to make code more readable, concise, and powerful.

🔹 Main Java 8 Features

Lambda Expression

Functional Interface

Stream API

Method Reference

Default & Static methods in interface

Optional class

Date & Time API

forEach() method

🧠 1️⃣ Lambda Expression

Used to write shorter code for functional interfaces.

(a, b) -> a + b


➡️ Removes boilerplate code.

🧠 2️⃣ Functional Interface

Interface with only one abstract method.

Example:

Runnable
Callable
Comparator


Custom:

@FunctionalInterface
interface Test {
void show();
}

🧠 3️⃣ Stream API

Used to process collections.

list.stream()
.filter(x -> x > 10)
.map(x -> x * 2)
.collect(Collectors.toList());


Used for:

filtering

mapping

sorting

aggregation

🧠 4️⃣ Method Reference

Shortcut of lambda.

System.out::println

🧠 5️⃣ Default Method

Interface can have method body.

default void show() {
System.out.println("Hello");
}

🧠 6️⃣ Optional Class

Avoids NullPointerException.

Optional<String> name = Optional.ofNullable(str);

🧠 7️⃣ Date and Time API

Thread-safe replacement of old Date class.

LocalDate.now();
LocalTime.now();
LocalDateTime.now();

⭐ One-line interview punch

Java 8 introduced functional programming with lambda expressions, streams, and new date-time API to write clean and efficient code.
-----------------------------------------------------------------------------------------

What is lambda expression?
-
Lambda expression is a short way to write implementation of a functional interface without creating a separate class.

🔹 Purpose

Reduces boilerplate code

Improves readability

Supports functional programming

🧠 Syntax
(parameters) -> expression


Example:

(a, b) -> a + b

🧠 Without Lambda
Runnable r = new Runnable() {
public void run() {
System.out.println("Thread running");
}
};

🧠 With Lambda
Runnable r = () -> {
System.out.println("Thread running");
};


✅ Clean
✅ Short
✅ Easy

⚠️ Important Point

Lambda works only with Functional Interface
(Interface having exactly one abstract method)

⭐ One-line interview punch

Lambda expression provides a concise way to implement functional interfaces using expression-based syntax.

🔥 Interview traps:

Lambda cannot be used with normal interface

Lambda does not create a new method

Lambda supports only one abstract method
-------------------------------------------------------------------------------------------
What is functional interface?
A functional interface is an interface that contains only one abstract method.

🔹 Purpose

Used to support lambda expressions

Enables functional programming in Java

Makes code short and readable

🧠 Rule

✅ Only one abstract method
✅ Can have multiple default methods
✅ Can have static methods

🧠 Example
@FunctionalInterface
interface Test {
void show();
}


✔ Valid functional interface

❌ Invalid
interface Test {
void show();
void display(); // ❌ two abstract methods
}

🧠 Built-in Functional Interfaces

Runnable → run()

Callable → call()

Comparator → compare()

Predicate → test()

Function → apply()

Consumer → accept()

Supplier → get()

⭐ One-line interview punch

A functional interface is an interface with exactly one abstract method, used mainly with lambda expressions.

🔥 Interview trap:

@FunctionalInterface is optional

But it helps compiler catch errors
---------------------------------------------------------------------------------------


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