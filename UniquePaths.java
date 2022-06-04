public class Solution {
	public static int uniquePaths(int m, int n) {
		// Write your code here.
        int x = m+n-2;
        int y = Math.min(m-1,n-1);
        int res=1;
        for(int i=1;i<=y;i++,x--){
            res *= x;
            res /= i;
        }
        return res;
	}
}