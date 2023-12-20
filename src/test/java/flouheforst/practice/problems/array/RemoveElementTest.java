package flouheforst.practice.problems.array;

import flouheforst.practice.helpers.Generate;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/*
    Solution 1: 7 481 084
    Solution 2: 1 617 182 375
    
    Solution 1: 4 091 000
    Solution 2: 1 628 057 792
*/
public class RemoveElementTest {
    RemoveElement removeElement;
    
    @Before
    public void setUp() {
        this.removeElement = new RemoveElement();
    }
    
    @Test
    public void test1() {
        final int expect = 2;
        
        final int[] nums = {3, 2, 2, 3};
        final int value = 3;
        
        final int response = this.removeElement.solution(nums, value);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test2() {
        final int expect = 5;
        
        final int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        final int value = 2;
        
        final int response = this.removeElement.solution(nums, value);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test3() {
        final int expect = 1;
        
        final int[] nums = {2};
        final int value = 3;
        
        final int response = this.removeElement.solution(nums, value);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test4() {
        final int expect = 0;
        
        final int[] nums = {3, 3};
        final int value = 3;
        
        final int response = this.removeElement.solution(nums, value);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test5() {
        final int expect = 2;
        
        final int[] nums = {3, 3};
        final int value = 5;
        
        final int response = this.removeElement.solution(nums, value);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test6() {
        
        final int value = 5;
        final int[] nums = Generate.generateArray(1000000, -100, 100);
        
        long startTime = System.nanoTime();
        final int response = this.removeElement.solution(nums, value);
        long stopTime = System.nanoTime();
    }
    
    @Test
    public void test7() {
        final int[] expect = {2, 2, 3, 3};
        int val = 3;
        int[] nums = {3, 2, 2, 3};
        
        final int output = this.removeElement.solution2(nums, val);
        assertArrayEquals(expect, nums);
    }
    
    @Test
    public void test8() {
        
        final int value = 5;
        final int[] nums = Generate.generateArray(1000000, -100, 100);
        
        long startTime = System.nanoTime();
        final int response = this.removeElement.solution2(nums, value);
        long stopTime = System.nanoTime();
    }
    
}
