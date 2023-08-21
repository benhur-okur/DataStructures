package StacksAndQueues;

public class Stack { // LIFO last in last out
    private Node top;
    private int height;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Stack (int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public Node pop () {
        Node popIt = top;
        if (height == 0) {
            return null;
        }
        else {
            top = top.next;
            popIt.next = null;
            height--;
        }
        return popIt;

    }
    public void push(int value) {
        Node newNode = new Node(value);
        if (height != 0) {
            newNode.next = top;
        }
        top = newNode;
        height++;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop() {
        System.out.println("Top : " + top.value);
    }

    public void getHeight() {
        System.out.println("Height : " + height );
    }
}
