public class Solution {

  public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
    //Your code goes here
      Queue<BinaryTreeNode> q = new LinkedList<>();
      ArrayList<Integer> list = new ArrayList<>();
      if(root==null)
          return list;
      q.offer(root);
      while(!q.isEmpty()){
          int size = q.size();
          while(size-->0){
              BinaryTreeNode node = q.remove();
              list.add(node.val);
              if(node.left!=null)
                  q.offer(node.left);
              if(node.right!=null)
                  q.offer(node.right);
          }
      }
      return list;
  }

}