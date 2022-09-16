package ru.gb.lessons.lesson2;

public class SelectionSort {
    //  0  1  2   3  4  5  6
    // [9, 2, 4, 11, 1, 7, 5]
    // [1, 2, 4, 11, 9, 7, 5]
    // [1, 2, 4, 11, 9, 7, 5]
    // [1, 2, 4, 11, 9, 7, 5]
    // [1, 2, 4, 5, 9, 7, 11]
    // [1, 2, 4, 5, 7, 9, 11]
    // [1, 2, 4, 5, 7, 9, 11]
    // [1, 2, 4, 5, 7, 9, 11]

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) { // O(n)
            int min = i;
            for (int j = i + 1; j < array.length; j++) { // O(n)
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }

        // O(n^2)
    }

}
