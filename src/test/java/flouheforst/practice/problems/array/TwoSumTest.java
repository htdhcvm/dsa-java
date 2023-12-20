package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {
    TwoSum twoSum;
    
    @Before
    public void setUp() {
        this.twoSum = new TwoSum();
    }
    
    @Test
    public void test1() {
        final int[] expect = {0, 1};
        final int target = 9;
        final int[] nums = {2, 7, 11, 15};
        
        final int[] response = this.twoSum.solution2(nums, target);
        assertArrayEquals(expect, response);
    }
    
    @Test
    public void test2() {
        final int[] expect = {1, 2};
        final int target = 6;
        final int[] nums = {3, 2, 4};
        
        final int[] response = this.twoSum.solution2(nums, target);
        assertArrayEquals(expect, response);
    }
    
    @Test
    public void test3() {
        final int[] expect = {0, 1};
        final int target = 6;
        final int[] nums = {3, 3};
        
        final int[] response = this.twoSum.solution2(nums, target);
        assertArrayEquals(expect, response);
    }
}
