package flouheforst.practice.problems.array;

public class SearchInsertPosition {
    public int searchInsert(
            int[] nums,
            int target
    ) {
        if (nums.length == 1 && nums[0] > target) {
            return 0;
        }
        if (nums.length == 1 && nums[0] < target) {
            return 1;
        }
        
        int index = getIndexIfExist(nums, target);
        
        if (index != -1) {
            return index;
        }
        
        int response = -1;
        
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            
            if (value > target && i == 0) {
                response = 0;
                break;
            }
            if (value > target) {
                response = i - 1;
                break;
            }
            
            if (value < target && i == nums.length - 1) {
                response = nums.length;
                break;
            }
        }
        
        return response;
    }
    
    private int getIndexIfExist(
            int[] nums,
            int target
    ) {
        if (nums.length == 1 && nums[0] == target) {
            return 0;
        }
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int middle = calcMiddle(left, right);
            int value = nums[middle];
            
            if (target == value) {
                return middle;
            }
            
            if (target > value) {
                left = middle + 1;
            }
            if (target < value) {
                right = middle - 1;
            }
        }
        
        return -1;
    }
    
    private int calcMiddle(
            int left,
            int right
    ) {
        return (left + right) / 2;
    }
}
