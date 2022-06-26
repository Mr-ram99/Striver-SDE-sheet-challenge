import java.util.*;
public class Kthlargest {
    PriorityQueue<Integer> pq;
    int k;
    Kthlargest(int K, int[] arr) {
        // Write your code here.
        k = K;
        pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            if(pq.size()<k) pq.offer(arr[i]);
            else{
                if(arr[i]>=pq.peek()) {
                    pq.offer(arr[i]);
                    pq.poll();
                }
            }
        }
    }

    void add(int num) {
        // Write your code here.
        if(pq.size()<k) pq.offer(num);
        else{
            if(num>=pq.peek()) {
                pq.offer(num);
                pq.poll();
            }
        }
    }

    int getKthLargest() {
        // Write your code here.
        return pq.peek();
    }
}
