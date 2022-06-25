public class Solution 
{
    public static String writeAsYouSpeak(int n) 
    {
        // Write your code here.
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        while(n-->1){
            StringBuilder str = new StringBuilder();
            int count=1, i=0;
            for(i=1;i<sb.length();i++){
                if(sb.charAt(i)==sb.charAt(i-1))count++;
                else{
                    str.append(count+"");
                    str.append(sb.charAt(i-1)+"");
                    count=1;
                }
            }
            str.append(count+"");
            str.append(sb.charAt(i-1)+"");
            sb = new StringBuilder(str);
        }
        return sb.toString();
    }
}