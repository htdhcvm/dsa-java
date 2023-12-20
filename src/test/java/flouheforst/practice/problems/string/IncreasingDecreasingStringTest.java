package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IncreasingDecreasingStringTest {
    
    IncreasingDecreasingString increasingDecreasingString;
    
    @Before
    public void setUp() {
        this.increasingDecreasingString = new IncreasingDecreasingString();
    }
    
    @Test
    public void test1() {
        final String prop = "aaaabbbbcccc";
        
        final String expect = "abccbaabccba";
        
        final String response = increasingDecreasingString.solution(prop);
        assertEquals(expect, response);
    }
    
    @Test
    public void test2() {
        final String prop = "rat";
        
        final String expect = "art";
        
        final String response = increasingDecreasingString.solution(prop);
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test3() {
        final String prop = "leetcode";
        
        final String expect = "cdelotee";
        
        final String response = increasingDecreasingString.solution(prop);
        assertEquals(expect, response);
    }
}
