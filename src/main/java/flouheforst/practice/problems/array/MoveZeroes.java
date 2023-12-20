package flouheforst.practice.problems.array;

public class MoveZeroes {
    private final int FIND_VALUE = 0;
    
    public void solution(int[] nums) {
        int writePointer = 0;
        boolean isChange = false;
        
        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            if (isChange && nums[readPointer] != this.FIND_VALUE) {
                int tmp = nums[writePointer];
                nums[writePointer] = nums[readPointer];
                nums[readPointer] = tmp;
                
                writePointer++;
                isChange = false;
            }
            
            if (nums[writePointer] == this.FIND_VALUE && !isChange) {
                isChange = true;
            }
            
            if (nums[readPointer] == this.FIND_VALUE && !isChange) {
                writePointer = readPointer;
                isChange = true;
            }
        }
    }
    
    
    public void solution1(int[] nums) {
        if (nums.length == 1)
            return;
        int left = 0;
        int right = 0;
        
        while (right < nums.length) {
            
            if (nums[left] != 0) {
                left++;
                right++;
                continue;
            }
            
            while (right < nums.length - 1 && nums[right] == 0) {
                right++;
            }
            
            nums[left] = nums[right];
            nums[right] = 0;
            
            left++;
            right++;
        }
    }
}
