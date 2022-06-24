/*   
    Following is the Binary Tree node structure for referance:

    class TreeNode
    {
        int data;
        TreeNode left, right;
    
        public TreeNode(int item)
        {
            data = item;
            left = right = null;
        }
    }
*/
import java.util.*;
public class Solution {
    public static ArrayList<Integer> pathInATree(TreeNode root, int x) {
        // Write your code here..
        ArrayList<Integer> list = new ArrayList<>();
        path(root, list, x);
        return list;
    }
    public static boolean path(TreeNode root, ArrayList<Integer> list, int x){
        if(root==null) return false;
        if(root.data == x) {
            list.add(root.data);
            return true;
        }
        list.add(root.data);
        if(path(root.left, list, x) || path(root.right, list, x)) return true;
        list.remove(list.size()-1);
        return false;
    }
}