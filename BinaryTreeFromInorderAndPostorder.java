/************************************************************
   
   Following is the TreeNode class structure
   
   class TreeNode<T>
   { 
   public:
        T data; 
        TreeNode<T> *left;
        TreeNode<T> *right;
   
        TreeNode(T data) 
  		{ 
            this -> data = data; 
            left = NULL; 
            right = NULL; 
        }
   };
   
   
 ************************************************************/
#include <bits/stdc++.h>
map<int, int> mp;
TreeNode<int>* BT(vector<int> &postorder, int postStart, int postEnd, vector<int> &inorder, int inStart, int inEnd)
{
    if(postStart > postEnd || inStart > inEnd) return NULL;
    
    TreeNode<int> *root = new TreeNode<int>(postorder[postEnd]);
    int idx = mp[postorder[postEnd]];
    int leftNums = idx - inStart;
    
    root->left = BT(postorder, postStart, postStart+leftNums-1, inorder, inStart, idx-1);
    root->right = BT(postorder, postStart+leftNums, postEnd-1, inorder, idx+1, inEnd);
    
    return root;    
}
TreeNode<int>* getTreeFromPostorderAndInorder(vector<int>& postOrder, vector<int>& inOrder) 
{
    // Write your code here.
    for(int i = 0; i < inOrder.size(); i++)
        mp[inOrder[i]] = i;
    
    return BT(postOrder, 0, postOrder.size()-1, inOrder, 0, inOrder.size()-1);
}
