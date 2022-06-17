import java.util.*;
public class Solution 
{
	public static String reverseString(String str) 
	{
		//Write your code here
        int n=str.length();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<n;){
            while(i<n && str.charAt(i)==' ')i++;
            int s=i;
            while(i<n && str.charAt(i)!=' ')i++;
            if(i-s>0) list.add(str.substring(s,i));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=list.size()-1;i>=0;i--){
            if(i!=0)
            sb.append(list.get(i)+" ");
            else
                sb.append(list.get(i));
        }
        return sb.toString();
	}
}
