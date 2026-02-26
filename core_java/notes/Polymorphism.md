 interview line
Polymorphism allows same method name to show different behavior,
achieved using method overloading (compile time) and method 
overriding (runtime).

method overLoading
Multiple functions with sane name but difference parameter
(compile time)

method override
Parent snd child class contain sane method with difference definition
(runtime)

ad
🔹 Types (Quick Recall)
Compile Time Polymorphism → Method Overloading
Run Time Polymorphism → Method Overriding

🔹 Compile Time Polymorphism (Overloading)
Kab hota hai?
Compile time pe decide hota hai
Same class me

Method name same, parameters different

Change kya ho sakta hai?

Number of parameters

Type of parameters

Order of parameters

⚠️ Sirf return type change karke overloading nahi hoti

🔹 Run Time Polymorphism (Overriding)

Kab hota hai?

Runtime pe decide hota hai

Parent–Child relation

Same method signature

Rules (Very Important 🔥)

Method name + parameters same

Access modifier restrict nahi ho sakta

static method override ❌

final method override ❌

Object decide karta hai kaunsa method chalega

🔹 Dynamic Method Dispatch

Parent reference → Child object
Runtime pe child ka method call hota hai

Example:

Animal a = new Dog();
a.sound();   // Dog ka sound

🔹 Overloading vs Overriding (Interview Table)
| Point       | Overloading  | Overriding   |
| ----------- | ------------ | ------------ |
| Time        | Compile Time | Run Time     |
| Class       | Same class   | Parent–Child |
| Params      | Different    | Same         |
| Inheritance | Not required | Required     |
