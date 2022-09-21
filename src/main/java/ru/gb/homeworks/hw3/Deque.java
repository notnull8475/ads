package ru.gb.homeworks.hw3;

public interface Deque<T> {

    boolean addFirst(T t);
    boolean addLast(T t);

    T peekFirst();
    T peekLast();

    T poolFirst();
    T poolLast();

    boolean isEmpty();
    boolean isFull();


}
