# Core Java – Basic to Deep (Interview-Oriented Notes)

> Ye notes un **basic Java topics** par focused hain jo aksar log skip kar dete hain,
> lekin **interview + strong foundation** ke liye bahut important hote hain.

---

## 1️⃣ Java Program Execution Flow

### Java code ka flow

```
.java  →  compiler (javac)  →  .class  →  JVM  →  Machine Code
```

* `.java` = human readable
* `.class` = bytecode (platform independent)
* JVM = platform dependent

### Why Java is Platform Independent?

* Bytecode same rehta hai
* JVM har OS ke liye alag hota hai

---

## 2️⃣ public static void main – Deep

* **public** → JVM ko accessible hona chahiye
* **static** → JVM object create nahi karta
* **void** → JVM ko return value nahi chahiye
* **main** → fixed entry point
* **String[] args** → command line input

JVM internally call karta hai:

```java
ClassName.main(new String[0]);
```

---

## 3️⃣ Variables in Java (Bahut Important)

### Types of Variables

| Type     | Location        | Default Value |
| -------- | --------------- | ------------- |
| Local    | Method ke andar | ❌ No default  |
| Instance | Object ke saath | ✔ Yes         |
| Static   | Class ke saath  | ✔ Yes         |

### Example

```java
class Test {
    int a;        // instance
    static int b; // static

    void show() {
        int c = 10; // local
    }
}
```

---

## 4️⃣ Memory Management (Heap & Stack)

### Stack Memory

* Method calls
* Local variables
* One stack per thread
* Fast access

### Heap Memory

* Objects
* Instance variables
* Shared across threads
* Garbage Collection hoti hai

```java
Test t = new Test();
```

* `t` → stack
* object → heap

---

## 5️⃣ Object Creation Process (Interview Favorite)

When you write:

```java
Student s = new Student();
```

Steps:

1. Class load hoti hai
2. Memory heap me allocate hoti hai
3. Instance variables initialize
4. Constructor call hota hai
5. Reference variable assign hota hai

---

## 6️⃣ Constructor – Deep Basics

### What is Constructor?

* Class ke naam jaisa
* Return type nahi hota
* Object initialization ke liye

### Types

1. Default Constructor
2. Parameterized Constructor

### Example

```java
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
```

### `this` keyword

* Current object ko refer karta hai

---

## 7️⃣ Methods – Important Points

* Code reusability
* Stack memory me execute hote hain

### Method Signature

```
returnType methodName(parameters)
```

### Method Overloading

* Same method name
* Different parameters

---

## 8️⃣ Access Modifiers

| Modifier  | Scope           |
| --------- | --------------- |
| private   | same class      |
| default   | same package    |
| protected | package + child |
| public    | everywhere      |

---

## 9️⃣ OOPS Pillars – Recap

1. Encapsulation → data hiding
2. Inheritance → code reuse
3. Polymorphism → many forms
4. Abstraction → hide implementation

---

## 🔟 `instanceof` Operator

```java
if (obj instanceof Student) {
}
```

* Runtime check
* Returns boolean

---

## 1️⃣1️⃣ Object Printing (`toString()`)

```java
@Override
public String toString() {
    return id + " " + name;
}
```

`System.out.println(obj)` → internally `toString()`

---

## 1️⃣2️⃣ Common Interview Traps

* Local variable default value nahi hota
* Constructor return type nahi hota
* `main()` overload ho sakta hai
* Static members class se belong karte hain

---

## 🎯 How to Study Further (Roadmap)

1. Class & Object ✔
2. Constructor & this ✔
3. Heap vs Stack ✔
4. Inheritance (deep) ✔
5. Polymorphism (runtime focus)
6. Abstraction (real-life mapping)
7. Interface vs Abstract class
8. Exception handling
9. Collections (ArrayList, HashMap)

---

> **Ye notes deliberately simple + deep rakhe gaye hain**, taki tum base strong karo.

Next step bolo bhai:
👉 Exception Handling (deep)
👉 Polymorphism runtime vs compile time
👉 Collections from zero
