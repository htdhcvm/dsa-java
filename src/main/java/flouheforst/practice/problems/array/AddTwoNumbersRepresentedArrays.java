package flouheforst.practice.problems.array;

import java.util.ArrayList;

public class AddTwoNumbersRepresentedArrays {
    
    public ArrayList<Integer> solution(
            ArrayList<Integer> a,
            ArrayList<Integer> b
    ) {
        ArrayList<Integer> response = new ArrayList<>();
        
        int lastPointerA = a.size() - 1;
        int lastPointerB = b.size() - 1;
        
        int wholePart = 0;
        
        while (lastPointerA >= 0 && lastPointerB >= 0) {
            Integer sum = a.get(lastPointerA) + b.get(lastPointerB);
            
            if (wholePart == 0) {
                if (sum % 10 == sum) {
                    response.add(0, sum);
                } else {
                    int remainder = sum % 10;
                    response.add(0, remainder);
                    
                    wholePart += 1;
                }
            } else {
                int sumWithWholePart = sum + wholePart;
                wholePart--;
                
                if (sumWithWholePart % 10 == sumWithWholePart) {
                    response.add(0, sumWithWholePart);
                } else {
                    int remainder = sumWithWholePart % 10;
                    response.add(0, remainder);
                    
                    wholePart += 1;
                }
            }
            
            
            lastPointerA--;
            lastPointerB--;
        }
        
        while (lastPointerA >= 0) {
            if (wholePart == 0) {
                Integer current = a.get(lastPointerA);
                response.add(0, current);
                
                lastPointerA--;
                
            } else {
                Integer sum = a.get(lastPointerA) + wholePart;
                wholePart--;
                lastPointerA--;
                
                if (sum % 10 == sum) {
                    response.add(0, sum);
                } else {
                    int remainder = sum % 10;
                    response.add(0, remainder);
                    
                    wholePart += 1;
                }
            }
        }
        while (lastPointerB >= 0) {
            if (wholePart == 0) {
                
                Integer current = b.get(lastPointerB);
                response.add(0, current);
                
                lastPointerB--;
                
            } else {
                Integer sum = b.get(lastPointerB) + wholePart;
                wholePart--;
                lastPointerB--;
                
                if (sum % 10 == sum) {
                    response.add(0, sum);
                } else {
                    int remainder = sum % 10;
                    response.add(0, remainder);
                    
                    wholePart += 1;
                }
            }
            
        }
        return response;
    }
}
