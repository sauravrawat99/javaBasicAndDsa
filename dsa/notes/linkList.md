#What is LinkList 
-

The linkList is a data Structure whare store data form of node 
every element contain 1:data 2:next(reference of next node) 

node are not store continuously in memory

class node{
constructor(data){
   this.data,
   this.null,
  }
}

class LinkedList {
constructor() {
this.head = null;
}
}

insertAtHead(data) {
const newNode = new Node(data);
newNode.next = this.head;
this.head = newNode;
}

Linked List Notes (Static vs Non-Static)
🔹 1. head kya hota hai?

👉 Definition:

head Linked List ka starting node hota hai

👉 Simple:

head → first element of list

👉 Example:

10 → 20 → 30
↑
head
🔹 2. tail kya hota hai?

👉 Definition:

tail Linked List ka last node hota hai

👉 Simple:

tail → last element (jiska next = null hota hai)

👉 Example:

10 → 20 → 30
↑
tail
🔥 3. Static vs Non-Static (Most Important)
❌ Case 1: static head
public static node head;

👉 Meaning:

Ye class variable hai

Sab objects same head share karenge

🧠 Example:
createLinkList ll1 = new createLinkList();
createLinkList ll2 = new createLinkList();

👉 Result:

ll1.head === ll2.head ❌

👉 Problem:

Data mix ho jayega

Multiple linked list nahi bana sakte

✅ Case 2: Non-Static head (Correct)
public node head;

👉 Meaning:

Har object ka apna head hoga

🧠 Example:
createLinkList ll1 = new createLinkList();
createLinkList ll2 = new createLinkList();

👉 Result:

ll1.head ≠ ll2.head ✅

👉 Benefit:

Har object → apni alag linked list

Clean design (OOP)

🔥 Final Conclusion (Exam + Interview)

👉 ❌ Never use static for:

head

tail

👉 ✅ Always use:

node head;
node tail;
💡 Golden Line (Yaad rakhna)

👉
"Linked List ek object ki property hai, class ki nahi"

🧠 addFirst Logic Revision
Step 1: new node banao  
Step 2: newNode.next = head  
Step 3: head = newNode  
🚀 Short Summary

head → first node

tail → last node

static → shared (wrong here)

non-static → separate (correct)


addLast() kya hota hai?

👉 Definition:

New node ko Linked List ke end (tail) me add karna

🧠 Example
Before:
10 → 20 → 30

addLast(40)

After:
10 → 20 → 30 → 40
🔥 Logic (Step by Step)
Step 1: new node banao  
Step 2: agar list empty hai → head = tail = newNode  
Step 3: tail.next = newNode  
Step 4: tail = newNode  
✅ Code (Best Version)
public void addLast(int data) {
node newnode = new node(data);

    // empty list
    if (head == null) {
        head = tail = newnode;
        return;
    }

    tail.next = newnode; // link
    tail = newnode;      // update tail
}
🧠 Visualization
Before:
head → 10 → 20 → 30 → null
↑
tail

After addLast(40):

head → 10 → 20 → 30 → 40 → null
↑
tail
⚠️ Important Points (Interview)
🔸 1. Tail ka use kyu karte hain?

👉 Without tail:

Har baar end tak traverse karna padega → O(n)

👉 With tail:

Direct add → O(1) ⚡

🔸 2. Empty list case must handle
if (head == null)

👉 Ye bhool gaya → bug 💀

❌ Common Mistake
tail.next = newnode;

👉 Agar tail null hai (empty list) → NullPointerException

✅ Full Example (Run Code)
public static void main(String[] args) {
createLinkList ll = new createLinkList();

    ll.addLast(10);
    ll.addLast(20);
    ll.addLast(30);
    ll.addLast(40);

    ll.print();
}
🧠 Output
10 → 20 → 30 → 40 →
💡 addFirst vs addLast
Method	Add kahan hota hai
addFirst	Starting me
addLast	End me
🚀 Pro Tip

👉 Real-world apps me:

Queue → addLast use hota hai

Stack → addFirst use hota hai