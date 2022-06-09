import java.util.* ;
import java.io.*; 
public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr) set.add(num);
        int max = 1;
        for(int i=0;i<N;i++){
            if(set.contains(arr[i]+1) && !set.contains(arr[i]-1)){
                int num = arr[i], count=1;
                while(set.contains(num+1)){
                    count++;
                    num++;
                }
                if(count>max) max = count;
            }
        }
        return max;
    }
}