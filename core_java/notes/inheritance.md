what is inheritance 
inheritance is when properties and method of base class
passed on drive class

🔹 Inheritance – Java Core

Definition:
Inheritance ek OOP concept hai jisme child class, parent class ke variables aur methods ko acquire (use) karti hai.

Keyword:

extends

Why use inheritance?
Code reusability
Maintainability
Runtime polymorphism ka base

Rules:

Java me ek class sirf ek class ko extend kar sakti hai

private members inherit nahi hote
Constructor inherit nahi hota

Child class parent ke protected members use kar sakti hai

IS-A Relationship:
Inheritance hamesha IS-A relationship show karta hai

Dog IS-A Animal
===============================================
1️⃣ Single Inheritance

➡️ One Parent → One Child

A → B


Ek class dusri ek class ko inherit karti hai

2️⃣ Multilevel Inheritance

➡️ Grandparent → Parent → Child

A → B → C


Chain ban jati hai inheritance ki

3️⃣ Hierarchical Inheritance

➡️ One Parent → Multiple Children

A
/ \
B   C


Ek parent class se multiple child classes

4️⃣ Multiple Inheritance ❌ (Class se nahi hota)
A   B
\ /
C

Java me class ke through allowed nahi
Reason: Diamond Problem

✔️ Interface ke through possible hai
5️⃣ Hybrid Inheritance
➡️ Combination of more than one type

Class se ❌ allowed nahi
Interface se ✔️ allowed