package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeStringGreatTest {
    MakeStringGreat makeStringGreat;
    
    
    @Before
    public void setUp() {
        makeStringGreat = new MakeStringGreat();
    }
    
    
    @Test
    public void test1() {
        final String s = "leEeetcode";
        final String expect = "leetcode";
        
        final String response = makeStringGreat.solution(s);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test2() {
        final String s = "abBAcC";
        final String expect = "";
        
        final String response = makeStringGreat.solution(s);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test3() {
        final String s = "s";
        final String expect = "s";
        
        final String response = makeStringGreat.solution(s);
        
        assertEquals(expect, response);
    }
}

