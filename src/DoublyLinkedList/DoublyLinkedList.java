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
    public Node remove(int index) {
        if (index < 0 || index >= length) {return null;}
        if (index == 0) {
            return removeFirst();
        }
        if (index == length-1) {
            return removeLast();
        }
        Node removeIt = get(index);
        Node before = get(index).prev;
        Node after = get(index).next;

        before.next = after;
        after.prev = before;

        removeIt.next = null;
        removeIt.prev = null;

        length--;
        return removeIt;
    }
    public boolean insert(int index, int value) {
        Node newNode = new Node(value);
        Node before = head;
        Node after = head;
        if (index < 0 || index > length ) {return false;}
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        before = get(index).prev;
        after = get(index);

        before.next = newNode;
        after.prev = newNode;
        newNode.prev = before;
        newNode.next = after;

        length++;
        return true;

    }
    public boolean set (int index, int value) {
        if(index < 0 || index >= length) {return false;}
        Node temp = head;
        temp = get(index);
        temp.value = value;

        return true;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {return null;}
        Node temp = head;
        if (index < length/2) {
            for (int i = 0;i<index;i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            temp = tail;
            for (int i = 1;i<length-index;i++) {
                temp = temp.prev;
            }
            return temp;
        }
    }

    public Node removeFirst () {
        Node firstNode = head;
        if (head == null) {return null;}
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            firstNode.next = null;
            head.prev = null;
        }
        length--;
        return firstNode;
    }
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }
    public Node removeLast () {
        if (tail == null) {return null;}
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            temp.prev = null;
            tail.next = null;
        }
        length--;
        return temp;

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
