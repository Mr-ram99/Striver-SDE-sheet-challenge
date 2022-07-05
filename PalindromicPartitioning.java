import java.util.*;
public class Solution {
    public static List<List<String>> partition(String s) {
        // Write your code here.
        List<List<String>> list = new ArrayList<>();
        List<String> li = new ArrayList<>();
        part(0,s,li,list);
        return list;
    }
    public static void part(int i, String s, List<String> li, List<List<String>> list){
        if(i==s.length()){
            list.add(new ArrayList<>(li));
        }
        for(int j=i+1;j<=s.length();j++){
            String str = s.substring(i,j);
            if(isPal(str)){
                li.add(str);
                part(j,s,li,list);
                li.remove(li.size()-1);
            }
        }
    }
    public static boolean isPal(String str){
        int i=0,j=str.length()-1;
        while(i<j) {
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;j--;
        }
        return true;
    }
}