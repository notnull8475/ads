package ru.gb.lessons.lesson3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class QueueImpl<T> implements Queue<T> {

    // FIFO First in First out

    // [1, 2, 3, 4]
    // 1, 2, 3, 4

    // [1 2 3 4 5 6 7 null null null]
    // [null null 3 4 5 6 7 null null null]
    // [null null 3 4 5 6 7 8 9 10]
    // [11 null 3 4 5 6 7 8 9 10]

    private final Object[] data;
    private int tail;

    public QueueImpl(int size) {
        this.data = new Object[size];
        tail = 0;
    }

    @Override
    public boolean push(T item) {
        if (isFull()) {
            return false;
        }

        data[tail++] = item;
        return true;
    }

    @Override
    public T pool() {
        if (isEmpty()) {
            return null;
        }

        // [1, 2, 3, null, null]
        // [2, 3, null, null, null]

        T peek = peek();
        for (int i = 0; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }

        tail--;
        return peek;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }

        return (T) data[0];
    }

    @Override
    public boolean isEmpty() {
        return tail == 0;
    }

    @Override
    public boolean isFull() {
        return tail == data.length;
    }

    @Override
    public String toString() {
        List<String> dataInQueue = IntStream.range(0, tail)
                .mapToObj(i -> data[i])
                .map(String::valueOf)
                .toList();

        return "[" + String.join(", ", dataInQueue) + "]";
    }

}
