package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidParenthesesTest {
    
    ValidParentheses validParentheses;
    
    @Before
    public void setUp() {
        this.validParentheses = new ValidParentheses();
    }
    
    @Test
    public void test1() {
        String s = "()";
        boolean expect = true;
        
        final boolean response = validParentheses.solution(s);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test2() {
        String s = "()[]{}";
        boolean expect = true;
        
        final boolean response = validParentheses.solution(s);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test3() {
        String s = "(]";
        boolean expect = false;
        
        final boolean response = validParentheses.solution(s);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test4() {
        String s = "([)]";
        boolean expect = false;
        
        final boolean response = validParentheses.solution(s);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test5() {
        String s = "{[]}";
        boolean expect = true;
        
        final boolean response = validParentheses.solution(s);
        
        assertEquals(expect, response);
    }
    
}
