/*
    ----------------- Binary Tree node class for reference -----------------

    class BinaryTreeNode<T> {
	    public T data;
	    public BinaryTreeNode<T> left;
	    public BinaryTreeNode<T> right;
	    public BinaryTreeNode<T> next;

	    BinaryTreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	        next = null;
	    }
	};

*/
import java.util.*;
public class Solution {
	public static void connectNodes(BinaryTreeNode<Integer> root) {
    	// Write your code here.
        Queue<BinaryTreeNode> q = new LinkedList<>();
        if(root == null) return;
        q.offer(root);
        while(!q.isEmpty()){
            int s = q.size();
            while(s-->0){
                BinaryTreeNode n = q.poll();
                if(s>0){
                    n.next = q.peek();
                }
                else{
                    n.next = null;
                }
                if(n.left!=null)q.offer(n.left);
                if(n.right!=null)q.offer(n.right);
            }
        }
        return;
	}
}






