package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImplementStrStrTest {
    ImplementStrStr implementStrStr;
    
    @Before
    public void setUp() {
        this.implementStrStr = new ImplementStrStr();
    }
    
    @Test
    public void test1() {
        String haystack = "sadbutsad";
        String needle = "sad";
        
        int expect = 0;
        
        int response = this.implementStrStr.solution(haystack, needle);
        assertEquals(expect, response);
    }
    
    @Test
    public void test2() {
        String haystack = "leetcode";
        String needle = "leeto";
        
        int expect = -1;
        
        int response = this.implementStrStr.solution(haystack, needle);
        assertEquals(expect, response);
    }
    
    @Test
    public void test3() {
        String haystack = "l";
        String needle = "l";
        
        int expect = 0;
        
        int response = this.implementStrStr.solution(haystack, needle);
        assertEquals(expect, response);
    }
    
    @Test
    public void test4() {
        String haystack = "";
        String needle = "";
        
        int expect = -1;
        
        int response = this.implementStrStr.solution(haystack, needle);
        assertEquals(expect, response);
    }
    
    @Test
    public void testt5() {
        String haystack = "leetcode";
        String needle = "code";
        
        int expect = 4;
        
        int response = this.implementStrStr.solution(haystack, needle);
        assertEquals(expect, response);
    }
    
    @Test
    public void test6() {
        String haystack = "qwe";
        String needle = "";
        
        int expect = -1;
        
        int response = this.implementStrStr.solution(haystack, needle);
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test7() {
        String haystack = "aaaaa";
        String needle = "bba";
        
        int expect = -1;
        
        int response = this.implementStrStr.solution(haystack, needle);
        assertEquals(expect, response);
    }
    
    @Test
    public void test8() {
        String haystack = "a";
        String needle = "a";
        
        int expect = 0;
        
        int response = this.implementStrStr.solution(haystack, needle);
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test9() {
        String haystack = "mississippi";
        String needle = "issip";
        
        int expect = 10;
        
        int response = this.implementStrStr.solution(haystack, needle);
        assertEquals(expect, response);
    }
    
    @Test
    public void test10() {
        String haystack = "mississippi";
        String needle = "pi";
        
        int expect = 9;
        
        int response = this.implementStrStr.solution(haystack, needle);
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test11() {
        String haystack = "babba";
        String needle = "bbb";
        
        int expect = -1;
        
        int response = this.implementStrStr.solution(haystack, needle);
        assertEquals(expect, response);
    }
}
