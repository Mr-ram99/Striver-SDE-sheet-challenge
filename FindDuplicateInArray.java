import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            int num = arr.get(i);
            if(set.contains(num)) return num;
            set.add(num);
        }
        return -1;
    }
}
