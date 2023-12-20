package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumNestingDepthParenthesesTest {
    
    MaximumNestingDepthParentheses maximumNestingDepthParentheses;
    
    @Before
    public void setUp() {
        maximumNestingDepthParentheses = new MaximumNestingDepthParentheses();
    }
    
    @Test
    public void test1() {
        final String s = "(1+(2*3)+((8)/4))+1";
        final int expect = 3;
        
        final int response = maximumNestingDepthParentheses.solution(s);
        
        assertEquals(expect, response);
    }
}
