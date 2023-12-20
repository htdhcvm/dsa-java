package flouheforst.practice.problems.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class SubstringsSizeThreeDistinctCharacters {
    public int solution(String s) {
        int windowSize = 3;
        int response = 0;
        
        if (s.length() < windowSize) {
            return response;
        }
        List<Character> hs = new ArrayList();
        hs.add(s.charAt(0));
        
        
        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            
            if (hs.size() < windowSize && hs.contains(current)) {
                hs.remove(0);
                hs.add(current);
                
                continue;
            }
            
            if (hs.size() == windowSize) {
                hs.remove(0);
            }
            
            hs.add(current);
            
            if (hs.size() == windowSize && isUniqArray(hs)) {
                response++;
            }
        }
        
        return response;
    }
    
    private boolean isUniqArray(List<Character> l) {
        HashSet<Character> hs = new HashSet<>();
        
        for (Character ch : l) {
            if (hs.contains(ch)) {
                return false;
            }
            
            hs.add(ch);
        }
        return true;
    }
    
    
    public int solution2(String s) {
        int response = 0;
        
        for (int i = 0; i < s.length() - 2; i++) {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);
            char third = s.charAt(i + 2);
            
            if (first != second && first != third && second != third) {
                response++;
            }
        }
        
        return response;
    }
    
    
    public int solution3(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        int start = 0;
        int end = 0;
        int ans = 0;
        int count = 0;
        
        while (end < s.length()) {
            if (!map.containsKey(s.charAt(end))) {
                map.put(s.charAt(end), 1);
                count++;
            } else {
                map.put(s.charAt(end), map.get(s.charAt(end)) + 1);
                
                if (map.get(s.charAt(end)) == 1) {
                    count++;
                }
            }
            
            if (end - start + 1 < 3) {
                end++;
            } else {
                if (count == 3) {
                    ans++;
                }
                
                if (map.containsKey(s.charAt(start))) {
                    map.put((s.charAt(start)), map.get(s.charAt(start)) - 1);
                    
                    if (map.get(s.charAt(start)) == 0) {
                        count--;
                    }
                }
                
                start++;
                end++;
            }
        }
        return ans;
    }
}
