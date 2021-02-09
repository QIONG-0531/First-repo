import java.util.ArrayList;

class MyHashSet {
    private int[] buckets;
    /** Initialize your data structure here. */
    public MyHashSet() {
        buckets = new int[10000000];
    }

    public void add(int key) {
        if(buckets[key] == 0){
            buckets[key] = 1;
            return ;
        }
        return ;
    }

    public void remove(int key) {
        if(buckets[key] == 1)
            buckets[key] = 0;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(buckets[key] == 1)
            return true;
        return false;
    }
}
public class Test3 {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        System.out.println(myHashSet.contains(1));
        System.out.println(myHashSet.contains(3));
        myHashSet.add(2);      // set = [1, 2]
        System.out.println(myHashSet.contains(2));
        myHashSet.remove(2);   // set = [1]
        System.out.println(myHashSet.contains(2));
    }
}
