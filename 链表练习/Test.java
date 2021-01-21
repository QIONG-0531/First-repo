import java.util.ArrayList;

class ListNode{
    public int val;
    public ListNode next;
    public ListNode(int data){
        this.val=data;
    }
}
class MyLinkedList {
    int usedSize;
    ListNode head;

    public MyLinkedList() {
        usedSize=0;
        head=null;
    }


    public int get(int index) {
        if(head==null || index<0 ||index>=usedSize){
            return -1;
        }
        ListNode cur=head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur.val;

    }


    public void addAtHead(int val) {
        ListNode cur=new ListNode(val);
        if(head==null){
            head=cur;
        }
        else{
            cur.next=head;
            head=cur;
        }
        usedSize++;
    }


    public void addAtTail(int val) {
        ListNode node=new ListNode(val);
        if(head==null){
            head=node;
        }
        else{
            ListNode cur=head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=node;
        }
        usedSize++;
    }


    public void addAtIndex(int index, int val) {
        if(index<0){
            addAtHead(val);
            return;
        }
        if(index==usedSize){
            addAtTail(val);
            return;
        }
        if(index>usedSize){
            return;
        }
        ListNode cur=head;
        while((index-1)!=0){
            cur=cur.next;
            index--;
        }
        ListNode node=new ListNode(val);
        node.next=cur.next;
        cur.next=node;
        usedSize++;
    }


    public void deleteAtIndex(int index) {
        if(index<0 || index>=usedSize){
            return;
        }
        if(index==0){
            head=head.next;
            usedSize--;
            return;
        }
        ListNode cur=head;
        if(index==usedSize-1){
            while(cur.next.next!=null){
                cur=cur.next;
            }
            cur.next=null;
            usedSize--;
            return;
        }
        ListNode tmp=head;
        for(int i=0;i<index-1;i++){
            tmp=tmp.next;
        }
        tmp.next=tmp.next.next;
        usedSize--;
    }
    public  void display(){
        ListNode cur=head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }
}
public class Test {
    public static void main2(String[] args) {
        int n=1;
        int ret=1;
        while (n<=5){
            ret*=n;
            n++;
        }
        System.out.println(ret);
    }
    public static void main1(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtTail(4);
       /* myLinkedList.display();
        myLinkedList.addAtIndex(1,2);
        myLinkedList.display();
        System.out.println(myLinkedList.get(1));*/
        myLinkedList.deleteAtIndex(2);
        myLinkedList.display();

    }
    
}
