package ru.gb.lessons.lesson3;

public interface Queue<T> {

    boolean push(T item);

    T pool();

    T peek();

    boolean isEmpty();

    boolean isFull();

}
