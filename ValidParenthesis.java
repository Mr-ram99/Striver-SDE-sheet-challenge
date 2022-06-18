import java.util.*;
public class Solution {
    public static boolean isValidParenthesis(String exp) {
        // Write your code here.
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stk.push(ch);
            }
            else{
                if(ch == '}'){
                    if(stk.isEmpty() || stk.pop()!='{') return false;
                }
                if(ch == ')'){
                    if(stk.isEmpty() || stk.pop()!='(') return false;
                }
                if(ch == ']'){
                    if(stk.isEmpty() || stk.pop()!='[') return false;
                }
            }
        }
        if(!stk.isEmpty()) return false;
        return true;
    }
}