package ru.gb.lessons.lesson5.hw;

public class DegreeCalculator {
    public static int degree(int x, int n) {
        if (n == 0) return 1;
        return x*degree(x, n-1);
    }
}
