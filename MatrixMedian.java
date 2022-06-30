import java.util.*;

public class Solution
{
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		// Write your code here.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n=matrix.size(), m=matrix.get(0).size();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int x = matrix.get(i).get(j);
                if(pq.size()<(n*m+1)/2) pq.add(x);
                else{
                    if(x>pq.peek()){
                        pq.poll();
                        pq.add(x);
                    }
                }
            }
        }
        return pq.peek();
	}
}