import java.util.*;

public class Solution {
	public static int maxProfit(ArrayList<Integer> values, ArrayList<Integer> weights, int n, int w) {
		// Write your code here.
        int [][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=values.get(i);
            arr[i][1]=weights.get(i);
        }
        int [][] dp = new int[n][w+1];
        for(int [] a:dp){
            Arrays.fill(a,-1);
        }
        return maxprofit(0, arr, dp, w);
    }
    public static int maxprofit(int i, int [][] arr, int [][] dp, int w){
        if(i==arr.length  || w==0) return 0;
        if(dp[i][w]!=-1) return dp[i][w];
        int pick =0;
        int notpick = maxprofit(i+1, arr,dp,w);
        if(w-arr[i][1]>=0){
            pick= arr[i][0]+maxprofit(i+1,arr,dp,w-arr[i][1]);
        }
        return dp[i][w]=Math.max(pick, notpick);
    }
}