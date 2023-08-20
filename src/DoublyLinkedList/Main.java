package DoublyLinkedList;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);

        myDLL.append(2);
        /*
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);
        myDLL.append(6);

         */

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.swapPairs();

        myDLL.printAll();


    }


}
