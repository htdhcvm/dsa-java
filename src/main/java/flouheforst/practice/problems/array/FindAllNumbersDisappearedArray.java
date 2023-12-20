package flouheforst.practice.problems.array;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedArray {
    public List<Integer> solution(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int[] tmp = new int[nums.length + 1];
        tmp[0] = 1;
        
        for (int i = 0; i < nums.length; i++) {
            tmp[nums[i]] = 1;
        }
        
        int iteratorTmp = 0;
        
        while (tmp[iteratorTmp] == 0) {
            iteratorTmp++;
        }
        
        while (iteratorTmp < tmp.length) {
            if (tmp[iteratorTmp] == 0) {
                l.add(iteratorTmp);
            }
            iteratorTmp++;
        }
        
        return l;
    }
    
    public List<Integer> solution2(int[] nums) {
        List<Integer> l = new ArrayList<>();
        
        
        return l;
    }
}
