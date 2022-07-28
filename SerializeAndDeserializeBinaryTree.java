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
   static String splitter = ",";
   static String n = "X";
   
   public static String serializeTree(TreeNode<Integer> root) {
       StringBuilder sb = new StringBuilder();
       buildString(root, sb);
       return sb.toString();
   }
   
   private static void buildString(TreeNode<Integer> root, StringBuilder sb) {
       if(root == null) sb.append(n).append(splitter);
       else {
           sb.append(root.data).append(splitter);
           buildString(root.left, sb);
           buildString(root.right, sb);
       }
   }
   
   public static TreeNode<Integer> deserializeTree(String str) {
       Deque<String> node = new LinkedList<>();
       node.addAll(Arrays.asList(str.split(splitter)));
       return buildTree(node);
   }
   
   private static TreeNode<Integer> buildTree(Deque<String> node) {
       String val = node.remove();
       if(val.equals(n)) return null;
       else {
           TreeNode<Integer> nodes = new TreeNode(Integer.valueOf(val));
           nodes.left = buildTree(node);
           nodes.right = buildTree(node);
           
           return nodes;
       }
   }
}
