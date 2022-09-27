package ru.gb.hw3;

import org.junit.jupiter.api.Test;
import ru.gb.homeworks.hw3.Deque;
import ru.gb.homeworks.hw3.DequeImpl;
import ru.gb.homeworks.hw3.Task1;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TasksTest {

    private Deque<Integer> createdDeque (int size){
        return new DequeImpl<>(size);
    }

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
    void testV2() {
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

    @Test
    void dequeTest(){
        Deque<Integer> queue = createdDeque(5);
        assertTrue(queue.addFirst(1));
        assertTrue(queue.addFirst(2));
        assertTrue(queue.addFirst(3));
        assertEquals("[3, 2, 1]",queue.toString());
        assertTrue(queue.addLast(5));
        assertTrue(queue.addLast(4));
        assertEquals("[3, 2, 1, 5, 4]",queue.toString());
        assertEquals(3,queue.peekFirst());
        assertEquals(4,queue.peekLast());
        assertEquals(4,queue.poolLast());
        assertEquals(3,queue.poolFirst());
    }

}
