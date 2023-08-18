package DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;
    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printAll () {
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }

    }

    public void getHead() {
        if (head != null) {
            System.out.println("head : " + head.value);
        } else {
            System.out.println("Null");
        }
    }

    public void getTail() {
        if (tail != null) {
            System.out.println("tail : " + tail.value);
        } else {
            System.out.println("Null");
        }    }

    public void getLength() {
        System.out.println("Length : " + length);
    }
}
