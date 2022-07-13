
/*************************************************************
 class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}

*************************************************************/

import java.util.*;
public class Solution {
	
	public static BinaryTreeNode<Integer> BTtoDLL(BinaryTreeNode<Integer> root) {
		// Write your code here
        List<Integer> list = new ArrayList<>();
        BinaryTreeNode<Integer> cur = new BinaryTreeNode<Integer>(-1);
        BinaryTreeNode<Integer> dummy = cur;
        inorder(root, list);
        for(int i=0;i<list.size();i++){
            BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>(list.get(i));
            cur.right = temp;
            if(i==0)
                temp.left=null;
            else 
                temp.left=cur;
            cur = cur.right;
        }
        cur.right = null;
        return dummy.right;
	}
	public static void inorder(BinaryTreeNode<Integer> root, List<Integer> list){
        if(root==null) return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right,list);
    }

}
