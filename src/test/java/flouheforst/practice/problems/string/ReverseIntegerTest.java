package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {
    ReverseInteger reverseInteger;
    
    @Before
    public void setUp() {
        this.reverseInteger = new ReverseInteger();
    }
    
    
    @Test
    public void test1() {
        int num = 123;
        int expect = 321;
        
        final int response = this.reverseInteger.solution(num);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test2() {
        int num = -123;
        int expect = -321;
        
        final int response = this.reverseInteger.solution(num);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test3() {
        int num = 120;
        int expect = 21;
        
        final int response = this.reverseInteger.solution(num);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test4() {
        int expect = -2147483648;
        
        final int response = this.reverseInteger.solution(expect);
        
    }
    
}
