package flouheforst.practice.problems.array;


public class RotateArray {
    public void solution(
            int[] nums,
            int k
    ) {
        int[] tmp = new int[nums.length - 1];
        
        for (int i = 0; i < k; i++) {
            
            System.arraycopy(nums, 0, tmp, 0, nums.length - 1);
            
            nums[0] = nums[nums.length - 1];
            
            int iter = 1;
            for (int j = 0; j < nums.length - 1; j++) {
                nums[iter] = tmp[j];
                iter++;
            }
        }
    }
    
    
    public void solution2(
            int[] nums,
            int k
    ) {
        for (int i = 0; i < k; i++) {
            int tmp = nums[0];
            nums[0] = nums[nums.length - 1];
            
            
            for (int j = 1; j < nums.length; j++) {
                int t = nums[j];
                nums[j] = tmp;
                tmp = t;
            }
        }
    }
    
    public void solution3(
            int[] nums,
            int k
    ) {
        final int countRotate = k % nums.length;
        
        if (countRotate == 0) {
            return;
        }
        
        for (int i = 0; i < countRotate; i++) {
            int tmp = nums[0];
            nums[0] = nums[nums.length - 1];
            
            
            for (int j = 1; j < nums.length; j++) {
                int t = nums[j];
                nums[j] = tmp;
                tmp = t;
            }
        }
    }
    
    
    public void solution4(
            int[] nums,
            int k
    ) {
        final int countRotate = k % nums.length;
        
        if (countRotate == 0) {
            return;
        }
        
        
        if (nums.length / 2 < countRotate) {
            int[] tmp = new int[nums.length - countRotate];
            
            if (nums.length - countRotate >= 0)
                System.arraycopy(nums, 0, tmp, 0, nums.length - countRotate);
            
            int j = 0;
            for (int i = nums.length - countRotate; i < nums.length; i++) {
                nums[j] = nums[i];
                j++;
            }
            
            int q = 0;
            
            for (int i = countRotate; i < nums.length; i++) {
                nums[i] = tmp[q];
                q++;
            }
            
        } else {
            int[] tmp = new int[countRotate];
            
            int j = 0;
            
            for (int i = nums.length - countRotate; i < nums.length; i++) {
                tmp[j] = nums[i];
                j++;
            }
            
            
            int q = nums.length - 1;
            for (int i = nums.length - countRotate - 1; i >= 0; i--) {
                nums[q] = nums[i];
                q--;
            }
            
            System.arraycopy(tmp, 0, nums, 0, countRotate);
        }
    }
    
}
