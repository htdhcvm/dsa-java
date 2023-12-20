package flouheforst.practice.problems.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


public class IncreasingDecreasingString {
    public String solution(String s) {
        Integer count = s.length();
        StringBuilder buildResponse = new StringBuilder();
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (Character ch : s.toCharArray()) {
            int intChar = (int) ch;
            
            if (hm.containsKey(intChar)) {
                Integer value = hm.get(intChar);
                hm.put(intChar, ++value);
            } else {
                hm.put(intChar, 1);
            }
        }
        
        List<Character> charactersIteger = new ArrayList<>(hm.keySet()).stream()
                .sorted((o1, o2) -> o1 - o2)
                .map(v -> Character.toString(v)
                        .charAt(0))
                .collect(Collectors.toList());
        
        while (count > 0) {
            int leftIter = 0;
            
            while (leftIter < charactersIteger.size()) {
                Character ch = charactersIteger.get(leftIter);
                int intChar = (int) ch;
                
                Integer countMeet = hm.get(intChar);
                if (countMeet > 0) {
                    buildResponse.append(ch);
                    hm.put(intChar, --countMeet);
                    count--;
                }
                leftIter++;
            }
            
            Collections.reverse(charactersIteger);
        }
        
        return buildResponse.toString();
    }
}
