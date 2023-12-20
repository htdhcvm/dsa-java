package flouheforst.practice.problems.array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> response = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            int size = i + 1;
            List<Integer> tmp = new ArrayList<>();
            
            for (int j = 0; j < size; j++) {
                if (j - 1 < 0 || j + 1 == size) {
                    tmp.add(1);
                    continue;
                }
                
                int leftIndex = j - 1;
                int rightIndex = j;
                
                List<Integer> partResponse = response.get(i - 1);
                int value = partResponse.get(leftIndex) + partResponse.get(rightIndex);
                
                tmp.add(value);
            }
            
            response.add(tmp);
        }
        
        return response;
    }
}
