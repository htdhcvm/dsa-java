package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateArrayTest {
    RotateArray ratateArray;
    
    @Before
    public void setUp() {
        this.ratateArray = new RotateArray();
    }
    
    @Test
    public void test1() {
        final int k = 3;
        final int[] nums = {1, 2, 3, 4, 5, 6, 7};
        final int[] expect = {5, 6, 7, 1, 2, 3, 4};
        
        this.ratateArray.solution4(nums, k);
        assertArrayEquals(expect, nums);
    }
    
    
    @Test
    public void test2() {
        final int k = 2;
        final int[] nums = {-1};
        final int[] expect = {-1};
        
        this.ratateArray.solution4(nums, k);
        assertArrayEquals(expect, nums);
    }
    
    
    @Test
    public void test3() {
        final int k = 3;
        final int[] nums = {1, 2};
        final int[] expect = {2, 1};
        
        this.ratateArray.solution4(nums, k);
        
        assertArrayEquals(expect, nums);
    }
    
    
    @Test
    public void test4() {
        final int k = 5;
        final int[] nums = {1, 2, 3, 4};
        final int[] expect = {4, 1, 2, 3};
        
        this.ratateArray.solution4(nums, k);
        
        assertArrayEquals(expect, nums);
    }
    
    @Test
    public void test5() {
        final int k = 9;
        final int[] nums = {1, 2, 3, 4};
        final int[] expect = {4, 1, 2, 3};
        
        this.ratateArray.solution4(nums, k);
        
        assertArrayEquals(expect, nums);
    }
    
    
}
