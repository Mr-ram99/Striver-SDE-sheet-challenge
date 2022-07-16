import java.util.*;
class Solution {

  public static String completeString(int n, String[] a) {
    // Write your code here.
      HashMap<String, HashSet<Integer>> map = new HashMap<>();
      HashSet<String> set = new HashSet<>();
      for(int i=0;i<a.length;i++){
          set.add(a[i]);
          for(int j=0;j<a[i].length();j++){
              String s = a[i].substring(0,j+1);
              map.putIfAbsent(s, new HashSet<Integer>());
              map.get(s).add(i);
          }
      }
      ArrayList<String> ans = new ArrayList<>();
      for(int i=0;i<a.length;i++){
          boolean flag = true;
          for(int j=0;j<a[i].length();j++){
              String s = a[i].substring(0,j+1);
              if(!set.contains(s)){
                  flag = false;
                  break;
              }
          }
          if(flag)
          ans.add(a[i]);
      }
      if(ans.size()==0) return "None";
      Collections.sort(ans, (p,q)->q.length()-p.length()>0?1:q.length()-p.length()==0?p.compareTo(q)>0?1:-1:-1);
      return ans.get(0);
  }
}