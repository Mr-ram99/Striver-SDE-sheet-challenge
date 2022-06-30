import java.util.*;
public class Solution {

	public static int longestIncreasingSubsequence(int arr[]) {
		//Your code goes here
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        for(int i=1;i<n;i++){
            int l=ans.size();
            if(arr[i]>ans.get(l-1)){
                ans.add(arr[i]);
            }
            else{
                int ind = Collections.binarySearch(ans, arr[i]);
                if(ind<0){
                    ind = (ind+1)*(-1);
                    ans.set(ind, arr[i]);
                }
            }
        }
        return ans.size();
	}
}