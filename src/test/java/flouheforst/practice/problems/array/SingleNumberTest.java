package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleNumberTest {
    SingleNumber singleNumber;
    
    @Before
    public void setUp() {
        this.singleNumber = new SingleNumber();
    }
    
    @Test
    public void test1() {
        final int[] nums = {2, 2, 1};
        final int expect = 1;
        
        final int response = this.singleNumber.solution1(nums);
        assertEquals(expect, response);
    }
    
    @Test
    public void test2() {
        final int[] nums = {4, 1, 2, 1, 2};
        final int expect = 4;
        
        final int response = this.singleNumber.solution1(nums);
        assertEquals(expect, response);
    }
    
    @Test
    public void test3() {
        final int[] nums = {1};
        final int expect = 1;
        
        final int response = this.singleNumber.solution(nums);
        assertEquals(expect, response);
    }
}
