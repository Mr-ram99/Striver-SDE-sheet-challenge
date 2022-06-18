import java.util.*;
public class Solution {
	public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
		// WRITE YOUR CODE HERE
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();   
        ArrayList<Integer> li = new ArrayList<>(); 
        pset(0,arr,list,li);
        return list;
	}
    public static void pset(int i, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> li){
        if(i==arr.size()){
            list.add(new ArrayList<>(li));
            return;
        }
        pset(i+1, arr, list, li);
        li.add(arr.get(i));
        pset(i+1, arr, list, li);
        li.remove(li.size()-1);
    }
}

