package flouheforst.practice.problems.array;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        boolean res = false;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && 0 <= i && j < arr.length && arr[i] == 2 * arr[j]) {
                    res = true;
                    break;
                }
            }
            
            if (res) {
                break;
            }
        }
        
        return res;
    }
    
    public boolean checkIfExistV2(int @NotNull [] arr) {
        boolean res = false;
        
        Set<Integer> set = new HashSet();
        
        for (int value : arr) {
            if (set.contains(value * 2) || (value % 2 == 0 && set.contains(value / 2))) {
                res = true;
                break;
            }
            set.add(value);
        }
        
        return res;
    }
}
