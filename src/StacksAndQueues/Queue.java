package StacksAndQueues;

public class Queue { //FIFO first in first out
    private Node first;
    private Node last;
    private int length;
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
    public Queue (int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }
    public Node dequeue () {
        Node dequeueIt = first;
        if (length == 0) {return null;}
        if (length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            dequeueIt.next = null;
        }
        length--;

        return dequeueIt;
    }
    public void enqueue (int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            last = newNode;
            first = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public void printQueue () {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst() {
        System.out.println("First : " + first.value);
    }

    public void getLast() {
        System.out.println("Last : " + last.value);
    }

    public void getLength() {
        System.out.println("Length : " + length);
    }
}
