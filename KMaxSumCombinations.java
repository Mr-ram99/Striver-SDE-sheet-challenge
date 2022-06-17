import java.util.*;
public class Solution{
	public static ArrayList<Integer> kMaxSumCombination(ArrayList<Integer> a, ArrayList<Integer> b, int n, int k){
		// Write your code here.
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            int x = a.get(i);
            for(int j=0;j<n;j++){
                int y = x + b.get(j);
                if(pq.size()<k) pq.add(y);
                else{
                    if(pq.peek()<y){
                        pq.remove();
                        pq.add(y);
                    }
                }
            }
        }
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<k;i++){
            li.add(0,pq.peek());
            pq.remove();
        }
        return li;
	}
}