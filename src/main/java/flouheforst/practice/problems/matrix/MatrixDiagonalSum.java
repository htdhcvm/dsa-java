package flouheforst.practice.problems.matrix;

public class MatrixDiagonalSum {
    public int solution(int[][] sum) {
        int x = sum.length - 1;
        
        int response = 0;
        
        for (int i = 0; i < sum.length; i++) {
            for (int k = 0; k < sum.length; k++) {
                if (i == k) {
                    response += sum[i][k];
                }
                
                if (x - i == k) {
                    response += sum[i][k];
                }
            }
        }
        
        if (sum.length % 2 != 0) {
            response -= sum[sum.length / 2][sum.length / 2];
        }
        
        return response;
    }
}
