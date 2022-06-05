import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
        ArrayList<ArrayList<Long>> list = new ArrayList<>();
        ArrayList<Long> li = new ArrayList<>();
        li.add((long)1);
        list.add(new ArrayList<>(li));
        int i=0;
        while(i<n-1){
            int size = li.size();
            int j=0;
            ArrayList<Long> temp = new ArrayList<>();
            while(j<=size){
                if(j == size|| j==0){
                    temp.add((long)1);
                }
                else{
                    temp.add(li.get(j)+li.get(j-1));
                }
                j++;
            }
            list.add(new ArrayList<>(temp));
            li.clear();
            li = temp;
            i++;
        }
        return list;
	}
}
