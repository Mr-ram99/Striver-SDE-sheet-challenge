import java.util.*;
public class Solution {
	public static int matrixMultiplication(int[] arr , int N) {
		// Write your code here
        int [][] dp = new int[N][N];
        for(int [] a: dp) Arrays.fill(a,-1);
        return solve(arr, 1, N-1, dp);
	}
    public static int solve(int [] arr, int i, int j,int [][] dp){
        if(i>=j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int ans = Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int temp = solve(arr, i, k, dp) + solve(arr, k+1, j, dp) + arr[i-1]*arr[k]*arr[j];
            ans = Math.min(ans, temp);
        }
        return dp[i][j] = ans;
    }
}
