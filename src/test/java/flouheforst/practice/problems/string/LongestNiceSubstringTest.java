package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestNiceSubstringTest {
    LongestNiceSubstring longestNiceSubstring;
    
    @Before
    public void setUp() {
        this.longestNiceSubstring = new LongestNiceSubstring();
    }
    
    @Test
    public void test1() {
        final String s = "YazaAay";
        final String expect = "aAa";
        
        final String response = longestNiceSubstring.solution(s);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test2() {
        final String s = "Bb";
        final String expect = "Bb";
        
        final String response = longestNiceSubstring.solution(s);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test3() {
        final String s = "c";
        final String expect = "";
        
        final String response = longestNiceSubstring.solution(s);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test4() {
        final String s = "";
        final String expect = "";
        
        final String response = longestNiceSubstring.solution(s);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test5() {
        final String s = "aAaaay";
        final String expect = "aAaaa";
        
        final String response = longestNiceSubstring.solution(s);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test6() {
        final String s = "aAayaAa";
        final String expect = "aAa";
        
        final String response = longestNiceSubstring.solution(s);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test7() {
        final String s = "aAazBbBB";
        final String expect = "BbBB";
        
        final String response = longestNiceSubstring.solution(s);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test8() {
        final String s = "jcJ";
        final String expect = "";
        
        final String response = longestNiceSubstring.solution(s);
        
        assertEquals(expect, response);
    }
}
