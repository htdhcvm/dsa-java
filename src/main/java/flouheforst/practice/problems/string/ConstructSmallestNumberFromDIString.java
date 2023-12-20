package flouheforst.practice.problems.string;

public class ConstructSmallestNumberFromDIString {
    
    public String solution(String pattern) {
        StringBuilder sb = new StringBuilder();
        
        int countI = 1;
        char[] charArray = pattern.toCharArray();
        
        for (int i = 0; i < charArray.length; i++) {
            Character ch = charArray[i];
            
            if (ch == 'I') {
                sb.append(countI);
                countI++;
            }
            
            if (ch == 'D') {
                
                int j = i++;
                while (charArray[j] == 'D' && j < charArray.length) {
                    j++;
                }
                
                int diff = j - i;
                
            }
        }
        
        return sb.toString();
    }
}
