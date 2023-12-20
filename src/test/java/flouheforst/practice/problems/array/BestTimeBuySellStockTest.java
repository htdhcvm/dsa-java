package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestTimeBuySellStockTest {
    
    BestTimeBuySellStock bestTimeBuySellStock;
    
    @Before
    public void setUp() {
        this.bestTimeBuySellStock = new BestTimeBuySellStock();
    }
    
    
    @Test
    public void test1() {
        final int expect = 0;
        final int[] nums = {10, 9, 8, 7, 2};
        
        final int result = this.bestTimeBuySellStock.solution1(nums);
        
        assertEquals(expect, result);
    }
    
    
    @Test
    public void test2() {
        final int expect = 0;
        final int[] nums = {7, 6, 4, 3, 1};
        
        final int result = this.bestTimeBuySellStock.solution1(nums);
        
        assertEquals(expect, result);
    }
    
    
    @Test
    public void test3() {
        final int expect = 7;
        final int[] nums = {7, 1, 5, 3, 6, 4};
        
        final int result = this.bestTimeBuySellStock.solution2(nums);
        
        assertEquals(expect, result);
    }
    
    @Test
    public void test4() {
        final int expect = 16;
        final int[] nums = {7, 1, 5, 3, 6, 4, 7, 6, 10, 12};
        
        final int result = this.bestTimeBuySellStock.solution1(nums);
        
        assertEquals(expect, result);
    }
}
