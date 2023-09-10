public class Linked {

    // Node of the singly linked list
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // head and tail of the singly linked list
    Node head = null;
    Node tail = null;

    // addNode() will add a new node to the list
    public void addNode(int data) {
        // Create a node
        Node newNode = new Node(data);

        // if the list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // print() will the all the nodes present in the list
    public void print() {
        // initially current point will point to the first node
        Node current = head;

        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        System.out.println("Nodes of the singly linked list:");
        while (current != null) {
            // print node and move current pointer to the next node
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Linked linkedList = new Linked();

        // Add 1, 2, 3, 4 nodes to the linikedList
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(5);

        // linkedList = 1->2->3->4->null

        // print the nodes of the linked list
        linkedList.print();
        // output: 1 2 3 4
    }

}
