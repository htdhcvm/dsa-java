package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReplaceElementsGreatestElemRightSideTest {
    
    ReplaceElementsGreatestElemRightSide replaceElementsGreatestElemRightSide;
    
    @Before
    public void setUp() {
        this.replaceElementsGreatestElemRightSide = new ReplaceElementsGreatestElemRightSide();
    }
    
    
    @Test
    public void test1() {
        int[] nums = {17, 18, 5, 4, 6, 1};
        final int[] expect = {18, 6, 6, 6, 1, -1};
        
        final int[] result = this.replaceElementsGreatestElemRightSide.solution2(nums);
        
        assertArrayEquals(expect, result);
    }
    
    
    @Test
    public void test2() {
        int[] nums = {400};
        final int[] expect = {-1};
        
        final int[] result = this.replaceElementsGreatestElemRightSide.solution2(nums);
        
        assertArrayEquals(expect, result);
    }
    
    
    @Test
    public void test3() {
        int[] nums = {};
        final int[] expect = {};
        
        final int[] result = this.replaceElementsGreatestElemRightSide.solution2(nums);
        
        assertArrayEquals(expect, result);
    }
}
