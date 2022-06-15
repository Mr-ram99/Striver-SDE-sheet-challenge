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
    public static List < Integer > getPostOrderTraversal(TreeNode root) {
    	// Write your code here.
        List<Integer> list = new ArrayList<>();
        postorder(root, list);
        return list;
    }
    public static void postorder(TreeNode node, List<Integer> list){
        if(node == null) return;
        postorder(node.left, list);
        postorder(node.right,list);
        list.add(node.data);
    }
}