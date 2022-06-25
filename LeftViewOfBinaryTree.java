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

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        //    Write your code here.
        ArrayList<Integer> list = new ArrayList<>();
        leftview(root, list, 0);
        return list;
    }
    public static void leftview(TreeNode<Integer> node, ArrayList<Integer> list, int depth){
        if(node == null) return ;
        if(list.size() == depth){
            list.add(node.data);
        }
        leftview(node.left, list, depth+1);
        leftview(node.right, list, depth+1);
    }
}




