package flouheforst.practice.problems.string;

import java.util.TreeSet;

public class LongestNiceSubstring {
    private static boolean isNicePair(
            char first,
            char second
    ) {
        if (first == second) {
            return true;
        }
        
        return Math.abs((int) first - (int) second) == 32;
    }
    
    public String solution(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return "";
        }
        TreeSet<String> tree = new TreeSet<String>();
        
        for (int i = 0; i < s.length(); i++) {
            
            if (i < s.length() - 1) {
                int j = i + 1;
                
                char current = s.charAt(i);
                char next = s.charAt(j);
                
                
                while (isNicePair(current, next) && j < s.length()) {
                    j++;
                    if (j < s.length()) {
                        next = s.charAt(j);
                    }
                }
                
                if (i != j - 1) {
                    String niceSubString = s.substring(i, j);
                    tree.add(niceSubString);
                    i = j;
                }
                
            }
        }
        
        if (tree.isEmpty())
            return "";
        return tree.first();
    }
}
