/*
🔥 insertAtStart – Notes

Adds node at beginning

No traversal needed

Time Complexity → O(1)

Logic
newNode.next = head
head = newNode

🔥 insertAtEnd – Notes

Adds node at last

With tail pointer → O(1)

Without tail → O(n)

Logic
tail.next = newNode
tail = newNode

Important Rules

If list empty →

head = tail = newNode


Always update tail when inserting at end

| Operation                 | Complexity |
| ------------------------- | ---------- |
| Insert at Start           | O(1)       |
| Insert at End (with tail) | O(1)       |
| Traverse                  | O(n)       |

 */
public class LinkList {

    Node head;
    Node tail;

     static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at Start
    void insertAtStart(int data) {

        Node newNode = new Node(data);

        // if list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Insert at End
    void insertAtEnd(int data) {

        Node newNode = new Node(data);

        // if list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }
//    insert at position
    void AddPosition(int index,int data){
         Node newNode = new Node(data);
         if(index==1){
             insertAtStart(data);
             return;
         }
         Node temp=
    }

    // Print List
    void printList() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        LinkList list = new LinkList();

        list.insertAtStart(2);
        list.insertAtStart(1);

        list.insertAtEnd(3);
        list.insertAtEnd(4);

        list.printList();
    }
}
