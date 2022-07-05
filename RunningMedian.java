
import java.util.Comparator;
import java.util.*;
public class Solution {

	public static void findMedian(int arr[])  {
        
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        int n=arr.length;
        PriorityQueue<Integer> pq_max = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq_min = new PriorityQueue<>();
        int [] ans = new int[n];
        for(int i=0;i<n;i++){
            if(!pq_min.isEmpty() && pq_min.peek()<arr[i]){
                pq_min.add(arr[i]);
            }
            else
            pq_max.add(arr[i]);
            if(pq_max.size()>pq_min.size()+1){
                pq_min.add(pq_max.peek());
                pq_max.poll();
            }
            else if(pq_min.size()>pq_max.size()+1){
                pq_max.add(pq_min.peek());
                pq_min.poll();
            }
            if(pq_max.size()>pq_min.size()){
                ans[i]=pq_max.peek();
            }
            else if(pq_min.size()>pq_max.size()){
                ans[i]=pq_min.peek();
            }
            else{
                ans[i]=(pq_min.peek()+pq_max.peek())/2;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }


}