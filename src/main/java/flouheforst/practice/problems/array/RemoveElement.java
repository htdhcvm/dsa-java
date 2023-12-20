package flouheforst.practice.problems.array;

public class RemoveElement {
    public int solution(
            int[] nums,
            int val
    ) {
        int response = 0;
        int lastIndex = nums.length - 1;
        
        if (nums.length == 1 && nums[0] != val) {
            response++;
            return response;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (i == lastIndex && nums[i] != val) {
                response++;
            }
            if (i == lastIndex) {
                break;
            }
            
            
            if (nums[i] == val) {
                while (nums[lastIndex] == val && lastIndex > i) {
                    lastIndex--;
                }
                
                if (i == lastIndex) {
                    break;
                }
                
                int tmp = nums[lastIndex];
                
                nums[lastIndex] = nums[i];
                nums[i] = tmp;
                
            }
            
            response++;
        }
        
        return response;
    }
    
    public int solution2(
            int[] nums,
            int val
    ) {
        int count = 0;
        int q = nums.length - 1;
        
        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] == val) {
                for (int j = q; j >= 0; j--) {
                    if (j > i && nums[j] != val) {
                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                        q = j;
                        count++;
                        break;
                    }
                }
            } else {
                count++;
            }
            
        }
        
        return count;
    }
}
