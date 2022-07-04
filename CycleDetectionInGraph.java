import java.util.*;
public class Solution {
    
    public static String cycleDetection(int[][] graph, int n, int m) {
        // Write your code here.
        boolean [] vis = new boolean[n+1];
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        for(int i=0;i<=n;i++) edges.add(new ArrayList<Integer>());
        for(int i=0;i<graph.length;i++){
            edges.get(graph[i][0]).add(graph[i][1]);
            edges.get(graph[i][1]).add(graph[i][0]);
        }
        for(int i=1;i<=n;i++){
            if(!vis[i]){
                if(dfs(i,-1,edges,vis))return "Yes";
            }
        }
        return "No";
    }
    public static boolean dfs(int i,int prev, ArrayList<ArrayList<Integer>> edges, boolean [] vis){
        vis[i]=true;
        int s = edges.get(i).size();
        for(int j=0;j<s;j++){
            int x = edges.get(i).get(j);
            if(vis[x] && x!=prev) return true;
            if(!vis[x]){
                vis[x]=true;
                if(dfs(x,i,edges,vis)) return true;
            }
        }
        return false;
    }
}