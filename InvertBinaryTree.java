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
    public static TreeNode<Integer> invertBinaryTree(TreeNode<Integer> root, TreeNode<Integer> leaf) {
        if(root==null) return root;
        Stack<TreeNode<Integer>>st=new Stack<>();
        boolean f=helper(root,leaf,st);
        TreeNode<Integer> new_root=st.pop();
//         if(!st.isEmpty()) new_root=st.pop();
        TreeNode<Integer> par=new_root;
        while(!st.isEmpty()){
            TreeNode<Integer> cur=st.peek();
            st.pop();
            if(cur.left==par){
                cur.left=null;
                par.left=cur;
            }
            else{
                cur.right=cur.left;
                cur.left=null;
                par.left=cur;
            }
            par=cur;
        }
        return new_root; 
    }
    static boolean helper(TreeNode<Integer>root,TreeNode<Integer>leaf,Stack<TreeNode<Integer>>st){
        st.add(root);
//         for(TreeNode<Integer> i:st){
//             System.out.println(i.data);
//         }
        if(root.left==null && root.right==null){
            if(root.data.equals(leaf.data)){
                return true;
            }
            else{
                st.pop();
                return false;
            }
        }
        if(root.left!=null){
            if(helper(root.left,leaf,st)) return true;
        }
        if(root.right!=null){
            if(helper(root.right,leaf,st)) return true;
        }
        st.pop();
        return false;
    }
}