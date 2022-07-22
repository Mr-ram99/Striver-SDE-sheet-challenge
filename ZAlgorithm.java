public class Solution {

	public static int zAlgorithm(String s, String p, int n, int m) {
		// Write your code here
//         not Z algorithm
        int count=0;
        for(int i=0;i<n-m+1;i++){
            if(s.substring(i,i+m).equals(p)) count++;
        }
        return count;
	}

}