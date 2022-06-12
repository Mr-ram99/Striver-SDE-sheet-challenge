import java.util.*;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
        int s=arr.get(0), count=1;
        for(int i=0;i<n;i++){
            int x = arr.get(i);
            if(x!=s){
                count++;
                s = x;
            }
        }
        return count;
	}
}