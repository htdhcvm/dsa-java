package flouheforst.practice.problems.string;

public class ReverseWordsString {
    public String solution(String s) {
        StringBuilder response = new StringBuilder();
        
        int left = 0;
        
        while (left < s.length()) {
            int right = left + 1;
            
            if (right < s.length()) {
                char rightChar = s.charAt(right);
                
                while (rightChar != ' ' && right < s.length()) {
                    rightChar = s.charAt(right);
                    right++;
                }
            }
            
            String strWithoutSpaces = s.substring(left, right)
                    .trim();
            String reverseString = reverse(strWithoutSpaces);
            response.append(reverseString)
                    .append(" ");
            
            left = right;
        }
        
        return response.toString()
                .trim();
    }
    
    private String reverse(String s) {
        int right = s.length() - 1;
        StringBuilder response = new StringBuilder();
        
        while (right >= 0) {
            response.append(s.charAt(right));
            right--;
        }
        
        return response.toString();
    }
}
