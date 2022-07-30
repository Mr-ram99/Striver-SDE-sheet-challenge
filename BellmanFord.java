import java.util.*;
public class Solution {
    static int bellmonFord(int n, int m, int src, int dest, ArrayList<ArrayList<Integer>> edges) {
      // Write your code here.
        int[] distance = new int[n+1];
        Arrays.fill(distance, 1000000000);
        
        distance[src] = 0;
        
        for(int i = 0; i < n-1; i++){
            for(ArrayList<Integer> list : edges){
                int u = list.get(0);
                int v = list.get(1);
                int w = list.get(2);
                
                int weight = distance[u] == 1000000000 ? 1000000000: w + distance[u];
                distance[v] = Math.min(distance[v], weight);
            }
        }
        return distance[dest];
    }
    
}