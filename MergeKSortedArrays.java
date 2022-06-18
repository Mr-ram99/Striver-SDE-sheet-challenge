import java.util.ArrayList;

public class Solution 
{
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		// Write your code here.
        ArrayList<Integer> res = kArrays.get(0);
        for(int i=1;i<k;i++){
            res = merge(res, kArrays.get(i));
        }
        return res;
	}
    public static ArrayList<Integer> merge(ArrayList<Integer> l1, ArrayList<Integer> l2){
        int i=0,j=0, n1 = l1.size(), n2=l2.size();
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<n1 && j<n2){
            int x = l1.get(i);
            int y = l2.get(j);
            if(x<y){
                ans.add(x);
                i++;
            }
            else{
                ans.add(y);
                j++;
            }
        }
        while(i<n1){
            ans.add(l1.get(i));
            i++;
        }
        while(j<n2){
            ans.add(l2.get(j));
            j++;
        }
        return ans;
    }
}
