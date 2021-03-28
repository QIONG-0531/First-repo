//二叉搜索树的查找，插入，删除
class BinarySearchTree{
   static class BSNode{
       public int val;
       public BSNode left;
       public BSNode right;

       public BSNode(int val) {
           this.val = val;
       }
   }
    public BSNode root=null;
    public BSNode search(int val){
        if(root==null) return null;
        BSNode cur=root;
        while(cur!=null){
            if(val>cur.val){
                cur=cur.right;
            }else if(val<cur.val){
                cur=cur.left;
            }else{
                return cur;
            }
        }
        return null;
    }
    public boolean insert(int val){
      BSNode node=new BSNode(val);
      if(root==null){
          root=node;
          return true;
      }
      BSNode cur=root;
      BSNode parent=null;
        while(cur!=null){
            if(val>cur.val){
                parent=cur;
                cur=cur.right;
            }else if(val<cur.val){
                parent=cur;
                cur=cur.left;
            }else{
                return false;
            }
        }
      if(val>parent.val){
          parent.right=node;
      }else{
          parent.left=node;
      }
      return true;
    }


    public void remove(int val){
        BSNode cur=root;
        BSNode parent=null;
        while(cur!=null){
            if(val>cur.val){
                parent=cur;
                cur=cur.right;
            }else if(val<cur.val){
                parent=cur;
                cur=cur.left;
            }else{
                removeNode(parent,cur,val);
                return;
            }
        }
    }
    //删除就是直接跳过该节点，连左边或者右边的子树
    public void removeNode(BSNode parent,BSNode cur,int val){
        //左边为空，三种情况
        if(cur.left==null){
            if(cur==root){
                root=cur.right;
            }else if(cur==parent.left){
                parent.left=cur.right;
            }else{
                parent.right=cur.right;
            }
        }
        //右边为空，三种情况
        else if(cur.right==null){
            if(cur==root){
                root=cur.left;
            }else if(cur==parent.left){
                parent.left=cur.left;
            }else{
                parent.right=cur.left;
            }
        }else{
            //左右都不为空，在要删除的节点的右树找最左（就是最小值）
                  BSNode tparent=cur;
                  BSNode target=cur.right;
                  while(target.left!=null){
                      tparent=target;
                      target=target.left;
                  }//找到右树的最左边
                  cur.val=target.val;//将该结点值覆盖到要删除的节点上
                  if(target==tparent.left){
                     tparent.left=target.right;
                  }else{
                      tparent.right=target.right;//右树可能没左边，即target就是cur.right
                  }
        }
    }
}
public class Test {
    public static void preOrder(BinarySearchTree.BSNode root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(BinarySearchTree.BSNode root){
        if(root==null)return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.insert(4);
        binarySearchTree.insert(3);
        binarySearchTree.insert(1);
        binarySearchTree.insert(11);
        binarySearchTree.insert(15);
        preOrder(binarySearchTree.root);
        System.out.println();
        inOrder(binarySearchTree.root);
        BinarySearchTree.BSNode RET=binarySearchTree.search(4);
        System.out.println(RET.val);
        binarySearchTree.remove(3);
        preOrder(binarySearchTree.root);
        System.out.println();
        inOrder(binarySearchTree.root);
    }
}
