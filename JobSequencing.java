import java.util.*;
public class Solution
{
    public static int jobScheduling(int[][] jobs)
    {
        // Write your code here
        int n = jobs.length;
        Arrays.sort(jobs, (a,b)->b[1]-a[1]);
        int max=jobs[0][1];
        for(int i=0;i<n;i++){
            max= Math.max(max, jobs[i][0]);
        }
        int profit=0, x=0;
        boolean [] arr = new boolean[max+1];
        for(int i=0;i<n;i++){
            int p = jobs[i][1];
            int d = jobs[i][0];
            while(d>0 && arr[d]){
                d--;
            }
            if(d>0){
                profit += p;
                arr[d] = true;
            } 
        }
        return profit;
    }
}
