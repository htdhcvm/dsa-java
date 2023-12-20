package flouheforst.practice.problems.string;

public class ImplementStrStr {
    public int solution(
            String haystack,
            String needle
    ) {
        if (haystack.length() == 0 || needle.length() == 0) {
            return -1;
        }
        if (haystack.equals(needle)) {
            return 0;
        }
        
        if (haystack == null || needle == null) {
            return -1;
        }
        
        
        int haystackIterator = 0;
        int needleIterator = 0;
        
        boolean startCompare = false;
        
        int firstIndex = -1;
        
        while (haystackIterator < haystack.length()) {
            
            if (needleIterator == needle.length()) {
                return firstIndex;
            }
            if (haystack.charAt(haystackIterator) == needle.charAt(needleIterator)) {
                if (firstIndex == -1) {
                    firstIndex = haystackIterator;
                }
                
                needleIterator++;
                haystackIterator++;
                
                startCompare = true;
                continue;
            }
            
            if (haystack.charAt(haystackIterator) != needle.charAt(needleIterator) && startCompare) {
                needleIterator = 0;
                startCompare = false;
                firstIndex = -1;
                continue;
            }
            
            
            haystackIterator++;
        }
        
        return firstIndex;
    }
    
    
    public int solution2(
            String haystack,
            String needle
    ) {
        
        if (haystack.length() == 0 || needle.length() == 0) {
            return -1;
        }
        if (haystack.equals(needle)) {
            return 0;
        }
        
        if (haystack == null || needle == null) {
            return -1;
        }
        
        
        int sizeNeedle = needle.length();
        for (int i = 0; i <= haystack.length() - sizeNeedle; i++) {
            String subHaystack = haystack.substring(i, i + sizeNeedle);
            
            if (needle.equals(subHaystack)) {
                return i;
            }
        }
        
        return -1;
    }
}
