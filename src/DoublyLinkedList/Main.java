package DoublyLinkedList;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(2);

        myDLL.append(3);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.printAll();
    }


}
