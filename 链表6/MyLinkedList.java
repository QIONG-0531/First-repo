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
        Node node2 = new Node(33);
        node1.next = node2;
        Node node3 = new Node(44);
        node2.next = node3;
        Node node4 = new Node(55);
        node3.next = node4;
        Node node5 = new Node(66);
        node4.next = node5;
    }

    //打印单链表
    public void display(Node head) {
        Node cur = head;
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
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean find(int key) {
        if (this.head == null) {
            System.out.println("单链表为空");
            return false;
        }
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //头插法
    public void firstnode(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    //尾插法
    public void lastnode(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        } else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    public Node move(int index) {
        Node cur = this.head;
        int count = 0;
        while (count != index - 1) {
            count++;
            cur = cur.next;
        }
        return cur;
    }

    //任意位置插入,第一个数据节点为0号下标
    public void add(int index, int data) {
        if (index < 0 || index > size()) {
            System.out.println("位置不合法");
            return;
        }
        if (index == 0) {
            firstnode(data);
            return;
        }
        if (index == size()) {
            lastnode(data);
            return;
        }
        Node cur = move(index);
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;
    }

    //找到关键字为key的前驱节点
    public Node findfirst(int key) {
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.next.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (this.head == null) {
            System.out.println("单链表为空");
            return;
        }
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node cur = findfirst(key);
        if (cur == null) {
            System.out.println("没有这个关键字");
        } else {
            cur.next = cur.next.next;
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        if (this.head == null) {
            System.out.println("单链表为空");
            return;
        }
        Node prev = this.head;
        Node cur = prev.next;
        while (cur != null) {
            if (cur.data != key) {
                prev = cur;
            } else {
                prev.next = cur.next;
            }
            cur = cur.next;
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }
    }

    //清空单链表
    public void clear() {
        this.head = null;
    }

    //反转一个单链表
    public Node reverse() {
        if (this.head == null) {
            System.out.println("单链表为空");
            return null;
        }
        Node prev = null;
        Node cur = this.head;
        Node newHead = null;
        while (cur != null) {
            Node curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }

    //返回链表的中间节点，如果有两个就返回第二个节点
    public Node midNode() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //输出该链表中倒数第k个节点
    public Node FindKthToTail(int k) {
        if (this.head == null || k <= 0 || k > size()) {
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (k - 1 != 0) {
            fast = fast.next;
            k--;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    //以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    public Node partition(int x) {
        if (this.head == null) {
            return null;
        }
        Node as = null;
        Node ae = null;
        Node bs = null;
        Node be = null;
        Node cur = this.head;
        while (cur != null) {
            if (cur.data < x) {
                if (as == null) {//第一次插入
                    as = cur;
                    ae = cur;
                } else {
                    ae.next = cur;
                    ae = ae.next;
                }
            } else {
                if (bs == null) {
                    bs = cur;
                    be = cur;
                } else {
                    be.next = cur;
                    be = be.next;
                }
            }
            cur = cur.next;
        }
        if (as == null) {
            return bs;
        }
        ae.next = bs;
        if (bs != null) {
            be.next = null;
        }
        return as;
    }

    // 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
    public Node deleteDuplication() {
        if (this.head == null) {
            return null;
        }
        Node cur = this.head;
        Node newHead = new Node(-1);
        Node tmp = null;
        tmp = newHead;
        while (cur != null) {
            if (cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
            } else {
                tmp.next = cur;
                cur = cur.next;
                tmp = tmp.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }

    //链表的回文结构
    public boolean chkPalindrome() {
        if (this.head == null) {
            return false;
        }
        //1、找到当前链表的中间位置
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //2、从中间位置开始，后半部分进行翻转
        Node cur = slow.next;
        while (cur != null) {
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //3、head从头往后走   slow从后往前走
        //只要发现 对应的val值不一样 就返回false  直到head和slow相遇
        while (head != slow) {
            if (head.data != slow.data) {
                return false;
            }
            //偶数的情况
            if (head.next == slow) {
                return true;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    //给定一个链表，判断链表中是否有环
    public boolean hasCycle() {
        if (this.head == null) {
            return false;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
    public Node detectCycle() {
        if (this.head == null) {
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                slow=head;
                while(fast!=slow){
                    slow=slow.next;
                    fast=fast.next;
                }
                return fast;
            }
        }
        return null;
    }
    //实现一种算法，删除单向链表中间的某个节点（即不是第一个或最后一个节点），假定你只能访问该节点。
    public void deleteNode(Node node) {//替换法删除
        if(node==null){
            return;
        }
        node.data=node.next.data;
        node.next=node.next.next;
    }
    //给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
    public Node rotateRight( int k) {
        if(head==null ||k<0){
            return null;
        }
       Node fast=head;
       Node slow=head;
        if(k==0){
            return head;
        }
        while(k!=0){
            if(fast.next!=null){
                fast=fast.next;
                k--;
            }
            else{
                fast=head;
                k--;
            }
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        if(fast==slow){
            return head;
        }
        Node node=slow.next;
        slow.next=null;
        fast.next=head;
        head=node;
        return head;
    }
}


