import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.
        int [] ans = new int[n];
        Stack<Integer> stk = new Stack<>();
        ans[n-1] = -1;
        stk.push(arr.get(n-1));
        for(int i=n-2;i>=0;i--){
            int x = arr.get(i);
            while(!stk.isEmpty() && stk.peek()>=x)stk.pop();
            if(stk.isEmpty()) ans[i]=-1;
            else ans[i]=stk.peek();
            stk.push(x);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: ans){
            list.add(num);
        }
        return list;
    }
}

