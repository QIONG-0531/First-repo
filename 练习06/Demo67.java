import java.util.*;
/*
class Node{
    int val;
    Node next;
    public Node(int val){
        this.val=val;
    }
}
public class Demo67{
    public static int slove(int n,int m){
        Node head=new Node(-1);
        Node cur=head;
        for(int i=0;i<n;i++){
            cur.next=new Node(i);
            cur=cur.next;
        }
        cur.next=head.next;
        cur=head.next;
        while(cur.next!=cur){
            for(int i=1;i<m-1;i++){
                cur=cur.next;
            }
            cur.next=cur.next.next;
            cur=cur.next;
        }
        return cur.val;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        System.out.println(slove(n,m));
    }
}
*/
