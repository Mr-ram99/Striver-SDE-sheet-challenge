/****************************************************************

    Following is the class structure of the TreeNode class:

    class TreeNode<T> {
        public T data;
        public TreeNode<T> left;
        public TreeNode<T> right;

        TreeNode(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }


*****************************************************************/

import java.util.ArrayList;

public class Solution {
    public static TreeNode<Integer> sortedArrToBST(ArrayList<Integer> arr, int n) {
        // Write your code here.
        return bst(0,n-1,arr);
    }
    public static TreeNode<Integer> bst(int s, int e, ArrayList<Integer> arr){
        if(s>e) return null;
        int mid = (e+s)/2;
        TreeNode<Integer> root = new TreeNode<Integer>(arr.get(mid));
        root.left = bst(0,mid-1,arr);
        root.right = bst(mid+1,e,arr);
        return root;
    }
}
