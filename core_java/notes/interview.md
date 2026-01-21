** What is java
* === java is object-oriented,platform-independent programming language,
* java code compile in bytecode and this bytecode run of jvm(java virtual machine).
* that's why java follow run once run anywhere

** why java is independent
* java don't run directly on os
* first in convert bytecode and jvm run that bytecode
* since jvm available every os

**JDK vs JRE vs JVM
*jvm 
- execute bytecode
- and jvm manage memory and garbage collections

*jre
-jvm require library
-use to java program

*jdk
- jre+compiler+developmentTools
- Used to develop java program

**Why Java is not 100% object-oriented?
Because Java supports primitive data types like int, char, boolean.
These are not objects, so Java is not fully object-oriented.

what is class and object
class == the class is  A blueprint of object  -- and do not occupy memory
object== the object is a instance of class --occuoy memory it runtime


-------------------------------------------------------------------------------------------------------------
What is object oriented programming
===object oriented programming is a programming approach where program are build using object

--each object contain
-data(variable)
-behavier(methods)

oops help to write code reusable,secure and easy maintain
----------------------------------------------------------------------------------------------------
what is four pillar of oops
1 Encapsulation – data security
2 Inheritance – code reusability
3 Polymorphism – flexibility
4 Abstraction – hide complexity

interview == these for concept use to create software secure and maintainable
------------------------------------------------------------------------------------------------------
What is class
The class is a blueprint or template of object
define -variable and methods

and its doesn't occupy memory

ex class classname{variable,methods}
---------------------------------------------------------------------------------------------------
what is object 
the object is the real instance of class
object represent real world entity and occupy memory in the run time 

Student s = new Student();
--------------------------------------------------------------------------------------
difference between class and object
| Class                  | Object              |
| ---------------------- | ------------------- |
| Blueprint              | Instance            |
| Logical entity         | Real entity         |
| No memory              | Uses memory         |
| Used to create objects | Used to access data |

class is definition  object implementations
-----------------------------------------------------------------------------------------------

why oop is used 
use to oop
-reusable codes
-easy maintain
-manage large programs
-improve security

oops help scalable and structured application
-------------------------------------------------------------------------------------------
Advantages of OOP

Main advantages:
Code reusability (inheritance)
Security (encapsulation)
Flexibility (polymorphism)
Better design (abstraction)
Easy maintenance

OOP reduces duplication and improves code quality.
-------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------
Q: What is Encapsulation?
---
➡ Encapsulation means wrapping data (variables) and methods (functions) into a single
unit (class) and controlling access to that data.

"Encapsulation protects the data from outside access and misuse."

How is Encapsulation achieved in Java?
----------
➡ Encapsulation is achieved using:
✔ private variables (data hiding)
✔ public getter & setter methods (controlled access)

Example thought:
Private variable = locked
Getter/Setter = key

Q: Why variables are declared private?
--

➡ To protect data from direct modification.

Example:
You shouldn't be able to set age = -10 directly.
With setter, we can validate:

if(age > 0) then set
else reject

Hence: data safety + validation



Q: Difference between Encapsulation and Data Hiding?
---
Very important interview question 👇
| Feature     | Encapsulation           | Data Hiding             |
| ----------- | ----------------------- | ----------------------- |
| Meaning     | Wrapping data + methods | Restricting data access |
| Achieved by | Class + getter/setter   | `private` keyword       |
| Purpose     | Organized structure     | Security/Protection     |
Simple line:
Data hiding is part of encapsulation.


Q: Can Encapsulation be achieved without Getter and Setter?
-

➡ YES, technically encapsulation = wrapping
Getter/Setter is only for controlled access.

But in Java interview answer:

"Fully encapsulation is normally achieved with private variables and public getters/setters."


Q: Benefits of Encapsulation?
-

Very important — interview likes this 👇

✔ Data Protection
✔ Validation Possible
✔ Better Code Maintenance
✔ Modularity & Clean Structure
✔ Loose Coupling
✔ Reusability

Short line:

