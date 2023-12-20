package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidAnagramTest {
    ValidAnagram validAnagram;
    
    @Before
    public void setUp() {
        this.validAnagram = new ValidAnagram();
    }
    
    @Test
    public void test1() {
        
        String s = "anagram";
        String t = "nagaram";
        
        boolean expect = true;
        
        final boolean response = this.validAnagram.solution(s, t);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test2() {
        
        String s = "rat";
        String t = "car";
        
        boolean expect = false;
        
        final boolean response = this.validAnagram.solution(s, t);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test3() {
        
        String s = "rat";
        String t = "raat";
        
        boolean expect = false;
        
        final boolean response = this.validAnagram.solution(s, t);
        
        assertEquals(expect, response);
    }
}
