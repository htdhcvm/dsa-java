package flouheforst.practice.problems.array;

public class SquaresSortedArray {
    public int[] sortedSquares(int[] nums) {
        final int[] tmp = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0)
                tmp[i] = nums[i] * -1;
            
            tmp[i] = nums[i] * nums[i];
        }
        
        for (int i = 0; i < tmp.length; i++) {
            for (int j = 0; j < tmp.length - 1; j++) {
                if (tmp[j] > tmp[j + 1]) {
                    int tmpNum = tmp[j];
                    tmp[j] = tmp[j + 1];
                    tmp[j + 1] = tmpNum;
                }
            }
        }
        
        return tmp;
    }
}
