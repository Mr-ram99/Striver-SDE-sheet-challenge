import java.util.*;
class Pair{
    int num;
    int index;
    Pair(int n, int i){
        num = n;
        index = i;
    }
}
public class Solution {
  public static int largestRectangle(ArrayList < Integer > heights) {
    // Write your code here.
      int n=heights.size();
      int [] left = new int[n];
      int [] right = new int[n];
      left[0]=-1;
      right[n-1]=n;
      Stack<Pair> stk = new Stack<>();
      stk.push(new Pair(heights.get(n-1),n-1));
      for(int i=n-2;i>=0;i--){
          int x = heights.get(i);
          while(!stk.isEmpty() && stk.peek().num>=x)stk.pop();
          if(stk.isEmpty()) right[i]=n;
          else right[i]=stk.peek().index;
          stk.push(new Pair(x,i));
      }
      while(!stk.isEmpty())stk.pop();
      stk.push(new Pair(heights.get(0),0));
      for(int i=1;i<n;i++){
          int x = heights.get(i);
          while(!stk.isEmpty() && stk.peek().num>=x)stk.pop();
          if(stk.isEmpty()) left[i]=-1;
          else left[i]=stk.peek().index;
          stk.push(new Pair(x,i));
      }
      int max=0;
      for(int i=0;i<n;i++){
          max = Math.max(max, heights.get(i)*(right[i]-left[i]-1));
      }
      return max;
  }
}
