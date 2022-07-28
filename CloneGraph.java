/***************************************************************************

  Class for graph node is as follows:

  class graphNode {
      public int data;
      public ArrayList<graphNode> neighbours;

      graphNode() {
          data = 0;
          neighbours = new ArrayList<graphNode>();
      }

      graphNode(int val) {
          data = val;
          neighbours = new ArrayList<graphNode>();
      }

      graphNode(int val, ArrayList<graphNode> neighbours) {
          data = val;
          this.neighbours = neighbours;
      }
    }

******************************************************************************/
import java.util.*;
public class Solution {
    public static graphNode cloneGraph(graphNode node) {
        // Write your code here.
        for(graphNode child:node.neighbours)
           cloneGraph(child);
       graphNode cloneNode=new graphNode(node.data,new ArrayList(node.neighbours));
       return cloneNode;
    }
}