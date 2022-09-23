package ru.gb.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.gb.lessons.lesson4.LinkedList;
import ru.gb.lessons.lesson4.LinkedListImpl;

class TestLinkedListImpl {

    private static LinkedListImpl<Integer> createLinkedList() {
        return new LinkedListImpl<>();
    }

    @Test
    void testEmptyList() {
        Assertions.assertEquals("[]", createLinkedList().toString());
    }

    @Test
    void testAddLast() {
        LinkedList<Integer> list = createLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        Assertions.assertEquals("[1 -> 2 -> 3]", list.toString());
    }

    @Test
    void testAddFirst() {
        LinkedList<Integer> list = createLinkedList();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        Assertions.assertEquals("[1 -> 2 -> 3]", list.toString());
    }

    @Test
    void testGetFirst() {
        LinkedList<Integer> list = createLinkedList();
        Assertions.assertNull(list.getFirst());

        list.addFirst(3);
        Assertions.assertEquals(3, list.getFirst());

        list.addFirst(2);
        list.addFirst(1);
        Assertions.assertEquals(1, list.getFirst());
    }

    @Test
    void testGetLast() {
        LinkedList<Integer> list = createLinkedList();
        Assertions.assertNull(list.getLast());

        list.addFirst(3);
        Assertions.assertEquals(3, list.getLast());

        list.addFirst(2);
        list.addFirst(1);
        Assertions.assertEquals(3, list.getLast());
    }

    @Test
    void testGetByIndex() {
        LinkedList<Integer> list = createLinkedList();
        Assertions.assertThrows(IllegalArgumentException.class, () -> list.get(0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> list.get(5));

        list.addFirst(3);
        Assertions.assertEquals(3, list.get(0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> list.get(1));

        list.addFirst(2);
        list.addFirst(1);
        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(3, list.get(2));
        Assertions.assertThrows(IllegalArgumentException.class, () -> list.get(3));
    }

    @Test
    void testDeleteByIndex() {
        LinkedList<Integer> list = createLinkedList();
        Assertions.assertThrows(IllegalArgumentException.class, () -> list.delete(0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> list.delete(5));

        list.addFirst(3);
        Assertions.assertThrows(IllegalArgumentException.class, () -> list.delete(1));
        list.delete(0);
        Assertions.assertEquals("[]", list.toString());

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        Assertions.assertThrows(IllegalArgumentException.class, () -> list.delete(5));
        list.delete(0);
        Assertions.assertEquals("[2 -> 3 -> 4 -> 5]", list.toString());
        list.delete(2);
        Assertions.assertEquals("[2 -> 3 -> 5]", list.toString());
    }

    @Test
    void testAddAtIndex() {
        LinkedListImpl<Integer> list = createLinkedList();
        Assertions.assertThrows(IllegalArgumentException.class, () -> list.add(-1, 5));

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        Assertions.assertThrows(IllegalArgumentException.class, () -> list.add(-1, 10));

        list.add(-1, 3);
        Assertions.assertEquals("[1 -> 2 -> 3 -> -1 -> 4 -> 5]", list.toString());
    }


}