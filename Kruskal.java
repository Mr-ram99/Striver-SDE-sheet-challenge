import java.util.*;
class Node implements Comparator<Node>{
    int wt,u,v;
    Node(int a,int b,int c){
        wt=a;
        u=b;
        v=c;
    }
    Node(){}
    public int compare(Node n1,Node n2){
        if(n1.wt<n2.wt)
            return -1;
        else if(n1.wt>n2.wt)
            return 1;
        else return 0;
    }
}
public class Solution {
    public static int kruskalMST(int n, int m, ArrayList<ArrayList<Integer>> graph) {
        // Write your code here.
        ArrayList<Node> arr=new ArrayList<Node>();
        for(int i=0;i<m;i++){
            arr.add(new Node(graph.get(i).get(2),graph.get(i).get(0),graph.get(i).get(1)));
        }
        Collections.sort(arr,new Node());
        int parent[]=new int[n+1];
        int rank[]=new int[n+1];
        int c=0,ans=0;
        for(int i=0;i<=n;i++){
            parent[i]=i;
            rank[i]=0;
        }
        for(Node nt:arr){
            int u=findParent(nt.u,parent);
            int v=findParent(nt.v,parent);
            if(u!=v){
                union(u,v,parent,rank);
                ans+=nt.wt;
                c++;
                if(c==n-1)
                    break;
            }
        }
        return ans;
    }
    public static void union(int u,int v,int parent[],int rank[]){
                if(rank[u]>rank[v])
                    parent[v]=parent[u];
                else if(u<v)
                    parent[u]=parent[v];
                else
                {
                    parent[v]=parent[u];
                    rank[u]++;
                }
    }
    public static int findParent(int node,int parent[]){
        if(node==parent[node])
            return node;
        return parent[node]=findParent(parent[node],parent);
    }
}