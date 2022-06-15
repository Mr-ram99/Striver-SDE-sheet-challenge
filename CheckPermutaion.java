public class Solution {
    public static boolean areAnagram(String str1, String str2){
        // Write your code here.
        if(str1.length()!=str2.length()) return false;
        int [] ch1= new int[26];
        int [] ch2= new int[26];
        for(char ch:str1.toCharArray()) ch1[ch-'a']++;
        for(char ch:str2.toCharArray()) ch2[ch-'a']++;
        for(int i=0;i<ch1.length;i++) if(ch1[i]!=ch2[i]) return false;
        return true;
    }
}