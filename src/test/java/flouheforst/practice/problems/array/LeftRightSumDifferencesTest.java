package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class LeftRightSumDifferencesTest {
    LeftRightSumDifferences leftRightSumDifferences;
    
    @Before
    public void setUp() {
        leftRightSumDifferences = new LeftRightSumDifferences();
    }
    
    @Test
    public void test1() {
        int[] nums = {10, 4, 8, 3};
        int[] expect = {15, 1, 11, 22};
        
        int[] response = leftRightSumDifferences.solution(nums);
        
        assertArrayEquals(expect, response);
    }
    
    
    @Test
    public void test2() {
        int[] nums = {1};
        int[] expect = {0};
        
        int[] response = leftRightSumDifferences.solution(nums);
        
        assertArrayEquals(expect, response);
    }
}
