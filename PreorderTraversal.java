/*
	
	Following is the Binary Tree node structure:

	public class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;
	    TreeNode() {}
	    TreeNode(int val) { this.data = val; }
	    TreeNode(int val, TreeNode left, TreeNode right) {
	       this.data = val;
	        this.left = left;
	        this.right = right;
	    }
	}

*/
import java.util.*;
public class Solution {
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
    	// Write your code here.
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        if(root==null) return list;
        stk.push(root);
        while(!stk.isEmpty()){
            TreeNode temp = stk.pop();
            list.add(temp.data);
            if(temp.right!=null) stk.push(temp.right);
            if(temp.left!=null) stk.push(temp.left);
        }
//         recursive
//         preorder(root, list);
        return list;
    }
    public static void preorder(TreeNode node, List<Integer> list){
        if(node == null) return;
        list.add(node.data);
        preorder(node.left, list);
        preorder(node.right,list);
    }
}