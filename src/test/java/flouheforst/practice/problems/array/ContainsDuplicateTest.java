package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContainsDuplicateTest {
    
    ContainsDuplicate containsDuplicate;
    
    @Before
    public void setUp() {
        this.containsDuplicate = new ContainsDuplicate();
    }
    
    @Test
    public void test1() {
        final int[] nums = {1, 2, 3, 1};
        final int k = 3;
        
        final boolean expect = true;
        
        final boolean response = this.containsDuplicate.solution(nums, k);
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test2() {
        final int[] nums = {1, 0, 1, 1};
        final int k = 1;
        
        final boolean expect = true;
        
        final boolean response = this.containsDuplicate.solution(nums, k);
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test3() {
        final int[] nums = {1, 2, 3, 1, 2, 3};
        final int k = 2;
        
        final boolean expect = false;
        
        final boolean response = this.containsDuplicate.solution(nums, k);
        assertEquals(expect, response);
    }
    
    
}
