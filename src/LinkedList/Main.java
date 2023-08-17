package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(31); // 31 2 3 4 5 6 333
        linkedList.append(333);
        linkedList.append(6);
        linkedList.append(5);
        linkedList.append(4);
        linkedList.append(3);
        linkedList.append(2);




        //linkedList.reverse();

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();

        System.out.println();

        linkedList.partitionList(5);

        linkedList.printList();




    }
}