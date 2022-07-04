import java.util.*;

public class Solution 
{
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> graph, int n, int e) 
    {
        // Write your code here
        boolean [] vis = new boolean[n];
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        for(int i=0;i<n;i++) edges.add(new ArrayList<Integer>());
        for(int i=0;i<e;i++){
            edges.get(graph.get(i).get(0)).add(graph.get(i).get(1));
        }
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,edges,vis,stk);
            }
        }
        while(!stk.isEmpty()) {
            ans.add(stk.peek());
            stk.pop();
        }
        return ans;
    }
    public static void dfs(int i, ArrayList<ArrayList<Integer>> edges, boolean [] vis, Stack<Integer> stk){
        vis[i]=true;
        for(int x: edges.get(i)){
            if(!vis[x])
            dfs(x,edges,vis,stk);
        }
        stk.push(i);
    }
}
