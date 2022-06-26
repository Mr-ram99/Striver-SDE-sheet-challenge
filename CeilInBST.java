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
public class Solution {

    public  static int findCeil(TreeNode<Integer> node, int x) {

        // Write your code here
        ArrayList<Integer> list = new ArrayList<>();
        inorder(node, list);
        for(int i=0;i<list.size();i++){
            if(list.get(i)>=x){
                return list.get(i);
            }
        }
        return -1;
    }
     public static void inorder(TreeNode<Integer> root, ArrayList<Integer> list){
        if(root == null)return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);

    }
}
