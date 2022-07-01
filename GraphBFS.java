import java.util.*;
public class Solution {
	public static ArrayList<Integer> BFS(int vertex, int edges[][]){
		// WRITE YOUR CODE HERE
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean [] vis = new boolean[vertex];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=vertex;i++) adj.add(new ArrayList<Integer>());
        for(int i=0;i<edges[0].length;i++){
            adj.get(edges[0][i]).add(edges[1][i]);
            adj.get(edges[1][i]).add(edges[0][i]);
        }
        for(int i=0;i<vertex;i++){
            Collections.sort(adj.get(i));
        }
        for(int i=0;i<vertex;i++){
            if(!vis[i]){
                q.offer(i);
                vis[i]=true;
                while(!q.isEmpty()){
                    int node = q.poll();
                    ans.add(node);
                    for(int n: adj.get(node)){
                        if(!vis[n]){
                            vis[n]=true;
                            q.offer(n);
                        }
                    }
                }
            }
        }
        return ans;
	}
}

