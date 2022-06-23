/************************************************************

    Following is the Binary Tree node structure:
    
   class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;

	    TreeNode(int data) {
		    this.data = data;
		    this.left = null;
		    this.right = null;
	    }

    }

************************************************************/

import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> traverseBoundary(TreeNode root){
		// Write your code here.
        ArrayList<Integer> list = new ArrayList<>();
        if(!isLeaf(root))list.add(root.data);
        addLeft(root.left, list);
        addLeaves(root, list);
        ArrayList<Integer> right = new ArrayList<>();
        addRight(root.right, right);
        for(int i=right.size()-1;i>=0;i--) list.add(right.get(i));
        return list;
            
	}
    public static boolean isLeaf(TreeNode node){
        return node.left==null && node.right==null;
    }
    public static void addLeft(TreeNode node, ArrayList<Integer> list){
        if(node == null) return ;
        if(!isLeaf(node)) list.add(node.data);
        if(node.left!=null) addLeft(node.left, list);
        else addLeft(node.right, list);
    }
    public static void addLeaves(TreeNode node, ArrayList<Integer> list){
        if(node.left == null && node.right ==null){
            list.add(node.data);
            return ;
        }
        if(node.left!=null) addLeaves(node.left, list);
        if(node.right !=null) addLeaves(node.right, list);
    }
    public static void addRight(TreeNode node, ArrayList<Integer> list){
        if(node == null) return;
        if(!isLeaf(node)) list.add(node.data);
        if(node.right != null) addRight(node.right, list);
        else addRight(node.left, list);
    }
}