Encapsulation protects data and makes code more maintainable.

Encapsulation One Line Answer
--------
Encapsulation is binding data and methods together and restricting direct access for safety.

--------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------

Q: What is inheritance?
-

➡ Inheritance means one class acquiring properties and behaviors of another class.

Simple line:
Child class reuses the code of Parent class.

Java words:
Parent → Super Class
Child → Sub Class


Q: Why inheritance is used?
--
➡ Inheritance is used for:

✔ Code Reuse
✔ Reduced redundancy
✔ Better structure
✔ Method overriding support
✔ Polymorphism

Interview line:

It helps avoid duplicate code and supports runtime polymorphism.


Q: Types of inheritance in Java?
--
Java supports:
Single Inheritance

A → B


Multilevel Inheritance

A → B → C

Hierarchical Inheritance

      A
     / \
    B   C

Java does NOT support Multiple inheritance with classes.

Q: Why multiple inheritance is not supported in Java?
-

Simple interview answer:

➡ To avoid diamond problem and ambiguity.

Example thought:
If two parents have the same method name → child confused → ambiguity


Q: How Java supports multiple inheritance?
-
➡ Java supports multiple inheritance through Interfaces (not classes)
Example:
class A implements Interface1, Interface2



Q: What is IS-A relationship?
-

➡ IS-A means Inheritance relationship

Examples:
Dog is-a Animal
Car is-a Vehicle
Student is-a Person

So when: class B extends A → B is-a A


Q: What is HAS-A relationship?
-
➡ HAS-A means Composition / Aggregation

Examples:
Car has-a Engine
House has-a Room
Student has-a Address


Difference between IS-A and HAS-A
-
| Basis   | IS-A                 | HAS-A                  |
| ------- | -------------------- | ---------------------- |
| Meaning | Inheritance          | Composition            |
| Keyword | extends / implements | reference inside class |
| Example | Dog is-a Animal      | Car has-a Engine       |
| Usage   | Code reuse           | Object relationship    |


Inheritance promotes code reuse

✔ Supports runtime polymorphism (via overriding)

✔ Used for method overriding

✔ But blind inheritance can cause tight coupling


Inheritance allows a class to use features of another class to reduce code duplication.
---------------------------

---------------------------------------------------------------------
-------------------------------------------------------------------------------

Q: What is Polymorphism?
--

➡ Polymorphism means one thing, many forms.

In OOP: same method name, different behavior

Interview line:

Polymorphism allows methods to behave differently based on object or context.

Types of Polymorphism in Java

Compile-time polymorphism (Method Overloading)

Runtime polymorphism (Method Overriding)


1️⃣ Compile-time Polymorphism
Q: What is compile-time polymorphism?

➡ When method call is resolved at compile time.

This is achieved by: Method Overloading



Q: What is Method Overloading?

➡ Overloading means same method name, different parameters.

Different parameters can be by:

✔ number of parameters
✔ type of parameters
✔ order of parameters

Example:

void add(int a, int b)
void add(double a, double b)
void add(int a, int b, int c)


Q: Rules of Method Overloading

✔ Same method name
✔ Different parameter list
✔ Return type can be same or different
✔ Cannot overload only by return type
✔ Happens in same class



2️⃣ Runtime Polymorphism
Q: What is runtime polymorphism?

➡ When method call is resolved at runtime based on object type.

This is achieved by: Method Overriding

Q: What is Method Overriding?
➡ Overriding means same method name, same parameter, same return type but in child class.

Parent → Child redefine

Example:

class Animal {
void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
void sound() { System.out.println("Dog barks"); }
}

Q: Rules of Method Overriding
-
✔ Same method name
✔ Same parameters
✔ Same return type (or covariant)
✔ Must be in parent-child class
✔ Access modifier cannot be reduced (only same or more public)
✔ Only for non-final, non-static methods

⚠️ Tricky Interview Questions
Q: Can we override static methods?

➡ No, static methods belong to class, not object.

Changing static in child = method hiding, not overriding.

