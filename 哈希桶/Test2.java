class HashBucket{
    public static class Node{
        public int key;
        public int value;
        public Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    public Node[]array;
    public int size;

    public HashBucket( ) {
        this.array=new Node[6];
    }

    public void put(int key, int value){
        int index=key%array.length;
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
    public void resize(){
        Node[]newArray=new Node[array.length*2];
        for(int i=0;i<array.length;i++){
            Node cur=array[i];
            while (cur!=null){
                int index=cur.key%newArray.length;
                Node curnext=cur.next;
                cur.next=newArray[index];
                newArray[index]=cur;
                cur=curnext;
            }
        }
        array=newArray;
    }
    public double loadFactor(){
        return size/(double)array.length;
    }
    public int get(int key){
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
}
public class Test2 {
    public static void main(String[] args) {
       HashBucket hashBucket=new HashBucket();
        hashBucket.put(1,1);
        hashBucket.put(2,2);
        hashBucket.put(3,3);
        hashBucket.put(4,4);
        hashBucket.put(5,5);
        hashBucket.put(6,6);
        hashBucket.put(7,7);
        System.out.println(hashBucket.get(7));
    }

}
