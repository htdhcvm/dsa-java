package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class ReverseStringTest {
    ReverseString reverseString;
    
    @Before
    public void setUp() {
        this.reverseString = new ReverseString();
    }
    
    @Test
    public void test1() {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        char[] expect = {'o', 'l', 'l', 'e', 'h'};
        
        this.reverseString.solution(chars);
        
        assertArrayEquals(expect, chars);
    }
    
    
    @Test
    public void test2() {
        char[] chars = {'h', 'e'};
        char[] expect = {'e', 'h'};
        
        this.reverseString.solution(chars);
        
        assertArrayEquals(expect, chars);
    }
    
    
    @Test
    public void test3() {
        char[] chars = {'h', 'e', 'e', 'e'};
        char[] expect = {'e', 'e', 'e', 'h'};
        
        this.reverseString.solution(chars);
        
        assertArrayEquals(expect, chars);
    }
}
