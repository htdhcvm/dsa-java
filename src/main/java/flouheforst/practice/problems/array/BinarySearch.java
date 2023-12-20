package flouheforst.practice.problems.array;

public class BinarySearch {
    public int search(
            int[] nums,
            int target
    ) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int middle = calMiddle(right, left);
            int item = nums[middle];
            
            if (item == target) {
                return middle;
            }
            
            if (item < target) {
                left = middle + 1;
                continue;
            }
            
            if (item > target) {
                right = middle - 1;
            }
        }
        
        if (nums.length == 1 && nums[0] == target) {
            return 0;
        }
        
        return -1;
    }
    
    private int calMiddle(
            int right,
            int left
    ) {
        return left + ((right - left) / 2);
    }
}
