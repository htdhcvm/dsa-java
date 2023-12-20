package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PlusOneTest {
    PlusOne plusOne;
    
    @Before
    public void setUp() {
        this.plusOne = new PlusOne();
    }
    
    @Test
    public void test1() {
        final int[] nums = {1, 2, 3};
        final int[] expect = {1, 2, 4};
        
        final int[] response = this.plusOne.solution(nums);
        assertArrayEquals(expect, nums);
    }
    
    
    @Test
    public void test2() {
        final int[] nums = {4, 3, 2, 1};
        final int[] expect = {4, 3, 2, 2};
        
        final int[] response = this.plusOne.solution(nums);
        assertArrayEquals(expect, nums);
    }
    
    @Test
    public void test3() {
        final int[] nums = {9};
        final int[] expect = {1, 0};
        
        final int[] response = this.plusOne.solution(nums);
        assertArrayEquals(expect, response);
    }
    
    @Test
    public void test6() {
        final int[] nums = {9, 9};
        final int[] expect = {1, 0, 0};
        
        final int[] response = this.plusOne.solution(nums);
        assertArrayEquals(expect, response);
    }
    
    
    @Test
    public void test7() {
        final int[] nums = {8, 9};
        final int[] expect = {9, 0};
        
        final int[] response = this.plusOne.solution(nums);
        assertArrayEquals(expect, response);
    }
    
    @Test
    public void test4() {
        final int[] nums = {-1};
        final int[] expect = {0};
        
        final int[] response = this.plusOne.solution(nums);
        assertArrayEquals(expect, nums);
    }
    
    
    @Test
    public void test8() {
        final int[] nums = {9, 8, 9};
        final int[] expect = {9, 9, 0};
        
        final int[] response = this.plusOne.solution(nums);
        assertArrayEquals(expect, response);
    }
}
