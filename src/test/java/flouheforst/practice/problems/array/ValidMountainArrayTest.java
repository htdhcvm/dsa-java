package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidMountainArrayTest {
    
    ValidMountainArray validMountainArray;
    
    @Before
    public void setUp() {
        this.validMountainArray = new ValidMountainArray();
    }
    
    @Test
    public void test1() {
        final boolean expect = false;
        final int[] nums = {2, 1};
        
        final boolean res = this.validMountainArray.validMountainArray(nums);
        
        assertEquals(expect, res);
    }
    
    @Test
    public void test2() {
        final boolean expect = false;
        final int[] nums = {3, 5, 6};
        
        final boolean res = this.validMountainArray.validMountainArrayV2(nums);
        
        assertEquals(expect, res);
    }
    
    @Test
    public void test3() {
        final boolean expect = true;
        final int[] nums = {0, 3, 2, 1};
        
        final boolean res = this.validMountainArray.validMountainArrayV2(nums);
        
        assertEquals(expect, res);
    }
    
    
    @Test
    public void test4() {
        final boolean expect = true;
        final int[] nums = {0, 1, 3, 2};
        
        final boolean res = this.validMountainArray.validMountainArray(nums);
        
        assertEquals(expect, res);
    }
    
    @Test
    public void test5() {
        final boolean expect = false;
        final int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        final boolean res = this.validMountainArray.validMountainArray(nums);
        
        assertEquals(expect, res);
    }
    
    @Test
    public void test6() {
        final boolean expect = false;
        final int[] nums = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        
        final boolean res = this.validMountainArray.validMountainArray(nums);
        
        assertEquals(expect, res);
    }
    
    @Test
    public void test7() {
        final boolean expect = false;
        final int[] nums = {14, 82, 89, 84, 79, 70, 70, 68, 67, 66, 63, 60, 58, 54, 44, 43, 32, 28, 26, 25, 22, 15, 13, 12, 10, 8, 7, 5, 4, 3};
        
        final boolean res = this.validMountainArray.validMountainArrayV2(nums);
        
        assertEquals(expect, res);
    }
}
