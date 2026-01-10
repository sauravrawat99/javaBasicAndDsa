1. Constructor kya hota hai?
   Constructor ek special method hota hai
   Jo object bante hi automatically call hota hai

Yaad rakhne wali baatein:

Class ke naam jaisa hota hai

Return type nahi hota (void bhi nahi)

new keyword ke sath call hota hai

Object initialize karta hai

🔹 2. Constructor ki zarurat kyu hoti hai?
Object ko initial value dene ke liye


Example:

Student ka name, age set karna

🔹 3. Types of Constructor

Java me mainly ye hote hain:

1️⃣ Default Constructor
2️⃣ Parameterized Constructor
3️⃣ Copy Constructor (Java style / manual)

🔹 4. Default Constructor
Jisme koi parameter nahi hota


Agar hum khud nahi banate:

Java compiler automatic bana deta hai

🔹 5. Parameterized Constructor
Jisme parameters hote hain
Object banate time value pass karte hain

🔹 6. Copy Constructor (Java me concept)
Ek object ke data ko dusre object me copy karna


⚠️ Important:

Java me built-in copy constructor nahi hota
Hum manually banate hain

🔹 7. Shallow Copy (Constructor ke through)
Reference same rehta hai
Memory share hoti hai


Object ke andar object ho

Reference copy hota hai

Change ek me → dono me

🔹 8. Deep Copy (Constructor ke through)
Naya object create hota hai
Memory alag hoti hai


Reference ka bhi new object

Change independent hota hai

🔹 9. this keyword (Constructor me)
this current object ko refer karta hai


Use:

Variable name same ho

Constructor chaining

🔹 10. Constructor Overloading
Ek hi class me multiple constructors
But parameter different

🔹 11. Destructor (Java Reality)
Java me destructor nahi hota


Kyu?

Java me Garbage Collector hota hai
Jo unused objects ko delete karta hai

🔹 12. finalize() method
Destructor jaisa lagta hai
But reliable nahi
Java 9+ me deprecated


Interview answer:

Java does not support destructor

🔥 Important Interview Lines
Constructor is used to initialize objects.

Java does not have copy constructor by default.

Java does not support destructor.

Garbage Collector handles memory in Java.

🔚 One Line Summary
Constructor → object initialize
Copy constructor → object copy
Shallow → same reference
Deep → new reference
Destructor → not in Java
