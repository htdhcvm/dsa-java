package flouheforst.practice.problems.array;

public class NumberSubarraysSizeAverageGreaterEqualThreshold {
    public int numOfSubarrays(
            int[] arr,
            int k,
            int threshold
    ) {
        int response = 0;
        
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (count < k) {
                sum += arr[i];
                count++;
            } else {
                if (sum / k >= threshold) {
                    response++;
                }
                
                sum -= arr[i - k];
                sum += arr[i];
            }
        }
        
        if (sum / k >= threshold) {
            response++;
        }
        
        return response;
    }
}
