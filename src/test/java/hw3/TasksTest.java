package hw3;

import org.junit.jupiter.api.Test;
import ru.gb.homeworks.hw3.Task1;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TasksTest {


    @Test
    void testGetSkippedNumb() {
        Task1 t = new Task1();
        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16};
        int[] a2 = {1, 2, 4, 5, 6};
        int[] a3 = {2, 3, 4, 5, 6, 7, 8};
        int[] a4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] a5 = {};

        assertEquals(11, t.getSkippedNumb(a1));
        assertEquals(3, t.getSkippedNumb(a2));
        assertEquals(1, t.getSkippedNumb(a3));
        assertEquals(15, t.getSkippedNumb(a4));
        assertEquals(1, t.getSkippedNumb(a5));


    }

    @Test
    private static void testV2() {
        Task1 t = new Task1();
        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16};
        int[] a2 = {1, 2, 4, 5, 6};
        int[] a3 = {2, 3, 4, 5, 6, 7, 8};
        int[] a4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] a5 = {};
        assertEquals(11, t.getSkippedNumbV2(a1));
        assertEquals(3, t.getSkippedNumbV2(a2));
        assertEquals(1, t.getSkippedNumbV2(a3));
        assertEquals(15, t.getSkippedNumbV2(a4));
        assertEquals(1, t.getSkippedNumbV2(a5));
    }

}
