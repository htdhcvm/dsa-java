package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructSmallestNumberFromDIStringTest {
    
    ConstructSmallestNumberFromDIString constructSmallestNumberFromDIString;
    
    @Before
    public void setUp() {
        constructSmallestNumberFromDIString = new ConstructSmallestNumberFromDIString();
    }
    
    
    @Test
    public void test1() {
        final String s = "IIIDIDDD";
        final String expect = "123549876";
        
        final String response = constructSmallestNumberFromDIString.solution(s);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test2() {
        final String s = "DDD";
        final String expect = "4321";
        
        final String response = constructSmallestNumberFromDIString.solution(s);
        
        assertEquals(expect, response);
    }
    
}
