package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class AddTwoNumbersRepresentedArraysTest {
    AddTwoNumbersRepresentedArrays addTwoNumbersRepresentedArrays;
    
    @Before
    public void setUp() {
        this.addTwoNumbersRepresentedArrays = new AddTwoNumbersRepresentedArrays();
    }
    
    @Test
    public void test1() {
        final ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        final ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1, 2, 3));
        
        final ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 4, 6));
        
        final ArrayList<Integer> result = this.addTwoNumbersRepresentedArrays.solution(a, b);
        
        assertEquals(expected, result);
    }
    
    
    @Test
    public void test2() {
        final ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        final ArrayList<Integer> b = new ArrayList<>(Arrays.asList(2, 3));
        
        final ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 4, 6));
        
        final ArrayList<Integer> result = this.addTwoNumbersRepresentedArrays.solution(a, b);
        
        assertEquals(expected, result);
    }
    
    
    @Test
    public void test3() {
        final ArrayList<Integer> a = new ArrayList<>(Arrays.asList(2, 3));
        final ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1, 2, 3));
        
        final ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 4, 6));
        
        final ArrayList<Integer> result = this.addTwoNumbersRepresentedArrays.solution(a, b);
        
        assertEquals(expected, result);
    }
    
    
    @Test
    public void test4() {
        final ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 9, 6));
        final ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1, 9, 6));
        
        final ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 9, 2));
        
        final ArrayList<Integer> result = this.addTwoNumbersRepresentedArrays.solution(a, b);
        
        assertEquals(expected, result);
    }
}
