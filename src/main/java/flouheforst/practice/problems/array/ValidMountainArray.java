package flouheforst.practice.problems.array;


public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        
        boolean isAsc = true;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                isAsc = false;
                break;
            }
        }
        
        
        if (isAsc) {
            return false;
        }
        
        boolean isHighDifference = false;
        
        for (int i = 1; i < arr.length; i++) {
            int prev = arr[i - 1];
            int current = arr[i];
            
            
            if (isHighDifference) {
                if (prev == current) {
                    return false;
                }
                if (prev < current) {
                    return false;
                }
            }
            
            if (!isHighDifference) {
                if (prev == current) {
                    return false;
                }
                if (prev > current) {
                    isHighDifference = true;
                }
            }
        }
        
        return isHighDifference;
    }
    
    
    public boolean validMountainArrayV2(int[] arr) {
        int climb = 0;
        
        while (climb < arr.length - 1 && arr[climb] < arr[climb + 1]) {
            climb += 1;
        }
        
        if (climb == 0 || climb == arr.length - 1) {
            return false;
        }
        
        while (climb < arr.length - 1 && arr[climb] > arr[climb + 1]) {
            climb += 1;
        }
        
        return climb == arr.length - 1;
    }
}
