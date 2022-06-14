import java.util.*;

public class Solution 
{
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target)
    {
        //    Write your code here.
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> li = new ArrayList<>();
        comb(0,arr,li,list,target);
        return list;        
    }
    public static void comb(int i, ArrayList<Integer> arr, ArrayList<Integer> li, ArrayList<ArrayList<Integer>> list, int target){
        if(target == 0){
                list.add(new ArrayList(li));
            return;
            }
       for(int ind = i;ind<arr.size();ind++){
           if (ind > i && arr.get(ind) == arr.get(ind-1))
                continue;
           int x = arr.get(ind);
            li.add(x);
            comb(ind+1, arr, li, list, target-x);
            li.remove(li.size()-1);
        }
    }
}


