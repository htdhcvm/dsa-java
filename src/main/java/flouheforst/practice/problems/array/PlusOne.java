package flouheforst.practice.problems.array;

public class PlusOne {
    
    public int[] solution(int[] digits) {
        int lastElement = digits[digits.length - 1];
        int increaseLast = ++lastElement;
        
        if (increaseLast % 10 == increaseLast) {
            digits[digits.length - 1] = increaseLast;
        } else {
            final boolean isNeedResize = this.isNeedArrayMoreSizeWhenIncrease(digits);
            
            
            if (isNeedResize) {
                int[] response = new int[digits.length + 1];
                
                response[0] = 1;
                for (int i = 1; i < response.length; i++) {
                    response[i] = 0;
                }
                
                return response;
                
            } else {
                for (int i = digits.length - 1; i >= 0; i--) {
                    int item = digits[i];
                    int increase = ++item;
                    
                    if (increase % 10 != increase) {
                        digits[i] = 0;
                    } else {
                        digits[i] = increase;
                        break;
                    }
                }
                
                return digits;
            }
        }
        
        return digits;
    }
    
    private boolean isNeedArrayMoreSizeWhenIncrease(int[] digits) {
        boolean response = true;
        
        for (int i = digits.length - 1; i >= 0; i--) {
            int elem = digits[i];
            int increaseElem = ++elem;
            
            
            if (increaseElem % 10 != increaseElem) {
                response = false;
            } else {
                response = true;
                break;
            }
        }
        
        return !response;
    }
}
