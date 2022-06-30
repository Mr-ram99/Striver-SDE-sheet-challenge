
public class Solution {
	public static String longestCommonPrefix(String[] arr, int n) {
		// Write your code here
        String prefix = arr[0];
        for(int i=1;i<n;i++){
            prefix = common(prefix, arr[i]);
            if(prefix.equals("")) return prefix;
        }
        return prefix;
	}
    public static String common(String s1, String s2){
        int i=0,j=0,n1=s1.length(),n2=s2.length();
        StringBuilder ans=new StringBuilder();
        while(i<n1 && j<n2){
            if(s1.charAt(i)==s2.charAt(j)) ans.append(s1.charAt(i)+"");
            else break;
            i++;j++;
        }
    return ans.toString();
    }
}
