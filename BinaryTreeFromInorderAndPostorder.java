/************************************************************
  
   Following is the TreeNode class structure
   
   class TreeNode<T> { 
        T data; 
        TreeNode<T> left;
        TreeNode<T> right;
  
        TreeNode(T data) { 
            this.data = data; 
            left = null; 
            right = null; 
        }
   }
    
 ************************************************************/
import java.util.*;
public class Solution {
	public static TreeNode<Integer> getTreeFromPostorderAndInorder(int[] postOrder, int[] inOrder) {
		// Write your code here.
        int n = postOrder.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) map.put(inOrder[i],i);
        return build(postOrder, 0, n-1, inOrder, 0, n-1, map);
	}

    public static TreeNode build(int[] post, int ps, int pe, int[] in, int is, int ie, HashMap<Integer, Integer> map){
        if(is>ie || ps>pe) return null;
        TreeNode node = new TreeNode(post[pe]);
        int index = map.get(post[pe]);
        int right = ie-index;
            node.right = build(post, pe-right, pe-1, in, index+1, ie, map);
            node.left = build(post, ps, pe-right-1, in, is, index-1, map);
        return node;
    }
}