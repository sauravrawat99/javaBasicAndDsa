What is linkList
-
the linklist linear data structure ware data element store form of nodes

each node contain 
1=data
2=next pointer (next node address)

structure of node
[data | next] → [data | next] → [data | next] → null

example 10 → 20 → 30 → 40 → null

why linklist
Problem
array=1fixed size 2insertion/delistion costly 3memory waste
linklist=Dynamic size 2Easy insertion/deletion 3No contiguous memory required


node structure
class Node {
int data;
Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

Basic Operations in Singly Linked List

Insert at Beginning
Insert at End
Insert at Position
Delete Node
Traverse (Print)
Search Element

insert in beginning
-
that tree step remember
1=New node banao
2=Uska next = current head
3=Head ko new node par shift karo