package flouheforst.practice.problems.string;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
    public int solution(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        
        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                count += 2;
                set.remove(ch);
            } else {
                set.add(ch);
            }
        }
        
        if (set.size() > 0) {
            count++;
        }
        
        return count;
    }
}
