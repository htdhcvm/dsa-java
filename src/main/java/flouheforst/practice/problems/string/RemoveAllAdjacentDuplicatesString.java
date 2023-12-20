package flouheforst.practice.problems.string;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesString {
    
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        
        for (Character ch : s.toCharArray()) {
            if (st.isEmpty()) {
                st.push(ch);
                continue;
            }
            
            if (st.peek() != ch) {
                st.push(ch);
                continue;
            }
            
            if (st.peek() == ch) {
                st.pop();
            }
        }
        
        for (Character ch : st) {
            sb.append(ch);
        }
        
        return sb.toString();
    }
}
