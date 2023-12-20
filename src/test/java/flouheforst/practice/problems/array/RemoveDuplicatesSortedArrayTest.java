package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesSortedArrayTest {
    
    RemoveDuplicatesSortedArray removeDuplicatesSortedArray;
    
    @Before
    public void setUp() {
        this.removeDuplicatesSortedArray = new RemoveDuplicatesSortedArray();
    }
    
    @Test
    public void test1() {
        final int expect = 2;
        final int[] nums = {1, 1, 2};
        
        
        final int result = this.removeDuplicatesSortedArray.solution(nums);
        
        
        assertEquals(expect, result);
    }
    
    @Test
    public void test2() {
        final int expect = 5;
        
        final int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        
        final int result = this.removeDuplicatesSortedArray.soluction2(nums);
        
        assertEquals(expect, result);
    }
    
    @Test
    public void test3() {
        final int expect = 2;
        final int[] nums = {1, 2, 2, 2};
        
        final int result = this.removeDuplicatesSortedArray.solution(nums);
        
        assertEquals(expect, result);
    }
    
    
}
