package flouheforst.practice.problems.array;

public class BestTimeBuySellStock {
    
    public int solution1(int[] prices) {
        int respone = 0;
        
        if (prices.length == 0 || prices.length == 1) {
            return respone;
        }
        
        int firstIterator = 0;
        int secondIterator = 1;
        
        for (int i = 0; i < prices.length; i++) {
            if (firstIterator >= prices.length || secondIterator >= prices.length) {
                break;
            }
            
            
            if (prices[firstIterator] > prices[secondIterator]) {
                firstIterator = secondIterator;
                secondIterator = secondIterator + 1;
                continue;
            }
            
            respone = respone + (prices[secondIterator] - prices[firstIterator]);
            firstIterator++;
            secondIterator++;
        }
        return respone;
    }
    
    public int solution2(int[] prices) {
        int respone = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                respone = respone + (prices[i] - prices[i - 1]);
            }
        }
        
        return respone;
    }
}
