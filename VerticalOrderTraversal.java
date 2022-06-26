/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

import java.util.*;
class Pair{
    TreeNode node;
    int col;
    Pair(TreeNode n, int j){
        node = n;
        col = j;
    }
}
public class Solution 
{
    public static ArrayList<Integer> verticalOrderTraversal(TreeNode<Integer> root) 
    {
        //    Write your code here.
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int s = q.size();
            while(s-->0){
                Pair p = q.poll();
                TreeNode node = p.node;
                int col = p.col;
                map.putIfAbsent(col, new ArrayList<Integer>());
                map.get(col).add((int)node.data);
                if(node.left!=null) q.offer(new Pair(node.left,col-1));
                if(node.right!=null) q.offer(new Pair(node.right,col+1));
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(ArrayList<Integer> li : map.values()){
            for(int i=0;i<li.size();i++){
                res.add(li.get(i));
            }
        }
        return res;
    }
}
