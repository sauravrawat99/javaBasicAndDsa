Array:
The array is linear data structure store 
- Data structure
- Stores multiple values of same type
- Uses continuous memory

Why Array?
- Fast access using index
- Easy to store large data

Index:
- Starts from 0
- Last index = length - 1

Declaration:
int[] arr = new int[5];

Initialization:
int[] arr = {1, 2, 3};

Access:
arr[0]  → first element

Traversal:
Use for loop or for-each loop

Update:
arr[index] = newValue;

Array Length:
arr.length

Time Complexity:
Access → O(1)
Traversal → O(n)
Search → O(n)

Important Points:
- Fixed size
- Same data type only

memory view
| Index | Value | Memory |
| ----- | ----- | ------ |
| 0     | 10    | 100    |
| 1     | 20    | 104    |
| 2     | 30    | 108    |
| 3     | 40    | 112    |

assuming int 4 byte

advantage 
faste access using index

disadvantage
fixed size
insertion delection costly(because insertion and deletion element swapping)

int vs integer

int[]
Primitive data type
Stores actual values
Faster
Less memory
Cannot store null

Used in DSA
✔ Used for performance

integer[]
Wrapper class
Stores object references
Slower
More memory
Can store null 

Collections (ArrayList<Integer>)
Frameworks (Spring, Hibernate)
Need null values