public class Solution {
    public static int atoi(String str) {
        // Write your code here.
        boolean isNeg = false;
        if(str.charAt(0)=='-') isNeg=true;
        int num=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch-'0'>=0 && ch-'0'<=9) num = num*10 + (ch-'0');
        }
        return isNeg==true?-num:num;
    }
}
