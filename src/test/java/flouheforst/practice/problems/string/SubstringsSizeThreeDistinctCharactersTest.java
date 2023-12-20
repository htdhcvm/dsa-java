package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubstringsSizeThreeDistinctCharactersTest {
    SubstringsSizeThreeDistinctCharacters substringsSizeThreeDistinctCharacters;
    
    @Before
    public void setUp() {
        this.substringsSizeThreeDistinctCharacters = new SubstringsSizeThreeDistinctCharacters();
    }
    
    @Test
    public void test1() {
        String s = "xyzzaz";
        final int expect = 1;
        
        final int response = substringsSizeThreeDistinctCharacters.solution(s);
        assertEquals(expect, response);
    }
    
    @Test
    public void test2() {
        String s = "aababcabc";
        final int expect = 4;
        
        final int response = substringsSizeThreeDistinctCharacters.solution(s);
        assertEquals(expect, response);
    }
}
