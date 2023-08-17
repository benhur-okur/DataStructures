package LinkedList;

import org.w3c.dom.Node;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public void partitionList(int x) {
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);

        Node lessNodes = dummy1;
        Node greaterNodes = dummy2;

        Node current = head;

        while (current != null) {
            if (current.value < x) {
                lessNodes.next = current;
                lessNodes = current;
            } else {
                greaterNodes.next = current;
                greaterNodes = current;
            }
            current = current.next;
        }
        greaterNodes.next = null;
        lessNodes.next = dummy2.next;

        head = dummy1.next;
    }

    public void reverseBetween(int m, int n) { // n > m
        if (head == null) {return;}
        int temp = 0;
        Node before = head;
        Node after = head;

        for(int i = 0;i<m;i++) {
            before = before.next;
        }

        while(n > m) {
            after = head;

            for(int i = 0;i<(n);i++) {
                after = after.next;
            }

            temp = before.value;

            before.value = after.value;

            after.value = temp;

            before = before.next;
            m++;
            n--;
        }
    }
    public Node findMiddleNode () {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // the algorithm is when the fast one has came to the end slow will be on the middle node

        return slow;
    }
    public void reverse () {
        Node temp = head;
        Node after = head.next;
        Node before = null;
        head = tail; // head became tail;
        tail = temp; // tail became head;
        tail.next = before;
        while (after != null) {
            before = temp;
            temp = after;
            after = after.next;
            temp.next = before;
        }
    }
    public boolean remove(int index) {
        if (index < 0 || index >= length) {
            return false;
        }
        if (index == length-1){
            removeLast();
            return true;
        }
        if (index == 0) {
            removeFirst();
            return true;
        }
        Node temp = get(index-1);
        Node removeIt = get(index);
        temp.next = removeIt.next;
        removeIt = null;
        length--;
        return true;
    }
    public boolean insert(int index, int value) { // index == 1; // next'leri düzenlemem lazım

        //şartlar
        Node newNode = new Node(value);
        if (index < 0 || index > length) {
            return false;
        } if (index == 0) {
            prepend(value);
            return true;
        } if (index == length) {
            append(value);
            return true;
        }
        Node previous = get(index-1);
        newNode.next = previous.next;
        previous.next = newNode;
        length++;
        return true;



    }
    public boolean set (int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        else {
            return false;
        }
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;

    }
    public Node get(int index) {
        Node temp = head;
        if (index < 0 || index > (length-1)) {
            return null;
        } else {
            for (int i = 0;i<index;i++) {
                temp = temp.next;
            }
        }
        return temp;

    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;

    }
    public Node removeLast() {
        if (head == tail) {
            head = null;
            tail = null;
            length = 0;
        } else if (length == 0) {
            return null;
        } else {
            Node removeIt = head;
            while (removeIt.next != tail) {
                removeIt = removeIt.next;
            }
            tail = removeIt;
            length--;
            return  removeIt.next = null;
        }
        if (length == 0) {
            head = null;
            tail = null;
        }
        return tail;



        /*
        tail.next = null;
        Node newTail = head;
        while (newTail.next != tail) {
            newTail = newTail.next;
        }
        newTail.next = null;
        length--;
        tail = newTail;

         */
    }

    public void append (int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public class Node {
        private int value;
        private Node next;

        public Node (int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public void getHead() {
        if (head != null) {
            System.out.println("head : " + head.value);
        } else {
            System.out.println("null");
        }
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void getTail() {
        if (tail != null) {
            System.out.println("tail : " + tail.value);
        } else {
            System.out.println("null");
        }
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void getLength() {
        System.out.println("length : " + length);
    }

    public void setLength(int length) {
        this.length = length;
    }
}

