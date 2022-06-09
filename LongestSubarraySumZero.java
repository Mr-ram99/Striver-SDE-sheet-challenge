import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
        int sum=0, max=0, n=arr.size();
        HashMap<Integer, Integer> map =new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum += arr.get(i);
            if(map.containsKey(sum)){
                max = Math.max((i-map.get(sum)), max);
            }
            else{
                map.put(sum,i);
            }
        }
        return max;
	}
}