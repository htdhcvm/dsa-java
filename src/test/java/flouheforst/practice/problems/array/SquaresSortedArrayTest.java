package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SquaresSortedArrayTest {
    
    SquaresSortedArray squaresSortedArray;
    
    @Before
    public void setUp() {
        this.squaresSortedArray = new SquaresSortedArray();
    }
    
    @Test
    public void test1() {
        final int[] expect = {0, 1, 9, 16, 100};
        final int[] nums = {-4, -1, 0, 3, 10};
        
        final int[] sortedSquares = this.squaresSortedArray.sortedSquares(nums);
        
        assertArrayEquals(expect, sortedSquares);
    }
    
    @Test
    public void test2() {
        final int[] expect = {4, 9, 9, 49, 121};
        final int[] nums = {-7, -3, 2, 3, 11};
        
        final int[] sortedSquares = this.squaresSortedArray.sortedSquares(nums);
        
        assertArrayEquals(expect, sortedSquares);
    }
    
}
