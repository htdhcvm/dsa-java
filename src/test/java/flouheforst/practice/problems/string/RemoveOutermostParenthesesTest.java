package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveOutermostParenthesesTest {
    
    RemoveOutermostParentheses removeOutermostParentheses;
    
    @Before
    public void setUp() {
        this.removeOutermostParentheses = new RemoveOutermostParentheses();
    }
    
    @Test
    public void test1() {
        final String s = "()";
        final String expect = "";
        
        final String response = removeOutermostParentheses.solution(s);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test2() {
        final String s = "(()())(())";
        final String expect = "()()()";
        
        final String response = removeOutermostParentheses.solution(s);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test3() {
        final String s = "(()())(())(()(()))";
        final String expect = "()()()()(())";
        
        final String response = removeOutermostParentheses.solution(s);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test4() {
        final String s = "()()";
        final String expect = "";
        
        final String response = removeOutermostParentheses.solution(s);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test5() {
        final String s = "(((((())))))";
        final String expect = "((((()))))";
        
        final String response = removeOutermostParentheses.solution(s);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test6() {
        final String s = "((()())(()()))";
        final String expect = "(()())(()())";
        
        final String response = removeOutermostParentheses.solution(s);
        
        assertEquals(expect, response);
    }
}
