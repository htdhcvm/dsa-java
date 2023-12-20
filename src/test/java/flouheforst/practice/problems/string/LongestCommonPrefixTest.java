package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixTest {
    
    LongestCommonPrefix longestCommonPrefix;
    
    @Before
    public void setUp() {
        this.longestCommonPrefix = new LongestCommonPrefix();
    }
    
    @Test
    public void test1() {
        String expect = "fl";
        String[] data = {"flower", "flow", "flight"};
        
        String response = this.longestCommonPrefix.solution(data);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test2() {
        String expect = "";
        String[] data = {"dog", "racecar", "car"};
        
        String response = this.longestCommonPrefix.solution(data);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test3() {
        String expect = "dd";
        String[] data = {"ddd", "dd", "dddd"};
        
        String response = this.longestCommonPrefix.solution(data);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test4() {
        String expect = "dd";
        String[] data = {"ddd", "dd", "dddd"};
        
        String response = this.longestCommonPrefix.solution(data);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test5() {
        String expect = "c";
        String[] data = {"cir", "car"};
        
        String response = this.longestCommonPrefix.solution(data);
        
        assertEquals(expect, response);
    }
    
    
}
