package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckOneStringSwapCanMakeStringsEqualTest {
    CheckOneStringSwapCanMakeStringsEqual checkOneStringSwapCanMakeStringsEqual;
    
    @Before
    public void setUp() {
        this.checkOneStringSwapCanMakeStringsEqual = new CheckOneStringSwapCanMakeStringsEqual();
    }
    
    
    @Test
    public void test1() {
        String data1 = "bank";
        String data2 = "kanb";
        final boolean expect = true;
        
        final boolean response = checkOneStringSwapCanMakeStringsEqual.solution(data1, data2);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test2() {
        String data1 = "attack";
        String data2 = "defend";
        final boolean expect = false;
        
        final boolean response = checkOneStringSwapCanMakeStringsEqual.solution(data1, data2);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test3() {
        String data1 = "kelb";
        String data2 = "kelb";
        final boolean expect = true;
        
        final boolean response = checkOneStringSwapCanMakeStringsEqual.solution(data1, data2);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test4() {
        String data1 = "aa";
        String data2 = "ac";
        final boolean expect = false;
        
        final boolean response = checkOneStringSwapCanMakeStringsEqual.solution(data1, data2);
        
        assertEquals(expect, response);
    }
}
