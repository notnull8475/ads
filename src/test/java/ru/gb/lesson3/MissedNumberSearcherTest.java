package ru.gb.lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.gb.lessons.Utility;
import ru.gb.lessons.lesson3.MissedNumberSearcher;

class MissedNumberSearcherTest {

    MissedNumberSearcher searcher = new MissedNumberSearcher();

    @Test
    void testSearch() {
//        test(4, Utility.intArrayOf(1, 2, 3, 5));
        test(11, Utility.intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16));
        test(1, Utility.intArrayOf(2, 3, 4, 5, 6, 7, 8));
        test(1, Utility.intArrayOf());
    }

    private void test(int expected, int[] source) {
        Assertions.assertEquals(expected, searcher.search(source));
    }


}