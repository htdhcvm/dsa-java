package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidPalindromeTest {
    ValidPalindrome validPalindrome;
    
    @Before
    public void setUp() {
        this.validPalindrome = new ValidPalindrome();
    }
    
    @Test
    public void test1() {
        String s = " A !ma&'n, a plan, a canal: Panama";
        boolean expect = true;
        
        final boolean response = this.validPalindrome.solution(s);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test2() {
        String s = "race a car";
        boolean expect = false;
        
        final boolean response = this.validPalindrome.solution(s);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test3() {
        String s = "  ";
        boolean expect = true;
        
        final boolean response = this.validPalindrome.solution(s);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test4() {
        String s = " ll ";
        boolean expect = true;
        
        final boolean response = this.validPalindrome.solution(s);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test6() {
        String s = ",//,";
        boolean expect = true;
        
        final boolean response = this.validPalindrome.solution(s);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test7() {
        String s = ".";
        boolean expect = true;
        
        final boolean response = this.validPalindrome.solution(s);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test8() {
        String s = "a.";
        boolean expect = true;
        
        final boolean response = this.validPalindrome.solution(s);
        
        assertEquals(expect, response);
    }
    
}
