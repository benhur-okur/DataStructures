package StacksAndQueues;

public class Main {
    public static void main(String[] args) {



        /*

        ------------- STACKS ----------

        Stack myStack = new Stack(1);
        myStack.push(2);

        myStack.pop();

        myStack.getTop();
        myStack.getHeight();



        myStack.printStack();

         */

        // ------------ QUEUES ----------

        Queue myQue = new Queue(1);
        myQue.enqueue(2);

        myQue.getFirst();
        myQue.getLast();
        myQue.getLength();

        myQue.printQueue();

    }
}
