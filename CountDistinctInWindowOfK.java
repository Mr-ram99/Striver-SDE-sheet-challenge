import java.util.*;

public class Solution {

	public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {

		// Write your code here
        int n = arr.size();
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<k;i++){
            int x = arr.get(i);
            map.putIfAbsent(x,0);
            map.put(x, map.get(x)+1);
        }
        ans.add(map.size());
        for(int i=k,j=0;i<n;i++,j++){
            int x = arr.get(i);
            int y = arr.get(j);
            map.putIfAbsent(x,0);
            map.put(x, map.get(x)+1);
            map.put(y, map.get(y)-1);
            if(map.get(y)==0) map.remove(y);
            ans.add(map.size());
        }
        return ans;
	}
}
