package ru.gb.lessons.lesson3;

public interface Stack<T> {

    boolean push(T item);

    T pool();

    T peek();

    boolean isEmpty();

    boolean isFull();

}
