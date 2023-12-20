package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToIntegerATOITest {
    
    StringToIntegerATOI stringToIntegerATOI;
    
    @Before
    public void setUp() {
        this.stringToIntegerATOI = new StringToIntegerATOI();
    }
    
    @Test
    public void test1() {
        String s = "42";
        int expect = 42;
        
        int response = this.stringToIntegerATOI.solution(s);
        assertEquals(expect, response);
    }
    
    @Test
    public void test2() {
        String s = "4193 with words";
        int expect = 4193;
        
        int response = this.stringToIntegerATOI.solution(s);
        assertEquals(expect, response);
    }
    
    @Test
    public void test3() {
        String s = "   -42";
        int expect = -42;
        
        int response = this.stringToIntegerATOI.solution(s);
        assertEquals(expect, response);
    }
    
    @Test
    public void test4() {
        String s = "4193 with words 123";
        int expect = 4193;
        
        int response = this.stringToIntegerATOI.solution(s);
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test5() {
        String s = "004193 with words 123";
        int expect = 4193;
        
        int response = this.stringToIntegerATOI.solution(s);
        assertEquals(expect, response);
    }
    
    @Test
    public void test6() {
        String s = "-+12";
        int expect = 0;
        
        int response = this.stringToIntegerATOI.solution(s);
        assertEquals(expect, response);
    }
    
    @Test
    public void test7() {
        String s = "+1";
        int expect = 1;
        
        int response = this.stringToIntegerATOI.solution(s);
        assertEquals(expect, response);
    }
    
    @Test
    public void test8() {
        String s = "+-12";
        int expect = 0;
        
        int response = this.stringToIntegerATOI.solution(s);
        assertEquals(expect, response);
    }
    
    @Test
    public void test9() {
        String s = "    0000000000000   ";
        int expect = 0;
        
        int response = this.stringToIntegerATOI.solution(s);
        assertEquals(expect, response);
    }
    
    @Test
    public void test10() {
        
        
        String s = "   +0 123";
        int expect = 0;
        
        int response = this.stringToIntegerATOI.solution(s);
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test11() {
        String s = "20000000000000000000";
        int expect = 2147483647;
        
        int response = this.stringToIntegerATOI.solution(s);
        assertEquals(expect, response);
    }
    
    @Test
    public void test12() {
        String s = "-20000000000000000000";
        int expect = Integer.MIN_VALUE;
        
        int response = this.stringToIntegerATOI.solution(s);
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test13() {
        String s = "123-";
        int expect = 123;
        
        int response = this.stringToIntegerATOI.solution(s);
        assertEquals(expect, response);
    }
    
}
