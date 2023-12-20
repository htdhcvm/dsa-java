package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class PascalTriangleTest {
    PascalTriangle pascalTriangle;
    
    @Before
    public void setUp() {
        this.pascalTriangle = new PascalTriangle();
    }
    
    
    @Test
    public void test1() {
        final int numRows = 5;
        
        final List<List<Integer>> response = this.pascalTriangle.generate(numRows);
    }
    
}
