package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PascalTriangleIITest {
    
    PascalTriangleII pascalTriangleII;
    
    
    @Before
    public void setUp() {
        pascalTriangleII = new PascalTriangleII();
    }
    
    
    @Test
    public void test1() {
        final int rowIndex = 3;
        final List<Integer> expect = List.of(1, 3, 3, 1);
        
        final List<Integer> response = pascalTriangleII.solution(rowIndex);
        
        assertEquals(response, expect);
    }
    
    
    @Test
    public void test2() {
        final int rowIndex = 0;
        final List<Integer> expect = List.of(1);
        
        final List<Integer> response = pascalTriangleII.solution(rowIndex);
        
        assertEquals(response, expect);
    }
    
    
    @Test
    public void test3() {
        final int rowIndex = 1;
        final List<Integer> expect = List.of(1, 1);
        
        final List<Integer> response = pascalTriangleII.solution(rowIndex);
        
        assertEquals(response, expect);
    }
    
}
