package flouheforst.practice.problems.array;

public class MaximumAverageSubarray {
    
    public double solution(
            int[] nums,
            int k
    ) {
        if (nums.length < k) {
            return 0;
        }
        
        double response = Double.NEGATIVE_INFINITY;
        
        int count = 0;
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            count++;
            
            if (count == k) {
                count--;
                if (i >= k) {
                    sum -= nums[i - k];
                }
                double tmp = (double) sum / k;
                
                if (response < tmp) {
                    response = tmp;
                }
            }
        }
        
        return response;
    }
}
