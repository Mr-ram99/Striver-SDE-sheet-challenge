import java.util.*;
public class Solution {

	public static long countWaysToMakeChange(int d[], int value){
        //write your code here		
        long [][] dp = new long[d.length][value+1];
        for(long [] a:dp) Arrays.fill(a,-1);
        return count(0, d, value, dp);
	}
	public static long count(int i, int [] d, int rem, long[][]dp)
    {
        if(rem == 0){
            return 1;
        }
        if(i==d.length){
            return 0;
        }
        if(dp[i][rem]!=-1) return dp[i][rem];
        long take = 0;
        long not_take=0;
        if(rem>=d[i]){
            take = count(i,d,rem-d[i],dp);
        }
        not_take=count(i+1,d,rem,dp);
        return dp[i][rem] = take + not_take;
    }
}