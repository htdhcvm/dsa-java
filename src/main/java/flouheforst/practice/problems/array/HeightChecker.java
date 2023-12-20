package flouheforst.practice.problems.array;

public class HeightChecker {
    public int solution(int[] heights) {
        int response = 0;
        int[] sortArray = new int[heights.length];
        
        System.arraycopy(heights, 0, sortArray, 0, heights.length);
        
        for (int i = 0; i < sortArray.length; i++) {
            for (int j = i + 1; j < sortArray.length; j++) {
                if (sortArray[i] > sortArray[j]) {
                    int tmp = sortArray[i];
                    sortArray[i] = sortArray[j];
                    sortArray[j] = tmp;
                }
            }
            
        }
        
        
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortArray[i]) {
                response++;
            }
        }
        
        return response;
    }
    
    public int solution2(int[] heights) {
        int response = 0;
        int[] tmp = new int[101];
        
        for (int i = 0; i < heights.length; i++) {
            tmp[heights[i]]++;
        }
        
        int indexStartTmp = 0;
        
        for (int i = 0; i < heights.length; i++) {
            while (tmp[indexStartTmp] == 0) {
                indexStartTmp++;
            }
            
            if (indexStartTmp != heights[i]) {
                response++;
            }
            
            tmp[indexStartTmp]--;
            
        }
        
        return response;
    }
}
