import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
		// Write your code here.
        int row=m, col=n;
        int i=0, j=row-1,mid=i+(j-i)/2;
        while(i<=j){
            mid = i + (j-i)/2;
            int x = mat.get(mid).get(col-1);
            if(x==target) return true;
            else if(x<target) i = mid+1;
            else j=mid-1;
        }
        int res_row = mid;
        i=0;j=col-1;
        while(i<=j){
            mid = i + (j-i)/2;
            int x = mat.get(res_row).get(mid);
            if(x==target) return true;
            else if(x<target) i = mid+1;
            else j=mid-1;
        }
        return false;
	}
}
