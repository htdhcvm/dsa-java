package flouheforst.practice.problems.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leaders {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        
        final int size = arr.length - 1;
        int max = arr[size];
        
        for (int i = size; i >= 0; i--) {
            if (i == size) {
                list.add(arr[i]);
                continue;
            }
            
            if (arr[i] > max) {
                list.add(arr[i]);
                max = arr[i];
            }
        }
        
        Collections.reverse(list);
        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }
    
    
    public List<Integer> solution2(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        final int size = arr.length - 1;
        int max = arr[size];
        
        for (int i = size; i >= 0; i--) {
            if (i == size) {
                list.add(arr[i]);
                continue;
            }
            
            if (arr[i] > max) {
                list.add(arr[i]);
                max = arr[i];
            }
        }
        
        Collections.reverse(list);
        return list;
    }
}
