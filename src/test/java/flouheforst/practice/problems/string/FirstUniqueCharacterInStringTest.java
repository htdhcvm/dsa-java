package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstUniqueCharacterInStringTest {
    
    FirstUniqueCharacterInString firstUniqueCharacterInString;
    
    @Before
    public void setUp() {
        this.firstUniqueCharacterInString = new FirstUniqueCharacterInString();
    }
    
    
    @Test
    public void test1() {
        String num = "leetcode";
        int expect = 0;
        
        final int response = this.firstUniqueCharacterInString.solution(num);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test2() {
        String num = "loveleetcode";
        int expect = 2;
        
        final int response = this.firstUniqueCharacterInString.solution(num);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test3() {
        String num = "aabb";
        int expect = -1;
        
        final int response = this.firstUniqueCharacterInString.solution(num);
        
        assertEquals(expect, response);
    }
}
