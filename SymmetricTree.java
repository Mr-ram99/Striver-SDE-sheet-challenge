/*****************************************************************

    Following is the representation for the Binary Tree Node:

    class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }

****************************************************************/

public class Solution {

    public static boolean isSymmetric(BinaryTreeNode<Integer> root) {
        // Write your code here.
        if(root==null) return true;
        return isSym(root.left, root.right);
    }
    public static boolean isSym(BinaryTreeNode<Integer> p, BinaryTreeNode<Integer> q){
        if(p == null && q== null) return true;
        if(p==null || q==null) return false;
        return p.data.equals(q.data) && isSym(p.left, q.right) && isSym(p.right, q.left);
    }
}