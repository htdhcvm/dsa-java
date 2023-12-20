package flouheforst.practice.problems.array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] solution(
            int[] nums,
            int target
    ) {
        int firstIter = 0;
        int lastIter = nums.length - 1;
        
        
        int[] tmp = this.sortAndReturnNewArray(nums);
        int[] values = new int[2];
        
        for (int i = 0; i < tmp.length; i++) {
            int sum = tmp[firstIter] + tmp[lastIter];
            
            if (sum == target) {
                values[0] = tmp[firstIter];
                values[1] = tmp[lastIter];
                break;
            }
            
            if (sum > target) {
                
                if (tmp[firstIter] > tmp[lastIter]) {
                    firstIter++;
                } else {
                    lastIter--;
                }
            }
            if (sum < target) {
                if (tmp[firstIter] > tmp[lastIter]) {
                    
                    lastIter--;
                } else {
                    
                    firstIter++;
                }
            }
        }
        
        int[] response = new int[2];
        
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == values[0] || nums[i] == values[1]) {
                response[j] = i;
                j++;
                
            }
        }
        
        return response;
    }
    
    
    private int[] sortAndReturnNewArray(int[] arr) {
        int[] tmp = new int[arr.length];
        
        System.arraycopy(arr, 0, tmp, 0, arr.length);
        
        Arrays.sort(tmp);
        
        return tmp;
    }
    
    public int[] solution2(
            int[] nums,
            int target
    ) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }
        
        int[] response = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            int condition = target - nums[i];
            if (hm.containsKey(condition) && i != hm.get(condition)) {
                response[0] = i;
                response[1] = hm.get(condition);
                break;
                
            }
        }
        return response;
    }
}
