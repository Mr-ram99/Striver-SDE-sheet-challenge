/*************************************************************
    
    Following is the Binary Tree node structure:

    class BinaryTreeNode {

	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	BinaryTreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	   }
    }

*************************************************************/
import java.util.*;
public class Solution {
	public static boolean pairSumBst(BinaryTreeNode root, int k) {
		// Write your code here.
        HashSet<Integer> set = new HashSet<>();
        inorder(root,set);
        for(int num: set){
            if(k-num!=num && set.contains(k-num)){
                return true;
            }
        }
        return false;
	}
    public static void inorder(BinaryTreeNode root, Set<Integer> set){
        if(root==null) return;
        inorder(root.left,set);
        set.add(root.data);
        inorder(root.right,set);
    }
}

