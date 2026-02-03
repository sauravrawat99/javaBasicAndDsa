✅ What is Variable?

A variable is a container used to store data/value during program run time.

✅ Every variable has 3 parts

Data type → type of data

Variable name → used for identification

Value → actual data

int age = 20;

✅ Types of Variables in Java
1️⃣ Local Variable

Declared inside a method or block

Can be used only inside that method/block

No default value

Must be initialized before use

void show() {
int x = 10;   // local variable
System.out.println(x);
}


📌 Important correction:
❌ cannot have null value
✅ Local variable has NO default value

2️⃣ Instance Variable

Declared inside the class but outside the method

Belongs to object

Gets default value

class Student {
int marks;   // instance variable
}

Student s = new Student();
System.out.println(s.marks); // 0

Default values

int → 0

float → 0.0

boolean → false

String / Object → null

3️⃣ Static Variable (Class Variable)

Declared using static keyword

Belongs to class level

Only one copy, shared by all objects

class College {
static String collegeName = "Girl College of Gwalior";
}

System.out.println(College.collegeName);


📌 Interview line:
Static variable is loaded only once in memory at class loading time.

✅ Variable Scope
| Variable Type | Scope          |
| ------------- | -------------- |
| Local         | Block / Method |
| Instance      | Object level   |
| Static        | Class level    |

🎯 One-line Interview Definition

A variable in Java is a named memory location used to store data whose value can change during program execution.
