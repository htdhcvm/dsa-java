package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {
    LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters;
    
    @Before
    public void setUp() {
        longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
    }
    
    @Test
    public void test1() {
        String s = "abcabcbb";
        
        Integer expect = 3;
        
        Integer response = longestSubstringWithoutRepeatingCharacters.solution5(s);
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test2() {
        String s = "bbbbb";
        
        Integer expect = 1;
        
        Integer response = longestSubstringWithoutRepeatingCharacters.solution5(s);
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test3() {
        String s = "pwwkew"; // wke
        
        Integer expect = 3;
        
        Integer response = longestSubstringWithoutRepeatingCharacters.solution5(s);
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test4() {
        String s = "aab";
        Integer expect = 2;
        
        Integer response = longestSubstringWithoutRepeatingCharacters.solution5(s);
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test5() {
        String s = "dvdf"; // vdf
        
        Integer expect = 3;
        
        Integer response = longestSubstringWithoutRepeatingCharacters.solution5(s);
        assertEquals(expect, response);
    }
}

