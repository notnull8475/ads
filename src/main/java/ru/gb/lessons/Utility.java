package ru.gb.lessons;

import java.util.concurrent.ThreadLocalRandom;

public final class Utility {

    private Utility() {

    }

    public static int[] intArrayOf(int ... varargs) {
        return varargs;
    }

    public static int[] randomIntArray(int size) {
        return randomIntArray(size, 1, 10);
    }

    public static int[] randomIntArray(int size, int min, int max) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = min + ThreadLocalRandom.current().nextInt(max - min + 1);
        }
        return arr;
    }

}
