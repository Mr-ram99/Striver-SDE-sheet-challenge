
import java.util.*;
public class Solution {
    static int dp[][];
    public static int cutLogs(int k, int n) {
        //Write your code here 
        dp = new int[101][10001];
        for(int [] a: dp) Arrays.fill(a,-1);
        return func(k,n);
    }
    public static int func(int e , int f){
        if(f==1 || f==0) return f;
        if(e==1)
            return f;
        if(dp[e][f]!=-1)
           return dp[e][f];
       int ans=Integer.MAX_VALUE ; 
       int l=1;
       int h=f;
       while(l<=h)
       {
           int mid = (l + (h-l)/2);
           int go_below=func(e-1 , mid-1);
           int go_above=func(e , f-mid);
           int temp = 1+Math.max(go_above,go_below);
           if(go_above>go_below)
               l=mid+1;
           else
               h=mid-1;
           ans = Math.min(ans , temp);
   }

   return dp[e][f]=ans;

    }
}
