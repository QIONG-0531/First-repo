public class TestDemo {
    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(3);
        list.addLast(5);
        list.addLast(3);
        list.addIndex(3,7);
        list.display();
//        System.out.println(list.contains(6));
//        list.remove(1);
//        list.display();
        list.removeAllKey(3);
        list.display();
    }
}
