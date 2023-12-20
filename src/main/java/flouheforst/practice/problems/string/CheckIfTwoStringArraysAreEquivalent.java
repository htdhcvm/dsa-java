package flouheforst.practice.problems.string;

import java.util.Arrays;

public class CheckIfTwoStringArraysAreEquivalent {
    public boolean solution(
            String[] word1,
            String[] word2
    ) {
        if (word1.length == 0 && word2.length == 0) {
            return true;
        }
        
        int sizeFirst = getSize(word1);
        int sizeSecond = getSize(word2);
        
        if (sizeFirst != sizeSecond) {
            return false;
        }
        
        String wordFirst = concatenateArrayString(word1);
        String wordSecond = concatenateArrayString(word2);
        
        return wordFirst.equals(wordSecond);
    }
    
    private int getSize(String[] word) {
        return Arrays.stream(word)
                .map(String::length)
                .mapToInt(Integer::intValue)
                .sum();
    }
    
    private String concatenateArrayString(String[] word) {
        return String.join("", word);
    }
}
