package flouheforst.practice.problems.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckWordEqualsSummationTwoWordsTest {
    CheckWordEqualsSummationTwoWords checkWordEqualsSummationTwoWords;
    
    @Before
    public void setUp() {
        this.checkWordEqualsSummationTwoWords = new CheckWordEqualsSummationTwoWords();
    }
    
    
    @Test
    public void test1() {
        String data1 = "acb";
        String data2 = "cba";
        String data3 = "cdb";
        final boolean expect = true;
        
        final boolean response = checkWordEqualsSummationTwoWords.solution(data1, data2, data3);
        
        assertEquals(expect, response);
    }
    
    
    @Test
    public void test2() {
        String data1 = "aaa";
        String data2 = "a";
        String data3 = "aab";
        final boolean expect = false;
        
        final boolean response = checkWordEqualsSummationTwoWords.solution(data1, data2, data3);
        
        assertEquals(expect, response);
    }
    
    @Test
    public void test3() {
        String data1 = "aaa";
        String data2 = "a";
        String data3 = "aaaa";
        final boolean expect = true;
        
        final boolean response = checkWordEqualsSummationTwoWords.solution(data1, data2, data3);
        
        assertEquals(expect, response);
    }
}



