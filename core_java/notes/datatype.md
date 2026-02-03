✅ What is Data Type?

A data type defines:

Type of data a variable can store

Memory size

Range of values

int age = 20;


int → data type

✅ Types of Data Types in Java

Java me 2 main types hote hain 👇

1️⃣ Primitive Data Types

Primitive data types store simple values directly.

🔹 List of Primitive Data Types
| Data Type | Size   | Range               | Default Value |
| --------- | ------ | ------------------- | ------------- |
| byte      | 1 byte | -128 to 127         | 0             |
| short     | 2 byte | -32,768 to 32,767   | 0             |
| int       | 4 byte | -2³¹ to 2³¹-1       | 0             |
| long      | 8 byte | -2⁶³ to 2⁶³-1       | 0L            |
| float     | 4 byte | Decimal (7 digits)  | 0.0f          |
| double    | 8 byte | Decimal (15 digits) | 0.0           |
| char      | 2 byte | Unicode character   | '\u0000'      |
| boolean   | 1 bit* | true / false        | false         |


*boolean size JVM dependent hota hai (interview point)

🔹 Example
int marks = 85;
float price = 99.5f;
char grade = 'A';
boolean pass = true;

2️⃣ Non-Primitive Data Types (Reference Types)

Non-primitive data types store reference (address) of object.

🔹 Examples

String

Array

Class

Object

Interface

String name = "Saurav";
int[] arr = {1, 2, 3};


📌 Default value: null

✅ Primitive vs Non-Primitive (Important Table)
| Primitive            | Non-Primitive          |
| -------------------- | ---------------------- |
| Store value directly | Store reference        |
| Fixed size           | Dynamic size           |
| Faster               | Slower                 |
| Cannot be null       | Can be null            |
| Example: int, char   | Example: String, Array |


🎯 One-Line Interview Answer

Data type in Java specifies the type of data a variable can hold and the amount of memory required.