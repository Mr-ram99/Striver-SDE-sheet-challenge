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

public class Solution 
{
    public static TreeNode<Integer> buildBinaryTree(ArrayList<Integer>  inorder, ArrayList<Integer>  preorder) 
    {
        //    Write your code here.
        int n = preorder.size();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) map.put(inorder.get(i),i);
        return build(preorder, 0, n-1, inorder, 0, n-1, map);
    }
    public static TreeNode build(ArrayList<Integer> pre, int ps, int pe, ArrayList<Integer> in, int is, int ie, HashMap<Integer, Integer> map){
        if(ps>pe || is>ie) return null;
        TreeNode node = new TreeNode(pre.get(ps));
        int index = map.get(pre.get(ps));
        int left = index - is;
        node.left = build(pre, ps+1, ps+left, in, is, index-1, map);
        node.right = build(pre, ps+left+1, pe, in, index+1, ie, map);
        return node;
    }
}