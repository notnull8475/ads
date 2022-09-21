package ru.gb.homeworks.hw3;

import java.util.ArrayDeque;
import java.util.List;
import java.util.stream.IntStream;

public class DequeImpl<T> implements Deque<T> {
    private Object[] data;

    private int size;

    public DequeImpl(int size) {
        this.data = new Object[size];
        this.size = 0;
    }

    @Override
    public boolean addFirst(Object o) {
        if (isFull()) {
            return false;
        }
        Object[] tmp = new Object[data.length];
        System.arraycopy(data,0,tmp,1,size);
        tmp[0] = o;
        data = tmp;
        size++;
        return true;
    }

    @Override
    public boolean addLast(Object o) {
        if (isFull()) {
            return false;
        }

        data[size++] = o;
        return true;
    }

    @Override
    public T peekFirst() {
        return null;
    }

    @Override
    public T peekLast() {
        if (isEmpty()) {
            return null;
        }

        return (T) data[size - 1];
    }

    @Override
    public T poolFirst() {
        return null;
    }

    @Override
    public T poolLast() {
        if (isEmpty()) {
            return null;
        }

        T peek = peekLast();
        data[--size] = null;

        return peek;
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
    }
