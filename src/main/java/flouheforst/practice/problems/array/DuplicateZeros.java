package flouheforst.practice.problems.array;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        
        int countZeroes = 0;
        
        for (int item : arr) {
            if (item == 0) {
                countZeroes++;
            }
        }
        
        if (countZeroes == 0) {
            return;
        }
        
        int lastElement = arr.length - countZeroes;
        
        arr[arr.length - 1] = arr[lastElement];
        
        int j = lastElement - 1;
        
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[j] == 0) {
                arr[i] = arr[j];
                arr[i - 1] = arr[j];
                
                i--;
                j--;
            } else {
                arr[i] = arr[j];
                
                j--;
            }
        }
    }
}