Q: Can we override final method?
-
➡ No, final method cannot be overridden.

Q: Can we override private method?
-
➡ No, private methods are not visible to child class.

If same name used → it's not overriding, it's new method.

Q: What is Method Hiding?
-
➡ When static method in child has same signature as parent, it becomes method hiding, not overriding.

Why runtime polymorphism is important?

➡ It enables dynamic binding and flexibility.

Example:

Animal a = new Dog();
a.sound(); // Dog sound


Here object type decides behavior → runtime decision

⭐ Interview One-Liners

✔ Overloading → Compile-time → Same name, diff parameters
✔ Overriding → Runtime → Same name, same parameters

✔ Overloading → Same class
✔ Overriding → Parent-child classes

✔ Static → no overriding
✔ Final → no overriding
✔ Private → no overriding

Polymorphism Real World Example

➡ Remote Control example

Same button → different behavior for different TVs
(LG, Sony, Samsung)

Short Summary for Interview

Polymorphism allows object to behave differently using the same method. In Java it is achieved
through method overloading (compile-time) and method overriding (runtime).

-------------------------------------------------------------------------------------------
-------------------------------------------------------------------

Q: What is Abstraction?
-
➡ Abstraction means showing only essential details and hiding internal implementation.

Simple line for interview:

Abstraction hides complexity from the user and shows only the required information.

Why abstraction is required?
-
✔ To reduce complexity
✔ To improve security
✔ To increase maintainability
✔ To make code flexible
✔ To avoid exposing implementation details

Example:
User uses ATM → withdraw money
But doesn't know:

connection to bank

validation

response handling

These are hidden → Abstraction

How Abstraction is achieved in Java?

Java uses two things:

Abstract class

Interface

🧩 ABSTRACT CLASS
Q: What is abstract class?
--
➡ A class declared with abstract keyword, and it can have:
✔ abstract methods (without body)
✔ non-abstract methods (with body)

Q: Can abstract class have constructor?
-
➡ YES
Constructor is used for initialization tasks, although we can't create object.

Q: Can abstract class have non-abstract methods?
-
➡ YES
This is why abstract class is partially abstract.

Q: Can we create object of abstract class?
-
➡ NO
Because abstract class is incomplete.

🔌 INTERFACE
Q: What is Interface?
---
➡ Interface is a contract that contains abstract methods (by default) which must 
be implemented by classes.

difference abstract vs interfaces
-
| Feature     | Abstract Class                 | Interface                                      |
| ----------- | ------------------------------ | ---------------------------------------------- |
| Methods     | Can be abstract & non-abstract | Mostly abstract, Java 8+ allows default/static |
| Variables   | Normal + final allowed         | Only **public static final**                   |
| Inheritance | Single                         | Multiple                                       |
| Constructor | Allowed                        | Not allowed                                    |
| Abstraction | Partial                        | 100% abstraction mainly                        |


What is 100% abstraction?
-
➡ When no implementation is provided, only method declaration.

Interface gives 100% abstraction (before Java 8).

Can interface have variables?

➡ YES, but are always:
✔ public
✔ static
✔ final

Can interface have constructors?
-
➡ NO, because you can't create object of interface.

What is default method in interface?

➡ Introduced in Java 8.
It allows method with body inside interface using default keyword.

Used for backward compatibility.

What is functional interface?
-
➡ An interface with only one abstract method

Example: Runnable, Callable, Comparator

Used in Lambda expressions.

⭐ Real World Example

➡ Car has accelerator → you press → car moves.
User doesn't know inner logic → Abstraction

Short One-Liner for Interview
Abstraction hides internal implementation and shows only essential functionality.

abstraction vs encapsulation
-
| Feature     | Abstraction                 | Encapsulation                    |
| ----------- | --------------------------- | -------------------------------- |
| Purpose     | hide implementation details | protect data                     |
| Hides       | internal complexity         | data access                      |
| Focus on    | what to do                  | how to do safely                 |
| Achieved by | abstract class, interface   | getter/setter + access modifiers |
