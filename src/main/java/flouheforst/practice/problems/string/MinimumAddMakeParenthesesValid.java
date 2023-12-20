package flouheforst.practice.problems.string;

import java.util.Stack;

public class MinimumAddMakeParenthesesValid {
    public int solution(String s) {
        Stack<Character> st = new Stack<>();
        
        for (Character ch : s.toCharArray()) {
            if (ch == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();
                continue;
            }
            
            st.add(ch);
        }
        
        return st.size();
    }
}
