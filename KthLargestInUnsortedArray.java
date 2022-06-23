import java.util.*;
public class Solution {

	static int kthLargest(ArrayList<Integer> arr, int size, int K) {
		// Write your code here.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<K;i++){
            pq.add(arr.get(i));
        }
        for(int i=K;i<size;i++){
            int x = arr.get(i);
            if(x>pq.peek()){
                pq.poll();
                pq.add(x);
            }
        }
        return pq.poll();
	}
    
}
