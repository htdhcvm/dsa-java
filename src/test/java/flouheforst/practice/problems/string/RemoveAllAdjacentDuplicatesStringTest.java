package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveAllAdjacentDuplicatesStringTest {
    
    RemoveAllAdjacentDuplicatesString removeAllAdjacentDuplicatesString;
    
    @Before
    public void setUp() {
        removeAllAdjacentDuplicatesString = new RemoveAllAdjacentDuplicatesString();
    }
    
    @Test
    public void test1() {
        final String s = "abbaca";
        
        final String expect = "ca";
        
        final String response = removeAllAdjacentDuplicatesString.solution(s);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test2() {
        final String s = "azxxzy";
        
        final String expect = "ay";
        
        final String response = removeAllAdjacentDuplicatesString.solution(s);
        
        assertEquals(expect, response);
    }
}

