import java.util.*;
public class Solution {
	
	public static int[] nextGreater(int[] arr, int n) {	
		//Write Your code here
        int [] ans = new int[n];
        Stack<Integer> stk = new Stack<>();
        ans[n-1] = -1;
        stk.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!stk.isEmpty() && stk.peek()<=arr[i])stk.pop();
            if(stk.isEmpty()) ans[i]=-1;
            else ans[i]=stk.peek();
            stk.push(arr[i]);
        }
		return ans;
	}

}
