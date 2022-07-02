import java.util.*;

public class Solution {
    public static ArrayList<ArrayList<Integer>> depthFirstSearch(int v, int e, ArrayList<ArrayList<Integer>> edges) {
        // Write your code here.
        boolean [] vis = new boolean[v];
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<v;i++) adj.add(new ArrayList<>());
        int l = edges.size();
        for(int i=0;i<l;i++){
            int x = edges.get(i).get(0);
            int y = edges.get(i).get(1);
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        for(int i=0;i<v;i++){
            if(!vis[i]){
                ArrayList<Integer> list = new ArrayList<>();
                dfs(i,adj,list,vis);
                res.add(list);
            }
        }
        return res;
    }
    public static void dfs(int i, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> list, boolean [] vis){
            vis[i]=true;
            list.add(i);
            for(int n: adj.get(i)){
                if(!vis[n]){
                    dfs(n, adj, list, vis);
                }
            }
        }
    }
