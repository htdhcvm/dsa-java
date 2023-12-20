package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContainDuplicatesTest {
    
    ContainDuplicates containDuplicates;
    
    @Before
    public void setUp() {
        this.containDuplicates = new ContainDuplicates();
    }
    
    @Test
    public void test1() {
        final int[] nums = {1, 2, 3, 1};
        final boolean expect = true;
        
        final boolean response = this.containDuplicates.solution(nums);
        assertEquals(expect, response);
    }
    
    @Test
    public void test2() {
        final int[] nums = {1, 2, 3, 4};
        final boolean expect = false;
        
        final boolean response = this.containDuplicates.solution(nums);
        assertEquals(expect, response);
    }
    
    @Test
    public void test3() {
        final int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        final boolean expect = true;
        
        final boolean response = this.containDuplicates.solution(nums);
        assertEquals(expect, response);
    }
    
}
