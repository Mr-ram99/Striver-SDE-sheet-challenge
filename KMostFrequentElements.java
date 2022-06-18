import java.util.*;
public class Solution {

	public static int[] KMostFrequent(int n, int k, int[] arr) {
		// Write your code here.
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a,b)->b.getValue().compareTo(a.getValue()));
        int [] ans= new int[k];
        for(int i=0;i<k && i<n;i++){
            ans[i] = list.get(i).getKey();
        }
        Arrays.sort(ans);
        return ans;
	}

}
