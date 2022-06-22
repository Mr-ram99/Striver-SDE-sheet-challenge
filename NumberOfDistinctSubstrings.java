import java.util.*;
public class Solution {
    public static int distinctSubstring(String word) {
        // Write your code here.
        HashSet<String> set = new HashSet<>();
        int n=word.length(), count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String s = word.substring(i,j);
                set.add(s);
            }
        }
        return set.size();
            
    }
}
