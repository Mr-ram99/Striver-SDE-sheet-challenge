public class Solution {
    public static long ayushGivesNinjatest(int n, int m, int[] time) {
        // Write your code here.
        long sum = 0, min= time[0];
        for(int num: time){
            sum += (long)num;
            if(num<min) min = num;
        }
        long low = min, high = sum, ans=sum;
        while(low<=high){
            long mid = low + (high-low)/2;
            if(isPossible(time, mid, n)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int [] time, long mid, int n){
        long sum=0;
        int count=1;
        for(int i=0;i<time.length;i++){
            if(time[i]>mid) return false;
            if(sum+time[i]>mid){
                count++;
                sum = time[i];
            }
            else{
                sum += time[i];
            }
        }
        return count<=n;
    }
}