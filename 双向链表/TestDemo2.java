public class TestDemo2 {
    public static void main(String[] args) {
        DoubleLinkedList list=new DoubleLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.addLast(5);
        list.addLast(1);
        list.display();
        //list.remove(6);
        //list.addIndex(3,10);
        list.removeAllKey(1);
        list.display();
    }
}
