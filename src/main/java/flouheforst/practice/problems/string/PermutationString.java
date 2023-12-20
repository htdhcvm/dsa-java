package flouheforst.practice.problems.string;

import java.util.HashMap;
import java.util.LinkedList;

public class PermutationString {
    
    
    public boolean checkInclusion(
            String s1,
            String s2
    ) {
        if (s2.length() < s1.length())
            return false;
        
        if (s1.equals(s2))
            return true;
        
        
        final char[] findSubString = reverse(s1).toCharArray();
        
        int first = 0;
        int second = s1.length() - 1;
        
        LinkedList<Character> ll = new LinkedList<>();
        
        for (char c : s2.substring(first, s1.length())
                .toCharArray()) {
            ll.add(c);
        }
        
        first++;
        second++;
        
        while (second < s2.length()) {
            final boolean isEqual = compare(ll, findSubString);
            
            if (isEqual) {
                return true;
            }
            
            
            ll.remove();
            ll.offer(s2.charAt(second));
            
            
            first++;
            second++;
        }
        
        return compare(ll, findSubString);
    }
    
    private boolean compare(
            LinkedList<Character> ll,
            char[] findSubString
    ) {
        char[] llChars = new char[ll.size()];
        
        int i = 0;
        for (Character c : ll) {
            llChars[i] = c;
            i++;
        }
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for (char llChar : llChars) {
            if (hm.containsKey(llChar)) {
                Integer count = hm.get(llChar);
                hm.put(llChar, ++count);
            } else {
                hm.put(llChar, 1);
            }
        }
        
        for (char findSubStr : findSubString) {
            if (hm.containsKey(findSubStr)) {
                Integer count = hm.get(findSubStr);
                hm.put(findSubStr, --count);
            }
        }
        
        for (Integer value : hm.values()) {
            if (value != 0) {
                return false;
            }
        }
        
        return true;
    }
    
    
    private String reverse(String str) {
        return new StringBuilder(str).reverse()
                .toString();
    }
}
