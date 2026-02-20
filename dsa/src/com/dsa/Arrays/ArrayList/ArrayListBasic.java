/*
ArrayList in Java
1️⃣ ArrayList kya hota hai?

ArrayList ek dynamic array hai.

👉 Normal array:

Size fixed hota hai

Example: int arr[5] → size 5 hi rahega

👉 ArrayList:

Size automatically grow/shrink hota hai

Memory internally manage karta hai

Ye kaha se aata hai?

ArrayList Java Collections Framework ka part hai.

Package:

import java.util.ArrayList;

Class:

ArrayList<Type> list = new ArrayList<>();

basics
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
    }
}

important method
| Method            | Kaam                                |
| ----------------- | ----------------------------------- |
| add()             | Element add karta hai               |
| get(index)        | Element fetch karta hai             |
| set(index, value) | Replace karta hai                   |
| remove(index)     | Remove karta hai                    |
| size()            | Size batata hai                     |
| contains()        | Check karta hai element hai ya nahi |


ArrayList<String> list = new ArrayList<>();

list.add("Saurav");
list.add("Rahul");
list.add("Aman");

System.out.println(list.get(1));  // Rahul

list.set(1, "Rohit");  // Replace

list.remove(0);  // Remove Saurav

System.out.println(list.size());  // 2


Internal Working (Very Important for Interview)

Default capacity = 10

Jab capacity full hoti hai

New array banata hai

Size increase karta hai (approx 1.5x)

Old data copy karta hai

👉 Isliye add operation average O(1) hota hai
👉 But resizing time me O(n) ho sakta hai


| Operation | Time     |
| --------- | -------- |
| add()     | O(1) avg |
| get()     | O(1)     |
| set()     | O(1)     |
| remove()  | O(n)     |
| search    | O(n)     |

| Array             | ArrayList       |
| ----------------- | --------------- |
| Fixed size        | Dynamic         |
| Fast              | Slightly slower |
| Primitive allowed | Only objects    |
Note:

ArrayList<int> ❌
ArrayList<Integer> ✅

Wrapper class use karte hain.

1️⃣ Normal Sorting (Ascending Order)

Java me easiest way:

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(50);
        list.add(10);
        list.add(40);
        list.add(20);

        Collections.sort(list);

        System.out.println(list);
    }
}

Output:

[10, 20, 40, 50]

👉 Collections.sort(list); automatically ascending order me sort karta hai.

📌 2️⃣ Descending Order Sorting
Collections.sort(list, Collections.reverseOrder());

Example:

Collections.sort(list, Collections.reverseOrder());
System.out.println(list);

Output:

[50, 40, 20, 10]
📌 3️⃣ Java 8 Way (Modern Way)
list.sort(null);   // ascending

Descending:

list.sort(Collections.reverseOrder());
📌 4️⃣ String ArrayList Sorting
ArrayList<String> names = new ArrayList<>();

names.add("Saurav");
names.add("Aman");
names.add("Rahul");

Collections.sort(names);

System.out.println(names);

Output:

[Aman, Rahul, Saurav]

👉 Alphabetical order me sort karega.

⚡ Important Interview Point

Sorting internally TimSort algorithm use karta hai

Time Complexity: O(n log n)

Difference Between Collection and Collections
1️⃣ 🧩 Collection (Interface)

👉 Collection ek interface hai.

Ye root interface hai

Iske andar basic methods defined hote hain

Isko implement karte hain:

ArrayList

LinkedList

HashSet

etc.

Example hierarchy:

Collection
   ↑
 List     Set
   ↑
ArrayList

Example:

import java.util.Collection;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Collection<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);

        System.out.println(list);
    }
}

👉 Yaha Collection reference hai
👉 ArrayList object hai

2️⃣ 🛠 Collections (Utility Class)

👉 Collections ek utility class hai.

Isme static methods hote hain

Sorting

Searching

Reverse

Shuffle

Max, Min

Example:

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(10);
        list.add(20);

        Collections.sort(list);

        System.out.println(list);
    }
}

👉 Yaha Collections.sort() use ho raha hai
👉 Ye class methods provide karti hai

| Collection           | Collections               |
| -------------------- | ------------------------- |
| Interface            | Utility Class             |
| Data store karta hai | Methods provide karta hai |
| add(), remove()      | sort(), reverse(), max()  |
| Part of framework    | Helper class              |

 */


package com.dsa.Arrays.ArrayList;

import java.util.ArrayList;

public class ArrayListBasic {
    static int minimum(ArrayList<Integer> arr){
        int minimum=Integer.MAX_VALUE;
        int n=arr.size();

        for (int i=0;i<n;i++){
            if(arr.get(i)<minimum)minimum=arr.get(i);
        }
        return minimum;
    }
    static void swapeTwoNumber(ArrayList<Integer> arr,int a , int b){

        int temp=arr.get(a);
        arr.set(a,arr.get(b));
        arr.set(b,temp);

        System.out.println(arr);
    }

    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        for ()
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.print(arr+", ");

        for (int i=arr.size()-1; i>=0;i--){
            System.out.print(arr.get(i)+", ");
        }

//        minimum arr
        System.out.println("minimun element of arraylist : "+minimum(arr));

        swapeTwoNumber(arr,1,2);

    }

}