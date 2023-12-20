package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeightCheckerTest {
    
    HeightChecker heightChecker;
    
    @Before
    public void setUp() {
        this.heightChecker = new HeightChecker();
    }
    
    @Test
    public void test1() {
        final int expect = 3;
        final int[] nums = {1, 1, 4, 2, 1, 3};
        
        final int result = this.heightChecker.solution2(nums);
        
        assertEquals(expect, result);
    }
    
    @Test
    public void test2() {
        final int expect = 5;
        final int[] nums = {5, 1, 2, 3, 4};
        
        final int result = this.heightChecker.solution2(nums);
        
        assertEquals(expect, result);
    }
    
    @Test
    public void test3() {
        final int expect = 0;
        final int[] nums = {1, 2, 3, 4, 5};
        
        final int result = this.heightChecker.solution(nums);
        
        assertEquals(expect, result);
    }
    
    @Test
    public void test4() {
        final int expect = 0;
        final int[] nums = {1, 2, 3, 4, 5};
        
        final int result = this.heightChecker.solution2(nums);
        
        assertEquals(expect, result);
    }
    
    @Test
    public void test5() {
        final int expect = 4;
        final int[] nums = {2, 1, 2, 1, 1, 2, 2, 1};
        
        final int result = this.heightChecker.solution2(nums);
        
        assertEquals(expect, result);
    }
    
    
    //    @Test
    //    public void speedTestSolution1() {
    //        final int[] nums = Generate.generateArray(1000000, 0, 100);
    //
    //        MeasureTime.measure(() ->
    //                this.heightChecker.solution(nums) // -> 321 000 ms
    //        );
    //
    //    }
    //
    
    //    @Test
    //    public void speedTestSolution2() {
    //
    //        final int[] nums = Generate.generateArray(1000000, 0, 100);
    //        MeasureTime.measure(() ->
    //                this.heightChecker.solution2(nums) // -> 6 ms
    //        );
    //    }
}
