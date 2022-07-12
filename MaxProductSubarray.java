import java.util.ArrayList;

public class Solution {
	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		// Write your code here.
        int min=arr.get(0), max=min, ans=min;
        for(int i=1;i<n;i++){
            int x = arr.get(i);
            if(x<0){
                int temp = max;
                max = min;
                min = temp;
            }
            min = Math.min(x, min*x);
            max = Math.max(x, max*x);
            ans = Math.max(ans, max);
        }
        return ans;
	}
}