package ru.gb.lesson3;

import org.junit.jupiter.api.Test;
import ru.gb.lessons.lesson3.Queue;
import ru.gb.lessons.lesson3.QueueImpl;

import static org.junit.jupiter.api.Assertions.*;

class QueueImplTest {

    private Queue<Integer> createQueue(int size) {
        return new QueueImpl<>(size);
    }

    @Test
    void testPushPeekPool() {
        Queue<Integer> queue = createQueue(5);
        queue.push(1);
        queue.push(2);
        queue.push(3);

        assertFalse(queue.isEmpty());
        assertFalse(queue.isFull());
        assertEquals("[1, 2, 3]", queue.toString());

        assertEquals(1, queue.peek());
        assertEquals(1, queue.pool());
        assertEquals(2, queue.peek());

        assertEquals("[2, 3]", queue.toString());
    }

    @Test
    void testEmpty() {
        Queue<Integer> queue = createQueue(2);
        assertTrue(queue.isEmpty());
        queue.push(1);
        queue.push(2);
        assertTrue(queue.isFull());
        assertEquals("[1, 2]", queue.toString());

        assertFalse(queue.push(-1));
        assertFalse(queue.push(-1));
        assertFalse(queue.push(-1));
        assertTrue(queue.isFull());
        assertEquals("[1, 2]", queue.toString());
    }

}