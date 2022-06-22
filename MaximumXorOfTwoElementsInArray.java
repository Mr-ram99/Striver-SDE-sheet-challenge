public class Solution {

    public static int maximumXor(int[] A) {
        
        // Write your Code here
        int n= A.length, max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                max = Math.max(max, (A[i]^A[j]));
            }
        }
        return max;
    }
}