package flouheforst.practice.problems.array;

public class SumSquareNumbers {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int) Math.sqrt(c);
        
        while (left <= right) {
            int value = (int) (Math.pow(left, 2) + Math.pow(right, 2));
            if (value == c) {
                return true;
            }
            
            if (value < c) {
                left++;
            }
            if (value > c) {
                right--;
            }
            
        }
        
        return false;
    }
}
