package flouheforst.practice.problems.array;

import java.util.HashSet;

public class ContainDuplicates {
    public boolean solution(int[] nums) {
        boolean isContain = false;
        
        HashSet<Integer> s = new HashSet();
        
        for (int num : nums) {
            final boolean isContainS = s.contains(num);
            if (isContainS) {
                isContain = true;
                return isContain;
            }
            s.add(num);
        }
        
        return isContain;
    }
}
