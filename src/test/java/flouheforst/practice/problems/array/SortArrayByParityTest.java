package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortArrayByParityTest {
    SortArrayByParity sortArrayByParity;
    
    @Before
    public void setUp() {
        this.sortArrayByParity = new SortArrayByParity();
    }
    
    @Test
    public void test1() {
        final int[] expect = {2, 4, 1, 3};
        final int[] nums = {3, 1, 2, 4};
        
        final int[] response = this.sortArrayByParity.solution(nums);
        assertArrayEquals(expect, response);
    }
}
