package flouheforst.practice.problems.array;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindColumnInRowArrayTest {


    FindColumnInRowArray findColumnInRowArray = new FindColumnInRowArray();


    @Test
    public void test1() {
        List<Integer> expected = List.of(3, 6, 9);

        List<Integer> response = findColumnInRowArray.find(
                List.of(1, 2, 3, 4, 5, 6, 7, 8, 9),
                3,
                3,
                3
        );

        assertEquals(expected, response);
    }

    @Test
    public void test2() {
        List<Integer> expected = List.of(2, 6);

        List<Integer> response = findColumnInRowArray.find(
                List.of(1, 2, 3, 4, 5, 6, 7, 8),
                2,
                4,
                2
        );

        assertEquals(expected, response);
    }





}
