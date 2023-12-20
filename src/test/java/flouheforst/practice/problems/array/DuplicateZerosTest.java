package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DuplicateZerosTest {
    DuplicateZeros duplicateZeros;
    
    @Before
    public void setUp() {
        this.duplicateZeros = new DuplicateZeros();
    }
    
    
    @Test
    public void test1() {
        final int[] expect = {1, 0, 0, 2, 3, 0, 0, 4};
        final int[] nums = {1, 0, 2, 3, 0, 4, 5, 0};
        
        this.duplicateZeros.duplicateZeros(nums);
        
        assertArrayEquals(nums, expect);
    }
    
    @Test
    public void test2() {
        final int[] expect = {1, 2, 3};
        final int[] nums = {1, 2, 3};
        
        this.duplicateZeros.duplicateZeros(nums);
        
        assertArrayEquals(nums, expect);
    }
}
