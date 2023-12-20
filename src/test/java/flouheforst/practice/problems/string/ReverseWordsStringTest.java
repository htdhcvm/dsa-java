package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseWordsStringTest {
    ReverseWordsString reverseWordsString;
    
    @Before
    public void setUp() {
        this.reverseWordsString = new ReverseWordsString();
    }
    
    @Test
    public void test1() {
        final String prop = "Let's take LeetCode contest";
        final String expect = "s'teL ekat edoCteeL tsetnoc";
        
        final String response = reverseWordsString.solution(prop);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test2() {
        final String prop = "God Ding";
        final String expect = "doG gniD";
        
        final String response = reverseWordsString.solution(prop);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test3() {
        final String prop = "I love u";
        final String expect = "I evol u";
        
        final String response = reverseWordsString.solution(prop);
        
        assertEquals(expect, response);
    }
    
    
}

