import java.util.ArrayList;

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
public class Testz57 {
    //直接找下一个节点
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if(pNode==null) return null;
        //右子树不为空，下一节点就是右子树的最左
        if(pNode.right!=null){
            TreeLinkNode cur=pNode.right;
            while(cur.left!=null){
                cur=cur.left;
            }
            return cur;
        }
        //右子树为空，该节点是父节点的左树，直接返回父节点（左根右）
        if(pNode.next!=null && pNode==pNode.next.left){
            return pNode.next;
        }
        //右子树为空，该节点是父节点的右树，如果是左子树的右树直接返回父节点的父节点
        //右子树的右树就走完了
        //判断是左子树的还是右子树的，如果是左边的右树，至少有一个节点是父节点的左树；右边则没有
        if(pNode.next!=null){
            TreeLinkNode pNext=pNode.next;
            while(pNext.next!=null && pNext.next.right==pNext){
                pNext=pNext.next;
            }
            return pNext.next;
        }
        return null;
    }


//还原二叉树，再找
    ArrayList<TreeLinkNode> list=new ArrayList<>();
    public TreeLinkNode GetNext2(TreeLinkNode pNode) {
        TreeLinkNode head=pNode;
        while(head.next!=null){
            head=head.next;
        }
        inorder(head);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)==pNode){
                return list.get(i+1);
            }
        }
        return null;
    }
    public void inorder(TreeLinkNode head){
        if(head==null) return;
        inorder(head.left);
        list.add(head);
        inorder(head.right);
    }
}
