import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public static ArrayList<Integer> findSpans(ArrayList<Integer> price) {
        // Write your code here.
        int n = price.size();
        ArrayList<Integer> pg = new ArrayList<>();
        Stack<Pair> stk= new Stack<>();
        pg.add(1);
        stk.push(new Pair(price.get(0),0));
        for(int i=1;i<n;i++){
            int x = price.get(i);
            while(!stk.isEmpty() && stk.peek().num<=x)stk.pop();
            if(stk.isEmpty()) pg.add(i+1);
            else pg.add(i-stk.peek().i);
            stk.push(new Pair(x,i));
        }
        return pg;
    }
}
class Pair{
    int num;
    int i;
    Pair(int n,int index){
        num = n;
        i = index;
    }
}