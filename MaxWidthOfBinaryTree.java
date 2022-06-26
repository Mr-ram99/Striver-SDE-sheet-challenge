/************************************************************

    Following is the TreeNode class structure

    class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	   }
	}


************************************************************/
import java.util.*;
public class Solution {
	public static int getMaxWidth(TreeNode root) {
		// Write your code here.
        Queue<TreeNode> q= new LinkedList<>();
        if(root == null) return 0;
        q.offer(root);
        int max=0;
        while(!q.isEmpty()){
            int s = q.size();
            max  = Math.max(max, s);
            while(s-->0){
                TreeNode node = q.poll();
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
        }
        return max;
	}
}