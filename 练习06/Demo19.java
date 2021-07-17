public class Demo19 {
    public void deleteNode(ListNode node) {
        //因为只有node节点，所以将后一个节点的值赋给node
        //然后删除后一节点
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
