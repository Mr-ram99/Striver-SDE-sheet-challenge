/*
    Definition of Node class for reference

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

*/
import java.util.*;
public class Solution {

    static class BSTIterator{
        ArrayList<Integer> list ;
        int curr;
        BSTIterator(TreeNode<Integer> root){
            // Write your code here
            curr=0;
            list = new ArrayList<>();
            inorder(root, list);
        }
        
        int next(){
            // Write your code here
            if(curr<list.size()) {
                int x=curr;
                curr++;
                return list.get(x);
            }
            return -1;
            
        }

        boolean hasNext(){
            // Write your code here
            return curr<list.size();
        }
    }
    public static void inorder(TreeNode<Integer> root, ArrayList<Integer> list){
        if(root==null)return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
}

/*
    Your BSTIterator object will be instantiated and called as such:
    BSTIterator iterator = new BSTIterator(root);
    while(iterator.hasNext())
    {
       print(iterator.next()+" ");
    }
*/
