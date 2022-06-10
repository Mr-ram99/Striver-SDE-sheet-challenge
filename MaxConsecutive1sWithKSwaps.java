import java.util.ArrayList;

public class Solution {
	public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
		// Write your code here.
        int count=0,j=-1,i=0,max=0;
        for(i=0;i<n;i++){
            if(arr.get(i)==0) count++;
            while(count>k){
                j++;
                if(arr.get(j)==0) count--;
            }
            
            max = Math.max(max,i-j);
        }
        return max;
	}
}