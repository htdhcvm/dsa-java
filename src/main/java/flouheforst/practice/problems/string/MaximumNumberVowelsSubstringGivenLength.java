package flouheforst.practice.problems.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class MaximumNumberVowelsSubstringGivenLength {
    public int solution(
            String s,
            int k
    ) {
        int count = 0;
        int maxCount = 0;
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        LinkedList<Character> ll = new LinkedList<>();
        
        int right = 0;
        
        while (right < k) {
            ll.offer(s.charAt(right));
            
            if (set.contains(s.charAt(right))) {
                count++;
            }
            right++;
        }
        
        if (count > maxCount) {
            maxCount = count;
        }
        
        
        while (right < s.length()) {
            Character ch = s.charAt(right);
            
            ll.offer(ch);
            
            if (set.contains(ch)) {
                count++;
            }
            
            Character first = ll.remove();
            
            if (set.contains(first)) {
                count--;
            }
            
            if (count > maxCount) {
                maxCount = count;
            }
            
            right++;
        }
        
        return maxCount;
    }
    
}




