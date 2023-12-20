package flouheforst.practice.problems.array;

import java.util.HashMap;

public class ContainsDuplicate {
    public boolean solution(
            int[] nums,
            int k
    ) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            
            if (hm.containsKey(current) && i - hm.get(current) <= k) {
                return true;
            } else {
                hm.put(current, i);
            }
        }
        
        return false;
    }
}
