import java.util.*;
public class Solution {
	
	public static ArrayList < Integer > dijkstra(ArrayList< ArrayList < Integer > > vec, int v, int e, int s){
		// Write your code here.
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Pair>());
        }
        for(int i=0;i<vec.size();i++){
            adj.get(vec.get(i).get(0)).add(new Pair(vec.get(i).get(1), vec.get(i).get(2)));
            adj.get(vec.get(i).get(1)).add(new Pair(vec.get(i).get(0), vec.get(i).get(2)));
        }
        int [] ans = new int[v];
        Arrays.fill(ans, Integer.MAX_VALUE);
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.dist-b.dist);
        
        ans[s]=0;
        pq.add(new Pair(s,0));
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int n1 = p.node;
            int d1 = p.dist;
            for(Pair x: adj.get(n1)){
                int n2 = x.node;
                int d2 = x.dist;
                if(d1+d2<ans[n2]){
                    pq.offer(new Pair(n2, d1+d2));
                    ans[n2]=d1+d2;
                }
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i: ans) res.add(i);
        return res;
        
	}
    
}
class Pair{
    int node;
    int dist;
    Pair(int n, int d){
        node = n;
        dist = d;
    }
}