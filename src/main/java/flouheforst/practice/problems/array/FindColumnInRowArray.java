package flouheforst.practice.problems.array;

import java.util.ArrayList;
import java.util.List;

public class FindColumnInRowArray {
    public List<Integer> find(List<Integer> arr, Integer row, Integer column, Integer indexColumn) {
        List<Integer> response = new ArrayList<>();

        for(int i = 0; i <  row; i++) {
            int currentRow = i + 1;
            int lastIndexRow = currentRow * column;

            int diffColumns = column - (indexColumn - 1);

            response.add(arr.get(lastIndexRow - diffColumns));
        }

        return response;
    }
}
