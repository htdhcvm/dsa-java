package flouheforst.practice.problems.array;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArrays {
    public int[] solution(
            int[] nums1,
            int[] nums2
    ) {
        HashMap<Integer, Integer> mapNum1 = new HashMap<>();
        HashMap<Integer, Integer> mapNum2 = new HashMap<>();
        
        this.arrToMap(nums1, mapNum1);
        this.arrToMap(nums2, mapNum2);
        
        if (mapNum1.size() < mapNum2.size()) {
            ArrayList<Integer> responseAL = this.itersection(mapNum1, mapNum2);
            return this.arrayListToArray(responseAL);
        }
        
        if (mapNum2.size() < mapNum1.size()) {
            ArrayList<Integer> responseAL = this.itersection(mapNum2, mapNum1);
            return this.arrayListToArray(responseAL);
        }
        
        ArrayList<Integer> responseAL = this.itersection(mapNum1, mapNum2);
        return this.arrayListToArray(responseAL);
    }
    
    private int[] arrayListToArray(ArrayList<Integer> al) {
        int[] response = new int[al.size()];
        
        int i = 0;
        for (Integer item : al) {
            response[i] = item;
            i++;
        }
        
        return response;
    }
    
    private ArrayList<Integer> itersection(
            HashMap<Integer, Integer> min,
            HashMap<Integer, Integer> max
    ) {
        ArrayList<Integer> al = new ArrayList();
        
        for (Integer item : min.keySet()) {
            if (max.containsKey(item)) {
                Integer countMin = min.get(item);
                Integer countMax = max.get(item);
                
                Integer minCount = this.getMin(countMin, countMax);
                
                for (int i = 0; i < minCount; i++) {
                    al.add(item);
                }
                
            }
        }
        
        return al;
    }
    
    private Integer getMin(
            Integer first,
            Integer second
    ) {
        if (first < second)
            return first;
        return second;
    }
    
    private void arrToMap(
            int[] nums,
            HashMap<Integer, Integer> map
    ) {
        for (int num : nums) {
            if (map.containsKey(num)) {
                Integer count = map.get(num);
                count++;
                map.put(num, count);
            } else {
                map.put(num, 1);
            }
        }
    }
}
