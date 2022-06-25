/*************************************************************

    Following is the Binary Tree node structure

    class BinaryTreeNode < Integer > {
        int data;
        BinaryTreeNode < Integer > left;
        BinaryTreeNode < Integer > right;

    public BinaryTreeNode(int data) {
            this.data = data;
        }
    }

*************************************************************/

public class Solution {
    public static void changeTree(BinaryTreeNode < Integer > root) {
        // Write your code here.
        if(root==null)return ;
        int sum=0;
        if(root.left!=null) sum+=root.left.data;
        if(root.right!=null) sum+=root.right.data;
        if(sum<root.data) {
            if(root.left!=null) root.left.data = root.data;
            if(root.right!=null) root.right.data = root.data;
        }
        else if(sum>root.data){
            root.data = sum;
        }
        changeTree(root.left);
        changeTree(root.right);
        sum=0;
        if(root.left!=null) sum += root.left.data;
        if(root.right!=null) sum += root.right.data;
        if(root.left!=null || root.right!=null) root.data = sum;
    }
}