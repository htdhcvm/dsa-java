package flouheforst.practice.problems.string;

import java.util.HashSet;
import java.util.Set;

public class BuddyStrings {
    public boolean solution(
            String s,
            String goal
    ) {
        
        if (s.length() != goal.length()) {
            return false;
        }
        
        int iterS = 0;
        int iterGoal = 0;
        
        int count = 0;
        int[] indexies = new int[2];
        int index = 0;
        
        Character repeatA = null;
        Character repeatB = null;
        
        Set<Character> setChars = new HashSet<>();
        
        while (iterS < s.length()) {
            char chS = s.charAt(iterS);
            char chGoal = goal.charAt(iterGoal);
            
            iterS++;
            iterGoal++;
            
            if (chS != chGoal) {
                if (count > 1) {
                    return false;
                }
                indexies[index] = iterS - 1;
                
                count++;
                index++;
            }
            
            if (!setChars.contains(chS)) {
                setChars.add(chS);
            } else {
                repeatA = chS;
                repeatB = chS;
            }
        }
        
        if (count == 0) {
            return repeatA != null && repeatB != null;
        }
        
        String swapString = swap(s, indexies[0], indexies[1]);
        
        return swapString.equals(goal);
    }
    
    private String swap(
            String s,
            int i,
            int j
    ) {
        char[] chars = s.toCharArray();
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
        
        return String.valueOf(chars);
    }
}
