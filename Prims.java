import java.util.*;

public class Solution 
{
    public static ArrayList<ArrayList<Integer>> calculatePrimsMST(int n, int m, ArrayList<ArrayList<Integer>> g)
    {
        // Write your code here.
        int[]key=new int[n+1];
        boolean[]mst=new boolean[n+1];
        int[]parent=new int[n+1];
        Arrays.fill(parent,-1);
        Arrays.fill(key,Integer.MAX_VALUE);
        key[0]=Integer.MIN_VALUE;
        key[1]=0;
        //Adjancency List
         ArrayList<ArrayList<Node>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<g.size();i++){
            int x=g.get(i).get(0);
            int y=g.get(i).get(1);
            int d=g.get(i).get(2);
           adj.get(x).add(new Node(y,d));
           adj.get(y).add(new Node(x,d));
        }
        //Working
        PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->a.wt-b.wt);
        pq.add(new Node(1,0));
        while(!pq.isEmpty()){
            primMst(adj,key,mst,parent,n,pq);
        }
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
       
        for(int i=2;i<parent.length;i++){
            
            ArrayList<Integer> res=new ArrayList<>();
           res.add(parent[i]); 
           res.add(i);
           res.add(key[i]);
            ans.add(res);
            
        }
        return ans;
       
    }
    public static void primMst(ArrayList<ArrayList<Node>>adj,int[]key,boolean[]mst,int[]parent,int n,PriorityQueue<Node> pq){
            int minIndex=pq.poll().v;
        mst[minIndex]=true;
        for(int i=0;i<adj.get(minIndex).size();i++){
           Node next=adj.get(minIndex).get(i);
            if(!mst[next.v] && key[next.v]>next.wt){
                key[next.v]=next.wt;
                pq.add(new Node(next.v,key[next.v]));
                parent[next.v]=minIndex;
                }
        }
        
    }
}
class Node{
   int wt;
   int v;
    Node(int v,int d){
        this.v=v;
        this.wt=d;
    }
}