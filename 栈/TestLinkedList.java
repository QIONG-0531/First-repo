import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();
        list.addLast(1);
        list.addFirst(2);
        list.add(3);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
