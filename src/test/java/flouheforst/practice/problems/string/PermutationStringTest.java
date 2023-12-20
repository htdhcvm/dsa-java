package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermutationStringTest {
    
    PermutationString permutationString;
    
    @Before
    public void setUp() {
        permutationString = new PermutationString();
    }
    
    
    @Test
    public void test1() {
        final String s1 = "ab";
        final String s2 = "eidbaooo";
        
        final boolean expected = true;
        
        final boolean response = permutationString.checkInclusion(s1, s2);
        
        assertEquals(expected, response);
    }
    
    @Test
    public void test2() {
        final String s1 = "ab";
        final String s2 = "eidboaoo";
        
        final boolean expected = false;
        
        final boolean response = permutationString.checkInclusion(s1, s2);
        
        assertEquals(expected, response);
    }
    
    
    @Test
    public void test3() {
        final String s1 = "adc";
        final String s2 = "dcda";
        
        final boolean expected = true;
        
        final boolean response = permutationString.checkInclusion(s1, s2);
        
        assertEquals(expected, response);
    }
    
    
    @Test
    public void test4() {
        final String s1 = "abc";
        final String s2 = "bbbca";
        
        final boolean expected = true;
        
        final boolean response = permutationString.checkInclusion(s1, s2);
        
        assertEquals(expected, response);
    }
}
