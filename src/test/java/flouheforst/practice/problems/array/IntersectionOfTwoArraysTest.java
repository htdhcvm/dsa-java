package flouheforst.practice.problems.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class IntersectionOfTwoArraysTest {
    IntersectionOfTwoArrays intersectionOfTwoArrays;
    
    @Before
    public void setUp() {
        this.intersectionOfTwoArrays = new IntersectionOfTwoArrays();
    }
    
    @Test
    public void test1() {
        final int[] nums1 = {1, 2, 2, 1};
        final int[] nums2 = {2, 2};
        final int[] expect = {2, 2};
        
        final int[] response = this.intersectionOfTwoArrays.solution(nums1, nums2);
        assertArrayEquals(expect, response);
    }
    
    @Test
    public void test2() {
        final int[] nums1 = {4, 9, 5};
        final int[] nums2 = {9, 4, 9, 8, 4};
        final int[] expect = {4, 9};
        
        final int[] response = this.intersectionOfTwoArrays.solution(nums1, nums2);
        assertArrayEquals(expect, response);
    }
    
}