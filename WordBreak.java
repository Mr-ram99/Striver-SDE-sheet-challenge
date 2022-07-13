import java.util.*;
public class Solution {
    public static Boolean wordBreak(String[] arr, int n, String target) {
        // Write your code here.
        HashSet<String> set = new HashSet<>();
        for(String s: arr) set.add(s);
        if(arr.length==0) return false;
        int m=target.length();
        boolean [] dp = new boolean[m+1];
        dp[0]=true;
        for(int i=1;i<=m;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(dp[j])
                {
                    String word = target.substring(j,i);
                    if(set.contains(word)){
                        dp[i]=true;
                        break;
                    }
                }
            }
        }
        return dp[m];
    }
}