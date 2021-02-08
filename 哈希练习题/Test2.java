class MyHashMap {
    static class Node{
        public int key;
        public int value;
        public Node next;
        public Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    public Node[]array;
    public int size;

    /** Initialize your data structure here. */
    public MyHashMap() {
      array=new Node[4];
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int index = key % array.length;
        Node cur=array[index];
        while(cur!=null){
            if(cur.key==key){
                cur.value=value;
                return;
            }
            cur=cur.next;
        }
        Node node=new Node(key,value);
        node.next=array[index];
        array[index]=node;
        size++;
        if(loadFactor()>0.75){
            resize();
        }
    }
    public double loadFactor(){
        return size*1.0/array.length;
    }
    public void resize(){
        Node[]newArray=new Node[array.length*2];
        for(int i=0;i<array.length;i++){
            Node cur=array[i];
            while(cur!=null){
                Node curNext=cur.next;
                int index=cur.key%newArray.length;
                cur.next=newArray[index];
                newArray[index]=cur;
                cur=curNext;
            }
        }
        array=newArray;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index=key%array.length;
        Node cur=array[index];
        while(cur!=null){
            if(cur.key==key){
                return cur.value;
            }
            cur=cur.next;
        }
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index=key%array.length;
        Node cur=array[index];
        Node pre=cur;
        while(cur!=null){
            if(cur.key==key){
                if(pre.key==cur.key){
                    array[index]=cur.next;
                }else{
                    pre.next=cur.next;
                }
            }
            pre=cur;
            cur=cur.next;
        }
    }
}
public class Test2 {
    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(3));
        hashMap.put(2, 1); // 更新已有的值
        System.out.println(hashMap.get(2));
        hashMap.remove(2); // 删除键为2的数据
        System.out.println(hashMap.get(2));
    }
}
