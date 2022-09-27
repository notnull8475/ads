package ru.gb.lessons.lesson5;

public class FactorialDemo {

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }


    // n! = 1 * 2 * 3 * ... * n
    // 4! = 1 * 2 * 3 * 4 = 24 = (4 - 1)! * 4 = 3! * 4
    // n! = (n - 1)! * n
    // -- 0! = 1
    public static long factorial(long n) {
        if (n == 1) {
            return 1;
        }

        // O(n)
        return n * factorial(n - 1);
    }

}
