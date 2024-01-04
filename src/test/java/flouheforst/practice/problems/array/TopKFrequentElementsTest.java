package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TopKFrequentElementsTest {
    
    TopKFrequentElements topKFrequentElements;
    
    @Before
    public void setUp() {
        topKFrequentElements = new TopKFrequentElements();
    }
    
    @Test
    public void test1() {
        final int[] nums = {1, 1, 1, 2, 2, 3};
        final int k = 2;
        final int[] expect = {1, 2};
        
        final int[] response = topKFrequentElements.solution(nums, k);
        
        assertArrayEquals(expect, response);
    }
    
    @Test
    public void test2() {
        final int[] nums = {1};
        final int k = 1;
        final int[] expect = {1};
        
        final int[] response = topKFrequentElements.solution(nums, k);
        
        assertArrayEquals(expect, response);
    }
    
    
    @Test
    public void test3() {
        final int[] nums = {4, 1, -1, 2, -1, 2, 3};
        final int k = 2;
        final int[] expect = {2, -1};
        
        final int[] response = topKFrequentElements.solution(nums, k);
        
        assertArrayEquals(expect, response);
    }
    
}
