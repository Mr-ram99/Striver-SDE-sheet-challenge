import java.util.*;

public class Solution {
    public static int maxIncreasingDumbbellsSum(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int [][] dp = new int[n][n+1];
        for(int [] a: dp)
            Arrays.fill(a,-1);
        return lis(0, arr,-1, dp);
    }
    public static int lis(int i, ArrayList<Integer> arr, int prev, int [][] dp){
        if(i==arr.size()){
            return 0;
        }
        if(dp[i][prev+1]!=-1) return dp[i][prev+1];
        int notpick = 0 + lis(i+1, arr,prev, dp);
        int pick = 0;
        if(prev == -1 || arr.get(i)>arr.get(prev)){
            pick = arr.get(i) + lis(i+1, arr, i, dp);
        }
        return dp[i][prev+1] = Math.max(pick, notpick);
    }

    
}