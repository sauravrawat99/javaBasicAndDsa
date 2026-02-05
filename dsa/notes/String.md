What is String?
-
the String  is collection of sequence character enclosed with "";

string is immutable
-
Once a String object is created, its value cannot be changed.

commonn method
-
| Method        | Work               |
| ------------- | ------------------ |
| length()      | find length        |
| charAt()      | character at index |
| toUpperCase() | convert to upper   |
| toLowerCase() | convert to lower   |
| equals()      | compare strings    |
| substring()   | part of string     |
| trim()        | remove spaces      |

What is String Pool?
-
String Pool is a memory area where Java stores unique string objects to avoid duplicate strings.

Why String Pool is Used?

Memory optimization
Avoid duplicate objects
Faster performance

| Way            | Stored In   |
| -------------- | ----------- |
| String literal | String Pool |
| new String()   | Heap Memory |


| String Pool      | Heap                    |
| ---------------- | ----------------------- |
| Stores literals  | Stores objects from new |
| Reuses objects   | Always new object       |
| Memory efficient | More memory usage       |


| Method      | Purpose        |
| ----------- | -------------- |
| length()    | find size      |
| equals()    | compare values |
| charAt()    | get character  |
| substring() | part of string |
| contains()  | search text    |
| split()     | break string   |
| replace()   | replace chars  |
| trim()      | remove spaces  |
