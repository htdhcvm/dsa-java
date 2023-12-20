package flouheforst.practice.problems.string;

public class ReverseString {
    
    public void solution(char[] s) {
        if (s.length == 1)
            return;
        
        int l = 0;
        int r = s.length - 1;
        
        while (l != r && l < r) {
            
            char tmp = s[l];
            
            s[l] = s[r];
            s[r] = tmp;
            
            l++;
            r--;
        }
    }
}
