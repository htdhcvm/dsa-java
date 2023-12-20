package flouheforst.practice.problems.string;


import java.util.Stack;

public class ValidParentheses {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (Character ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(')');
                continue;
            }
            if (ch == '{') {
                stack.push('}');
                continue;
            }
            if (ch == '[') {
                stack.push(']');
                continue;
            }
            
            if (stack.isEmpty() || stack.pop() != ch) {
                return false;
            }
        }
        
        return stack.isEmpty();
    }
}
