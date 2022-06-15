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
    public static List < Integer > getInOrderTraversal(TreeNode root) {
    	// Write your code here.
//         iterative
        
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        TreeNode node  = root;
        while(true){
            if(node!=null){
                stk.push(node);
                node = node.left;
            }
            else{
                if(stk.isEmpty()) break;
                TreeNode temp = stk.pop();
                list.add(temp.data);
                node = temp.right;
            }
        }
//         recursive
//         inorder(root, list);
        return list;
    }
    public static void inorder(TreeNode node, List<Integer> list){
        if(node == null) return;
        inorder(node.left, list);
        list.add(node.data);
        inorder(node.right,list);
    }
}