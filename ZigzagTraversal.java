/*
	Following is the class used to represent the object/node of the Binary Tree

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}
*/
import java.util.*;
public class Solution {
	public static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {
		// Write your code here!
        boolean dir=false;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        Stack<Integer> stk = new Stack<>();
        List<Integer> list= new ArrayList<>();
        if(root == null) return list;
        q.add(root);
        while(!q.isEmpty()){
            int s = q.size();
            while(s-->0){
                BinaryTreeNode temp = q.poll();
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
                if(dir){
                    stk.push((int)temp.data);
                }
                else{
                    list.add((int)temp.data);
                }
            }
            while(!stk.isEmpty()){
                list.add(stk.pop());
            }
            dir = !dir;
        }
        return list;
    }
}
