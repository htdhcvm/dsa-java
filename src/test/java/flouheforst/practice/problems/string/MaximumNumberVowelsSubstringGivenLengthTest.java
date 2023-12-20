package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumNumberVowelsSubstringGivenLengthTest {
    MaximumNumberVowelsSubstringGivenLength maximumNumberVowelsSubstringGivenLength;
    
    @Before
    public void setUp() {
        maximumNumberVowelsSubstringGivenLength = new MaximumNumberVowelsSubstringGivenLength();
    }
    
    @Test
    public void test1() {
        final String s = "abciiidef";
        final int k = 3;
        
        final int expected = 3;
        
        final int response = maximumNumberVowelsSubstringGivenLength.solution(s, k);
        
        assertEquals(expected, response);
    }
    
    
    @Test
    public void test2() {
        final String s = "aeiou";
        final int k = 2;
        
        final int expected = 2;
        
        final int response = maximumNumberVowelsSubstringGivenLength.solution(s, k);
        
        assertEquals(expected, response);
    }
    
    
    @Test
    public void test3() {
        final String s = "leetcode";
        final int k = 3;
        
        final int expected = 2;
        
        final int response = maximumNumberVowelsSubstringGivenLength.solution(s, k);
        
        assertEquals(expected, response);
    }
    
    @Test
    public void test4() {
        final String s = "leetcode";
        final int k = 3;
        
        final int expected = 2;
        
        final int response = maximumNumberVowelsSubstringGivenLength.solution(s, k);
        
        assertEquals(expected, response);
    }
    
    
    @Test
    public void test5() {
        final String s = "novowels";
        final int k = 1;
        
        final int expected = 1;
        
        final int response = maximumNumberVowelsSubstringGivenLength.solution(s, k);
        
        assertEquals(expected, response);
    }
    
    
    @Test
    public void test6() {
        final String s = "tnfazcwrryitgacaabwm";
        final int k = 4;
        
        final int expected = 3;
        
        final int response = maximumNumberVowelsSubstringGivenLength.solution(s, k);
        
        assertEquals(expected, response);
        
    }
}