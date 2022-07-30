public class Solution {	
	public static String longestPalinSubstring(String str) {
		// Write your code here.
        String longest="";
        int n=str.length();
        for(int i=0;i<n;i++){
            String odd=expand(i,i,str);
//             System.out.println(odd);
            if(odd.length()>longest.length()){
                longest=odd;
            }
        }
        for(int i=0;i<n;i++){
            String even=expand(i,i+1,str);
//             System.out.println(even);
            if(even.length()>longest.length()){
                longest=even;
            }
        }
        return longest;
    }
    static String expand(int l,int r,String s){
        while(l>=0 && r<s.length()){
            if(s.charAt(l)!=s.charAt(r)){
                break;
            }
            l--;
            r++;
        }
//         System.out.println(l+" "+r);
        return s.substring(l+1,r);
	}
  
}
