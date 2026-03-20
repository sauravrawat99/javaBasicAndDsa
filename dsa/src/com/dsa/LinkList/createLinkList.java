public class createLinkList {

    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // always head and tail public note static remove static
    public node head;
    public node tail;

//    add first
    public void addfirst(int data) {
        node newnode = new node(data);
//step 1
        if (head == null) {
            head = tail = newnode;
            return;
        }

//        step 2
        newnode.next = head;
//        step 3
        head = newnode;
    }

    public void addLast(int data){
        node newnode = new node(data);
        if(head==null){
            head = tail = newnode;
            return;
        }

        tail.next=newnode;
        tail=newnode;
    }

    public void print() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        createLinkList ll = new createLinkList();

        ll.addfirst(30);
        ll.addfirst(20);
        ll.addfirst(10);
        ll.addfirst(5);

//        ll.print();


        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.addLast(70);

        ll.print();


    }
}