class Node{
    public int val;
    public Node next;
    public Node(int val){
        this.val=val;
    }
}
public class SingleLinkedList {
   public Node head;
    //头插法
    public void addFirst(int data){
     Node node=new Node(data);
     if(this.head==null){
        this.head=node;
     }
     else{
         node.next=this.head;
         this.head=node;
     }
    }
    //尾插法
    public void addLast(int data){
       Node node=new Node(data);
       if(head==null){
           head=node;
       }
       else {
           Node cur = this.head;
           while (cur.next != null) {
               cur = cur.next;
           }
           cur.next = node;
       }
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index<0 || index>size()){
            System.out.println("位置不合法");
            return;
        }
        if(index==0){
            addFirst(data);
        }
        else if(index==size()){
            addLast(data);
        }
        else{
            Node cur=this.head;
            while((index-1)!=0){
                cur=cur.next;
                index--;
            }
            Node node=new Node(data);
            node.next=cur.next;
            cur.next=node;
        }
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur=this.head;
        while(cur!=null){
            if(cur.val==key){
                return true;
            }
            cur=cur.next;
        }
       return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
       if(this.head.val==key){
           this.head=this.head.next;
       }
       else{
           Node cur=this.head;
           while (cur.next!=null) {
               if(cur.next.val==key){
                   cur.next=cur.next.next;
                   return;
               }
               cur=cur.next;
           }
       }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
       /* if(this.head.val==key){
            this.head=this.head.next;
        }
            Node cur=this.head;
            while (cur!=null && cur.next!=null) {
                if(cur.next.val==key){
                    cur.next=cur.next.next;
                }
                cur=cur.next;
            }*/
        if(this.head==null){
            System.out.println("单链表为空");
            return;
        }
        Node pre=this.head;
        Node cur=pre.next;
        while(cur!=null){
            if(pre.val==key){
                pre.next=cur.next;
            }
            else{
                pre=cur;
            }
            cur=cur.next;
        }
        if(this.head.val==key){
            this.head=this.head.next;
        }
    }
    //得到单链表的长度
    public int size(){
        int size=0;
        Node cur=this.head;
        while(cur!=null){
            cur=cur.next;
            size++;
        }
        return size;
    }
    public void display(){
       Node cur=this.head;
       while(cur!=null){
           System.out.print(cur.val+" ");
           cur=cur.next;
       }
        System.out.println();
    }
    public void clear(){
     this.head=null;
    }
}

