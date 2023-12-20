package flouheforst.practice.problems.string;

import java.util.Stack;

public class ScoreParentheses {
    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        
        int response = 0;
        for (Character ch : s.toCharArray()) {
            if (ch == '(') {
                if (response != 0) {
                    stack.push(response);
                    response = 0;
                }
                stack.push(0);
            }
            
            if (ch == ')') {
                int value = stack.pop();
                
                if (value == 0) {
                    if (response == 0) {
                        response = 1;
                    } else {
                        response *= 2;
                    }
                } else {
                    response += value;
                }
            }
        }
        
        while (!stack.isEmpty()) {
            int value = stack.pop();
            
            if (value == 0) {
                response *= 2;
            } else {
                response += value;
            }
        }
        
        return response;
    }
}
