package flouheforst.practice.problems.array;

public class RemoveDuplicatesSortedArray {
    public int solution(int[] nums) {
        int res = nums.length;
        
        for (int i = 1; i < res; i++) {
            if (nums[i] == nums[i - 1]) {
                int tmp = nums[i];
                
                for (int j = i + 1; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                }
                
                nums[nums.length - 1] = tmp;
                
                i--;
                res--;
            }
        }
        
        return res;
    }
    
    public int soluction2(int[] nums) {
        if (nums == null) {
            return 0;
        }
        
        int writePointer = 1;
        
        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != nums[readPointer - 1]) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }
        
        
        return writePointer;
    }
}
