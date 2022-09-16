package ru.gb.lessons.lesson2;

import java.util.Comparator;

public class InsertionSort {
    //  0   1  2   3  4  5  6
    // [9, 2, 4, 11, 1, 7, 5]

    // i = 1, j = 0, value = 2
    // [9, 9, 4, 11, 1, 7, 5]
    // [2, 9, 4, 11, 1, 7, 5]

    // i = 2, j = 1, value = 4
    // [2, 9, 9, 11, 1, 7, 5], j = 0
    // [2, 4, 9, 11, 1, 7, 5]

    public static <T> void sort(T[] array, Comparator<T> tComparator) {
        for (int i = 1; i < array.length; i++) { // O(n)
            int j = i - 1;
            T value = array[i];

            while (j >= 0 && tComparator.compare(array[j], value) > 0) { // O(n)
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = value;
        }

        // O(n^2)
    }

}


// 5

//  0  1  2  3   4   5  6  7   8
// [1, 2, 4, 7, 11 | 5, 9, 3, 12]
// [1, 2, 4, 7, 11, 5 | 9, 3, 12]
// [1, 2, 4, 5, 7, 11 | 9, 3, 12]



// [1, 2, 4, 5, 7, 11 | 9, 3, 12]
// [1, 2, 4, 5, 7, 9, 11 | 3, 12]
// [1, 2, 3, 4, 5, 7, 9, 11 | 12]
// [1, 2, 3, 4, 5, 7, 9, 11, 12]