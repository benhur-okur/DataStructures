package DoublyLinkedList;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(2);


        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);

        myDLL.insert(1, 31);

        myDLL.remove(0);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();


        myDLL.printAll();
    }


}
