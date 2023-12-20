package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateImageTest {
    RotateImage rotateImage;
    
    
    @Before
    public void setUp() {
        this.rotateImage = new RotateImage();
    }
    
    @Test
    public void test1() {
        final int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        final int[][] expect = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        
        this.rotateImage.solution(nums);
        assertArrayEquals(nums, expect);
    }
    
    @Test
    public void test2() {
        final int[][] nums = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}
            
        };
        final int[][] expect = {{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}};
        
        this.rotateImage.solution(nums);
        assertArrayEquals(nums, expect);
    }
    
    
    @Test
    public void test3() {
        final int[][] nums = {{5, 1, 9, 11, 2}, {2, 4, 8, 10, 4}, {13, 3, 6, 7, 6}, {15, 14, 12, 16, 8}, {2, 4, 8, 10, 4},
            
        };
        final int[][] expect = {{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}};
        
        this.rotateImage.solution(nums);
        assertArrayEquals(nums, expect);
    }
}
