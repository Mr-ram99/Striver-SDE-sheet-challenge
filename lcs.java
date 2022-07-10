import java.util.*;
public class Solution {

	public static int lcs(String s, String t) {
		//Your code goes here
        int n1= s.length(), n2 = t.length();
        int [][] dp  = new int[n1+1][n2+1];
        for(int i=0;i<=s.length();i++){
            for(int j=0;j<=t.length();j++){
                if(i==0 || j==0) dp[i][j]=0;
                else{
                    if(s.charAt(i-1)==t.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1]+1;
                    }
                    else{
                        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                    }
                }
            }
        }
        return dp[n1][n2];
        
//         return helper(0,0,s,t,dp);
    }
    public static int helper(int i, int j, String s, String t, int [][] dp){
    if(i==s.length() || j==t.length()) return 0;
    int a=0, b=0;
    if(s.charAt(i)==t.charAt(j)){
    a = 1 + helper(i+1, j+1, s, t, dp);
    }
    else{
    a = helper(i+1, j, s, t, dp);
    b = helper(i, j+1, s, t, dp);
    }
    return dp[i][j] = Math.max(a,b);
    }

}