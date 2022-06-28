public class Solution {
    public static boolean findPattern(String p, String s) {
        // Write your code here.
//         KMP algorithm O(n)
        int l1 = p.length(), l2 = s.length();
        int [] lps = new int[l1];
        lps[0]=0;
        getlps(p,lps,l1);
        int i=0,j=0;
        while(i<l2){
            if(p.charAt(j)==s.charAt(i)){
                i++;
                j++;
            }
            if(j==l1)return true;
            if(i<l2 && p.charAt(j)!=s.charAt(i)){
                if(j>0) j=lps[j-1];
                else i++;
            }
        }
        return false;
    }
    public static void getlps(String p, int [] lps, int len){
        int i=1,j=0;
        while(i<len){
            if(p.charAt(i)==p.charAt(j)){
                j++;
                lps[i]=j;
                i++;
            }
            else{
                if(j>0) j=lps[j-1];
                else {
                    lps[i]=j;
                    i++;
                }
            }
        }
    }
}