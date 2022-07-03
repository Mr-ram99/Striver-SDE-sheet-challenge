import java.util.*;

public class Solution {

    public static boolean isGraphBirpatite(ArrayList<ArrayList<Integer>> edges) {

        // Write your code here
        int v = edges.size();
        int clr;
        int [] vis = new int[v];
        Arrays.fill(vis,-1);
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<v;i++){
            if(vis[i]==-1){
                q.offer(new Pair(i,0));
                vis[i]=0;
                while(!q.isEmpty()){
                    Pair p = q.poll();
                    clr = p.clr==0?1:0;
                    for(int j=0;j<v;j++){
                        if(edges.get(p.val).get(j)==1){
                            if(vis[j]==-1){
                                q.offer(new Pair(j,clr));
                                vis[j]=clr;
                            }
                            else{
                                if((clr==1 && vis[j]==0) || (clr==0 && vis[j]==1)) return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
class Pair{
    int val;
    int clr;
    Pair(int a, int b){
        val = a;
        clr = b;
    }
}