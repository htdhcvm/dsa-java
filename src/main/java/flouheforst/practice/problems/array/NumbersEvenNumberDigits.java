package flouheforst.practice.problems.array;

public class NumbersEvenNumberDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            String s = String.valueOf(current);
            if (s.length() % 2 == 0) {
                count++;
            }
        }
        
        return count;
    }
}
