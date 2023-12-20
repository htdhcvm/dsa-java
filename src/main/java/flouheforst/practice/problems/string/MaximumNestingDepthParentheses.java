package flouheforst.practice.problems.string;

public class MaximumNestingDepthParentheses {
    
    public int solution(String s) {
        int maxCount = 0;
        int count = 0;
        
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                count++;
            }
            
            if (ch == ')') {
                count--;
            }
            
            if (count > maxCount) {
                maxCount = count;
            }
        }
        
        return maxCount;
    }
}
