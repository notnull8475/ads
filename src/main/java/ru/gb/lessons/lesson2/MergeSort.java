package ru.gb.lessons.lesson2;

import java.util.Comparator;

public class MergeSort {

    //    !         !
    // [1 3 5 6] [2 4 7 8]

    // [1 2



    public static <T> void sort(T[] array, Comparator<T> tComparator) {
        mergeSort(array,array.length,tComparator);
    }
    public static <T> void mergeSort(T[] a, int n, Comparator<T> tComparator) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        T[] l = (T[]) new Object[mid];
        T[] r = (T[]) new Object[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid,tComparator);
        mergeSort(r, n - mid,tComparator);

        merge(a, l, r, mid, n - mid,tComparator);
    }
    public static <T>void merge(
            T[] a, T[] l, T[] r, int left, int right,Comparator<T> tComparator) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (tComparator.compare(l[i],r[j])<0){
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
