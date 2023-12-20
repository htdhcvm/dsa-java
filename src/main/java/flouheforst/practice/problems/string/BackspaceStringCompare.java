package flouheforst.practice.problems.string;

import java.util.Stack;

public class BackspaceStringCompare {
    
    public boolean solution(
            String s,
            String t
    ) {
        return withoutBackspace(s).equals(withoutBackspace(t));
    }
    
    
    public String withoutBackspace(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        
        for (Character ch : str.toCharArray()) {
            if (ch == '#' && !st.isEmpty()) {
                st.pop();
                continue;
            }
            
            if (ch != '#') {
                st.push(ch);
            }
        }
        
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        
        return sb.toString();
    }
}
