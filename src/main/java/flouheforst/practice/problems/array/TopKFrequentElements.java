package flouheforst.practice.problems.array;

import java.util.*;

public class TopKFrequentElements {
    public int[] solution(
            int[] nums,
            int k
    ) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                map.put(num, ++count);
            } else {
                map.put(num, 1);
            }
        }
        
        Map<Integer, List<Integer>> mapMax = new TreeMap<>(Collections.reverseOrder());
        map.forEach((key, value) -> {
            if (mapMax.containsKey(value)) {
                mapMax.get(value)
                        .add(key);
            } else {
                List<Integer> ll = new LinkedList<>();
                ll.add(key);
                mapMax.put(value, ll);
            }
        });
        
        
        int[] response = new int[k];
        int i = 0;
        
        for (Map.Entry<Integer, List<Integer>> entry : mapMax.entrySet()) {
            if (i >= k) {
                break;
            }
            List<Integer> ll = entry.getValue();
            
            for (Integer value : ll) {
                if (i >= k) {
                    break;
                }
                response[i] = value;
                i++;
            }
            
        }
        
        return response;
    }
}
