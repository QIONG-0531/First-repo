import com.sun.org.apache.regexp.internal.RE;
import jdk.nashorn.internal.ir.WhileNode;
import org.omg.CORBA.PUBLIC_MEMBER;

class Node{
    public int data;
    public Node next;
    public Node(){

    }
    public Node(int data){
        this.data=data;
    }
}
public class MyLinkedList {
    public Node head;

    //创建一个单链表
    public void created() {
        this.head = new Node(11);
        Node node1 = new Node(22);
        this.head.next = node1;
        Node node2 = new Node(11);
        node1.next = node2;
        Node node3 = new Node(44);
        node2.next = node3;
        Node node4 = new Node(55);
        node3.next = node4;
        Node node5 = new Node(55);
        node4.next = node5;
    }

    //打印单链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //找单链表的最后一个节点
    public Node findlast() {
        if (this.head == null) {
            System.out.println("单链表为空");
            return null;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }
    //找单链表的倒数第二个节点
    public Node findlasttwo() {
        if (this.head == null) {
            System.out.println("单链表为空");
            return null;
        }
        if (this.head.next == null) {
            System.out.println("单链表只有一个节点");
            return null;
        }
        Node cur = this.head;
        while (cur.next.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    //找到第x位置的数
    public Node findx(int x) {
        if (this.head == null) {
            System.out.println("单链表为空");
            return null;
        }
        if (x < 0) {
            System.out.println("位置x太小");
            return null;
        }
        if (x >= size()) {
            System.out.println("位置x太大");
            return null;
        }
        Node cur = this.head;
        int count = 0;
        while (count != x) {
            cur = cur.next;
            count++;
        }
        return cur;
    }
    //单链表长度
    public int size() {
        Node cur=this.head;
        int count=0;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean find(int key){
        if(this.head==null){
            System.out.println("单链表为空");
            return false;
        }
        Node cur=this.head;
        while (cur!=null){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    //头插法
    public void firstnode(int data){
        Node node=new Node(data);
        if(this.head==null){
            this.head=node;
        }
        else {
            node.next=this.head;
            this.head=node;
        }
    }
    //尾插法
    public void lastnode(int data){
        Node node=new Node(data);
        if(this.head==null){
            this.head=node;
        }
        else{
            Node cur=this.head;
            while (cur.next!=null){
                cur=cur.next;
            }
            cur.next=node;
        }
    }
    public Node move(int index){
        Node cur=this.head;
        int count=0;
        while(count!=index-1){
            count++;
            cur=cur.next;
        }
        return cur;
    }
     //任意位置插入,第一个数据节点为0号下标
    public void add(int index,int data){
        if(index<0||index>size()){
            System.out.println("位置不合法");
            return;
        }
        if(index==0){
            firstnode(data);
            return;
        }
        if(index==size()){
            lastnode(data);
            return;
        }
        Node cur=move(index);
        Node node=new Node(data);
        node.next=cur.next;
        cur.next=node;
    }
    //找到关键字为key的前驱节点
    public Node findfirst(int key){
        Node cur=this.head;
        while (cur.next!=null){
            if(cur.next.data==key){
                return cur;
            }
            cur=cur.next;
        }
        return null;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(this.head==null){
            System.out.println("单链表为空");
            return;
        }
        if(this.head.data==key){
            this.head=this.head.next;
            return;
        }
        Node cur=findfirst(key);
        if(cur==null){
            System.out.println("没有这个关键字");
        }
        else{
            cur.next=cur.next.next;
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        if(this.head==null){
            System.out.println("单链表为空");
            return;
        }
        Node prev=this.head;
        Node cur=prev.next;
        while(cur!=null){
            if(cur.data!=key){
                prev=cur;
            }
            else{
                prev.next=cur.next;
            }
            cur=cur.next;
        }
        if(this.head.data==key){
            this.head=this.head.next;
        }
    }
    //清空单链表
    public void clear(){
        this.head=null;
    }
    //反转一个单链表
    public Node reverse(){
        if(this.head==null){
            System.out.println("单链表为空");
            return null;
        }
        Node prev=null;
        Node cur=this.head;
        Node newHead=null;
        while (cur!=null){
            Node curNext=cur.next;
            if(curNext==null){
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return newHead;
    }
    //返回链表的中间节点，如果有两个就返回第二个节点
    public Node midNode(){
        Node fast=this.head;
        Node slow=this.head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
