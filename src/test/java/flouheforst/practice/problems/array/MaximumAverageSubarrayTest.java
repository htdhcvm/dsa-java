package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumAverageSubarrayTest {
    
    MaximumAverageSubarray maximumAverageSubarray;
    
    @Before
    public void setUp() {
        this.maximumAverageSubarray = new MaximumAverageSubarray();
    }
    
    
    @Test
    public void test1() {
        final int[] nums = {1, 12, -5, -6, 50, 3};
        final int k = 4;
        
        final double expect = 12.75000;
        
        final double response = this.maximumAverageSubarray.solution(nums, k);
        assertEquals(expect, response, 0.0001);
    }
    
    
    @Test
    public void test2() {
        final int[] nums = {5};
        final int k = 1;
        
        final double expect = 5.00000;
        
        final double response = this.maximumAverageSubarray.solution(nums, k);
        
        assertEquals(expect, response, 0.0001);
    }
    
    
    @Test
    public void test3() {
        final int[] nums = {5, 5};
        final int k = 2;
        
        final double expect = 5.00000;
        
        final double response = this.maximumAverageSubarray.solution(nums, k);
        
        assertEquals(expect, response, 0.0001);
    }
    
    
    @Test
    public void test4() {
        final int[] nums = {4, 0, 4, 3, 3};
        final int k = 5;
        
        final double expect = 2.80000;
        
        final double response = this.maximumAverageSubarray.solution(nums, k);
        
        assertEquals(expect, response, 0.0001);
    }
    
}

