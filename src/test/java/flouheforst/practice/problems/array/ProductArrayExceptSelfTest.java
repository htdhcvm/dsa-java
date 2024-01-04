package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ProductArrayExceptSelfTest {
    ProductArrayExceptSelf productArrayExceptSelf;
    
    
    @Before
    public void setUp() {
        productArrayExceptSelf = new ProductArrayExceptSelf();
    }
    
    @Test
    public void test1() {
        final int[] nums = {1, 2, 3, 4};
        final int[] expect = {24, 12, 8, 6};
        
        final int[] resopnse = productArrayExceptSelf.solution(nums);
        assertArrayEquals(expect, resopnse);
    }
    
    
    @Test
    public void test2() {
        final int[] nums = {-1, 1, 0, -3, 3};
        final int[] expect = {0, 0, 9, 0, 0};
        
        final int[] resopnse = productArrayExceptSelf.solution(nums);
        assertArrayEquals(expect, resopnse);
    }
}
