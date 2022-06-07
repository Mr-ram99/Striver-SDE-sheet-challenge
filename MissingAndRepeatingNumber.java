import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int c;
        for(int i=0;i<n;i++){
            int x = arr.get(i);
            c = x-1;
            int y = arr.get(c);
            if(y!=x){
                int temp = y;
                arr.set(c, x);
                arr.set(i, temp);
                i--;
            }
        }
        for(int i=0;i<n;i++){
            int x = arr.get(i);
            if(x!=i+1){
                return new int[]{i+1, x};
            }
        }
        return new int[]{-1,-1};
    }
}