package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1); // 31 2 3 4 5 6 333
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(3);
        linkedList.append(4);




        //linkedList.reverse();

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();

        System.out.println();

        linkedList.removeDuplicates();

        linkedList.printList();
        linkedList.getLength();



    }
}