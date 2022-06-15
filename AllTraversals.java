/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/
import java.util.*;

 class pair{
        BinaryTreeNode node;
        int val;
        pair(BinaryTreeNode n, int i){
            node = n;
            val = i;
        }
    }

public class Solution {
   
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        // Write your code here.
        List<List<Integer>> list = new ArrayList<>();
        if(root==null) return list;
        Stack<pair> stk = new Stack<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        stk.push(new pair(root,1));
        while(!stk.isEmpty()){
            pair p = stk.pop();
            if(p.val==1){
                pre.add((int)p.node.data);
                p.val++;
                stk.push(p);
                if(p.node.left!=null){
                    stk.push(new pair(p.node.left,1));
                }
            }
            else if(p.val==2){
                in.add((int)p.node.data);
                p.val++;
                stk.push(p);
                if(p.node.right!=null){
                    stk.push(new pair(p.node.right,1));
                }
            }
            else{
                post.add((int)p.node.data);
            }
        }
        
        list.add(new ArrayList(in));
        list.add(new ArrayList(pre));
        list.add(new ArrayList(post));
        return list;
    }
}
