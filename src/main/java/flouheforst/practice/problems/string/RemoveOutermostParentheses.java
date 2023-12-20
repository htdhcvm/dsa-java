package flouheforst.practice.problems.string;

import java.util.Stack;

public class RemoveOutermostParentheses {
    public String solution(String s) {
        Stack<Character> bracket = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (bracket.size() > 0) {
                    sb.append(s.charAt(i));
                }
                bracket.push(s.charAt(i));
            } else {
                bracket.pop();
                if (bracket.size() > 0) {
                    sb.append(s.charAt(i));
                }
            }
            
        }
        return sb.toString();
    }
}


