package flouheforst.practice.problems.array;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int currentMax = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            
            if (current == 1) {
                currentMax++;
                if (currentMax > res) {
                    res = currentMax;
                }
            } else {
                currentMax = 0;
            }
        }
        
        return res;
    }
}
