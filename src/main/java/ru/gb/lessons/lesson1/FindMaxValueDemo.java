package ru.gb.lessons.lesson1;

public class FindMaxValueDemo {

    private static int findMax(int[] arr) {
        // O(n)
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
