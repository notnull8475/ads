package ru.gb.lessons.lesson1;

public class SumEvenIndexDemo {

    private static int sumWithEvenIndex(int[] arr) {
        // 10 => x
        // 100 => 10x/2 = 5x
        // 1000 => 100x / 2 = 50x

        // O(n/2) ~ O(n)
        // O(1000n) ~ O(n)


        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }

}
