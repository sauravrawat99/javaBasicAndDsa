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

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Insert at Position (1 based index)
    void addPosition(int index, int data) {

        Node newNode = new Node(data);

        // insert at start
        if (index == 1) {
            insertAtStart(data);
            return;
        }

        Node temp = head;
        int count = 1;

        // move to (index-1) node
        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        // invalid index
        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        // insert
        newNode.next = temp.next;
        temp.next = newNode;

        // if inserted at last update tail
        if (newNode.next == null) {
            tail = newNode;
        }
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

        list.addPosition(3, 99);

        list.printList();
    }
}
