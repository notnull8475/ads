package ru.gb.lessons.lesson2;

public class BubbleSort {

    // [9, 2, 4, 11, 1, 7, 5]
    // [2, 9, 4, 11, 1, 7, 5]
    // [2, 4, 9, 11, 1, 7, 5]
    //
    // [2, 4, 9, 1, 7, 5, 11]
    // [2, 4, 9, 1, 7, 5, 11]
    // [2, 4, 1, 9, 7, 5, 11]
    // [2, 4, 1, 7, 9, 5, 11]
    // [2, 4, 1, 7, 5, 9, 11]

    // int a, b

    public static void sort(int[] array) {
        int tmp = -1;

        int limit = array.length;
        boolean isSorted;
        do {
            limit--;
            isSorted = true;
            for (int i = 0; i < limit; i++) { // O(n)
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;

                    isSorted = false;
                }
            }
        } while (!isSorted); // O(n)

        // O(n^2)
    }

}
