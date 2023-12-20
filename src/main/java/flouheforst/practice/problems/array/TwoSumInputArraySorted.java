package flouheforst.practice.problems.array;

public class TwoSumInputArraySorted {
    public int[] solution(
            int[] numbers,
            int target
    ) {
        int[] response = new int[2];
        
        int iterFirst = 0;
        int iterLast = numbers.length - 1;
        
        while (iterFirst < iterLast) {
            int firstValue = numbers[iterFirst];
            int lastValue = numbers[iterLast];
            
            int sum = firstValue + lastValue;
            
            if (sum == target) {
                response[0] = ++iterFirst;
                response[1] = ++iterLast;
                break;
            }
            
            if (sum < target) {
                iterFirst++;
            }
            
            if (sum > target) {
                iterLast--;
            }
        }
        
        return response;
    }
}
