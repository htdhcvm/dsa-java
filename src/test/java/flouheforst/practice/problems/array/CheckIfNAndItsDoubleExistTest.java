package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckIfNAndItsDoubleExistTest {
    CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist;
    
    @Before
    public void setUp() {
        this.checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();
    }
    
    @Test
    public void test1() {
        final boolean expect = true;
        final int[] nums = {10, 2, 5, 3};
        
        final boolean result = this.checkIfNAndItsDoubleExist.checkIfExist(nums);
        
        assertEquals(expect, result);
    }
    
    @Test
    public void test2() {
        final boolean expect = false;
        final int[] nums = {3, 1, 7, 11};
        
        final boolean result = this.checkIfNAndItsDoubleExist.checkIfExist(nums);
        
        assertEquals(expect, result);
    }
    
    
    @Test
    public void test3() {
        final boolean expect = true;
        final int[] nums = {10, 2, 5, 3};
        
        final boolean result = this.checkIfNAndItsDoubleExist.checkIfExistV2(nums);
        
        assertEquals(expect, result);
    }
    
    @Test
    public void test4() {
        final boolean expect = false;
        final int[] nums = {3, 1, 7, 11};
        
        final boolean result = this.checkIfNAndItsDoubleExist.checkIfExistV2(nums);
        
        assertEquals(expect, result);
    }
}
