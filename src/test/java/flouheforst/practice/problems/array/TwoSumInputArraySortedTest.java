package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumInputArraySortedTest {
    TwoSumInputArraySorted twoSumInputArraySorted;
    
    @Before
    public void setUp() {
        this.twoSumInputArraySorted = new TwoSumInputArraySorted();
    }
    
    @Test
    public void test1() {
        final int target = 9;
        final int[] nums = {2, 7, 11, 15};
        
        final int[] expect = {1, 2};
        
        final int[] response = twoSumInputArraySorted.solution(nums, target);
        assertArrayEquals(expect, response);
    }
    
    @Test
    public void test2() {
        final int target = -1;
        final int[] nums = {-1, 0};
        
        final int[] expect = {1, 2};
        
        final int[] response = twoSumInputArraySorted.solution(nums, target);
        assertArrayEquals(expect, response);
    }
    
    @Test
    public void test3() {
        final int target = 6;
        final int[] nums = {2, 3, 4};
        
        final int[] expect = {1, 3};
        
        final int[] response = twoSumInputArraySorted.solution(nums, target);
        assertArrayEquals(expect, response);
    }
}
