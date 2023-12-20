package flouheforst.practice.problems.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majorCount = nums.length / 2;
        
        HashMap<Integer, Integer> hm = new HashMap();
        
        for (int item : nums) {
            hm.computeIfPresent(item, (k, v) -> v += 1);
            hm.computeIfAbsent(item, k -> 1);
        }
        
        int maxValue = nums[0];
        int maxMet = 0;
        
        for (Map.Entry<Integer, Integer> item : hm.entrySet()) {
            int countMet = item.getValue();
            int value = item.getKey();
            
            if (maxMet < countMet) {
                maxValue = value;
                maxMet = countMet;
            }
        }
        
        if (maxMet >= majorCount) {
            return maxValue;
        }
        
        return -1;
    }
    
    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        int majorCount = nums.length / 2;
        
        if (nums.length == 1) {
            return nums[0];
        }
        
        int first = 0;
        int second = 1;
        
        int value = nums[first];
        int count = 1;
        
        int valueTmp = nums[second];
        int countTmp = 1;
        
        while (second < nums.length) {
            int firstValue = nums[first];
            int secondValue = nums[second];
            
            if (secondValue == firstValue) {
                countTmp++;
            }
            
            if (secondValue != firstValue) {
                if (countTmp >= count) {
                    value = valueTmp;
                    count = countTmp;
                }
                
                valueTmp = secondValue;
                countTmp = 1;
            }
            
            first++;
            second++;
        }
        
        if (countTmp >= count) {
            value = valueTmp;
            count = countTmp;
        }
        
        if (count >= majorCount) {
            return value;
        }
        
        return -1;
    }
    
    
    public int majorityElement3(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];
    }
}
