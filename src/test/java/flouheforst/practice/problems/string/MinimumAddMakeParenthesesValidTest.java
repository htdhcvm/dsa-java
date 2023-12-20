package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumAddMakeParenthesesValidTest {
    
    MinimumAddMakeParenthesesValid minimumAddMakeParenthesesValid;
    
    @Before
    public void setUp() {
        minimumAddMakeParenthesesValid = new MinimumAddMakeParenthesesValid();
    }
    
    
    @Test
    public void test1() {
        final String s = "())";
        final int expect = 1;
        
        final int response = minimumAddMakeParenthesesValid.solution(s);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test2() {
        final String s = "(((";
        final int expect = 3;
        
        final int response = minimumAddMakeParenthesesValid.solution(s);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test3() {
        final String s = "()))((";
        final int expect = 4;
        
        final int response = minimumAddMakeParenthesesValid.solution(s);
        
        assertEquals(expect, response);
    }
    
    
}
