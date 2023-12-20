package flouheforst.practice.problems.string;


public class ValidPalindrome {
    public boolean solution(String s) {
        String tmp = "";
        
        boolean isSpaceStr = this.isSpaceString(s);
        
        if (isSpaceStr) {
            return true;
        }
        
        for (int i = 0; i < s.length(); i++) {
            Character lc = s.charAt(i);
            if (this.checkCorrectAscii(lc)) {
                tmp += Character.toLowerCase(lc);
            }
        }
        
        int l = 0;
        int r = tmp.length() - 1;
        
        while (l < r) {
            Character lc = tmp.charAt(l);
            Character rc = tmp.charAt(r);
            
            if ((int) lc != (int) rc) {
                return false;
            }
            l++;
            r--;
        }
        
        return true;
    }
    
    private boolean isSpaceString(String s) {
        boolean q = false;
        
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if ((int) ch == 32) {
                q = true;
            } else {
                q = false;
                break;
            }
        }
        return q;
    }
    
    private boolean checkCorrectAscii(Character ch) {
        int ascii = (int) ch;
        
        return ascii >= 48 && ascii <= 57 || ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122;
    }
}
