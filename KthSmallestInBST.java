/************************************************************

    Following is the TreeNode class structure

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

	public static int kthSmallest(TreeNode<Integer> root, int k) 
	{
		//  Write your code here.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int s = q.size();
            while(s-->0){
                TreeNode n = q.poll();
                if(pq.size()<k) pq.offer((int)n.data);
                else{
                    if((int)n.data<pq.peek()){
                        pq.offer((int)n.data);
                        pq.poll();
                    }
                }
                if(n.left!=null)q.offer(n.left);
                if(n.right!=null)q.offer(n.right);
            }
        }
        if((int)pq.size()<k) return -1;
        return pq.poll();
	}

}
