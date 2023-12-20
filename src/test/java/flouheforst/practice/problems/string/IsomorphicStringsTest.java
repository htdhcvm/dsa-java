package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsomorphicStringsTest {
    IsomorphicStrings isomorphicStrings;
    
    @Before
    public void setUp() {
        this.isomorphicStrings = new IsomorphicStrings();
    }
    
    @Test
    public void test1() {
        String s = "egg";
        String t = "add";
        
        final boolean expect = true;
        
        final boolean response = isomorphicStrings.solution(s, t);
        assertEquals(expect, response);
    }
    
    @Test
    public void test2() {
        String s = "foo";
        String t = "bar";
        
        final boolean expect = false;
        
        final boolean response = isomorphicStrings.solution(s, t);
        assertEquals(expect, response);
    }
    
    @Test
    public void test3() {
        String s = "paper";
        String t = "title";
        
        final boolean expect = true;
        
        final boolean response = isomorphicStrings.solution(s, t);
        assertEquals(expect, response);
    }
    
    @Test
    public void test4() {
        String s = "bbbaaaba";
        String t = "aaabbbba";
        
        final boolean expect = false;
        
        final boolean response = isomorphicStrings.solution(s, t);
        assertEquals(expect, response);
    }
    
    @Test
    public void test5() {
        String s = "badc";
        String t = "baba";
        
        final boolean expect = false;
        
        final boolean response = isomorphicStrings.solution(s, t);
        assertEquals(expect, response);
    }
}