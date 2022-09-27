package ru.gb.lessons.lesson5;

public class FrogProblemDemo {

    //
    // X _ _ _ _ _ _ _ _ _

    // 1
    // 1

    // 2
    // 1 + 1
    // 2

    // 3
    // 1 + 1 + 1
    // 2 + 1
    // 1 + 2

    // 4
    // 1 + 1 + 1 + 1
    // 2 + 1 + 1
    // 1 + 2 + 1
    // 1 + 1 + 2
    // 2 + 2

    // 5
    // 1 + 1 + 1 + 1 + 1
    // 2 + 1 + 1 + 1
    // 1 + 2 + 1 + 1
    // 1 + 1 + 2 + 1
    // 2 + 2 + 1
    // 1 + 1 + 1 + 2
    // 2 + 1 + 2
    // 1 + 2 + 2


    public static void main(String[] args) {
        System.out.println(variants(2));
        System.out.println(variants(3));
        System.out.println(variants(4));
        System.out.println(variants(5));
        System.out.println(variants(6));
    }

    public static int variants(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

}
