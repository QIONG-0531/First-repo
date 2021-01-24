import java.util.LinkedList;

public class Test2 {
    public  static  int getResult(int n) {
        if (n < 1)
            return -1;
        LinkedList<Integer> list = new LinkedList<Integer>();
        int round = 2;
        int i, cur;
        for (i = 1; i <= n; i++) {
            list.add(i);
        }
        while (list.size() > 1) {
            i = 0;
            cur=0;
            while (list.size() > 1 && i < list.size()) {
                cur = (cur + 1) % round;
                if (cur != 1) {
                    list.remove(i);
                } else {
                    i++;
                }
            }
            round++;
            if (list.size() > 1) {
                int last = list.removeLast();
                list.addFirst(last);
            }
        }
        return list.pop();// 返回最后一个元素
    }

    public static void main(String[] args) {
        System.out.println(getResult(5));
    }
}
