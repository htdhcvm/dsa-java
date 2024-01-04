package flouheforst.practice.problems.array;

public class LeftRightSumDifferences {
    public int[] solution(int[] nums) {
        int[] response = new int[nums.length];
        
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        
        int i = 0;
        int j = nums.length - 1;
        int q = 1;
        int q2 = right.length - 2;
        
        while (i < nums.length - 1) {
            left[q] = left[q - 1] + nums[i];
            right[q2] = right[q2 + 1] + nums[j];
            
            q++;
            q2--;
            i++;
            j--;
        }
        
        for (int k = 0; k < left.length; k++) {
            int res = Math.abs(left[k] - right[k]);
            
            response[k] = res;
        }
        
        return response;
    }
}
