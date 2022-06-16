import java.util.*;
public class Solution 
{
    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) 
	{
        // Write your code here.
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> li = new ArrayList<>();
        solve(0,arr,k,list,li);
        return list;
    }
    public static void solve(int ind, ArrayList<Integer> arr, int target, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> li){
        if(ind==arr.size()){
            if(target == 0 && !li.isEmpty()){
            list.add(new ArrayList(li));
            }
            return ;
        }
        int x = arr.get(ind);
        solve(ind+1,arr,target,list,new ArrayList<>(li));
        li.add(x);
        solve(ind+1,arr,target-x,list,new ArrayList<>(li));
        
    }
}