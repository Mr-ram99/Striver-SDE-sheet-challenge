import java.util.*;
public class Solution {

	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
        if(!stack.isEmpty()){
            int temp = stack.pop();
            sortStack(stack);
            sortedInsert(stack, temp);
        }
	}
    public static void sortedInsert(Stack<Integer> stk, int temp){
        if(stk.isEmpty() || temp>=stk.peek()) stk.push(temp);
        else{
            int t = stk.pop();
            sortedInsert(stk, temp);
            stk.push(t);
        }
    }

}