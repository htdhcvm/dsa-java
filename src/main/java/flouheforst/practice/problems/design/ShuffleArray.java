package flouheforst.practice.problems.design;

import java.util.*;

public class ShuffleArray {
    private final HashMap<Integer, Integer> hashMap = new HashMap<>();
    private final int size;
    private final int[] arr;
    
    public ShuffleArray(int[] nums) {
        size = nums.length;
        arr = new int[size];
        
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(i, nums[i]);
        }
    }
    
    public int[] reset() {
        for (int i = 0; i < size; i++) {
            arr[i] = hashMap.get(i);
        }
        
        return arr;
    }
    
    public int[] shuffle() {
        Set<Integer> keys = hashMap.keySet();
        List<Integer> arrKeys = new ArrayList<>(keys);
        
        Collections.shuffle(arrKeys);
        
        int i = 0;
        for (Integer item : arrKeys) {
            arr[i] = hashMap.get(item);
            i++;
        }
        
        return arr;
    }
}
