package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckIfTwoStringArraysAreEquivalentTest {
    
    CheckIfTwoStringArraysAreEquivalent checkIfTwoStringArraysAreEquivalent;
    
    @Before
    public void setUp() {
        this.checkIfTwoStringArraysAreEquivalent = new CheckIfTwoStringArraysAreEquivalent();
    }
    
    
    @Test
    public void test1() {
        String[] data1 = {"ab", "c"};
        String[] data2 = {"a", "bc"};
        final boolean expect = true;
        
        final boolean response = checkIfTwoStringArraysAreEquivalent.solution(data1, data2);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test2() {
        String[] data1 = {"a", "cb"};
        String[] data2 = {"ab", "c"};
        final boolean expect = false;
        
        final boolean response = checkIfTwoStringArraysAreEquivalent.solution(data1, data2);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test3() {
        String[] data1 = {"abc", "d", "defg"};
        String[] data2 = {"abcddefg"};
        final boolean expect = true;
        
        final boolean response = checkIfTwoStringArraysAreEquivalent.solution(data1, data2);
        
        assertEquals(expect, response);
    }
    
}
