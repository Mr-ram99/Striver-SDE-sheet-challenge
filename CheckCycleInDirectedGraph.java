import java.util.ArrayList;
public class Solution {
  public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> edges) {
    // Write your code here.
      ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
      boolean [] vis = new boolean[n+1];
      boolean [] dfsvis = new boolean[n+1];
      for(int i=0;i<=n;i++){
          adj.add(new ArrayList<Integer>());
      }
      for(int i=0;i<edges.size();i++){
          adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
      }
      for(int i=1;i<=n;i++){
          if(!vis[i]){
              if(dfs(i,adj,vis,dfsvis)) return true;
          }
      }
      return false;
  }
   public static boolean dfs(int i, ArrayList<ArrayList<Integer>> adj, boolean [] vis, boolean [] dfsvis){
       vis[i]=true;
       dfsvis[i]=true;
       for(int n: adj.get(i)){
           if(!vis[n]){
               if(dfs(n,adj,vis,dfsvis)) return true;
           }
           else if(dfsvis[n]) return true;
       }
       dfsvis[i]=false;
       return false;
   }
}