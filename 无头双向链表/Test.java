public class Test {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.addFirst(1);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.display();
        /*doubleLinkedList.addLast(1);
        doubleLinkedList.addLast(2);
        doubleLinkedList.addLast(3);
        doubleLinkedList.addLast(4);
        doubleLinkedList.display();*/
       /* doubleLinkedList.addIndex(0,9);
        doubleLinkedList.display();
        System.out.println(doubleLinkedList.contains(0));*/
       /* doubleLinkedList.remove(3);
        doubleLinkedList.display();
        doubleLinkedList.removeAllKey(3);
        doubleLinkedList.display();*/
        doubleLinkedList.clear();
    }
}
