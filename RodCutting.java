import java.util.*;
public class Solution {
	public static int cutRod(int price[], int n) {
		// Write your code here.
        int [][] dp = new int[n][n+1];
        for(int [] a: dp){
            Arrays.fill(a,-1);
        }
        return cut(1,price,dp,n);
	}
    public static int cut(int i, int [] price, int [][] dp, int rem){
        if(i==price.length || rem == 0)return 0;
        if(dp[i-1][rem]!=-1) return dp[i-1][rem];
        int nottake = cut(i+1, price,dp,rem);
        int take=0;
        if(rem>=i){
            take = price[i-1] + cut(i,price,dp,rem-i);
        }
        return dp[i][rem] = Math.max(take,nottake);
    }
}