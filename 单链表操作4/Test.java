import jdk.nashorn.internal.ir.WhileNode;
import org.omg.CORBA.NO_IMPLEMENT;

public class Test {
    // 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
    public static Node mergeTwoLists(Node headA, Node headB){
        Node newHead=new Node(-1);
        Node tmp=newHead;
        while(headA!=null&&headB!=null){
            if(headA.data>headB.data){
                tmp.next=headB;
                headB=headB.next;
            }
            else{
                tmp.next=headA;
                headA=headA.next;
            }
            tmp=tmp.next;
        }
        if(headA==null){
            tmp.next=headB;
        }
        if(headB==null){
            tmp.next=headA;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList1=new MyLinkedList();
        myLinkedList1.lastnode(12);
        myLinkedList1.lastnode(45);
        myLinkedList1.lastnode(45);
        myLinkedList1.lastnode(89);
        myLinkedList1.lastnode(89);
        myLinkedList1.display(myLinkedList1.head);
        Node ret=myLinkedList1.deleteDuplication();
        myLinkedList1.display(ret);
    }
    public static void main2(String[] args) {
        MyLinkedList myLinkedList1=new MyLinkedList();
        myLinkedList1.lastnode(12);
        myLinkedList1.lastnode(67);
        myLinkedList1.lastnode(45);
        myLinkedList1.lastnode(13);
        myLinkedList1.lastnode(89);
        myLinkedList1.display(myLinkedList1.head);
        Node ret=myLinkedList1.partition(40);
        myLinkedList1.display(ret);
       /* MyLinkedList myLinkedList2=new MyLinkedList();
        myLinkedList2.lastnode(1);
        myLinkedList2.lastnode(3);
        myLinkedList2.lastnode(5);
        myLinkedList2.lastnode(6);
        myLinkedList2.lastnode(9);
        myLinkedList2.display(myLinkedList2.head);*/
       /* Node ret=Test.mergeTwoLists(myLinkedList1.head,myLinkedList2.head);
        myLinkedList2.display(ret);*/

    }
    public static void main1(String[] args) {
        /*MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.created();
        myLinkedList.display();*/
        /*Node ret=myLinkedList.findlast();
        System.out.println(ret.data);
        Node ret1=myLinkedList.findlasttwo();
        System.out.println(ret1.data);
        ret= myLinkedList.findx(2);
        System.out.println(ret.data);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.find(89));
        myLinkedList.firstnode(12);
        myLinkedList.display();
        myLinkedList.lastnode(89);
        myLinkedList.display();*/
        /*myLinkedList.add(0,99);
        myLinkedList.display();
        myLinkedList.add(6,99);
        myLinkedList.display();
        myLinkedList.add(2,49);
        myLinkedList.display();*/
        //System.out.println(myLinkedList.reverse().data);
       /* System.out.println(myLinkedList.midNode().data);
        System.out.println(myLinkedList.FindKthToTail(1).data);*/
    }
}
