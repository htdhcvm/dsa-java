package flouheforst.practice.problems.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IsomorphicStrings {
    public boolean solution(
            String s,
            String t
    ) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Character> hm = new HashMap<>();
        Set<Character> set = new HashSet<>();
        int iterS = 0;
        int iterT = 0;
        
        while (iterS < s.length()) {
            char chS = s.charAt(iterS);
            char chT = t.charAt(iterT);
            
            iterS++;
            iterT++;
            
            if (!hm.containsKey(chS)) {
                boolean isContain = set.contains(chT);
                
                if (isContain) {
                    return false;
                }
                
                hm.put(chS, chT);
                set.add(chT);
                continue;
            }
            
            char chTMeet = hm.get(chS);
            
            if (chT != chTMeet) {
                return false;
            }
        }
        
        return true;
    }
}
