package ru.gb.lessons.lesson1;

public class FibonacciDemo {

    // 1 1 2 3 5 8 13 21
    private int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
