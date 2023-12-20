package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromeTest {
    
    LongestPalindrome longestPalindrome;
    
    @Before
    public void setUp() {
        longestPalindrome = new LongestPalindrome();
    }
    
    @Test
    public void test1() {
        final String s = "abccccdd"; // dccaccd
        final int expect = 7;
        
        final int response = longestPalindrome.solution(s);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test2() {
        final String s = "ccc";
        final int expect = 3;
        
        final int response = longestPalindrome.solution(s);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test3() {
        final String s = "ababababa"; // bbaaaaabb
        final int expect = 9;
        
        final int response = longestPalindrome.solution(s);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test4() {
        final String s = "bananas"; // naaan
        final int expect = 5;
        
        final int response = longestPalindrome.solution(s);
        
        assertEquals(expect, response);
    }
}
