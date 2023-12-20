package flouheforst.practice.problems.array;

public class ReplaceElementsGreatestElemRightSide {
    public int[] solution(int[] arr) {
        
        if (arr.length == 0)
            return arr;
        
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arr[i] = -1;
                break;
            }
            
            int max = arr[i + 1];
            
            for (int j = i + 2; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
            
            arr[i] = max;
            
        }
        
        return arr;
    }
    
    public int[] solution2(int[] arr) {
        int max = Integer.MIN_VALUE;
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (max < arr[i]) {
                int tmp = max;
                max = arr[i];
                arr[i] = tmp;
                
                if (i == arr.length - 1) {
                    arr[i] = -1;
                }
                
                
            } else {
                arr[i] = max;
            }
        }
        
        return arr;
    }
}
