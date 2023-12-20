package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScoreParenthesesTest {
    
    ScoreParentheses scoreParentheses;
    
    
    @Before
    public void setUp() {
        scoreParentheses = new ScoreParentheses();
    }
    
    @Test
    public void test1() {
        final String s = "(()(()))";
        
        final int expect = 6;
        
        final int response = scoreParentheses.solution(s);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test2() {
        final String s = "()()()";
        
        final int expect = 3;
        
        final int response = scoreParentheses.solution(s);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test3() {
        final String s = "(())()";
        
        final int expect = 3;
        
        final int response = scoreParentheses.solution(s);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test4() {
        final String s = "(()())()";
        
        final int expect = 6;
        
        final int response = scoreParentheses.solution(s);
        
        assertEquals(expect, response);
    }
}
