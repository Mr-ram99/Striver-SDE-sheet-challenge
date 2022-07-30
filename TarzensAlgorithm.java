import java.util.*;
public class Solution {
    public static void dfs(int node,int vis[],ArrayList<ArrayList<Integer>> adj,Stack<Integer> st){
        vis[node]=1;
        for(Integer it: adj.get(node)){
            if(vis[it]==0){
                dfs(it,vis,adj,st);
            }
        }
        st.push(node);
    }
    public static List<List<Integer>> stronglyConnectedComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<Integer>());
        for(int i=0;i<edges.length;i++)
            adj.get(edges[i][0]).add(edges[i][1]);
        Stack<Integer> st=new Stack<Integer>();
        //Topo sort
        int vis[]=new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(i,vis,adj,st);
            }
        }
        ArrayList<ArrayList<Integer>> transpose=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)
            transpose.add(new ArrayList<Integer>());
        for(int i=0;i<edges.length;i++)
            transpose.get(edges[i][1]).add(edges[i][0]);
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        //Run DFS according to the topological sort received
        int vis2[]=new int[n];
        Stack<Integer> st2=new Stack<Integer>();
        while(st.size()>0){
            int node=st.pop();
            if(vis2[node]==0){
                dfs(node,vis2,transpose,st2);
                ArrayList<Integer> temp=new ArrayList<Integer>();
                while(st2.size()>0){
                    temp.add(st2.pop());
                }
                ans.add(temp);
            }
        }
        return ans;
    }
}