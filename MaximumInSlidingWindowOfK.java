
import java.util.*;

public class Solution 
{

	public static ArrayList<Integer> getMaximumOfSubarrays(ArrayList<Integer> nums, int k) 
	{
		//	  Write your code here.
        int n=nums.size();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<k;i++){
            pq.add(nums.get(i));
        }
        list.add(pq.peek());
        for(int i=k;i<n;i++){
            pq.remove(nums.get(i-k));
            pq.add(nums.get(i));
            list.add(pq.peek());
        }
        return list;
	}
}