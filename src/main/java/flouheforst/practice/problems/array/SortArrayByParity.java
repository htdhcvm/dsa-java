package flouheforst.practice.problems.array;

public class SortArrayByParity {
    public int[] solution(int[] nums) {
        int[] response = new int[nums.length];
        
        int responseEndIterator = nums.length - 1;
        int responseStartIterator = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                response[responseStartIterator] = nums[i];
                responseStartIterator++;
            } else {
                response[responseEndIterator] = nums[i];
                responseEndIterator--;
            }
        }
        
        return response;
    }
}
