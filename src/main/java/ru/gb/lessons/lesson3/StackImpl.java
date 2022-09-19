package ru.gb.lessons.lesson3;

import java.util.List;
import java.util.stream.IntStream;

public class StackImpl<T> implements Stack<T> {

    // LIFO Last in First out

    // [1, 2, 3, 4, 5]
    // 5, 4, 3, 2, 1

    private final Object[] data;
    private int size;

    public StackImpl(int size) {
        this.data = new Object[size];
        this.size = 0;
    }

    @Override
    public boolean push(T item) {
        if (isFull()) {
            return false;
        }

        data[size++] = item;
        return true;
    }

    @Override
    public T pool() {
        if (isEmpty()) {
            return null;
        }

        T peek = peek();
        data[--size] = null;

        return peek;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }

        return (T) data[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        List<String> dataInStack = IntStream.range(0, size) // [0, 1, 2, 3, ..., size]
                .mapToObj(i -> data[i])
                .map(String::valueOf)
                .toList();

        return "[" + String.join(", ", dataInStack) + "]";
    }
}
