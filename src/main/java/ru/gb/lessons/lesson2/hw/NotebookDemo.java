package ru.gb.lessons.lesson2.hw;

import ru.gb.lessons.lesson2.BubbleSort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NotebookDemo {

    public static void main(String[] args) {
        List<Notebook> notebooks = NotebookGenerator.generate(10_000);

        Comparator<Notebook> notebookComparator = Comparator.comparingDouble(Notebook::getPrice)
                .thenComparingInt(Notebook::getRam)
                .thenComparing(Comparator.<Notebook>comparingInt(n -> n.getBrand().ordinal()).reversed())
                .reversed();

        Notebook[] notebooksArray = notebooks.toArray(Notebook[]::new);

        sort(notebooksArray, notebookComparator);

//        List<Notebook> sortedNotebooks = notebooks.stream()
//                .sorted(notebookComparator)
//                .toList();

        Arrays.stream(notebooksArray).forEach(System.out::println);

//        sortedNotebooks.forEach(System.out::println);
    }

    private static <T> void sort(T[] array, Comparator<T> tComparator) {
        int limit = array.length;
        boolean isSorted;
        do {
            limit--;
            isSorted = true;
            for (int i = 0; i < limit; i++) { // O(n)
                if (tComparator.compare(array[i], array[i + 1]) > 0) {
                    T tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;

                    isSorted = false;
                }
            }
        } while (!isSorted); // O(n)

        // O(n^2)
    }

}
