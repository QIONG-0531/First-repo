import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        //迭代器
        Iterator<Integer>iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        list.add(1,2);
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }


}
