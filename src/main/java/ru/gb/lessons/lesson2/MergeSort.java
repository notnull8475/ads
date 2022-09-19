package ru.gb.lessons.lesson2;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSort {

    //    !         !
    // [1 3 5 6] [2 4 7 8]

    // [1 2

    public static <T> void sort(T[] array, Comparator<T> tComparator) {

    }
    public static <T> void mergeSort(T[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Object[] l = new Object[mid];
        Object[] r = new Object[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    public static <T>void merge(
            T[] a, T[] l, T[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }


}
