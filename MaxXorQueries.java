import java.util.*;

public class Solution {
    public static ArrayList<Integer> maxXorQueries(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> q) {
        // Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<q.size();i++){
            int x = q.get(i).get(0);
            int y = q.get(i).get(1);
            int max=0;
            for(int j=0;j<arr.size();j++){
                if(arr.get(j)<=y){
                    max = Math.max(max, x^arr.get(j));
                }
            }
            ans.add(max==0?-1:max);
        }
        return ans;
    }
}