package ru.gb.lessons.lesson4;

import java.util.Iterator;

public class ArrayIteratorDemo {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        ArrayIterable arrayIterable = new ArrayIterable(array);

        for (Integer integer : arrayIterable) {
            System.out.println(integer);
        }
    }

    static class ArrayIterable implements Iterable<Integer> {

        private final int[] arr;

        public ArrayIterable(int[] arr) {
            this.arr = arr;
        }

        @Override
        public Iterator<Integer> iterator() {
            return new ArrayIterator();
        }

        private class ArrayIterator implements Iterator<Integer> {

            private int cursor = 0;

            @Override
            public boolean hasNext() {
                return cursor < arr.length;
            }

            @Override
            public Integer next() {
                return arr[cursor++];
            }
        }

    }

}
