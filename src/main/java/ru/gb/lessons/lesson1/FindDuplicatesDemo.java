package ru.gb.lessons.lesson1;

import ru.gb.lessons.Utility;

public class FindDuplicatesDemo {

    public static void main(String[] args) {
        int[] first = Utility.intArrayOf(10, 9, 8, 7, 6);
        int[] second = Utility.intArrayOf(1, 2, 3, 4, 5);
        int duplicate = findDuplicate(first, second);
    }

    private static int findDuplicate(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) { // O(n)
            for (int j = 0; j < arr2.length; j *= 2) { // O(log(n))
                if (arr1[i] == arr2[j]) {
                    return arr1[i];
                }
            }
        }

        // o(nlog(n))

        return -1;
    }

}
