import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		//write your code here
        int max=0, s=0, i=0;
        int [] ch = new int[26];
        for(i=0;i<26;i++){
            ch[i]=-1;
        }
        for(i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(ch[c-'a']!=-1){
                max = Math.max(max, i-s);
                s = Math.max(s, ch[c-'a']+1);
            }
            ch[c-'a']=i;
        }
        max = Math.max(max, i-s);
        return max;
	}
}
