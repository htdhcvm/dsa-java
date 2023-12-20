package flouheforst.practice.problems.string;

import java.util.*;

public class FindAllAnagramsString {
    
    public List<Integer> solution(
            String s,
            String p
    ) {
        List<Integer> response = new ArrayList<>();
        
        if (p.length() > s.length())
            return response;
        
        Map<Character, Integer> pMap = new HashMap<>();
        
        for (char ch : p.toCharArray()) {
            if (pMap.containsKey(ch)) {
                Integer count = pMap.get(ch);
                pMap.put(ch, ++count);
            } else {
                pMap.put(ch, 1);
            }
        }
        
        LinkedList<Character> tmp = new LinkedList<>();
        
        int left = 0;
        int right = p.length() - 1;
        
        int iter = left;
        while (iter <= right) {
            tmp.offer(s.charAt(iter));
            iter++;
        }
        
        for (char character : tmp) {
            if (pMap.containsKey(character)) {
                Integer count = pMap.get(character);
                pMap.put(character, --count);
            }
        }
        
        boolean isAnagram = true;
        
        for (int value : pMap.values()) {
            if (value != 0) {
                isAnagram = false;
                break;
            }
        }
        
        if (isAnagram) {
            response.add(left);
        }
        
        left++;
        right++;
        
        while (right < s.length()) {
            Character charFirst = tmp.poll();
            
            if (charFirst != null && pMap.containsKey(charFirst)) {
                int count = pMap.get(charFirst);
                
                pMap.put(charFirst, ++count);
            }
            
            tmp.offer(s.charAt(right));
            
            if (pMap.containsKey(s.charAt(right))) {
                int count = pMap.get(s.charAt(right));
                
                pMap.put(s.charAt(right), --count);
            }
            
            boolean isAnagramInternal = true;
            
            for (int value : pMap.values()) {
                if (value != 0) {
                    isAnagramInternal = false;
                    break;
                }
            }
            
            
            if (isAnagramInternal) {
                response.add(left);
            }
            
            right++;
            left++;
        }
        
        return response;
    }
}

