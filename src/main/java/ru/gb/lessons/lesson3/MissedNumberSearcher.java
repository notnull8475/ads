package ru.gb.lessons.lesson3;

public class MissedNumberSearcher {

    public int search(int[] array) {
        if (array == null || array.length == 0) {
            return 1;
        }

        return searchBinary(array);
//        return searchLinear(array);
    }

    private static int searchBinary(int[] array) {
        // [1, 2, 3, 4, 5, 7, 8, 9, 10]
        // [7, 8]
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // left = 5, right = 5
            int m = (right + left) / 2; // 5
            int element = array[m]; // 7

            if (m + 1 == element) {
                // искать справа
                left = m + 1;
                continue;
            }

            // искать слева
            right = m;
        }

        // O(log(n))
        return array[left] - 1;
    }

    private static int searchLinear(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1) {
                return i + 1;
            }
        }

        // O(n)
        throw new IllegalArgumentException("All elements at the place");

        // a[0] + a[1] + a[2] + ... + a[n] = sum
        // sum = по формуле арифметической прогрессии
        // O(n)
    }


}
