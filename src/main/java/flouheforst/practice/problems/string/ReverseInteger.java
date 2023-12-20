package flouheforst.practice.problems.string;

public class ReverseInteger {
    public int solution(int x) {
        long current = x;
        long response = 0;
        boolean isWasNegative = false;
        
        if (x < 0) {
            
            isWasNegative = true;
            current *= -1;
            
        }
        
        StringBuilder stb = new StringBuilder();
        
        stb.append(current);
        stb.reverse();
        
        response = Long.parseLong(stb.toString());
        
        if (isWasNegative) {
            response *= -1;
        }
        
        if (response < Integer.MIN_VALUE || response > Integer.MAX_VALUE) {
            return 0;
        }
        
        return (int) response;
    }
}
