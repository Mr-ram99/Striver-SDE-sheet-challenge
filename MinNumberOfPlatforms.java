import java.util.*;
public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
    
        Arrays.sort(at);
        Arrays.sort(dt);
        int i=1, j=0, p=1, max=1;
        while(i<n && j<n){
            if(at[i]<=dt[j]){
                p++;
                i++;
            }
            else{
                p--;
                j++;
            }
            max = Math.max(max, p);
        }
        return max;
    }
}