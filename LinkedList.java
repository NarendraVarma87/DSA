public class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void addNode(int data) {
        Node nextNode = new Node(data);
        if (head == null) {
            head = nextNode;
            tail = nextNode;
        } else {
            tail.next = nextNode;
            tail = nextNode;
        }
    }

    public void print() {
        Node current = head;
        if (current == null) {
            System.out.println("Empty");
        }
        System.out.println("enter Nodes at");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.addNode(10);
        ls.addNode(20);
        ls.addNode(30);
        ls.addNode(40);
        ls.addNode(50);

        ls.print();
    }
}