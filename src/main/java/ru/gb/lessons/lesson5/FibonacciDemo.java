package ru.gb.lessons.lesson5;

public class FibonacciDemo {

    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }

    // 1 1 2 3 5 8 13 21 ...
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        // O(2^n)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
