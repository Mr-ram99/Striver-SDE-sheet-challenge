import java.util.*;

public class Solution {
    public static int[] findMedian(int[] arr, int n) {
        Queue<Integer> minPQ = new PriorityQueue<Integer>(); 
        Queue<Integer> maxPQ = new PriorityQueue<Integer>(Collections.reverseOrder());
        ArrayList<Integer> medians = new ArrayList<>(); 
        
        for(int val : arr){
            if(maxPQ.isEmpty() || maxPQ.peek()>= val) 
                maxPQ.offer(val);
            else
                minPQ.offer(val);
            
            if(maxPQ.size()>minPQ.size()+1) 
                minPQ.offer(maxPQ.poll());
            
            else if(maxPQ.size() < minPQ.size()) 
                maxPQ.offer(minPQ.poll());
            
            
            if(maxPQ.size() == minPQ.size())
                medians.add((maxPQ.peek() + minPQ.peek())/2);
            else
                medians.add(maxPQ.peek());
                
        }
        
        int ans[] = new int[medians.size()];
        for(int i=0;i<medians.size();i++){
            ans[i] = medians.get(i);
        }
        return ans;
    }
}
