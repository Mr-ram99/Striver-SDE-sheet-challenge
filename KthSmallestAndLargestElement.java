import java.util.*;
public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x = arr.get(i);
            if(pq.size()<k) pq.add(x);
            else{
                if(pq.peek()<x){
                    pq.add(x);
                    pq.remove();
                }
            }
            if(pq2.size()<k) pq2.add(x);
            else{
                 if(pq2.peek()>x){
                    pq2.add(x);
                    pq2.remove();
                }
            }
        }
        list.add(pq2.remove());
        list.add(pq.remove());
        return list;
	}
}
