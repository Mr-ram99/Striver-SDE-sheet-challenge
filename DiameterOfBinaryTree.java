/*************************************************************

Following is the Binary Tree Node structure:

    class TreeNode<T> {
		public T data;
		public BinaryTreeNode<T> left;
		public BinaryTreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = null;
			right = null;
	  	}
    }

*************************************************************/

public class Solution {
	public static int diameterOfBinaryTree(TreeNode<Integer> root) {
		// Write your code here.
        int [] d = new int[1];
        int height = diameter(root, d);
        return d[0];
	}
    public static int diameter(TreeNode root , int [] d){
        if(root == null) return 0;
        int l = diameter(root.left, d);
        int r = diameter(root.right, d);
        d[0] = Math.max(d[0], l+r);
        return Math.max(l,r)+1;
    }
}