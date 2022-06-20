import java.util.*;
public class Solution {

    public static int chessTournament(int[] pos, int n,  int c) 
	{
        // Write your code here.   
        Arrays.sort(pos);
        int low =1;
        int high = pos[n-1]-pos[0];
        int ans = low;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isPossible(pos, mid, c)){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int [] pos, int mid,int c){
        int count=1, s=pos[0];
        for(int i=1;i<pos.length;i++){
            if(pos[i]-s>=mid){
                count++;
                s=pos[i];
            }
            if(count==c) return true;
        }
        return false;
    }

}