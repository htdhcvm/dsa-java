package flouheforst.practice.problems.string;

import java.util.stream.Collectors;

public class CheckWordEqualsSummationTwoWords {
    public boolean solution(
            String firstWord,
            String secondWord,
            String targetWord
    ) {
        int result = numberSting(firstWord) + numberSting(secondWord) - numberSting(targetWord);
        return result == 0;
    }
    
    
    private int numberSting(String str) {
        String concut = str.chars()
                .map(v -> v - 97)
                .mapToObj(v -> String.valueOf(v))
                .collect(Collectors.joining(""));
        
        return Integer.parseInt(concut);
    }
}
