package flouheforst.practice.problems.string;

import java.util.LinkedList;
import java.util.Stack;

public class BasicCalculator {
    
    public int solution(String s) {
        char[] chars = s.toCharArray();
        Stack<Integer> st = new Stack<>();
        
        int curr = 0;
        char operation = '+';
        
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (Character.isDigit(ch)) {
                curr = curr * 10 + ch - '0';
            }
            
            
            if (!Character.isDigit(ch) && ch != ' ' || i == chars.length - 1) {
                
                if (operation == '+') {
                    st.add(curr);
                }
                if (operation == '-') {
                    st.add(-curr);
                }
                if (operation == '/') {
                    st.push(st.pop() / curr);
                }
                if (operation == '*') {
                    st.push(st.pop() * curr);
                }
                
                curr = 0;
                operation = ch;
            }
        }
        
        int sum = 0;
        
        while (!st.isEmpty()) {
            sum += st.pop();
        }
        
        return sum;
        
    }
    
    public int solution3(String s) {
        Stack<Integer> st = new Stack();
        int num = 0;
        char operator = '+';
        
        char[] ch = s.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i]))
                num = num * 10 + ch[i] - '0';
            if (!Character.isDigit(ch[i]) && ch[i] != ' ' || i == ch.length - 1) {
                
                if (operator == '+') {
                    st.push(num);
                } else if (operator == '-') {
                    st.push(-num);
                } else if (operator == '*') {
                    st.push(st.pop() * num);
                } else if (operator == '/') {
                    st.push(st.pop() / num);
                }
                
                num = 0;
                operator = ch[i];
                
            }
        }
        
        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }
        
        return sum;
    }
    
    public int solution2(String s) {
        char[] chars = s.toCharArray();
        
        LinkedList<String> stackOperations = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        for (char ch : chars) {
            if (+ch == 32) {
                continue;
            }
            if (ch == '/' || ch == '-' || ch == '+' || ch == '*') {
                stackOperations.add(sb.toString());
                sb.setLength(0);
                stackOperations.add(String.valueOf(ch));
                continue;
            }
            
            sb.append(ch);
        }
        
        if (!sb.isEmpty()) {
            stackOperations.add(sb.toString());
        }
        
        while (stackOperations.size() != 1) {
            String operand1 = stackOperations.remove();
            String operator = stackOperations.remove();
            String operand2 = stackOperations.remove();
            
            String response = doOperation(operand1, operator, operand2);
            
            stackOperations.addFirst(response);
        }
        
        return 0;
    }
    
    private String doOperation(
            String operand1,
            String operator,
            String operand2
    ) {
        Integer op1 = Integer.valueOf(operand1);
        Integer op2 = Integer.valueOf(operand2);
        
        Integer res = 0;
        
        switch (operator) {
            case "+": {
                res = op1 + op2;
                break;
            }
            case "-": {
                res = op2 - op1;
                break;
            }
            case "*": {
                res = op1 * op2;
                break;
            }
            case "/": {
                double tmp = (double) op2 / (double) op1;
                res = (int) tmp;
                break;
            }
        }
        
        
        return res.toString();
    }
}
