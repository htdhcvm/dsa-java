package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindAllNumbersDisappearedArrayTest {
    FindAllNumbersDisappearedArray findAllNumbersDisappearedArray;
    
    @Before
    public void setUp() {
        this.findAllNumbersDisappearedArray = new FindAllNumbersDisappearedArray();
    }
    
    @Test
    public void test1() {
        final List<Integer> expect = new ArrayList<>() {
            {
                add(5);
                add(6);
            }
        };
        final int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        
        final List<Integer> result = this.findAllNumbersDisappearedArray.solution(nums);
        
        assertEquals(expect, result);
    }
    
    @Test
    public void test2() {
        final List<Integer> expect = new ArrayList<>() {
            {
                add(2);
            }
        };
        final int[] nums = {1, 1};
        
        final List<Integer> result = this.findAllNumbersDisappearedArray.solution(nums);
        
        assertEquals(expect, result);
    }
    
    @Test
    public void test3() {
        final List<Integer> expect = new ArrayList<>() {
            {
                add(1);
            }
        };
        final int[] nums = {2, 2};
        
        final List<Integer> result = this.findAllNumbersDisappearedArray.solution(nums);
        
        assertEquals(expect, result);
    }
    
    
    @Test
    public void test4() {
        final List<Integer> expect = new ArrayList<>() {
            {
                add(5);
                add(6);
            }
        };
        final int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        
        final List<Integer> result = this.findAllNumbersDisappearedArray.solution(nums);
        
        assertEquals(expect, result);
    }
    
}
