import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> stringMatch(String str, String pat) {
		// Write your code here.
        int m=pat.length(), n=str.length();
        
        ArrayList<Integer> ans = new ArrayList<>();
        int p = findHash(pat,m);
        int t = findHash(str,m);
         if(p==t){
                int j=0;
                for(;j<m;j++){
                    if(pat.charAt(j)!=str.charAt(j)){
                        break;
                    }
                }
                if(j==m){
                    ans.add(0);
                }
            }
        for(int i=m;i<n;i++){
            t = (t - (str.charAt(i-m)-'A'+1))/5 + ((str.charAt(i)-'A'+1)*(int)Math.pow(5,m-1));
            if(p==t){
                int j=0;
                for(;j<m;j++){
                    if(pat.charAt(j)!=str.charAt(i-m+j+1)){
                        break;
                    }
                }
                if(j==m){
                    ans.add(i-m+1);
                }
            }
            
        }
        return ans;
	}
    public static int findHash(String pat, int m){
        int hash=0;
        for(int i=0;i<m;i++){
            hash += (pat.charAt(i)-'A'+1)*((int)Math.pow(5,i));
        }
        return hash;
    }
}