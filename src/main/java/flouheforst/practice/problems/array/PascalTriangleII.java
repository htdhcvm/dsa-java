package flouheforst.practice.problems.array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    
    private static ArrayList<Integer> getRow(
            List<List<Integer>> response,
            int i
    ) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int currentSize = response.get(i - 1)
                .size() + 2;
        for (int k = 0; k < currentSize; k++) {
            
            if (k == 0 || k == currentSize - 1) {
                arrayList.add(1);
            } else {
                arrayList.add(response.get(i)
                                      .get(k - 1) + response.get(i)
                        .get(k));
            }
        }
        return arrayList;
    }
    
    public List<Integer> solution(int rowIndex) {
        List<List<Integer>> response = new ArrayList<>();
        response.add(List.of(1));
        response.add(List.of(1, 1));
        
        if (rowIndex == 0 || rowIndex == 1)
            return response.get(rowIndex);
        
        for (int i = 1; i < rowIndex; i++) {
            ArrayList<Integer> arrayList = getRow(response, i);
            response.add(arrayList);
        }
        
        return response.get(rowIndex);
    }
}
