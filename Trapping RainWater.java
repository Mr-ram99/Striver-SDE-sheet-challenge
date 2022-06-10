import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
        // Write your code here.
        long [] left = new long[n];
        long [] right = new long[n];
        left[0]=arr[0];
        right[n-1]=arr[n-1];
        long count=0;
        for(int i=1;i<n;i++){
            long max = (long)Math.max(left[i-1], arr[i]);
            left[i]=max;
        }
        for(int i=n-2;i>=0;i--){
            long max = (long)Math.max(right[i+1], arr[i]);
            right[i]=max;
        }
        for(int i=0;i<n;i++){
            long min = (long)Math.min(left[i], right[i]);
            if(min-arr[i]>0){
                count += min-arr[i];
            }
        }
        return count;
    }
}
