/*************************************************************
    Following is the Binary Tree node structure

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

*************************************************************/
import java.util.ArrayList;
public class Solution {
	public static ArrayList<Integer> predecessorSuccessor(BinaryTreeNode<Integer> root, int key) {
		// Write your code here.
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        inorder(root, list);
        for(int i=0;i<list.size();i++){
            if(list.get(i)==key){
                if(i==0) res.add(-1);
                else res.add(list.get(i-1));
                if(i==list.size()-1)res.add(-1);
                else res.add(list.get(i+1));
                break;
            }
        }
        return res;
	}
    public static void inorder(BinaryTreeNode<Integer> root, ArrayList<Integer> list){
        if(root == null)return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
}