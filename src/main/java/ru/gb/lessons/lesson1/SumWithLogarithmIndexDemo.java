package ru.gb.lessons.lesson1;

import ru.gb.lessons.Utility;

public class SumWithLogarithmIndexDemo {

    public static void main(String[] args) {
        int[] ints = Utility.intArrayOf(1, 10, 100, 1000, 10_000, 1_000_000);

        for (int size : ints) {
            int[] testArray = Utility.randomIntArray(size);
            System.out.println("Size: " + size + " => ");
            sumWithLogarithmIndex(testArray);
        }
    }

    private static int sumWithLogarithmIndex(int[] arr) {
        int counter = 0;

        int sum = 0;
        for (int i = 1; i < arr.length; i *= 2) {
            sum += arr[i];
            counter++;

            System.out.println("\tIndex: " + i);
        }

        System.out.println("\tCounter: " + counter);

        return sum;
    }

}
