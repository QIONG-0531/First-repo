class Node{
        public int data;
        public Node prev;
        public Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public class DoubleLinkedList {
        public Node head;
        public Node last;

        //头插法
        public void addFirst(int data) {
            Node node = new Node(data);
            if (this.head == null) {
                this.head = node;
                this.last = node;
            } else {
                node.next = this.head;
                this.head.prev = node;
                this.head = node;
            }
        }

        //尾插法
        public void addLast(int data) {
            Node node = new Node(data);
            if (this.last == null) {
                this.head = node;
                this.last = node;
            } else {
                this.last.next = node;
                node.prev = this.last;
                last = node;
            }
        }

        //打印链表
        public void display() {
            Node cur = this.head;
            while (cur != null) {
                System.out.print(cur.data + " ");
                cur = cur.next;
            }
            System.out.println();
        }

        //任意位置插入,第一个数据节点为0号下标
        public void addIndex(int index, int data) {
            if (index < 0 || index > size()) {
                return;
            }
            if (index == 0) {
                addFirst(data);
                return;
            }
            if (index == size()) {
                addLast(data);
                return;
            }
            Node node = new Node(data);
            Node cur = this.head;
            while (index != 0) {
                cur = cur.next;
                index--;
            }
            node.next = cur;
            node.prev = cur.prev;
            cur.prev.next = node;
            cur.prev = node;
        }

        //计算单链表长度
        public int size() {
            Node cur = this.head;
            int size = 0;
            while (cur != null) {
                size++;
                cur = cur.next;
            }
            return size;
        }

        //查找是否包含关键字key是否在单链表当中
        public boolean contains(int key) {
            if (this.head == null) {
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

        //删除第一次出现关键字为key的节点
        public void remove(int key) {
            if (this.head == null) {
                return;
            }
            Node cur = this.head;
            while (cur != null) {
                if (cur.data == key) {
                    break;
                } else {
                    cur = cur.next;
                }
            }
            if (cur == null) {
                return;
            }
            if (cur == this.head) {
                this.head = this.head.next;
                this.head.prev = null;
                return;
            }
            if (cur == this.last) {
                this.last = this.last.prev;
                this.last.next = null;
                return;
            }
            cur.prev.next = cur.next;
            cur.next.prev = cur.prev;
        }

        //删除所有值为key的节点
        public void removeAllKey(int key) {
            if (this.head == null) {
                return;
            }
            Node cur = this.head;
            while (cur != null) {
                if (cur.data == key) {
                    if (cur == this.head) {
                        this.head = this.head.next;
                        this.head.prev = null;
                    } else {
                        if (cur == this.last) {
                            this.last = this.last.prev;
                            this.last.next = null;
                        } else {
                            cur.prev.next = cur.next;
                            cur.next.prev = cur.prev;
                        }

                    }
                }
                cur = cur.next;
            }
        }
        //清空链表
        public void clear(){
            this.head=null;
            this.last=null;
        }
    }
