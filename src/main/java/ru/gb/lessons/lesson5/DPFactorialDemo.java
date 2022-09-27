package ru.gb.lessons.lesson5;

public class DPFactorialDemo {

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }


    // n! = 1 * 2 * 3 * ... * n
    // 4! = 1 * 2 * 3 * 4 = 24 = (4 - 1)! * 4 = 3! * 4
    // n! = (n - 1)! * n
    // -- 0! = 1
    public static int factorial(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] * i;
        }

        return dp[n];
    }

}
