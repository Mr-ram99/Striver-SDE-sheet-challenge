 
 
/*************************************************************
	Following is the Binary Tree node structure
	class TreeNode<T> {
		public T data;
		public TreeNode<T> left;
		public TreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = right = null;
		}

};************************************************************/
import java.util.*;
public class Solution {
	public static TreeNode<Integer> preOrderTree(int[] preOrder) {
 		// Write your code here
        ArrayList<Integer> pre = new ArrayList<>();
        for(int i=0;i<preOrder.length;i++){
            pre.add(preOrder[i]);
        }
        return bst(pre);
    }
    public static TreeNode bst(ArrayList<Integer> list){
        int n=list.size();
        if(n==0) return null;
        TreeNode node = new TreeNode(list.get(0));
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        int i=1;
        int x= list.get(0);
        while(i<n && list.get(i)<x){
            left.add(list.get(i));
            i++;
        }
        while(i<n){
            right.add(list.get(i));
            i++;
        }
        node.left = bst(left);
        node.right = bst(right);
        return node;
    }
}
