package flouheforst.practice.problems.matrix;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixDiagonalSumTest {
    MatrixDiagonalSum matrixDiagonalSum;
    
    @Before
    public void setUp() {
        matrixDiagonalSum = new MatrixDiagonalSum();
    }
    
    @Test
    public void test1() {
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        final int expect = 25;
        
        final int response = matrixDiagonalSum.solution(data);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test2() {
        int[][] data = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        final int expect = 8;
        
        final int response = matrixDiagonalSum.solution(data);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test3() {
        int[][] data = {{5}};
        final int expect = 5;
        
        final int response = matrixDiagonalSum.solution(data);
        
        assertEquals(expect, response);
    }
}
