package flouheforst.practice.problems.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {
    public int solution(String s) {
        int response = -1;
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap();
        
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            
            if (hm.containsKey(chr)) {
                Integer count = hm.get(chr);
                count++;
                hm.put(chr, count);
            } else {
                hm.put(chr, 1);
            }
        }
        
        
        Character findValue = null;
        
        for (Map.Entry<Character, Integer> set : hm.entrySet()) {
            if (set.getValue() == 1) {
                findValue = set.getKey();
                break;
            }
        }
        
        if (findValue == null) {
            return response;
        }
        
        
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            if (chr == findValue) {
                response = i;
                break;
            }
        }
        
        return response;
    }
}
