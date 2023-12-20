package flouheforst.practice.problems.string;

public class StringToIntegerATOI {
    public int solution(String s) {
        String tmp = "";
        
        boolean isWasSign = false;
        boolean firstSpaces = false;
        for (int i = 0; i < s.length(); i++) {
            int chatAsci = s.charAt(i);
            
            while (chatAsci == 32) {
                if (firstSpaces) {
                    break;
                }
                i++;
                if (i == s.length() || i > s.length()) {
                    break;
                }
                chatAsci = s.charAt(i);
            }
            
            firstSpaces = true;
            if (i == s.length() || i > s.length()) {
                break;
            }
            
            boolean isNumber = this.checkIsnNumber(s.charAt(i));
            
            if (!isNumber) {
                if (tmp.length() > 0) {
                    break;
                }
                if (s.charAt(i) == '-') {
                    if (isWasSign) {
                        break;
                    }
                    tmp += "-";
                    isWasSign = true;
                    continue;
                }
                if (s.charAt(i) == '+') {
                    if (isWasSign) {
                        break;
                    }
                    isWasSign = true;
                    
                    continue;
                }
            }
            if (isNumber) {
                tmp += s.charAt(i);
            }
            
            if (!isNumber) {
                break;
            }
        }
        
        if (tmp.length() == 0) {
            return 0;
        }
        
        long v;
        
        try {
            v = Long.parseLong(tmp);
        } catch (NumberFormatException e) {
            
            if ((int) tmp.charAt(0) != 45) {
                boolean isFullNumber = this.isFullNumber(tmp);
                if (isFullNumber) {
                    return Integer.MAX_VALUE;
                }
            } else {
                if (tmp.substring(1)
                        .length() == 0) {
                    return 0;
                }
                boolean isFullNumber = this.isFullNumber(tmp.substring(1));
                
                if (isFullNumber) {
                    return Integer.MIN_VALUE;
                }
            }
            
            
            return 0;
        }
        
        if (v < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        
        if (v >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        
        
        return (int) v;
    }
    
    private boolean isFullNumber(String str) {
        
        for (int i = 0; i < str.length(); i++) {
            if (!this.checkIsnNumber(str.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean checkIsnNumber(Character ch) {
        return (int) ch >= 48 && (int) ch <= 57;
    }
}
