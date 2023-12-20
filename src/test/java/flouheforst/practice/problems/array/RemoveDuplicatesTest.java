package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {
    
    RemoveDuplicates removeDuplicates;
    
    @Before
    public void setUp() {
        this.removeDuplicates = new RemoveDuplicates();
    }
    
    
    @Test
    public void test1() {
        int[] nums = {1, 1, 2};
        
        final int output = this.removeDuplicates.removeDuplicates(nums);
        
        assertEquals(2, output);
    }
    
    
    @Test
    public void test2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        
        final int output = this.removeDuplicates.removeDuplicates(nums);
        
        assertEquals(5, output);
    }
}
