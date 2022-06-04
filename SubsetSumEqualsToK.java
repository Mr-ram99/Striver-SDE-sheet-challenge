public class Solution {
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
        int [][] dp = new int[n][k+1];
        for(int [] a:dp)
        {
            for(int i=0;i<a.length;i++){
            a[i]=-1;
            }
        }
        return rec(0,k,arr,dp);
    }
    public static boolean rec(int i, int k, int [] arr, int [][] dp){
        int n=arr.length;
        if(k==0) return true;
        if(i>=n || k<0) return false;
        if(dp[i][k]!=-1)return dp[i][k]==0?false:true;
        boolean taken = rec(i+1, k-arr[i], arr,dp);
        boolean nottaken = rec(i+1,k,arr,dp);
        dp[i][k] = taken || nottaken ? 1:0;
        return taken || nottaken;
    }
}
