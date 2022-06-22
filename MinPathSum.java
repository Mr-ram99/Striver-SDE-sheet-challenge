import java.util.*;
public class Solution {
    public static int minSumPath(int[][] grid) {
    	// Write your code here.
        int n=grid.length, m=grid[0].length;
        int [][] dp = new int[n][m];
        for(int [] a:dp) Arrays.fill(a,-1);
        return mincost(0,0,grid,dp);
    }
    public static int mincost(int i,int j, int[][]grid, int[][]dp){
        int n=grid.length, m=grid[0].length;
        if(i==n-1 && j==m-1){
            return grid[i][j];
        }
        if(dp[i][j]!=-1)return dp[i][j];
        int d=Integer.MAX_VALUE, r=Integer.MAX_VALUE;
        if(i+1<n){
            d = mincost(i+1, j,grid, dp);
        }
        if(j+1<m){
            r = mincost(i, j+1,grid, dp);
        }
        return dp[i][j] = grid[i][j]+Math.min(r,d);
    }
}