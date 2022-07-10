/*************************************************************************

    Following is the class structure of the Node class:

	class TreeNode<T> {
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

*************************************************************************/

public class Solution {
	public static int largestBST(TreeNode<Integer> root) {
		// Write your code here.
        Pair p =  bst(root);
        return p.size;
	}
    public static Pair bst(TreeNode<Integer> root){
        int max = Integer.MAX_VALUE, min = Integer.MIN_VALUE;
        if(root==null){
            return new Pair(0, min, max);
        }
        if(root.left == null && root.right == null){
            return new Pair(1, root.data, root.data);
        }
        Pair l = bst(root.left);
        Pair r = bst(root.right);
        if(l.max<root.data && r.min>root.data){
            return new Pair(l.size + r.size + 1, Math.max(r.max,root.data), Math.min(l.min, root.data));
        }
        return new Pair(Math.max(l.size,r.size), max, min);
    }
}
class Pair{
    int size;
    int max;
    int min;
    Pair(int s, int mx, int mn){
        size = s;
        max = mx;
        min = mn;
    }
}