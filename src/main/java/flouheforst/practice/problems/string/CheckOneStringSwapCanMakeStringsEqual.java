package flouheforst.practice.problems.string;

import java.util.HashMap;

public class CheckOneStringSwapCanMakeStringsEqual {
    public boolean solution(
            String s1,
            String s2
    ) {
        if (s1.isEmpty() && s2.isEmpty()) {
            return true;
        }
        if (s1.equals(s2))
            return true;
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for (Character ch : s1.toCharArray()) {
            if (hm.containsKey(ch)) {
                Integer count = hm.get(ch);
                hm.put(ch, ++count);
            } else {
                hm.put(ch, 1);
            }
        }
        for (Character ch : s2.toCharArray()) {
            if (hm.containsKey(ch)) {
                Integer count = hm.get(ch);
                hm.put(ch, --count);
            } else {
                return false;
            }
        }
        
        for (Integer value : hm.values()) {
            if (value != 0) {
                return false;
            }
        }
        
        int iter = 0;
        int count = 0;
        
        while (iter < s1.length()) {
            char ch1 = s1.charAt(iter);
            char ch2 = s2.charAt(iter);
            
            if (ch1 != ch2) {
                count++;
            }
            
            if (count > 2) {
                return false;
            }
            
            iter++;
        }
        return true;
    }
}
