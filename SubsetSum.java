import java.util.*;
public class Solution {
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ArrayList<Integer> list = new ArrayList<>();
        allsub(0, num, list, 0);
        Collections.sort(list);
        return list;
    }
    public static void allsub(int i, int [] arr, ArrayList<Integer> list, int sum){
        if(i==arr.length){
            list.add(sum);
            return;
        }
        allsub(i+1, arr, list, sum+arr[i]);
        allsub(i+1, arr, list, sum);
    }

}