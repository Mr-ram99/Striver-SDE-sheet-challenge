
public class Solution {

    public static int minCharsforPalindrome(String str) {
       String input = str + "@" + reverse(str);
        int n = input.length();
        int [] lps = new int[n];
        lps[0] = 0;
        for(int i = 1 ; i < n ; ++i){
            int x = lps[i-1];
            while(input.charAt(x) != input.charAt(i)){
                if(x == 0){
                    x = -1;
                    break;
                }
                x = lps[x-1];
            }
            lps[i] = x + 1;
        }
        return str.length() - lps[n-1];
    }
    
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--) sb.append(s.charAt(i)+"");
        return sb.toString();
    }
}