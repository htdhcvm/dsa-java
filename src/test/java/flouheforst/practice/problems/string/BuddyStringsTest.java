package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuddyStringsTest {
    BuddyStrings buddyStrings;
    
    @Before
    public void setUp() {
        this.buddyStrings = new BuddyStrings();
    }
    
    @Test
    public void test1() {
        String s = "ab";
        String t = "ba";
        
        final boolean expect = true;
        
        final boolean response = buddyStrings.solution(s, t);
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test2() {
        String s = "ab";
        String t = "ab";
        
        final boolean expect = false;
        
        final boolean response = buddyStrings.solution(s, t);
        assertEquals(expect, response);
    }
    
    @Test
    public void test3() {
        String s = "aa";
        String t = "aa";
        
        final boolean expect = true;
        
        final boolean response = buddyStrings.solution(s, t);
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test4() {
        String s = "abab";
        String t = "abab";
        
        final boolean expect = true;
        
        final boolean response = buddyStrings.solution(s, t);
        assertEquals(expect, response);
    }
    
    @Test
    public void test5() {
        String s = "abcd";
        String t = "cbad";
        
        final boolean expect = true;
        
        final boolean response = buddyStrings.solution(s, t);
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test6() {
        String s = "abcd";
        String t = "badc";
        
        final boolean expect = false;
        
        final boolean response = buddyStrings.solution(s, t);
        assertEquals(expect, response);
    }
    
    
}
