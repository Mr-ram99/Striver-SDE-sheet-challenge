/************************************************************

    Following is the TreeNode class structure.

	class TreeNode<T> 
	{
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) 
	    {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

************************************************************/
import java.util.*;
public class Solution 
{
    public static TreeNode prev;
    public static TreeNode<Integer> flattenBinaryTree(TreeNode<Integer> root)
    {
        // Write your code here.
//         Neive solution
//         ArrayList<Integer> list = new ArrayList<>();
//         preorder(root, list);
//         TreeNode cur = new TreeNode(-1);
//         TreeNode dummy = cur;
//         for(int i=0;i<list.size();i++){
//             TreeNode temp = new TreeNode(list.get(i));
//             cur.right = temp;
//             cur = temp;
//         }
//         return dummy.right;
//         recursive solution
        prev = null;
        flat(root);
        return root;
    }
    public static void flat(TreeNode<Integer> node){
        if(node == null) return;
        flat(node.right);
        flat(node.left);
        node.right = prev;
        node.left = null;
        prev = node;
    }
    public static void preorder(TreeNode<Integer> root, ArrayList<Integer> list){
        if(root==null)return;
        list.add(root.data);
        preorder(root.left,list);
        preorder(root.right,list);
    }
}