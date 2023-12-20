package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThirdMaximumNumberTest {
    
    ThirdMaximumNumber thirdMaximumNumber;
    
    @Before
    public void setUp() {
        this.thirdMaximumNumber = new ThirdMaximumNumber();
    }
    
    @Test
    public void test1() {
        final int expect = 1;
        final int[] nums = {3, 2, 1};
        
        final int sortedSquares = this.thirdMaximumNumber.solution(nums);
        
        assertEquals(expect, sortedSquares);
    }
    
    @Test
    public void test2() {
        final int expect = 2;
        final int[] nums = {1, 2};
        
        final int sortedSquares = this.thirdMaximumNumber.solution(nums);
        
        assertEquals(expect, sortedSquares);
    }
    
    @Test
    public void test3() {
        final int expect = 1;
        final int[] nums = {2, 2, 3, 1};
        
        final int sortedSquares = this.thirdMaximumNumber.solution(nums);
        
        assertEquals(expect, sortedSquares);
    }
    
    @Test
    public void test4() {
        final int expect = 3;
        final int[] nums = {3, 3, 3};
        
        final int sortedSquares = this.thirdMaximumNumber.solution(nums);
        
        assertEquals(expect, sortedSquares);
    }
    
    @Test
    public void test5() {
        final int expect = 2;
        final int[] nums = {1, 1, 2};
        
        final int sortedSquares = this.thirdMaximumNumber.solution(nums);
        
        assertEquals(expect, sortedSquares);
    }
    
    @Test
    public void test6() {
        final int expect = 5;
        final int[] nums = {5, 2, 2};
        
        final int sortedSquares = this.thirdMaximumNumber.solution(nums);
        
        assertEquals(expect, sortedSquares);
    }
    
    @Test
    public void test7() {
        final int expect = 2;
        final int[] nums = {1, 2, 2};
        
        final int sortedSquares = this.thirdMaximumNumber.solution(nums);
        
        assertEquals(expect, sortedSquares);
    }
    
    @Test
    public void test8() {
        final int expect = 2;
        final int[] nums = {1, 2, 2, 5, 3, 5};
        
        final int sortedSquares = this.thirdMaximumNumber.solution(nums);
        
        assertEquals(expect, sortedSquares);
    }
}
