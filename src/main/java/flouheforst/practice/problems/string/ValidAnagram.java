package flouheforst.practice.problems.string;

import java.util.HashMap;

public class ValidAnagram {
    public boolean solution(
            String s,
            String t
    ) {
        boolean response = true;
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (hm.containsKey(ch)) {
                int count = hm.get(ch);
                count++;
                hm.put(ch, count);
            } else {
                hm.put(ch, 1);
            }
        }
        
        
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            
            if (hm.containsKey(ch)) {
                int count = hm.get(ch);
                count--;
                hm.put(ch, count);
            } else {
                response = false;
                break;
            }
        }
        
        
        for (Integer value : hm.values()) {
            if (value != 0) {
                response = false;
                break;
            }
        }
        
        return response;
    }
}
