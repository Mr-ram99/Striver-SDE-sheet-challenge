import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.size();
        for(int i=0;i<n;i++){
            int x = arr.get(i);
            map.put(x, map.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            int x = e.getKey();
            int y = e.getValue();
            if(y>n/3){
                list.add(x);
            }
        }
        return list;
    }
}