package flouheforst.practice.problems.binarysearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SqrtXTest {
    private SqrtX sqrtX;
    
    @Before
    public void setUp() {
        sqrtX = new SqrtX();
    }
    
    
    @Test
    public void test1() {
        final int x = 4;
        
        final int expect = 2;
        
        final int response = sqrtX.solution(x);
        
        assertEquals(expect, response);
    }
}
