import java.util.*;
public class Solution {
    
    static class MinStack {
    TreeMap<Integer, Integer> map;
    Stack<Integer> stk;
        // Constructor
        MinStack() {
            // Write your code here.
            map = new TreeMap<>();
            stk = new Stack<>();
        }

        // Function to add another element equal to num at the top of stack.
        void push(int num) {
            // Write your code here.
            stk.push(num);
            map.putIfAbsent(num,0);
            map.put(num, map.get(num)+1);
        }

        // Function to remove the top element of the stack.
        int pop() {
            // Write your code here.
            if(stk.isEmpty()) return -1;
            int x = stk.pop();
            map.put(x,map.get(x)-1);
            if(map.get(x)==0) map.remove(x);
            return x;
        }

        // Function to return the top element of stack if it is present. Otherwise
        // return -1.
        int top() {
            // Write your code here.
            if(stk.isEmpty()) return -1;
            return stk.peek();
        }

        // Function to return minimum element of stack if it is present. Otherwise
        // return -1.
        int getMin() {
            // Write your code here.
            if(stk.isEmpty()) return -1;
            return map.firstKey();
        }
    }
}