public class LinkList {

    Node head;
    Node tail;

    public static class Node {
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
