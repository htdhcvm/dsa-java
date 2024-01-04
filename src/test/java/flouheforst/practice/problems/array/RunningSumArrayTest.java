package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RunningSumArrayTest {
    RunningSumArray runningSumArray;
    
    @Before
    public void setUp() {
        runningSumArray = new RunningSumArray();
    }
    
    @Test
    public void test1() {
        int[] nums = {1, 2, 3, 4};
        int[] expect = {1, 3, 6, 10};
        
        int[] response = runningSumArray.solution(nums);
        
        assertArrayEquals(expect, response);
    }
    
    
    @Test
    public void test2() {
        int[] nums = {1, 1, 1, 1, 1};
        int[] expect = {1, 2, 3, 4, 5};
        
        int[] response = runningSumArray.solution(nums);
        
        assertArrayEquals(expect, response);
    }
    
    
    @Test
    public void test3() {
        int[] nums = {3, 1, 2, 10, 1};
        int[] expect = {3, 4, 6, 16, 17};
        
        int[] response = runningSumArray.solution(nums);
        
        assertArrayEquals(expect, response);
    }
}
