package flouheforst.practice.problems.string;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String solution(String[] strs) {
        Arrays.sort(strs, (a, b) -> Integer.compare(a.length(), b.length()));
        int len = strs[0].length();
        
        String response = "";
        
        
        for (int i = 0; i < len; i++) {
            
            boolean checkAll = true;
            for (int k = 1; k < strs.length; k++) {
                Character chFirst = strs[0].charAt(i);
                Character ch = strs[k].charAt(i);
                
                if (ch != chFirst) {
                    checkAll = false;
                    
                    break;
                }
            }
            if (checkAll) {
                response += strs[0].charAt(i);
            } else {
                break;
            }
        }
        
        return response;
    }
}
