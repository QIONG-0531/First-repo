class ListNode{
    public int val;
    public ListNode pre;
    public ListNode next;
    public ListNode(int data){
        this.val=data;
    }
}
    // 2、无头双向链表实现
    public class DoubleLinkedList {
    public ListNode head;
    public ListNode last;
        //头插法
        public void addFirst(int data){
            ListNode node=new ListNode(data);
            if(this.head==null){
                this.head=node;
                this.last=node;
            }
            else {
                node.next=this.head;
                this.head.pre=node;
                this.head=node;
            }
        }
        //尾插法
        public void addLast(int data){
            ListNode node=new ListNode(data);
            if(this.head==null){
                this.head=node;
                this.last=node;
            }
            else {
                this.last.next=node;
                node.pre=this.last;
                this.last=node;
            }
        }
        //任意位置插入,第一个数据节点为0号下标
        public void addIndex(int index,int data){
            if(index<0 || index>size()) return;
            if(index==0){
                addFirst(data);
            }
            else if(index==size()){
                addLast(data);
            }
            else{
                ListNode cur=this.head;
                while(index!=0){
                    cur=cur.next;
                    index--;
                }
                ListNode node=new ListNode(data);
                node.next=cur;
                node.pre=cur.pre;
                cur.pre.next=node;
                cur.pre=node;
            }

        }
        //查找是否包含关键字key是否在单链表当中
        public boolean contains(int key){
          ListNode cur=this.head;
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
                 this.head.pre=null;
             }
            else if(this.last.val==key) {
                   this.last=this.last.pre;
                   this.last.next=null;
                  }
              else  {
                     ListNode cur = this.head;
                     while (cur != null) {
                         if (cur.val == key) {
                             cur.pre.next = cur.next;
                             cur.next.pre = cur.pre;
                             return;
                         }
                         cur = cur.next;
                     }
                 }
             }
        //删除所有值为key的节点
        public void removeAllKey(int key) {
            ListNode cur = this.head;
            while (cur != null) {
                if (cur.val == key) {
                    if (cur == this.head) {
                        this.head = this.head.next;
                        this.head.pre = null;
                    } else {
                        cur.pre.next = cur.next;
                        if (cur == this.last) {
                            this.last = cur.pre;
                        } else {
                            cur.next.pre = cur.pre;
                        }
                    }
                }
                cur = cur.next;
            }
        }
        //得到单链表的长度
        public int size(){
            ListNode cur=this.head;
            int count=0;
            while(cur!=null){
                count++;
                cur=cur.next;
            }
            return count;
        }
        public void display(){
            ListNode cur=this.head;
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


