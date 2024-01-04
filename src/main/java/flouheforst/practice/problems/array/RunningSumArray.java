package flouheforst.practice.problems.array;

public class RunningSumArray {
    
    public int[] solution(int[] nums) {
        int[] response = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                response[i] = nums[i];
                continue;
            }
            response[i] = response[i - 1] + nums[i];
        }
        
        return response;
    }
}
