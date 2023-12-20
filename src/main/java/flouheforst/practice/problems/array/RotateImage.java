package flouheforst.practice.problems.array;

public class RotateImage {
    
    public void solution(int[][] matrix) {
        final int depth = matrix.length / 2;
        
        for (int i = 0; i < depth; i++) {
            if (i == 0) {
                for (int k = i; k < matrix.length - 1; k++) {
                    
                    System.out.println("i: " + i + " k: " + k + ", " + matrix[i][k]);
                }
            } else {
                for (int k = i; k < matrix.length - i; k++) {
                    System.out.println("i: " + i + " k: " + k + ", " + matrix[i][k]);
                }
            }
            System.out.println("\n");
        }
    }
}
