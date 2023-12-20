package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumbersEvenNumberDigitsTest {
    
    NumbersEvenNumberDigits numbersEvenNumberDigits;
    
    @Before
    public void setUp() {
        this.numbersEvenNumberDigits = new NumbersEvenNumberDigits();
    }
    
    
    @Test
    public void test1() {
        final int expect = 2;
        final int[] nums = {12, 345, 2, 6, 7896};
        
        final int max = this.numbersEvenNumberDigits.findNumbers(nums);
        assertEquals(expect, max);
    }
    
    
    @Test
    public void test2() {
        final int expect = 1;
        final int[] nums = {555, 901, 482, 1771};
        
        final int max = this.numbersEvenNumberDigits.findNumbers(nums);
        assertEquals(expect, max);
    }
}
