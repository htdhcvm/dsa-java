package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicCalculatorTest {
    
    private BasicCalculator basicCalculator;
    
    
    @Before
    public void setUp() {
        basicCalculator = new BasicCalculator();
    }
    
    
    @Test
    public void test1() {
        final String s = "3+2*2";
        
        final int expect = 7;
        
        
        final int response = basicCalculator.solution(s);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test2() {
        final String s = " 3/2 ";
        
        final int expect = 1;
        
        
        final int response = basicCalculator.solution(s);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test3() {
        final String s = " 3+5 / 2 ";
        
        final int expect = 5;
        
        
        final int response = basicCalculator.solution(s);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test4() {
        final String s = " 1-1*2+1 ";
        
        final int expect = 0;
        
        
        final int response = basicCalculator.solution(s);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test5() {
        final String s = " 1-1*2";
        
        final int expect = -1;
        
        
        final int response = basicCalculator.solution(s);
        
        assertEquals(expect, response);
    }
}
