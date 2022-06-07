import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
        long sum=0, max = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum<arr[i]){
                sum = arr[i];
            }
            max = Math.max(max, sum);
        }
        return max;
	}

}
