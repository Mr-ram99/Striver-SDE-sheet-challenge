/*************************************************************

Following is the Binary Tree node structure

class BinaryTreeNode<T> 
{
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    BinaryTreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
};

*************************************************************/
public class Solution {

	public static boolean isBalancedBT(BinaryTreeNode<Integer> root) {
		// Write your code here.
        return height(root)==-1?false:true;
	}
    public static int height(BinaryTreeNode<Integer> node){
        if(node == null)return 0;
        int l = height(node.left);
        int r = height(node.right);
        if(l==-1 || r==-1) return -1;
        if(Math.abs(l-r)>1)return -1;
        return Math.max(l,r)+1;
    }
}
