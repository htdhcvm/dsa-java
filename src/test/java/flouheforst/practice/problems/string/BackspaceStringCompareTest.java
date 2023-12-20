package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BackspaceStringCompareTest {
    BackspaceStringCompare backspaceStringCompare;
    
    @Before
    public void setUp() {
        backspaceStringCompare = new BackspaceStringCompare();
    }
    
    
    @Test
    public void test1() {
        final String s = "ab#c";
        final String t = "ad#c";
        
        final boolean expect = true;
        
        final boolean response = backspaceStringCompare.solution(s, t);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test2() {
        final String s = "y#fo##f";
        final String t = "y#f#o##f";
        
        final boolean expect = true;
        
        final boolean response = backspaceStringCompare.solution(s, t);
        
        assertEquals(expect, response);
    }
    
}
