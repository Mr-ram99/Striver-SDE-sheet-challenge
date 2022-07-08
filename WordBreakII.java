import java.util.ArrayList;

public class Solution {

	public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) {
		// Write your code here.
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> li = new ArrayList<>();
        wb(0, s,dictionary,list,li,"");
        return list;
	}
    public static void wb(int i, String s, ArrayList<String> dict, ArrayList<String> list, ArrayList<String> li, String p){
        if(i==s.length()){
            if(p.equals("")){
                String str = String.join(" ",li);
                list.add(str);
            }
            return;
        }
        p = p+s.charAt(i);
        if(dict.contains(p)){
            li.add(p);
            wb(i+1, s, dict, list, li, "");
            li.remove(li.size()-1);
        }
        wb(i+1, s, dict, list, li, p);
    }
}