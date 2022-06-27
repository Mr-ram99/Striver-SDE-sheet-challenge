import java.util.* ;
import java.io.*; 
public class Solution {
  public static String fourSum(int[] arr, int target, int n) {
      // Write your code here.
      Map<Integer, Pair> map = new HashMap<>();
      for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
              int sum= arr[i]+arr[j];
              map.put(sum, new Pair(i, j));
          }
      }
      for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
              int left = target -(arr[i]+arr[j]);
              if(map.containsKey(left)){
                  Pair p = map.get(left);
                  int i1 = p.i;
                  int j1 = p.j;
                  if(i!=i1 && j!=j1 && j!=i1 && i!=j1) return "Yes";
              }
          }
      }
      
      return "No";
  }
    
}
class Pair{
    int i;
    int j;
    Pair(int one, int two){
        i = one;
        j = two;
    }
}
