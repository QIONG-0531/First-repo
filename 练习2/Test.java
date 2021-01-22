import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Test {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null&&list2==null){
            return null;
        }
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode head=new ListNode(0);
        ListNode cur=head;
        while(list1!=null || list2!=null){
            if(list1.val>list2.val){
                cur.next=list2;
                list2=list2.next;
            }
            else{
                cur.next=list1;
                list1=list1.next;
            }
            cur=cur.next;
        }
        return head.next;
    }
    public static List<Character> func(String str1, String str2) {
        List<Character> ret =new ArrayList<>();
        char[]chars1=str1.toCharArray();
       char[]chars2=str2.toCharArray();
       for(int i=0;i<chars1.length;i++){
           int flag=0;
           for(int j=0;j<chars2.length;j++){
               if(chars1[i]==chars2[j]){
                   flag=1;
               }
           }
           if(flag==0){
               ret.add(chars1[i]);
           }
       }
       return ret;
    }

    public static void main1(String[] args) {
        System.out.println(func("welcome to bit", "come"));

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        char[]chars=str.toCharArray();
        char[]arr=new char[chars.length];
        int flag=0;
        int n=1;
        arr[0]=chars[0];
        for(int i=1;i<chars.length;i++){
            for(int j=0;j<i;j++){
                if(chars[j]==chars[i]){
                    flag=1;
                }
            }
            if(flag==0){
               arr[n++]=chars[i];
            }
        }
        System.out.println(new String(arr));
    }

}
