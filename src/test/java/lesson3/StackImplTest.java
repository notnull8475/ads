package lesson3;

import org.junit.jupiter.api.Test;
import ru.gb.lessons.lesson3.Stack;
import ru.gb.lessons.lesson3.StackImpl;

import static org.junit.jupiter.api.Assertions.*;

class StackImplTest {

    private Stack<Integer> createStack(int size) {
        return new StackImpl<>(size);
    }

    @Test
    void testPushPeekPool() {
        Stack<Integer> stack = createStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // [1, 2, 3, null, null]

        assertFalse(stack.isEmpty());
        assertFalse(stack.isFull());
        assertEquals("[1, 2, 3]", stack.toString());

        assertEquals(3, stack.peek());
        assertEquals(3, stack.pool());
        assertEquals(2, stack.peek());

        assertEquals("[1, 2]", stack.toString());
    }

    @Test
    void testEmpty() {
        Stack<Integer> stack = createStack(2);
        assertTrue(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        assertTrue(stack.isFull());
        assertEquals("[1, 2]", stack.toString());

        assertFalse(stack.push(-1));
        assertFalse(stack.push(-1));
        assertFalse(stack.push(-1));
        assertTrue(stack.isFull());
        assertEquals("[1, 2]", stack.toString());
    }

}