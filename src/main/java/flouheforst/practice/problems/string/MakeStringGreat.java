package flouheforst.practice.problems.string;

import java.util.Stack;

public class MakeStringGreat {
    
    public String solution(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for (Character ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
                continue;
            }
            
            if (stack.peek() != versaCharacter(ch)) {
                stack.push(ch);
                continue;
            }
            
            stack.pop();
        }
        
        for (Character ch : stack) {
            sb.append(ch);
        }
        
        return sb.toString();
    }
    
    public Character versaCharacter(Character ch) {
        if (Character.isUpperCase(ch)) {
            return Character.toLowerCase(ch);
        }
        
        return Character.toUpperCase(ch);
    }
}
