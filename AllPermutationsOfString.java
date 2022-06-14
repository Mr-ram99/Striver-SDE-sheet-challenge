import java.util.*;
public class Solution {
    public static List<String> findPermutations(String s) {
        // Write your code here.
        char [] chars = s.toCharArray();
        List<String> list = new ArrayList<>();
        permute(0, chars, list);
        return list;
    }
    public static void permute(int ind, char[] chars, List<String> list)    {
        if(ind==chars.length){
            list.add(new String(chars));
            return;
        }
        for(int i=ind;i<chars.length;i++){
            swap(chars, i, ind);
            permute(ind+1, chars, list);
            swap(chars, i ,ind);
        }
    }
    public static void swap(char [] ch, int i, int j){
        char c = ch[i];
        ch[i] = ch[j];
        ch[j] = c;
    }
}