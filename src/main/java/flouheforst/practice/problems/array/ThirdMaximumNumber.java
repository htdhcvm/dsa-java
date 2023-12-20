package flouheforst.practice.problems.array;


import java.util.Arrays;

public class ThirdMaximumNumber {
    public int solution(int[] nums) {
        Arrays.sort(nums);
        
        for (int i = 0, j = nums.length - 1, tmp; i < j; i++, j--) {
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        
        int meetMax = 2;
        int responseMax = nums[0];
        int response = nums[0];
        
        
        for (int i = 1; i < nums.length; i++) {
            if (response == nums[i]) {
                continue;
            }
            
            if (meetMax == 0) {
                break;
            }
            
            if (response > nums[i]) {
                response = nums[i];
            }
            
            if (response < nums[i]) {
                responseMax = nums[i];
            }
            
            if (nums[i] != nums[i - 1]) {
                meetMax--;
            }
        }
        
        if (meetMax == 0) {
            return response;
        }
        
        return responseMax;
    }
}
